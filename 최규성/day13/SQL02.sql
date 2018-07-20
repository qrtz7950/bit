select employee_id as 사원번호, first_name 사원이름, nvl (to_char(manager_id),'매니저없음') 매니저번호
    from employees;
    
--부서번호가 80,90,100번에 해당하지않는 사원목록 조회

select * from employees
    where department_id != 80
    and department_id ^= 90
    and department_id <> 100;
    
select * from employees
    --where department_id not in (80,90,100); or
    where not department_id in (80,90,100);
    
    
    -------------------------------------------------------
    
    
--월급이 많은 사원순으로 조회
select * from employees
    order by salary DESC;
    
    --SALARY 컬럼을 맨앞(1번째)으로 오게하고 월급으로 명명
    select employees.salary 월급, employees.* from employees
        --order by 월급 desc;
         order by 1 desc;
    --employees 가 너무길어
    select e.salary, e.* from employees e
        order by e.salary desc;
        
--연봉이 높은 사원순으로 조회. 단, 연봉이 같은 경우는 last_name을 기준으로 사전순으로 조회
select e.salary, e.last_name , e.* from employees e
    order by e.salary DESC, e.last_name asc;
    
/*
    to_char() : 숫자형, 날짜형을 문자형으로 변경
    
    to_char(날짜, '포맷문자')      yy(년), m(월), d(일)
                                h(시), mi(분) , s(초)
                            
    to_char(숫자, '포맷문자')     9(자리수)   0(비어있는 자리수를 0으로 채움)
                                ,(액수 표현시 3자리마다 ','표현)
                                .(실수 소수점 자리수 표현)
    
    to_char(hire_date, 'yyyy')
*/

select sysdate 
    , to_char(sysdate, 'yy/mm/dd')현재날짜 
    , to_char(sysdate, 'hh:mi:ss')현재시간
    , to_char(sysdate, 'hh24:mi:ss') "현재시간(24h)"
    from dual;

/*
    전체사원목록 조회. 단, 입사연도 출력시 18/07/20 => 18.07.20 변경 조회
*/
select employee_id, last_name
    , to_char(hire_date, 'yy.mm.dd') hire_date
    from employees;

/*
    사원중 2005년 9월에 입사한 목록 조회
*/
select *
    from employees
    where to_char(hire_date, 'yyyymm') = '200509';
    
--연봉을 세자리마다 ','로 표시
select employee_id, last_name, to_char(salary,'900,000') "salary(공백0표시)"
    from employees;
    
--입사년도가 2001, 2002, 2003인 사원 목록조회
select employee_id, last_name, hire_date
    from employees
    where to_char(hire_date, 'yyyy') = '2001' 
    or to_char(hire_date, 'yyyy') = '2002'
    or to_char(hire_date, 'yyyy') = '2003';
    ----------------------------------------
select employee_id, last_name, hire_date
    from employees
    where to_char(hire_date, 'yyyy') in ('2001', '2002', '2003');
    --------------------------------------------

create table t_year(
    year number(4)
    );
    
insert into t_year values(2001);
insert into t_year values(2002);
insert into t_year values(2003);

select * from t_year;
--하나의 셀렉트절 안에 셀렉트절이 들어가는 경우를 '서브쿼리'라고 부른다.
select employee_id, last_name, hire_date
    from employees
    where to_char(hire_date,'yyyy')
        in (
                select year from t_year
            );
            
------------------------------------------------------
--입사년도가 2001,2,3 인 사원 중에 부서번호가 90인 사원목록 조회

select * from employees
    where (to_char(hire_date, 'yyyy') = '2001'
        or to_char(hire_date, 'yyyy') = '2002'
        or to_char(hire_date, 'yyyy') = '2003')
        and department_id = 90;
    ---------------------------------------------------
select employee_id, last_name, hire_date, department_id
    from employees
    where to_char(hire_date, 'yyyy') in ('2001','2002','2003')
        and department_id = 90;
        
        
    -----------------------------------------------------

select 'Hello World', upper('hello world'), lower('HELLO WORLD'), length('Hello World')
    from dual;
    
