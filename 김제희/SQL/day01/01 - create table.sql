/*
게시판 테이블 명 : t_board 
- 글번호    :  no         number(5)
- 제목      : title       varchar2(200)
- 내용      : content     varchar2(4000)
- 조회수    : view_cnt    number(5)
- 등록일    : reg_date     date
*/

create table t_board(
        no            number(5)
    ,   title         varchar2(200)
    ,   content       varchar2(4000)
    ,   view_cnt      number(5)
    ,   reg_date      date
);

select * from tab;

desc t_board;

drop table t_board;