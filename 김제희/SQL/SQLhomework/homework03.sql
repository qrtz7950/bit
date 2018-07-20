select department_id,count(*)
    from employees
group by department_id
having department_id is not null
       and count(*) >=5
order by department_id asc;

select * from employees;
---------------------------------------------------------------------
select to_char(hire_date, 'mm') || '월' as 월, count(to_char(hire_date, 'mm')) as 직원수
  from employees e
group by to_char(hire_date, 'mm')
order by to_char(hire_date, 'mm') asc;
-------------------------------------------------------------------------

select nvl(to_char(trunc(commission_pct,1)),'<커미션없음>'), count(trunc(nvl(commission_pct,1),0))
     from employees
 group by trunc(commission_pct,1);
------------------------------------------------------------------------------
select substr(phone_number,1,3)
  from employees
group by substr(phone_number,1,3);

  
  
  
  
select substr(phone_number,1,3)
from employees;
  
  