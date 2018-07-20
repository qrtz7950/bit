-- 1번
select name, title, dept_id 
    from s_emp
    where dept_id in(112, 118) 
      and title in('과장', '사원')
      and salary between 1500 and 4000;

-- 2번
select name, title, salary
    from s_emp
    where manager_id is null;
    
-- 3번
select name, title, salary
    from s_emp
    where title like '%부장'
      and salary >= 3000;
    
-- 4번
select name, title, salary
    from s_emp
    where (title like '%부장' or title = '과장')
      and dept_id in(112,113,117,118)
      and salary between 2300 and 3000;

-- 5번
select name, title, salary, start_date
    from s_emp
    where (title like '%부장' or title = '과장')
      and to_char(start_date, 'MM') like '03';

-- 6번
select name, title, salary*16 as 직원연봉
    from s_emp;
    
-- 7번
select name ||' '|| title ||'의 급여' || salary as "직원 급여"
    from s_emp;
    
-- 8번
select name, title, salary
    from s_emp
    where commission_pct is not null
      and manager_id is not null
    order by salary asc;