--부서별 급여가 높은 순으로 순위를 조회
select department_id, salary, employee_id, first_name
        , (
            select count(*) + 1
              from employees e2
            where e1.department_id = e2.department_id
                and e1.salary < e2.salary
        ) as rank
    from employees e1
    order by department_id, salary desc;
    
select department_id, salary,employee_id,first_name
        ,rank() over(
                    partition by department_id 
                    order by salary desc
                    ) as rank
    from employees;
    
    
--------------------------------------------------------------------

select count(*) from employees; --107
select count(*) from departments; --27

--full outer join , cross join
select count(*)
    from employees,departments;     --2889 = 107 * 27
    
--사원의 근무 부서명 조회
select e.employee_id, e.first_name, e.salary, e.department_id, d.department_name
    from employees e,departments d
    where e.department_id = d.department_id --Inner Join의 방법(두개의 테이블이 공통적으로 갖는 컬럼 사용)
    order by 1;

select count(*)                                    --부서가 null인 사원이 빠짐
    from employees e, departments d                 --106
    where e.department_id = d.department_id;
    
----------------------------------------------------------------------------------
--left outer join (107명)
select e.employee_id, e.first_name, e.salary, e.department_id, d.department_name
    from employees e,departments d
    where e.department_id = d.department_id(+);
    
--right outer join (107명)
select e.employee_id, e.first_name, e.salary, e.department_id, d.department_name
    from employees e,departments d
    where d.department_id(+) = e.department_id ;
    
    
--ANSI cross join
select count(*)
    from employees cross join departments;
    
--ansi inner join
select e.employee_id, e.first_name, e.salary, d.department_id
    from employees e inner join departments d
        on e.department_id = d.department_id; 
    
--ansi left outer join
select e.employee_id, e.first_name, e.salary, d.department_id
    from employees e left outer join departments d
        on e.department_id = d.department_id;
        
--ansi right outer join
select e.employee_id, e.first_name, e.salary, d.department_id
    from departments d right outer join employees e
        on e.department_id = d.department_id;
        
-- 80번 부서에 근무하는 사원의 번호, 이름, 부서명을 조회
select  e.employee_id, e.first_name, d.department_name
    from employees e, departments d
    where e.department_id = d.department_id
        and e.department_id = 80;
            --ansi 사용
select e.employee_id, e.first_name, d.department_name
    from employees e inner join departments d
        on e.department_id = d.department_id
    where e.department_id = 80;
    
/* 직책(job title)이 Sales Manager인 사원들의 입사년도와 입사년도(hire_date)별
    평균 급여를 출력하시오. 출력시 년도를 기준으로 오름차순정렬
    */
select j.job_title,to_char(e.hire_date, 'yyyy'),avg(e.salary)
    from jobs j inner join employees e
        on j.job_id = e.job_id
    where  j.job_title = 'Sales Manager'
    group by j.job_title,to_char(e.hire_date,'yyyy')
    order by 2 asc;

/* public Accountant의 직책(job_title)으로 과거에 근무한적이있는 모든 사원의 사번과 이름을 출력하시오
    (현재 'public account'의 직책으로 근무하는 사원은 고려하지않는다.)
    이름은 first_name, last_name을 한 컬럼에 합쳐서 출력한다.*/

select e.employee_id, e.first_name || ' ' || e.last_name 이름
    from employees e, jobs j,job_history jh
    where j.job_id = jh.job_id
        and jh.employee_id = e.employee_id
        and j.job_title = 'Public Accountant';
        
    --ansi사용
select e.employee_id, e.first_name || ' ' || e.last_name 이름
    from employees e  inner join job_history jh
        on e.employee_id = jh.employee_id
        inner join jobs j on j.job_id = jh.job_id
    where j.job_title = 'Public Accountant';

--2007년 입사한 사원의 사번이름성부서명 출력 부서가없으면 없다고 출력
select e.employee_id 사번, e.first_name 이름, e.last_name 성, nvl(d.department_name,'<Not Assigned>') 부서명
    from employees e , departments d
    where to_char(e.hire_date,'yyyy') = '2007'
      and e.department_id = d.department_id(+);
    
--자신의 매니저보다 연봉을 많이 받는 직원들의 성과 연봉을 출력하시오
select e.last_name, e.salary
    from employees e, employees m           --self join
    where e.salary > m.salary
        and e.manager_id = m.employee_id;    
        
/*각부서별로 직원이 한명만있는 부서만 조회하시오 단, 직원이 없는 부서에 대해 '<신생부서>'
라는 문자열이 출력되도록 하고, 출력 결과는 다음과 같이 부서명이 내림차순으로 정렬되어야 한다.
*/
select nvl(
            (
                 select d.department_name
                      from departments d
                      where e.department_id = d.department_id
            ),'<신생부서>'
        ) 부서명, count(*) 직원수
    from employees e
    group by department_id
    having count(*) =1
    order by 1 desc;
    
 select nvl(d.department_name,'신생부서'),count(*) 직원수
 from employees e, departments d
 where e.department_id = d.department_id(+)
 group by d.department_name
 having count(*) =1
 order by 1 desc;
 
 --===제희한테받은거=====================================================================
