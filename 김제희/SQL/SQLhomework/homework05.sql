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