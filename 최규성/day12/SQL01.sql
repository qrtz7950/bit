/*
 게시판 테이블명 : t_board
  - 글번호 : no        number(5)
  - 제목  : title     varchar2(200)
  - 내용  : content   varchar2(4000)
  - 조회수: view_cnt   number(5)
  - 등록일: reg_date   date
*/
create table t_board(       --테이블 생성
    no          number(5),
    title       varchar2(200),
    content     varchar2(4000),
    view_cnt    number(5),
    reg_date    date
);

select * from tab;          --테이블 확인

describe t_board;           --테이블 출력

desc t_board;

drop table t_board;

select * from tab;

/*
     게시판 테이블 : t_board
        -글번호     no         number(5)   반드시존재 중복허용X
        -제목      title      varchar2(200) 반드시존재
        -내용     content     varchar2(4000)
        -조회수    view_cnt    number(5)     0으로 초기화
        -등록일    reg_date    date        등록한 시각으로 초기화
        
        not null + unique(필수 + 중복x) = primary key 
        sysdate = 현재 시간(년월일시분초 다들어감)
*/

create table t_board(
    no      number(5)   primary key
    , title varchar2(200) not null --필수항목
    , content varchar2(4000)
    , view_cnt number(5)    default 0
    , reg_date  date        default sysdate 

);

desc t_board;

rename t_board to t_board_ch;

rename t_board_ch to t_board;

desc t_board;
/*--------------------------------------------------------------------*/
create table t_test(
    col_01 varchar2(10)
    ,col_02 number
);

desc t_test;

alter table t_test
    add col_03 varchar2(20);
    
alter table t_test
    add (
        col_04 date
        ,col_04 number(2)
    );
    
alter table t_test
    modify col_03 varchar2(10);
    
desc t_test;

alter table t_test
    drop column col_04;


alter table t_test
    rename column col_05 to col_04;
    
/*
    게시판 INSERT 예제
    번호: 1
    제목: 제목1
    내용: 내용1
    조회수: 0
    등록일: 현재날짜
*/
insert into t_board(no,title,content,view_cnt,reg_date)
    values(1,'제목1','내용1',0,sysdate);
/*
    insert 예제2
    번호: 2
    제목: 제목2
    내용: 연습입니다
    조회수: 0
    등록일: 현재날짜
*/

insert into t_board(no, title, content)
    values(2,'제목2','연습입니다');

insert into t_board(content, no, title)
    values('디폴트값이 들어갑니다',3,'디폴트연습');
desc t_board;

insert into t_board
    values(4,'제목4','컬럼명생략',10,sysdate);



--모든 게시물의 조회수를 100으로 수정
update t_board
    set view_cnt  = 100;
    
--글번호가 2인 게시물의 조회수를 0으로 수정
update t_board
    set view_cnt = 0
  where no = 2;
  
--글번호가 3인 게시물에서 제목을 디폴트연습 -> 변경된 제목으로 수정
update t_board
    set title = '변경된 제목'
  where no = 3;
  
  
/*
    글번호가 4인 게시글에서
    제목을'수정된 제목', 내용을 '수정된 내용'으로 변경
*/

update t_board
    set title = '수정된 제목', content = '수정된 내용';
  where no = 4;
  
  select * from tab t_board;
  
  /*
    글번호가 2인 게시글 삭제
    */
 --delete from t_board
-- where no =2;
 
 --전체 게시글 삭제
 --delete t_board;


-- 전체 게시물 조회
select * from t_board;

select no, title
    from t_board;
    
select no as 글번호 title 제목, content "내    용"       --맨앞 컬럼에 as를쓰면 그뒤의 컬럼들은 as생략가능
    from t_board;
    
select no,view_cnt
    from t_board;
    
update t_board
    set view_cnt = no *10;
    
--조회수에 100을 더한 "hit조회수"컬럼 조회

