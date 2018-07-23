-- 부서별 급여가 높은 순으로 순위를 조회
select department_id, salary, employee_id, first_name
       ,(
           select count(*) + 1
             from employees e2
             where e.department_id = e2.department_id
                   and e.salary < e2.salary
         ) as rank
  from employees e
  order by  department_id, salary desc;
  
select department_id, salary, employee_id, first_name
       , rank() over (
                      partition by department_id
                      order by salary desc
                     ) as rank
  from employees;
  
------------------------------------------------------------------
select count(*) from employees;  -- 107
select count(*) from departments; -- 27

select * from tab;

-- full outer join, cross join --
select count(*)
  from employees, departments;  -- 2889(107 * 27)

-- inner join --
select count(*)                 -- 106
  from employees, departments
  where employees.department_id = departments.department_id; 
  -- 교집합 묶어서 join한것
  
-- 사원의 근무부서명 조회
select e.employee_id, e.first_name, e.salary
       , e.department_id, d.department_name
  from employees e, departments d
  where e.department_id = d.department_id
  order by 1 asc;

select * from employees where department_id is null;

----------------------------------------------------------------------
-- null까지 조회
-- (+) 사용
select e.employee_id, e.first_name, e.salary
       , e.department_id, d.department_name
  from employees e, departments d
  where e.department_id = d.department_id(+);   -- left outer join
--  where e.department_id(+) = e.department_id;   -- right outer join


-- ansi join -- 명시적 표기
-- ansi cross join
select count(*)
  from employees cross join departments;

-- ansi inner join
select e.employee_id, e.first_name, e.salary
       , d.department_name
  from employees e inner join departments d
    on e.department_id = d.department_id;

-- ansi left outer join
select e.employee_id, e.first_name, e.salary
       , d.department_name
  from employees e left outer join departments d
    on e.department_id = d.department_id;

-- ansi right outer join
select e.employee_id, e.first_name, e.salary
       , d.department_name
  from employees e right outer join departments d
    on e.department_id = d.department_id;
    
-- ansi full outer join 
select e.employee_id, e.first_name, e.salary
       , d.department_name
  from employees e full outer join departments d
    on e.department_id = d.department_id;

-- 80번 부서에  근무하는 사원의 번호, 이름, 부서명 조회
select e.employee_id, e.first_name, e.salary
       , e.department_id, d.department_name
  from employees e, departments d
  where e.department_id = d.department_id
    and e.department_id =80;

select e.employee_id, e.first_name, e.salary
       , e.department_id, d.department_name
  from employees e inner join departments d
    on e.department_id = d.department_id
  where e.department_id =80;
  
/*
    직책(job title)이 Sales Manager인 사원들의 입사년도와 입사년도(hire_date)별
    평균 급여를 출력하시오. 출력 시  년도를 기준으로 오름차순 정렬
*/
select to_char(e.hire_date, 'yyyy') 입사년도
       , trunc(avg(e.salary),0) 평균급여
  from employees e inner join jobs j
    on e.job_id = j.job_id
  where job_title = 'Sales Manager'
  group by to_char(e.hire_date, 'yyyy')
  order by 1 asc;
  
/*
    'Public Accountant'의 직책(job_title)으로 과거에 근무한 적이 있는 모든 사원의
    사번과 이름을 출력. (현재 'Public Accountant'의 직책(job_title)으로 근무하는
    사원은 고려x) 이름은 first_name, last_name을 아래의 실행결과와 같이 출력
*/
select 사번, 이름
  from (
        select e.employee_id 사번
               , e.first_name || ' ' || e.last_name 이름
               , j.job_title 직책
          from employees e, job_history jh, jobs j
         where e.employee_id = jh.employee_id
               and j.job_id = jh.job_id
       )
  where 직책 = 'Public Accountant';
  
select e.employee_id 사번
        , e.first_name || ' ' || e.last_name 이름
  from employees e inner join job_history jh
    on e.employee_id = jh.employee_id
    inner join jobs j on j.job_id = jh.job_id
  where j.job_title = 'Public Accountant';
  
/*
    2007년 입사(hire_date)한 직원들의 사번(employee_id), 이름(first_name),
    성(last_name), 부서명(department_name)을 조회
    이때, 부서에 배치되지 않은 직원의 경우, '<Not Assigned>'로 출력
*/
select e.employee_id 사번, e.first_name 이름, e.last_name 성
     , nvl(d.department_name, '<Not Assigned>') 부서명
  from employees e left outer join departments d
    on e.department_id = d.department_id
  where to_char(e.hire_date,'yyyy') = '2007'
  order by 1 asc;
  
/*
    자신의 매니저보다 연봉(salary)를 많이 받는 직원들의 성(last_name)과
    연봉(salary)을 출력
*/
-- self join --
select e.last_name 성, e.salary 연봉
  from employees e inner join employees ee
    on e.manager_id = ee.employee_id
  where e.salary > ee.salary;

/*  
    각 부서별로 직원이 한명만 있는 부서만 조회. 단, 부서명이 없는 부서에 대해
    '<신생부서>'라는 문자열이 출력되도록 하고, 출력결과는 부서명 내림차순
*/
select nvl((
        select d.department_name
          from departments d
          where e.department_id = d.department_id
       ), '<신생부서>') 부서명, count(*) 직원수
  from employees e
  group by department_id
  having count(*) = 1;
  order by 1 desc