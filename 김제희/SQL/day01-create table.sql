/*
게시판 테이블 명 : t_board 
- 글번호    :  no         number(5)        반드시 존재 중복허용X
                        not null + unique => primary key
- 제목      : title       varchar2(200)    반드시 존재
- 내용      : content     varchar2(4000)
- 조회수    : view_cnt    number(5)        0으로 초기화
- 등록일    : reg_date     date            현재시간 초기화
*/

create table t_board02(
        no            number(5)         PRIMARY KEY --두 개 이상의 필드도 가능
    ,   title         varchar2(200)     not null
    ,   content       varchar2(4000)    
    ,   view_cnt      number(5)         default 0
    ,   reg_date      date              default sysdate
);

select * from tab;

rename t_board02 to board02_t;

desc board02_t;

rename board02_t to t_board02;

desc t_board02;

--테이블 이름 수정

create table t_test(
        col_01 varchar2(10)
    ,   col_02 number
);

desc t_test;

alter table t_test
    add col_03 varchar2(20);
    
alter table t_test
    add(
            col_04 date
        ,   col_05 number(2)
        );
        
desc t_test;

--콜론삭제

alter table t_test
    drop column col_04;

desc t_test;

alter table t_test
    rename column col_05 to col_04;

desc t_test;

--컬럼 수정




    