-- website사용시 필요한 게시판
create table t_board(
    no  number(5) primary key
    , title varchar2(2000) not null
    , writer varchar2(200) not null
    , content varchar2(4000) not null
    , view_cnt number(5) default 0
    , reg_date date default sysdate
);
-- t_board테이블의 시퀀스
drop sequence seq_t_board_no;
create sequence seq_t_board_no;
delete from t_board;
commit;

insert into t_board(no, title, writer, content)
 values(seq_t_board_no.nextval, '제목입니다', '홍길동', '내용입니다');
 
select * from t_board; 


commit;

select no, title, writer, to_char(reg_date, 'yyyy-mm-dd') as reg_date
  from t_board
 order by no desc;

-- 로그인과 관련된 테이블
create table t_member(
    id  varchar2(50) primary key
    , password varchar2(50) not null
    , type char(1) default 'U'
);

insert into t_member(id, password, type)
 values('admin', 'admin', 'S');
 
insert into t_member(id, password)
 values('user', 'user');

select * from t_member;

commit;

-- 첨부파일과 관련된 테이블 생성
create table t_board_file(
    no number(5) primary key
    , board_no number(5) not null
    , file_ori_name varchar2(200) 
    , file_save_name varchar2(200)
    , file_size number(10)
    , constraint t_board_file_board_no_fk foreign key(board_no)
        references t_board(no) on delete cascade
);

alter table t_board_file
  drop constraint t_board_file_board_no_fk;

alter table t_board_file
  add constraint t_board_file_board_no_fk foreign key(board_no)
        references t_board(no) on delete cascade;

-- 첨부파일 시퀀스
create sequence seq_t_board_file_no;

drop table t_board_file;

select * from t_board order by no asc;

insert into t_board_file values(1, 17, 'test', 'test', 1000);
insert into t_board_file values(2, 45, 'test', 'test', 2000);

select * from t_board_file;




























