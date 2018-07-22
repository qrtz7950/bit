select department_id as 부서번호,count(*) as 사원수
    from employees
group by department_id
having department_id is not null
       and count(*) >=5
order by department_id asc;

select * from employees;
---------------------------------------------------------------------
select to_char(hire_date, 'mm') || '월' as 월, count(to_char(hire_date, 'mm')) as 사원수
  from employees e
group by to_char(hire_date, 'mm')
order by to_char(hire_date, 'mm') asc;
-------------------------------------------------------------------------

select nvl(to_char(trunc(commission_pct,1)),'<커미션 없음>'), count(trunc(nvl(commission_pct,1),0))
     from employees
 group by trunc(commission_pct,1);
------------------------------------------------------------------------------

select employee_id, first_name, phone_number
     , case when substr(phone_number,1,3) = 515 then '서울'
            when substr(phone_number,1,3) = 590 then 'eowjs'
            when substr(phone_number,1,3) = 650 then '부산'
            when substr(phone_number,1,3) = 603 then '광주'
            else '기타'
            end as "AREA"
    from employees
order by employee_id asc;    
        
-------------------------------------------------------------------------
select first_name, job_id, max(salary)
     from employees e
 group by job_id,first_name;
-------------------------------------------------------------------------

select RANKING
      , last_name 
      , first_name
      , salary
     from (
             select e.*
                  , row_number() over( order by salary desc) as rnum
                  , dense_rank() over(order by salary desc) as RANKING
                from employees e
          )
where rnum between 6 and 10;
-------------------------------------------------------------------------

select *
from employees;
