drop table s_emp;
CREATE TABLE s_emp
(id             NUMBER(7) primary key,
 name           VARCHAR2(25),
 mailid         VARCHAR2(8),
 start_date     DATE,
 manager_id     NUMBER(7),
 title          VARCHAR2(25),
 dept_id        NUMBER(7),
 salary         NUMBER(11, 2),
 commission_pct NUMBER(4, 2)
);

INSERT INTO s_emp VALUES (
  1, '박구곤', 'sky98',
   to_date('03-03-1990','dd-mm-yyyy'), NULL, '사장',
   118, 5000, NULL);
INSERT INTO s_emp VALUES (
   2, '손명성', '2xxsig',
   to_date('08-03-1990','dd-mm-yyyy'), 1, '기획부장',
   110, 3000, NULL);
INSERT INTO s_emp VALUES (
   3, '이은선', 'ch21175',
   to_date('17-06-1991','dd-mm-yyyy'), 1, '영업부장',
   102, 3500, NULL);
INSERT INTO s_emp VALUES (
   4, '서의홍', 'mquickto',
   to_date('07-04-1990','dd-mm-yyyy'), 1, '총무부장',
   101, 3000, NULL);
INSERT INTO s_emp VALUES (
   5, '김심선', 'aropebur',
   to_date('04-03-1990','dd-mm-yyyy'), 1, '인사부장',
   118, 3200, NULL);
INSERT INTO s_emp VALUES (
   6, '전지영', 'murguhar',
   to_date('18-01-1991','dd-mm-yyyy'), 2, '과장',
   110, 2400, NULL);
INSERT INTO s_emp VALUES (
   7, '김정미', 'enchu',
   to_date('14-05-1990','dd-mm-yyyy'), 2, '과장',
   111, 2400, NULL);
INSERT INTO s_emp VALUES (
   8, '신기웅', 'bbiri',
   to_date('07-04-1990','dd-mm-yyyy'), 2, '과장',
   112, 2100, NULL);
INSERT INTO s_emp VALUES (
   9, '이상헌', 'acatchpo',
   to_date('09-02-1992','dd-mm-yyyy'), 2, '과장',
   113, 2300, NULL);
INSERT INTO s_emp VALUES (
   10, '최순철', 'mhavel',
   to_date('27-FEB-1991','dd-mm-yyyy'), 2, '과장',
   113, 2300, NULL);
INSERT INTO s_emp VALUES (
   11, '최정선', 'cmagee',
   to_date('14-05-1990','dd-mm-yyyy'), 3, '영업대표이사',
   102, 2450, 10);
INSERT INTO s_emp VALUES (
   12, '안은경', 'hgiljum',
   to_date('18-01-1992','dd-mm-yyyy'), 3, '영업대표이사',
   103, 2500, 12.5);
INSERT INTO s_emp VALUES (
   13, '김석우', 'ysedeghi',
   to_date('18-02-1991','dd-mm-yyyy'), 3, '영업대표이사',
   104, 2650, 10);
INSERT INTO s_emp VALUES (
   14, '박성규', 'mnguyen',
   to_date('22-01-1992','dd-mm-yyyy'), 3, '영업대표이사',
   105, 2650, 15);
INSERT INTO s_emp VALUES (
   15, '신종필', 'adumas',
   to_date('09-10-1991','dd-mm-yyyy'), 3, '영업대표이사',
   106, 2400, 17.5);
INSERT INTO s_emp VALUES (
   16, '이기철', 'emaduro',
   to_date('07-02-1992','dd-mm-yyyy'), 6, '사원',
   110, 2400, NULL);
INSERT INTO s_emp VALUES (
   17, '구원상', 'gsmith',
   to_date('08-03-1990','dd-mm-yyyy'), 6, '사원',
   110, 940, NULL);
INSERT INTO s_emp VALUES (
   18, '서정주', 'anozaki',
   to_date('09-02-1991','dd-mm-yyyy'), 7, '사원',
   111, 1200, NULL);
INSERT INTO s_emp VALUES (
   19, '안창환', 'vpatel',
   to_date('06-08-1991','dd-mm-yyyy'), 7, '사원',
   111, 795, NULL);
INSERT INTO s_emp VALUES (
   20, '윤정숙', 'cnewman',
   to_date('21-07-1991','dd-mm-yyyy'), 8, '사원',
   112, 750, NULL);
INSERT INTO s_emp VALUES (
   21, '장현철','amarkari',
   to_date('26-05-1991','dd-mm-yyyy'), 8, '사원',
   112, 850, NULL);
INSERT INTO s_emp VALUES (
   22, '장혜숙', 'echang',
   to_date('30-11-1990','dd-mm-yyyy'), 9, '사원',
   113, 800, NULL);
INSERT INTO s_emp VALUES (
   23, '강연범', 'rpatel',
   to_date('17-10-1990','dd-mm-yyyy'), 9, '사원',
   106, 795, NULL);
INSERT INTO s_emp VALUES (
   24, '오은경', 'bdancs',
   to_date('17-03-1991','dd-mm-yyyy'), 10, '사원',
   113, 860, NULL);
INSERT INTO s_emp VALUES (
   25, '이용호', 'sschwart',
   to_date('09-05-1991','dd-mm-yyyy'), 10, '사원',
   113, 1100, NULL);
COMMIT;
