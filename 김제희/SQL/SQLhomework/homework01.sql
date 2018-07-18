create table T_MEMBER(
        ID              varchar2(20) primary key
    ,   NAME            varchar2(20) not null
    ,   PASSWORD        varchar2(20) not null
    ,   EMAIL_ID        varchar2(30)
    ,   EMAIL_DOMAIN    varchar2(20)
    ,   TEL1            char(3)
    ,   TEL2            char(4)
    ,   TEL3            char(4)
    ,   POST            char(7)
    ,   BASIC_ADDR      varchar2(200)
    ,   DETAIL_ADDR     varchar2(200)
    ,   TYPE            char(1) default 'U'
    ,   REG_DATE        date default sysdate

);

desc T_MEMBER;