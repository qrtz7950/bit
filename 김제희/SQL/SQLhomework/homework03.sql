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

select nvl(to_char(trunc(commission_pct,1)),'<커미션 없음>') as 커미션, count(*) as 사원수
     from employees
 group by trunc(commission_pct,1);

select commission_pct, count(*) as 직원수
    from( 
         select case when commission_pct is null then '<커미션없음>'
                     else to_char(trunc(commission_pct,1),'.9')
                end as commission_pct
             from employees
        )
group by commission_pct
order by 1 desc;
------------------------------------------------------------------------------

select employee_id, first_name, phone_number
     , case substr(phone_number,1,3) when '515' then '서울'
                                     when '590' then '대전'
                                     when '650' then '부산'
                                     when '603' then '광주'
            else '기타'
            end as AREA
    from employees
order by employee_id asc;    
        
-------------------------------------------------------------------------
select e.job_id as 부서번호, e.ms as 최대급여, employees.last_name as 이름
  from (
        select job_id, max(salary) as ms
           from employees
           group by job_id
       )e
       , employees
  where employees.job_id = e.job_id and employees.salary = e.ms;
  
  
select first_name, job_id, salary
  from employees
 where (salary, job_id) in ( --in은 쌍으로도 비교할 수 있다
                            select max(salary)
                                  from employees
                              group by job_id
                           );
-------------------------------------------------------------------------

select RANKING
      , last_name 
      , first_name
      , salary
     from (
             select e.*
                  , row_number() over( order by salary desc) as rnum
                  , rank() over(order by salary desc) as RANKING
                from employees e
          )
where rnum between 6 and 10;
-------------------------------------------------------------------------

--부서별 급여가 높은순으로 순위를 조회

select department_id, salary, employee_id, first_name
     , (
        select count(*)+1
          from employees e2
         where e.department_id = e2.department_id
           and e.salary < e2.salary
        ) as rank
  from employees e
order by department_id, salary desc;

--위 문제를 좀더 간단하게 표현

select department_id, salary, employee_id, first_name
     , rank() over(
                   partition by department_id 
                       order by salary
                   ) as rank
  from employees;

-------------------------------------------------------------------------

select *
from employees;
