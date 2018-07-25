-- java를 이용한 게시판관리프로그램 sql

-- kr.co.mlec.board.vo.BoardVO 객체정보 저장목적
create table tbl_board(
    no  number(5)   primary key
    , title varchar2(200) not null
    , writer varchar2(100) not null
    , view_cnt number(5) default 0
    , reg_date  date default sysdate
);

--게시물번호를 위한 일련번호 생성(sequence 생성)
create sequence tbl_board_no;

insert into tbl_board(no, title, writer)
  values(tbl_board_no.nextval, 'aaa', 'bbb');








