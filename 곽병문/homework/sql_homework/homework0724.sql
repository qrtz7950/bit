/*  2.
    각 도시(city)에 있는 모든 부서 직원들의 평균급여를 조회하고자 한다. 평균급여가
    가장 낮은 도시부터 도시명(city)과 평균연봉, 해당 도시의 직원수를 출력하시오. 단,
    도시에 근무하는 직원이 10명 이상인 곳은 제외하고 조회하시오.
*/
select l.city 도시이름, avg(salary) 평균급여, count(l.city) 직원수
  from employees e inner join departments d
    on e.department_id = d.department_id inner join locations l
    on d.location_id = l.location_id
  group by l.city
  having count(l.city) < 10
  order by 3 desc;
  
/*  6.
    업무명(job_title)이 ‘Sales Representative’인 직원 중에서 연봉(salary)이 9,000이상,
    10,000 이하인 직원들의 이름(first_name), 성(last_name)과 연봉(salary)를 출력하시오
*/
select e.first_name, e.last_name, e.salary
  from employees e inner join jobs j
    on e.job_id = j.job_id
  where j.job_title = 'Sales Representative'
        and e.salary between 9000 and 10000;
        
/*  7.
    부서별로 가장 적은 급여를 받고 있는 직원의 이름, 부서이름, 급여를 출력하시오. 이름은
    last_name만 출력하며, 부서이름으로 오름차순 정렬하고, 부서가 같은 경우 이름을 기준
    으로 오름차순 정렬하여 출력합니다
*/
select e.last_name 이름, d.department_name 부서이름, e.salary 급여
  from employees e left outer join departments d
    on e.department_id = d.department_id
  where (d.department_name, e.salary)
        in
        (
        select d2.department_name, min(e2.salary)
          from employees e2 inner join departments d2
            on e2.department_id = d2.department_id
          group by d2.department_name
        )
        or d.department_id is null
  order by d.department_name asc, e.last_name asc;
  
/*  14.
    Employees 테이블에서 입사한달(hire_date)별로 인원수를 조회하시오
*/
select to_char(e.hire_date, 'mm')||'월' 월, count(e.hire_date) 직원수
  from employees e
  group by to_char(e.hire_date, 'mm')
  order by 1 asc;
  
/*  15.
    부서별 직원들의 최대, 최소, 평균급여를 조회하되, 평균급여가 ‘IT’ 부서의 평균급여보다
    많고, ‘Sales’ 부서의 평균보다 적은 부서 정보만 출력하시오.
*/
select d.department_name 부서명, trunc(max(e.salary), -2) 최대급여
     , trunc(min(e.salary),-2) 최소급여, trunc(avg(e.salary), -2) 평균급여
  from employees e inner join departments d
    on e.department_id = d.department_id
  group by d.department_name
  having avg(e.salary) > (
                         select avg(salary)
                         from employees e2 inner join departments d2
                           on e2.department_id = d2.department_id
                         group by d2.department_name
                         having d2.department_name = 'IT'
                         )
    and  avg(e.salary) < (
                         select avg(salary)
                         from employees e3 inner join departments d3
                           on e3.department_id = d3.department_id
                         group by d3.department_name
                         having d3.department_name = 'Sales'
                         );

/*  17.
    부서별 입사월별 직원수를 출력하시오. 단, 직원수가 5명 이상인 부서만 출력되어야 하며
    출력결과는 부서이름 순으로 한다
*/
select d.department_name 부서명, to_char(e.hire_date, 'mon') 입사월
     , count(to_char(e.hire_date, 'mon')) 직원수
  from employees e inner join departments d
    on e.department_id = d.department_id
  group by d.department_name, to_char(e.hire_date, 'mon')
  having count(to_char(e.hire_date, 'mon')) >= 5
  order by d.department_name asc;
  
/*  18.
    국가(country_name) 별 도시(city)별 직원수를 조회하시오. 단, 부서에 속해있지 않은 직원
    이 있기 때문에 106명의 직원만 출력이 된다. 부서정보가 없는 직원은 국가명과 도시명
    대신에 ‘<부서없음>’이 출력되도록 하여 107명 모두 출력되게 한다.
*/
select nvl(c.country_name, '<부서없음>') 국가명, nvl(l.city, '<부서없음>') 도시명
     , count(l.city) 직원수
  from employees e left outer join departments d
    on e.department_id = d.department_id left outer join locations l
    on d.location_id = l.location_id left outer join countries c
    on l.country_id = c.country_id
  group by c.country_name, l.city
  order by c.country_name, l.city asc;
  
/*  19.
    각 부서별 최대 급여자의 아이디(employee_id), 이름(first_name), 급여(salary)를 출력
    하시오. 단, 최대 급여자가 속한 부서의 평균급여를 마지막으로 출력하여 평균급여와 비교할 수
    있게 할 것.
*/
select e.employee_id 직원아이디, e.first_name 이름, e.salary 급여
     ,  부서평균
  from employees e left outer join (
                                    select round(avg(ee.salary), 2) 부서평균
                                         , ee.department_id eedi
                                         , max(ee.salary) mes
                                      from employees ee
                                      group by ee.department_id
                                    )
    on e.department_id = eedi
  where e.salary = mes
  order by e.employee_id asc;

/*  21.
    커미션(commission_pct)을 가장 많이 받은 상위 4명의 부서명(department_name), 직원명
    (first_name), 급여(salary), 커미션(commission_pct) 정보를 조회하시오. 출력결과는
    커미션을 많이 받는 순서로 출력하되 동일한 커미션에 대해서는 급여가 높은 직원이 먼저 출력
    되게 한다
*/
select d.department_name, e.first_name, e.salary, e.commission_pct
  from (
        select ee.*, rownum
          from employees ee
          where ee.commission_pct is not null
          order by ee.commission_pct desc, ee.salary desc
        )e inner join departments d
    on e.department_id = d.department_id
  where rownum <= 4;
        