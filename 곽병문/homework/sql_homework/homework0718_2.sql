-- 1번
/* 112, 118부서를 대상으로 과장과 사원의 이름, 직급, 급여, 부서ID를 조회하되, 급여는 1500 이상 4000 이하인 직원만 
   출력되도록 하시오. 
   단, 급여가 많은 사람부터 화면에 출력합니다.
*/
select name, title, dept_id 
    from s_emp
    where dept_id in(112, 118) 
      and title in('과장', '사원')
      and salary between 1500 and 4000;

-- 2번
/* 관리자가 없는 직원의 이름, 직급, 급여를 조회하시오. 
   (힌트. manager_id 컬럼이 자신의 상사가 누구인지 알 수 있는 컬럼입니다.)
*/
select name, title, salary
    from s_emp
    where manager_id is null;
    
-- 3번
-- 직급이 부장이면서 급여가 3000 이상인 직원의 이름, 직급, 급여를 조회하시오
select name, title, salary
    from s_emp
    where title like '%부장'
      and salary >= 3000;
    
-- 4번
/* 직급이 부장과 과장인 사람들을 대상을 이름, 직급, 급여를 조회하시오. 
   단, 112, 113, 117, 118 부서에 소속되어 있는 사원 중에서 급여가 2300 ~ 3000 사이인 직원만 조회되도록 하시오.
   부서순으로 출력합니다.
*/
select name, title, salary
    from s_emp
    where (title like '%부장' or title = '과장')
      and dept_id in(112,113,117,118)
      and salary between 2300 and 3000;

-- 5번
-- 직급이 부장 혹은 과장이면서 03월에 입사한 직원의 이름, 직급, 급여, 입사일을 조회하시오
select name, title, salary, start_date
    from s_emp
    where (title like '%부장' or title = '과장')
      and to_char(start_date, 'MM') like '03';

-- 6번
/* 직원의 연봉에 1000 을 더한 값을 조회하시오. 
   연봉은 급여에 16을 곱하면 됩니다. 단, 연봉은 ALIAS를 지정하여 화면에 출력시 "직원연봉" 으로 출력되도록 합니다. 
*/
select name, title, salary+1000, salary*16 as 직원연봉
    from s_emp;
    
-- 7번
/* 출력결과가 다음과 같도록 조회하시오. 

직원 급여 
--------------------------------- 
박구곤 사장의 급여 5,000 
손명성 기획부장의 급여 3,000 
이은선 영업부장의 급여 3,500 
서의홍 총무부장의 급여 3,000 
김심선 인사부장의 급여 3,200 
... 
... 
*/
select name ||' '|| title ||'의 급여' || salary as "직원 급여"
    from s_emp;
    
-- 8번
/* 커미션을 받으면서 자신을 관리하는 관리자가 있는 직원을 대상으로 급여가 2500 이상인 직원을 조회하시오. 
   화면에 출력 시 직원의 연봉이 낮은 사람부터 출력합니다
*/
select name, title, salary
    from s_emp
    where commission_pct is not null
      and manager_id is not null
      and salary >= 2500
    order by salary asc;
