/*
    employees테이블에서 사원번호, 사원이름, 매니저 번호 조회
    단, manager가 없는 경우는 0으로 출력
*/
select employee_id 사원번호, first_name 사원이름, nvl(manager_id, 0) 매니저번호
    from employees;

/*
    employees테이블에서 사원번호, 사원이름, 매니저 번호 조회
    단, manager가 없는 경우는 '매니저없음'dmfh cnffur
*/
select employee_id 사원번호, first_name 사원이름, nvl(to_char(manager_id), '매니저없음') 매니저번호
    from employees;
    
-- 부서번호가 80, 90, 100에 해당하지 않는 사원 목록 조회
select *
    from employees
   where department_id != 80
     and department_id ^= 90
     and department_id <> 100;
     
-- 월급이 많은 순서대로 사원 정렬
select employees.salary, employees.*
    from employees
    order by employees.salary desc;
    
select e.salary 월급, e.*
     from employees e
    order by 월급 desc;
    
select e.salary 월급, e.*
     from employees e
    order by 1 desc;    -- 컬럼순서
    
/*
    연봉이 높은 사원순으로 조회
    단, 연봉이 같은경우 last_name을 기준으로 사전순으로 조회
*/
select e.salary, e.last_name, e.*
     from employees e
    order by e.salary, e.last_name;
--  order by 1 desc, 2 asc;

/*
    to_char() : 숫자형, 날짜형을 문자형으로 변경
       
    to_char(날짜, '포맷문자')     yy(년), m(월), d(일)
                                h(시), mi(분), s(초)
    to_char(숫자, '포맷문자')     9(자리수)  0(비어있는 자리수 0 채움)
                                ,(액수표현시 3자리마다 ,표현)
                                .(실수 소수점 자리수 표현)
*/
select sysdate
    , to_char(sysdate, 'yy/mm/dd') 현재날짜
    , to_char(sysdate, 'hh:mi:ss') 현재시간
    , to_char(sysdate, 'hh24:mi:ss') "현재시간(24h)"
    from dual;

/*
    전체사원목록 조회
    단, 입사년도 출력시 18/07/20 => 18.07.20 변경 조회
*/
select employee_id, last_name, to_char(sysdate, 'yy.mm.dd') hire_date
    from employees;
    
-- 사원중 2005년 9월에 입사한 목록 조회
select *
    from employees
    where to_char(employees.hire_date, 'yyyymm') = '200509';
    
-- 연봉으로 세자리마다 , 표시
select employee_id, last_name, to_char(salary, '999,999') salary
    from employees;
    
-- 입사년도가 2001, 2002, 2003인 사원목록 조회
select hire_date, employees.*
    from employees
    where to_char(hire_date, 'yyyy') = '2001'
       or to_char(hire_date, 'yyyy') = '2002'
       or to_char(hire_date, 'yyyy') = '2003';
       
select hire_date, employees.*
    from employees
    where to_char(hire_date, 'yyyy') in ('2001', '2002', '2003');
    
create table t_year(
    year number(4)
);
insert into t_year values(2001);
insert into t_year values(2002);
insert into t_year values(2003);

select * from t_year;

select e.hire_date, e.*
    from employees e
    where to_char(e.hire_date, 'yyyy')
       in (
            select year from t_year         -- subquery
          );
          
-- 입사년도가 2011, 2002, 2003인 사원 중에 부서번호가 90인 사원목록 조회
select *
  from employees e
 where to_char(e.hire_date, 'yyyy') in ('2001','2002','2003')
   and e.department_id =90;

select 'Hello World'
        , upper('Hello World')
        , lower('Hello World')
        , length('Hello World')
    from dual;
    
select substr('2018년 7월 20일', 1, 5)
       , substr('2018년 7월 20일', 7, 3)
  from dual;

-- last_name 에 'en'이 포함된 사원목록 조회
select last_name
  from employees
 where instr(lower(last_name), 'en') != 0;      -- instr 특정문자 위치 확인 , 없으면 0

select sysdate from dual;

-- 현재달의 마지막 날이 몇일?
select to_char(sysdate, 'mm') || '월의 마지막날은 '
       || to_char(last_day(sysdate), 'dd') || '일 입니다' "마지막 날"
  from dual;
  
select to_char(sysdate, 'yyyy-mm-dd') 현재날짜
       , to_char(add_months(sysdate, 1)) "현재날짜 + 한달"
       , to_char(add_months(sysdate, 6)) "현재날짜 + 6개월"
  from dual;
  
--현재날짜에서 가장 가까운 월요일의 날짜 조회
select next_day(sysdate, '월요일') from dual;

select to_number('1234') from dual;

select to_date('20170411')
       , to_date('20170411', 'yyyymmdd') 날짜변환1
       , to_date('20170411', 'yyyyddmm') 날짜변환2
       , to_char(to_date('20170411', 'yyyymmdd'), 'yyyy-mm-dd') 날짜변환3
  from dual;
  
/*
    salary 20000 이상         '고액연봉자'
           10000~20000 사이   '보통연봉자'
           10000 미만         '저액연봉자'
*/
select employee_id, last_name, salary
       , case when salary >= 20000 then '고액연봉자'
              when salary >= 10000 then '보통연봉자'
              else '저액연봉자'
         end as "salary type"
  from employees;