select to_char(e.hire_date, 'yyyy'), avg(e.salary)
    from employees e left outer join jobs j
      on e.job_id = j.job_id
   where j.job_title = 'Sales Manager'   
group by to_char(e.hire_date, 'yyyy')
order by 1;
------------------------------------------------------------------------------
select nvl(l.city, 'NO CITY') as city_name, round(avg(salary),'.9') as average_salary, count(*) as numOfEmployee
    from employees e left outer join departments d 
      on e.department_id = d.department_id left outer join locations l
      on d.location_id = l.location_id
group by l.city
  having count(*) < 10;
------------------------------------------------------------------------------ 
select e.employee_id as employeeNum, e.first_name || ' ' || e.last_name as name
  from employees e left outer join job_history jh
    on e.employee_id = jh.employee_id left outer join jobs j
    on j.job_id = jh.job_id 
 where j.job_title = 'Public Accountant';
------------------------------------------------------------------------------
select e.last_name, e.salary
  from employees e, employees m
 where e.salary > m.salary
   and e.manager_id = m.employee_id;
------------------------------------------------------------------------------
select e.employee_id, e.first_name || ' ' || e.last_name, nvl(d.department_name, '<NOT ASSIGNED>')
  from employees e left outer join departments d
    on e.department_id = d.department_id
 where to_char(e.hire_date, 'yyyy') = '2007';
 
select e.first_name || ' ' || e.last_name as name, e.salary
  from employees e left outer join jobs j
    on e.job_id = j.job_id
 where j.job_title = 'Sales Representative'
   and e.salary between '9000' and '10000';
------------------------------------------------------------------------------
select nvl(d.department_name,'no name') as department_name
  from employees ee,departments dd
where in ((select min(e.salary)
          from employees e left outer join departments d
            on e.department_id = d.department_id
        group by department_name));
   
------------------------------------------------------------------------------
select RANKING
     , last_name
     , first_name
     , salary
  from (
        select e.*
             , rank() over (order by e.salary desc) as RANKING
             , row_number() over(order by e.salary desc) as rnum
          from employees e
        )
where rnum between 6 and 10;

select e.last_name as ename
     , nvl(m.last_name,'no manager') as name
     , d.department_name
     , l.city
  from employees e inner join departments d
    on e.department_id = d.department_id inner join locations l
    on d.location_id = l.location_id inner join employees m
    on e.manager_id = m.employee_id
 where l.city = 'Seattle'
order by 1 asc;

select j.job_title
     , sum(e.salary)
    from employees e left outer join jobs j
      on e.job_id = j.job_id
group by j.job_title
  having sum(e.salary) > '30000';
  
select e.employee_id as 사원번호
     , e.first_name as 이름
     , j.job_title as 업무명
     , d.department_name as 부서이름
  from employees e left outer join employees m
    on e.manager_id = m.employee_id left outer join departments d
    on e.department_id = d.department_id left outer join locations l
    on d.location_id = l.location_id left outer join jobs j
    on j.job_id = e.job_id
  where l.city = 'Seattle'
  order by 1 asc;

select e.first_name as name
     , to_char(e.hire_date, 'yyyy-mm-dd am hh-mi-ss') as hiredate
     , nvl(to_char(m.employee_id),'관리자없음') as manager_id
     , nvl(to_char(m.first_name),'관리자없음') as manager_name
 from employees e left outer join employees m
   on e.manager_id = m.employee_id
where to_char(e.hire_date, 'yyyy') between '2001' and '2003'
order by e.employee_id desc;
     
select e.first_name
     , e.salary
     , d.department_name
  from employees e left outer join departments d
    on e.department_id = d.department_id
where d.department_name = 'Sales'
  and (select avg(e.salary)
         from employees e
        where e.department_id = 100
       ) > e.salary;

select to_char(e.hire_date, 'mm') || 'th' as month
     , count(*) as numOfEmployee
  from employees e
group by to_char(e.hire_date, 'mm')
order by 1 asc;

select d.department_name
     , max(e.salary)
     , min(e.salary)
     , round(avg(e.salary),'.9')
    from employees e left outer join departments d
      on e.department_id = d.department_id
group by d.department_name
  having (
          select avg(ee.salary)
            from employees ee left outer join departments dd
            on ee.department_id = dd.department_id
        group by dd.department_name
          having dd.department_name = 'IT'
          ) 
          < avg(e.salary) and
          (
           select avg(eee.salary)
             from employees eee left outer join departments ddd
               on eee.department_id = ddd.department_id
         group by ddd.department_name
           having ddd.department_name = 'Sales') > avg(e.salary);

select nvl(d.department_name, '<신생부서>') as 부서명
     , count(*) as 직원명
  from employees e left outer join departments d
    on e.department_id = d.department_id
group by d.department_name
  having count(*) = '1'
order by 1 desc; 

select d.department_name
     , to_char(e.hire_date, 'mon')
     , count(*)
  from employees e left outer join departments d
    on e.department_id = d.department_id
group by d.department_name, to_char(e.hire_date, 'mon')
  having count(*)>='5'
order by 1 asc;


select * from employees;
