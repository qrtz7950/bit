

select count(*) from employees; -- 107
select count(*) from departments; -- 27

select count(*)
  from employees,departments; -- 107 * 27 = 2889

select * 
  from employees,departments; 
  -- full outer join, cross join 이라고한다
  -- 만들수 있는 모든 경우의 수를 만든 것

select *
  from employees e,departments d
 where e.department_id = d.department_id;
-- 서로 교집합인 애들만 묶여서 출력되는 이런 형태의 조인을
-- inner join이라고 한다
  
select *
  from employees e,departments d
 where e.department_id = d.department_id;
-- 교집합이 아닌 row도 출력하고 교집합인 row는 그 부분만 확장하여 출력하는것
--하나의 테이블의 row는 모두 출력하고 다른 테이블은 교집합을 만족하는 row에만 확장하여 출력하는것
-- 어느 테이블이 확장되는지를 선택하여 left or right outer join이라고 할 수 잇다
-- outer join
--(left or right) outer join
-- 두개의 테이블을 모두 확장하여 출력하면 full outer join이라고한다

-----------------------------------------------------------------------------

--사원의 근무부서명을 조회
select e.employee_id, e.first_name, e.salary, e.department_id, d.department_name
    from employees e, departments d
   where d.department_id = e.department_id
order by e.employee_id;
  
select * 
  from employees,departments;  
----------------------------------------------------------------------------------------------------------------------
select count(*)
  from employees e,departments d
 where e.department_id = d.department_id;

--inner join
--107명인데 106명만 나옴 왜냐면 조건에 만족하지 못하는 null값이 있기때문
--primary키는 유니크하면서 not null인데 억떡계 그럴수가 잇나

--null값이라 찍히지 않지만 null인 값까지 출력할수 있게 (+)를 추가한다
--left outer join
-- (+)의 순서에 따라 (left or right) outer join이 된다
select e.employee_id, e.first_name, e.salary, e.department_id, d.department_name
    from employees e, departments d
   where d.department_id = e.department_id(+) 
order by e.employee_id;

--(+)는 오라클에서만 쓰이는 아우터 조인 방식이다
-- 표준 규격은 ansi join방식이다
--이 방식은 어떤 조인을 할것인지 명시한다.

--ansi cross join
select count(*) 
  from employees cross join departments;

--ansi inner join
--오라클에서 where절로 거는 조건을 안시는 on으로 표현
--어느 테이블이 확장되는지는 순서가 중요하다
select e.employee_id, e.first_name, e.salary, d.department_name
  from employees e inner join departments d
  on  e.department_id = d.department_id;

-- left outer join 
select e.employee_id, e.first_name, e.salary, d.department_name
  from employees e left outer join departments d
    on e.department_id = d.department_id;
    
-- right outer join 
select e.employee_id, e.first_name, e.salary, d.department_name
  from departments d right outer join employees e
    on e.department_id = d.department_id;

--on 조건은 순서가 중요하지않다
-- full outer join 
select e.employee_id, e.first_name, e.salary, d.department_name
  from departments d full outer join employees e
    on e.department_id = d.department_id;

--80번 부서에 근무하는 사원의 번호, 이름(first_name), 부서명 조회
select e.employee_id, e.first_name, d.department_name
  from employees e,departments d
 where e.department_id = d.department_id
   and e.department_id = 80;
 
select e.employee_id, e.first_name, d.department_name
  from employees e inner join departments d
    on e.department_id = d.department_id
 where e.department_id = 80;

--작책이 sales manager 인 사원들의 입사년도와 입사년별 평균 급여를 출력하세요 출력시 년도를 기준으로 오름차순 정렬

select to_char(hire_date, mm) as 년도, avg(e.salary)
    from employees e inner join departments d
      on e.hire_date = d.hire_date
group by hire_date;

---------------------------------------------------------------------------------------

-- 직책이 (job_title)sales manager 인 사람의 입사년도별 평균 급여 출력
select to_char(e.hire_date, 'yyyy') as 년도, round(avg(e.salary),'.9') as 평균급여
    from employees e inner join jobs j
      on j.job_id = e.job_id
   where j.job_title = 'Sales Manager'
group by to_char(e.hire_date, 'yyyy');

---------------------------------------------------------------------------------------
/*
    ‘Public Accountant’의 직책(job_title)으로 과거에 근무한 적이 있는 
    모든 사원의 사번과 이름을 출력하시오. 
    (현재 ‘Public Accountant’의 직책(job_title)으로 근무하는 사원은 고려하지 않는다.) 
    이름은 first_name, last_name을 아래의 실행결과와 같이 출력한다
*/
select e.employee_id, e.first_name || ' ' || e.last_name 이름
  from employees e, jobs j, job_history jh
 where j.job_id = jh.job_id
   and jh.employee_id = e.employee_id
   and j.job_title = 'Public Accountant';
   
select e.employee_id, e.first_name || ' ' || e.last_name 이름
  from employees e inner join job_history jh
    on jh.employee_id = e.employee_id
    inner join jobs j on j.job_id = jh.job_id
 where j.job_title = 'Public Accountant';   
---------------------------------------------------------------------------------------

--2007에 입사한 직원들의 사번 이름 성 부서명을 조회합니다
     --hire_date    employee_id first_name last_name department_name
     
select e.employee_id as 사번, e.first_name as 이름, e.last_name as 성, d.department_name as 부서명
     , nvl(d.department_name, 'Not assigned' )
  from employees e left outer join departments d
    on d.department_id = e.department_id
 where to_char(e.hire_date, 'yyyy') = '2007';


-------------------------------------------------------------

--자신의 매니저보다 연봉을 많이 받는 직원들의 성과 연봉을 출력하시오
--같은 테이블은 조인하는 것을 셀프 조인이라고한다
select e.first_name || ' ' || e.last_name as 이름 , e.salary
   from employees e, employees ee
  where e.salary > ee.salary
    and e.manager_id = ee.employee_id;

--부서별로 직원이 한명만 있는 부서만 조회하시오 단 직원이 없는 부서에 대해 신생부서라는 문자열이 출력되도록 하고 출력결과는 부서명이 내림차순

select e.department_id
   from (
         select nvl(to_char(e.department_id),'<신생부서>'), count(*)
           from employees e
       group by e.department_id
         ) e
  where count(*) = 1;


-- 각 부서별로 직원이 한명만 있는 부서만 조회 단 부서명이 없는 부서에 대해서는 신성부서라는 문자열 출력 출력결과는 부서명 내림차순

  select nvl(
             (select d.department_name
                from departments d
               where e.department_id = department_id) , '신생부서') as , count(*)
    from employees e 
group by e.department_id
  having count(*) = 1
order by department_id desc;


 
---------------------------------------------------------------------------------------
select * 
  from employees, departments;