select no,view_cnt, view+100
    from t_board;
    
select no,view_cnt ||'회'
    from t_board;
    
select '오늘은 '|| 7 || '월 ' || 18 ||'일입니다.' as 현재날짜
    from dual;


select '날짜정보 : ' || sysdate as 날짜정보
    from dual;
    
select * from tab;

select * from employees;

/*
    employees 테이블의 모든 목록을 다음과 같이 조회
    King 사원의 사원번호는 100번이고, 연봉은 24000입니다.
    Kochhar 사원의 사원번호는 101번이고, 연봉은 17000입니다.
    ....
    Gietz 사원의 사운번호는 107번이고 , 연봉은 8300입니다.
*/

select last_name || '사원의 사원번호는' || employee_id ||'번이고, 연봉은' || salary || '입니다.' as 사원정보
    from employees;
    
desc employees;

--employees 테이블에서 연봉 5000이상인 사원 조회

select * from employees
    where salary >= 5000;
    
--employees 테이블에서 부서번호가 (department_id) 80인 사원목록조회

select * from employees
    where department_id = 80;
    
--employees 테이블에서 부서번호가 80이 아닌 사원목록 조회
select * from employees
    where department_id != 80;
    
--employees 테이블에서 연봉이 10000~20000 인 사원을 조회
select * from employees
    where salary >= 10000 and salary <=20000;
    
select * from employees
    where salary between 10000 and 20000;
    
--employees 테이블에서 연봉이 15000이상이거나 부서번호가 80인 사원목록 조회

select * from employees
    where salary >= 15000 or employee_id = 80;
    
--employees 테이블에서 부서번호가 80,90,100 인사람을 조회
select * from employees
    where employee_id = 80 or employee_id = 90 or employee_id = 100;
    
select * from employees
    where department_id in (80,90,100);
    
select employees.department_id, employees.employee_id, employees.last_name,employees.salary
    from employees
    where department_id in (80,90,100);
    
select employees.department_id as 부서명,employees. *     --부서번호가 맨앞과 뒤에 2번 나온다
    from employees
    where department_id in (80,90,100);
    
select e.department_id ,e. * from employees e
    where e.department_id in (80,90,100);
    
    
--employees 테이블에서 first_name이 'Peter'인 사람을 조회
select * from employees
    where first_name = 'Peter';
    
--employees 테이블에서 first_name의 앞글자가 'P'인 사람을 조회
select * from employees
    where first_name like 'P%';         --P로시작하고 뒤에 0개이상의 문자를 갖는 문자열
    
--employees 테이블에서 forst_name의 앞글자가 'P'이면서 다섯글자인 사원목록 조회
select * from employees
    where first_name like 'P____';      --언더바1개가 1글자를 의미
    
--first_name의 두번째 글자가 'e'인 사원목록 조회
select * from employees
    where first_name like '_e%';
    
--first_name에 't'가 포함된 사원목록 조회
select * from employees
    where first_name like '%t%';    --DB 검색을 위해 맨앞에 %를 넣는것은 좋지않다.
    
--commission_pct가 없는 사원목록 조회
select * from employees
    where commission_pct  is null;
    
--commission_pct를 가지는 사원목록 조회
select * from employees
    where commission_pct is not null;
    
/*
    커미션이 존재하는 사원들에 한해, 사원번호,연봉,커미션,보너스 조회
    보너스 = 연봉 * 커미션
*/
select employee_id, salary, commission_pct, salary * commission_pct as BONUS from employees
    where commission_pct is not null;
    
--모든사원의 사원번호, 연봉, 커미션, 보너스 조회
--커미션이 없는 사원은 커미션, 보너스를 null 에서 0으로 변환 -> nvl(컬럼명,값) :null값을 임의의 값으로 변경하는 함수
select employee_id, salary, nvl(commission_pct,0) commission_pct, salary * nvl(commission_pct,0) as BONUS from employees
    where employees;