-- employees 테이블 총 사원수 조회
select count(*) "총 사원수"
  from employees;
  
-- 부서번호가 80인 사원수
select count(*)
  from employees
 where department_id = 80;
 
-- employees테이블 job_id 조회(단, 중복금지)
select distinct job_id                     -- distinct : 중복된거 제외
  from employees;
  
select count(distinct job_id)                      -- distinct : 중복된거 제외
  from employees;
  
-- employees 테이블에서 최대급여, 최소급여
select max(salary) 최대급여
       , min(salary) 최소급여
       , sum(salary) 급여총액
       , round(avg(salary), 2) 급여평균
  from employees;
  

------------------------------------------------------------------
-- 시퀀스
create sequence seq_01;

select seq_01.nextval from dual;        
select seq_01.currval from dual;        -- nextval 쓰고나서부터 사용가능

create sequence seq_02
    start with 20180700001;
    
select seq_02.nextval from dual;

create sequence seq_03
    increment by 5;
    
select seq_03.nextval from dual;

alter sequence seq_03
    increment by 3;
    
select * from t_board;

insert into t_board(no, title, content)
    values(3, '삽입예제', '삽입안됨');  -- no(primary key 써서 중복불가)

create sequence seq_t_board_no;

delete from t_board;
truncate table t_board;

insert into t_board(no, title, content)
    values(seq_t_board_no.nextval, '제목1', '시퀀스에 의한 삽입');

select * from t_board;

--------------------------------------------------------------
-- rownum
select *
  from employees
 where rownum <=5;      --select 전에 rownum을 알 수 없어 옳지 않은 방식
    /* 
        해석순서 
            from => where => select => order by
    */

-- 급여가 많은 사원순으로 상위 5명 조회
/*
select *                    -- 해석순서에 의해 올바르지 않은 값 나옴
  from employees
 where rownum <= 5
 order by salary desc;
 
select *
  from employees
 order by salary desc;
 */
 select *
   from (                   -- 먼저 내림차순 정렬하여 추출한후
         select *
           from employees
          order by salary desc
        )
  where rownum <= 5;        -- 위에서 5명 뽑아냄
  

-----------------------------------------------------------------
-- Group By

-- 중복되지 않는 부서번호 조회
/*
select distinct department_id
  from employees
 order by department_id desc;
 */
 
 select department_id           -- 집합함수와 관련된 것만 사용 가능(해당그룹에서 계산해서)
   from employees
  group by department_id;       -- 같은 내용 그룹화
  
-- 부서별 사원수 조회
select department_id || '번 부서 : ' || count(department_id) || '명' as "부서별 직원수"
  from employees
 group by department_id;
 
-- 부서별 최대급여, 최소급여, 평균급여 조회
select department_id, max(salary) 최대급여, min(salary) 최소급여
       , round(avg(salary),1) 평균급여
  from employees
 group by department_id;

  
-------------------------------------------------------------------
-- Having : 그룹에 조건을 걸 때 사용, 그룹

      -- 순서  
      -- from => where => group by => having => select => order by

 /*
    부서별 평균급여 조회
    단, 평균급여가 5000이상인 부서만 조회
*/
select *
  from (
        select department_id as di, round(avg(salary),1) as asalary
          from employees
         group by department_id
        )
  where asalary>=5000;

select department_id, round(avg(salary),1) avg_salary
  from employees
 group by department_id
  having avg(salary) >= 5000;
  
/*
    부서번호를 가지는 부서 중 사원수가 5명 이상인 부서 조회
    단, 부서는 부서번호 오름차순 정렬
*/
select department_id, count(department_id) 사원수
  from employees
 where department_id is not null
 group by department_id
 having count(department_id)>=5
 order by department_id asc;
 
 /*
    한화면에 사원을 5명씩 출력한다 가정했을 때의
    첫번째 페이지에 출력할 사원목록 조회
*/
select *
  from employees
 where rownum <= 5;
 
 -- 두번째 페이지에 출력할 사원목록 조회
 select *
   from (
         select e.*, rownum as rn
           from employees e
        )
  where rn >= 6 and rn <=10;
 
 /* 
    급여를 내림차순으로 정렬했을 때의 두번째 페이지에 조회될 사원목록
*/
select eee.*
  from (
        select ee.*, rownum rn
          from (
             select e.*
               from employees e
              order by salary desc
            )ee
        )eee
 where rn >5 and rn <= 10;
 
 select employee_id, first_name, department_id, rownum
   from employees;

/*
    rownum_number() 함수
    rownum_number() over ([partition by 컬럼명] order by 컬럼명)
    
    rank() 함수
    rank() over ([partition by 컬럼명] order by 컬럼명)
    
    partition by : 지정된 컬럼에 해당하는 그룹설정
    order by : 지정된 컬럼에 대한 위치/순서 지정
*/
select employee_id, first_name, department_id
       , row_number() over( order by first_name asc) rnum
  from employees;

 select employee_id, first_name, department_id, salary
        , row_number() over(order by salary desc) rnum
   from employees;

select e.*, rownum
  from(
        select employee_id, first_name, department_id, salary
          from employees
         order by salary desc
      ) e;
      
 select employee_id, first_name, department_id, salary
        , rank() over(order by salary desc) rnum
   from employees;