select substr('2018년 07월 20일', 1,5)
     , substr('2018년 07월 20일', 7,2)
    from dual;
    
select '        trim전        ' , length('        trim전        ')
     ,trim('        trim후        '),length(trim('        trim후        '))
     ,ltrim('        ltrim후        ')
     ,rtrim('        rtrim후        ')
    from dual;
    
select replace('가나다라마바사', '다라', '떠러')
        , instr('가나다라마바사', '다라')
        , instr('가나다라마바사', '다바')
    from dual;

-- last_name에 'en'이 포함된 사원목록 조회

select last_name from employees
    --where lower(last_name) like '%en%'; %가 앞에 있으면 성능저하 문제
    where instr(lower(last_name), 'en') <> 0;
    
-----------------------------------------------------------------

select sysdate from dual;

--현재달의 마지막날이 몇일인가
select to_char(sysdate,'mm') || '월의 마지막날은 ' || 
        to_char(last_day(sysdate),'dd')|| '일 입니다'
    from dual;
--몇달후가 궁금함
select sysdate 현재날짜 
    , add_months(sysdate, 1) "현재날짜 + 1달"
    , add_months(sysdate, 6) "현재날짜 + 6달"
    from dual;
    
--현재날짜에서 가장 가까운 월요일의 날짜 조회
select next_day(sysdate,'월요일') from dual;
-------------------------------------------------
select to_number('1234') from dual;
select 100+200, '100' +200 from dual;   --버전이 올라가면서 to_number는 잘안쓰게됨

select '20170411'
    , to_date('20170411', 'yyyymmdd') 날짜변환1
    , to_date('20170411', 'yyyyddmm') 날짜변환2
    , to_char(to_date('20170411', 'yyyymmdd'), 'yyyy-mm-dd') 날짜변환3
    from dual;
    
----------------------------------------------

/*
    salary가 20000이상이면  '고액연봉자'
             10000~19999면 '보통연봉자'
             00000~ 9999면 '저액연봉자'
 */          
select employee_id, last_name, salary
        ,case when salary >= 20000 then '고액연봉자'
              when salary >= 10000 then '보통연봉자'
              else '저액연봉자'
        end as "salary type"
    from employees;
    
--총사원 수 조회
select count(*) 총사원수
    from employees;
    
--부서번호가 80인 사원수 조회
select count(*)
    from employees
    where department_id = 80;

--사원들의 job_id 조회 (중복금지) --distinct : 중복을 제외
select distinct job_id
    from employees;

--job_id 종류수
select count(distinct job_id)
    from employees;
    
--최대급여, 최소급여,총액,평균(소수점 3자리에서 반올림) 조회
select max(salary) 최대급여 , min(salary) 최소급여
        ,sum(salary) 급여총액
        ,round(avg(salary),2) 급여평균
    from employees
    order by salary desc;
    
------시퀀스----------------------------------------------------
create sequence seq_01;

select seq_01.nextval from dual;
select seq_01.currval from dual;

create sequence seq_02
    start with 201807000001;
    
select seq_02.nextval from dual;

create sequence seq_03
    increment by 5;

select seq_03.nextval from dual;

alter sequence seq_03
    increment by 3;
    
----------------------------------------------------------------
select * from t_board;

insert into t_board(no, title, content)
    values(3, '삽입예제', '삽입안됨');
    
create sequence seq_t_board_no;

delete from t_board;
truncate table t_board;

insert into t_board(no,title,content)
    values(seq_t_board_no.nextval,'제목1', '시퀀스에 의한 삽입');
    
select * from t_board;

--------------------탑N쿼리--------------------------------

select * from employees
    where rownum <= 5;
    
select * from employees
    where rownum = 1;
    
select * from employees
    where rownum = 5;
    
--급여가 많은 사원 순으로 상위 5명 조회
select * from employees
    where rownum <=5
    order by salary desc;
---------------해석순서는 from -> where -> select -> order by-------------
    
select *
    from(
    select * from employees             
        order by salary desc
    )
    where rownum < = 5;
    
