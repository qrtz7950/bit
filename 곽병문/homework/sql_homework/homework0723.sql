/*  1.
    EMPLOYEES 테이블에서 급여를 많이 받는 순서대로 조회했을 때 결과처럼 6번째부터
    10번째까지 5명의 last_name, first_name, salary를 조회
*/
select ee.RANKING, ee.last_name, ee.first_name, ee.salary
  from (
        select e.*, rank() over(order by e.salary desc) RANKING
          from employees e
        )ee
  where ee.RANKING between 6 and 10;
/*  2.
    사원의 부서가 속한 도시(city)가 ‘Seattle’인 사원의 이름, 해당 사원의 매니저 이름,
    사원의 부서 이름을 출력하시오. 이때 사원의 매니저가 없을 경우 ‘<없음>’이라고 출력
    이름은 last_name만 출력하며, 사원의 이름을 오름차순으로 정렬
*/
select e.last_name 사원이름
     , nvl(m.last_name, '<없음>') 매니저이름
     , d.department_name 부서이름
  from employees e left outer join employees m
    on e.manager_id = m.employee_id left outer join departments d
    on e.department_id = d.department_id left outer join locations l
    on d.location_id = l.location_id
  where l.city = 'Seattle'
  order by 1 asc;

/*  3.
    각 업무( job) 별로 연봉(salary)의 총합을 구하고자 한다. 연봉 총합이 가장 높은
    업무부터 업무명(job_title)과 연봉 총합을 조회
    단, 연봉총합이 30,000보다 큰 업무만 출력
*/
select j.job_title 업무명, sum(e.salary)
  from employees e inner join jobs j
    on e.job_id = j.job_id
  group by j.job_title
  having sum(e.salary) > 30000
  order by sum(e.salary) desc;

/*  4.
    각 사원(employee)에 대해서 사번(employee_id), 이름(first_name), 업무명(job_title),
    부서명(department_name)을 조회/ 단, 도시명(city)이 ‘Seattle’인 지역(location)의
    부서(department)에 근무하는 직원을 사원번호 오름차순순으로 출력
*/
select e.employee_id, e.first_name, j.job_title, d.department_name
  from employees e inner join jobs j
    on e.job_id = j.job_id left outer join departments d
    on e.department_id = d.department_id left outer join locations l
    on d.location_id = l.location_id
  where l.city = 'Seattle'
  order by 1 asc;

/*  5.
    2001~2003년사이에 입사한 직원의 이름(first_name), 입사일(hire_date), 관리자사번
    (employee_id), 관리자 이름(fist_name)을 조회합니다. 단, 관리자가 없는 사원정보도
    출력결과에 포함시켜 출력한다
*/
select e.first_name 직원이름
     , to_char(e.hire_date, 'yyyy-mm-dd AM hh12:mi:ss') 입사일
     , m.employee_id 관리자사번
     , nvl(m.first_name, e.first_name)
  from employees e left outer join employees m
    on e.manager_id = m.employee_id
  where to_number(to_char(e.hire_date, 'yyyy'), '9999') between 2001 and 2003;

/*  6.
    ‘Sales’ 부서에 속한 직원의 이름(first_name), 급여(salary), 부서이름(department_name)을
    조회/ 단, 급여는 100번 부서의 평균보다 적게 받는 직원 정보만 출력되어야 한다
*/
select e.first_name, e.salary, d.department_name
  from employees e inner join departments d
    on e.department_id = d.department_id
  where (
        select avg(salary)
          from employees ee
          where ee.department_id = 100
          group by ee.department_id
        )>e.salary
        and d.department_name = 'Sales';