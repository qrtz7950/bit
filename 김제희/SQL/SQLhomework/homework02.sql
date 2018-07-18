select * from s_emp;

select *
    from s_emp s;

select s.name,s.title,s.salary,s.dept_id
    from s_emp s
    where (dept_id = 118 or dept_id = 112)
      and (title like '%과장' or title = '사원')
      and salary between 1500 and 4000;

select s.name,s.title,s.salary,s.dept_id
    from s_emp s
    where manager_id is null;

select s.name,s.title,s.salary,s.dept_id
    from s_emp s
    where title like '%부장'
      and salary >= 3000;

select s.name,s.title,s.salary,s.dept_id
    from s_emp s
    where (title like '%부장' or title like '%과장')
      and dept_id in (112, 113, 117, 118)
      and salary between 2300 and 3000;

select s.*,s.name,s.title,s.salary,s.dept_id
    from s_emp s
    where (title like '%부장' or title like ('%과장'))
      and to_char(start_date) like '__/03/__';

select s.name,s.title,s.salary * 16 + 1000 as 직원연봉
    from s_emp s;
    
select s.name|| ' ' ||s.title || '의 급여' ||s.salary as 직원급여
    from s_emp s;

select *
    from s_emp s
    where commission_pct is not null
      and manager_id is not null
      and salary>2500;