--중복되지않는 부서번호 조회
select distinct department_id
    from employees;

--부서별 부서번호 조회
select department_id
    from employees
    group by department_id;
    
-- 부서별 사원ㅅ ㅜ조회
select department_id, count(department_id)
    from employees
    group by department_id;

--부서별 최대급여, 최소급여, 평균급여 조회
select department_id , max(salary) 최대급여,min(salary) 최소급여
        , round(avg(salary),1) 평균급여
    from employees
    group by department_id;
    
/*
    부서별 평균급여 조회
    단, 평균급여가 5000이상인 부서만 조회
    where -> group by 순
*/
select department_id, round(avg(salary),1) avg
    from employees
    group by department_id
    having avg(salary) >= 5000;


select  avg_salary
    from(
        select department_id, round (avg(salary),1) as avg_salary
            from employees
            group by department_id
        )
   where avg_salary >= 5000;
   
/*
    부서번호를 가지는 부서 중 사원수가 5명이상인 부서조회
    단, 부서는 부서번호 오름차순 정렬
*/
select department_id, count(*) as depart_count
    from employees
    where department_id is not null
    group by department_id
    having count(*) >= 5
    order by department_id asc;
    
/*
    한화면에 사원을 5명씩 출력한다 가정했을 떄의 
    첫번째 페이지에 출력할 사원목록 조회
*/

select * from employees
    where rownum <= 5;
    
/*
    두번째 페이지에 출력할 사원목록 조회
*/

select *    
    from (
            select e.*, rownum as rn
                from employees e
         )    
    where rn >= 6 and rn <= 10;
    
--급여를 내림차순순으로 정렬했을때의 두번째 페이지에 조회될 사원목록
select *
    from(
        select e.* , rownum rn
            from (
                    select *
                     from employees
                    order by salary desc
                ) e
        )
where rn >= 6 and rn <= 10;


-------------------------------------------------------------
select  employee_id, first_name, department_id, rownum
    from employees;
    
/*
    rownum_number() 함수
    rownum_number() over([partition by 컬럼명] order by 컬럼명)
    
    rank() 함수
    rank() over([partition by 컬럼명] order by 컬럼명)
    
    partition by :  지정된 컬럼에 해당하는 그룹설정
    order by : 지정된 컬럼에 대한 위치/순서 지정
*/
--급여 순위 (위에것(row_number)을 쓰면 서브쿼리로 안해도 됨)

select employee_id, first_name, department_id, salary
    , row_number() over(order by salary desc) rnum
    from employees;
    

select e.*, rownum
    from(
        select employee_id, first_name, department_id, salary
            from employees
            order by salary desc
        ) e;
          
--급여 순위 (공동 채택, 누락순위 발생)
select employee_id, first_name, department_id, salary
    , rank() over(order by salary desc) rrank
    from employees;
    
--급여 순위 (공동 채택, 누락순위 미발생)
select employee_id, first_name, department_id, salary
    , dense_rank() over(order by salary desc) rrank
    from employees;
    
--========================과제02===================================
--1. 부서번호를 가지는 부서 중 사원수가 5명이상인 부서를 조회하시오
select department_id, count(*) as depart_count
    from employees
    where department_id is not null
    group by department_id
    having count(*) >= 5;

    
--2. Employees 테이블에서 입사한 달별로 인원수를 조회하시오
select e.*
    from(
        select to_char(hire_date,'mm') 월 , count(*) as 직원수
            from employees
            group by to_char(hire_date, 'mm')
            order by to_char(hire_date,'mm') asc
        ) e;
        
/* 
 3.커미션(commission_pct)별 직원수를 조회하시오. 커미션은 아래실행결과처럼 0.2, 0.25는
모두 .2로, 0.3, 0.35는 .3 형태로 출력되어야 한다. 단, 커미션 정보가 없는 직원들도 있는
데 커미션이 없는 직원 그룹은 ‘<커미션 없음>’이 출력되게 한다.
*/

select trunc(to_char(nvl(commission_pct,0),1)) 커미션 ,  count(trunc(commission_pct,1),1) 직원수
    from employees;
    group by 
    