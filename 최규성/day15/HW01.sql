select j.job_title, avg(e.salary)
    from employees e left outer join jobs j
         on e.job_id = j.job_id(+)
    where e.salary >= 10000
    group by j.job_title
    order by 2 desc;
    