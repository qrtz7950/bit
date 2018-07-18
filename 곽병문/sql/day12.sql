/*
    다수의
    라인을
    주석처리
*/
-- 한줄 주석처리

/* 
    게시판 테이블명 : t_board
    - 글번호   : no        number(5)
    - 제목    : title      varchar2(200)
    - 내용    : content    varchar2(4000)
    - 조회수   : view_cnt  number(5)
    - 등록일   : reg_date  date
 */

create table t_board(
    no          number(5)
    , title       varchar2(200)
    , content     varchar2(4000)
    , view_cnt    number(5)
    , reg_date    date
);

select * from tab;

describe t_board;

desc t_board;

drop table t_board;

select * from t_board;

truncate table t_board;

/* 
    게시판 테이블명 : t_board
    - 글번호   : no        number(5)       -- 반드시 존재 , 중복허용X   
                                          -- not null + unique => primary key
    - 제목    : title      varchar2(200)   -- 반드시 존재
    - 내용    : content    varchar2(4000)
    - 조회수   : view_cnt  number(5)       -- 0으로 초기화
    - 등록일   : reg_date  date            -- 현재날짜로 초기화
 */
 
 create table t_board(
    no          number(5)       primary key    -- 
    , title     varchar2(200)   not null       -- 필수 항목 표시
    , content   varchar2(4000)
    , view_cnt  number(5)       default 0          -- 초기값 설정
    , reg_date  date            default sysdate
 );
 
 desc t_board;
 
 rename t_board to t_boardd;
 
 desc t_boardd;
 
 rename t_boardd to t_board;
 
 create table t_test(
    col_01      varchar2(10)
    , col_02    number
);

desc t_test;

alter table t_test
    add col_03 varchar2(20);

ALTER TABLE T_TEST
    ADD (COL_04 DATE
         , COL_05 NUMBER(2)
    );
    
ALTER TABLE T_TEST
    MODIFY COL_01 VARCHAR2(20);

ALTER TABLE T_TEST
    DROP COLUMN COL_04;

ALTER TABLE T_TEST
    RENAME COLUMN COL_05 TO COL_04;
    
desc t_test;

/*
    INSERT 예제
    번호 : 1
    제목 : 제목1
    내용 : 내용1
    조회수 : 0
    등록일 : 현재날짜
*/
insert into t_board(no, title, content, view_cnt, reg_date)
    values(1, '제목1', '내용1', 0, sysdate);

select * from t_board;

/*
    INSERT 예제2
    번호 : 2
    제목 : 제목2
    내용 : 연습입니다
    조회수 : 0
    등록일 : 현재날짜
*/
insert into t_board(no, title, content)
    values(2, '제목2', '연습입니다');
    
select * from t_board;

insert into t_board(content, no, title)
    values('연습!!!', 3, '연습');

insert into t_board
    values(4, '크크', '크크킄', 0, sysdate);
    
select * from t_board;

-- UPDATE 예제

update t_board set view_cnt = 100;

-- 글번호 2인 게시물의 조회수를 0으로 수정
update t_board
    set view_cnt = 0 where no = 2;

select * from t_board;

-- 글번호가 3인 게시물의 제목을 디폴트연습 -> 변경된 제목 수정
update t_board
    set title = '변경된 제목' where no=3;
    
-- 글번호가 4인 게시글에서 제목을 '수정된 제목', 내용 '수정된 내용' 변경
update t_board
    set title = '수정된 제목', content = '수정된 내용'
    where no=4;
    
select * from t_board;

-- 글번호가 2인 게시글 삭제
delete from t_board
    where no=2;

-- 전체 삭제
delete from t_board;

-- 전체 게시물 조회
select * from t_board;

select no, title
    from t_board;

select no as 글번호, title 제목, content "내       용", view_cnt 조회수, reg_date 등록일
    from t_board;

select no, view_cnt
    from t_board;
    
update t_board
    set view_cnt = no * 10;

-- 조회수에 100을 더한 "hit조회수" 컬럼 조회
select no, view_cnt, view_cnt+100 as hit조회수
    from t_board;

select no, view_cnt||'회' as 조회수
    from t_board;
    
-- 오늘은 7월 18일입니다
select '오늘은 ' || 7 || '월' || 18 || '일 입니다' as "현재 날짜"
    from dual;

select '날짜정보 : ' || sysdate as "날짜 정보"
    from dual;
    
/*
    employees 테이블의 모든 목록을 다음과 같이 조회
    King사원의 사원번호는 100번이고, 연봉은 24000입니다.
    Kochhar사원의 사원번호는 101번이고, 연봉은 17000입니다.
    ...
    Gietz사원의 사원번호는 107번이고, 연봉은 8300입니다.
*/

select last_name||'사원의 사원번호는 ' || employee_id
    ||'번이고, 연봉은 ' ||salary||'입니다.' as 사원정보
    from employees;
    
desc employees;

-- employees테이블에서 연봉이 5000 이상인 사원 조회
select * from employees
    where salary>=5000;
    
-- employees테이블에서 부서번호가(department_id) 80인 사원목록 조회
select * from employees
    where department_id = 80;
    
-- employees테이블에서 부서번호가(department_id) 80이 아닌 사원목록 조회
select * from employees
    where department_id != 80;

-- employees테이블에서 연봉이 10000~20000 사이인 사원목록 조회
select * from employees
    where salary >= 10000 and salary <= 20000;

select * from employees
    where salary between 10000 and 20000;

-- employees테이블에서 연봉이 15000이상이거나 부서번호가 80인 사원목록 조회
select * from employees
    where salary >= 10000 or department_id = 80;

-- employees테이블에서 부서번호가 80, 90, 100인 사원목록 조회
select * from employees
    where department_id = 80 or department_id = 90
                             or department_id = 100;

select * from employees
    where department_id in(80, 90, 100);
    
select employees.department_id, employees.*
    from employees
    where department_id in(80, 90, 100);
    
select e.department_id, e.*
    from employees e            --테이블명은 alias 안쓰고 그냥 함
    where e.department_id in(80, 90, 100);
    
-- employees 테이블에서 firts_name 'Peter'인 사원목록 조회
select *
    from employees
    where first_name = 'Peter';
    
-- employees 테이블에서 firts_name 앞글자가 'P'인 사원목록 조회
select *
    from employees
    where first_name like 'P%';     -- like     % 0개이상의 문자

-- employees 테이블에서 firts_name 앞글자가 'P'이고 다섯글자인 사원목록 조회
select *
    from employees
    where first_name like 'P____';     -- like  _ 1개의 문자

-- employees 테이블에서 firts_name 두번째 글자가 'e'인 사원목록 조회
select *
    from employees
    where first_name like '_e%';

-- employees 테이블에서 firts_name 't' 포함된 사원목록 조회
select *
    from employees
    where first_name like '%t%';    -- 앞 %넣으면 검색속도 느림, 안하는게 좋다

-- commissio_pct가 없는 사원 조회
select *
    from employees
    where commission_pct is null;      -- null값 찾기
    
-- commissio_pct를 가지는 사원 조회
select *
    from employees
    where commission_pct is not null;   -- null값 제외
    
-- commissio_pct를 가지는 사원 중 사원번호, 연봉, 커미션, 보너스 조회
-- 보너스 = 연봉 * 커미션
select employee_id, salary, commission_pct, salary * commission_pct as bonus
    from employees
    where commission_pct is not null;
/*
    모든 사원 중 사원번호, 연봉, 커미션, 보너스 조회
    보너스 = 연봉 * 커미션
    커미션 업으면 커미션, 보너스 0으로 조회
    nvl(컬럼면, value) : null값을 임의의 value로 변경하는 함수
*/
select employee_id, salary, nvl(commission_pct, 0), salary * nvl(commission_pct, 0) as bonus
    from employees;