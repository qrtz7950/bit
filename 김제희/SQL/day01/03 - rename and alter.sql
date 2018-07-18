insert into t_board(no, title, content, view_cnt, reg_date) --컬럼의 순서는 상관없다
    values(1, '제목1', '내용1', 0, sysdate);        
    --문자 표현은 ''
/*
    insert example
    번호  :  번호 2
    제목  : 제목2
    내용  : 연습입니다
    조회수:  0
    등록일: 현재날자
*/
insert into t_board(no, title, content) --디폴트로 설정된값은 따로 넣지않아도 자동으로 들어감
    values(2, '제목2', '연습입니다');      

insert into t_board(content, no, title) --지정만하면 순서상관X
    values('디폴드값들어감', 3, '디폴트값');
    
desc t_board;

insert into t_board  --넣을 값 지정하지않으면 테이블만들때 순서대로 제한조건 상관없이 다 넣어야함
    values(4, '제목4', '내용3', 0, sysdate);

select * from t_board;


-------------------업데이트----------------------------------------------

--모든 게시글의 조회수를 100으로 수정

update t_board
    set view_cnt = 100;
    
select * from t_board;

--글번호가 2인 게시글의 조회수를 0으로 수정

update t_board
    set view_cnt = 0
    where no = 2;
    
select * from t_board;

--글번호가 3인 게시글의 제목을 디폴드에서 변경된제목으로 수정
update t_board
    set title = '변경된 제목'
    where no = 3;

select * from t_board;

--글번호가 4인 게시글의 제목과 내용을 수정된제목으로 변경

update t_board
    set title = '수정된 제목' ,content = '수정된 내용'
    where no = 4;
    
select * from t_board;

delete from t_board
    where no = 2;

delete from t_board;

--delete from t_board;

select * from t_board;

--select 예제---------------------------------------------------

select no, title
    from t_board;

--콜럼에 뭐가 뭔지 구분할수 있도록 엘리어스를 붙여줄 수 있다
select no as 글번호, title 제목, content as "내     용", view_cnt as 조회수, reg_date as 날짜 --as사용 또는 생략가능
    from t_board;

select no, view_cnt
    from t_board;
    
update t_board
    set view_cnt = no * 10;

select * from t_board;

--컬럼 연산자, 컬럼 합 예쩨

select no, view_cnt, view_cnt + 100 as 히트다히트
    from t_board;
    
select no, view_cnt || '회' as 조회수
    from t_board;

--오늘은 7월 18일입니다
select '오늘은 0718' as 지금!
    from dual; --더미테이블 듀얼
    
select '오늘은' || 0718 as 지금! --문자끼리 더하기 가능
    from dual; --더미테이블 듀얼    
    
select '날짜정보 :  ' || sysdate as 날짜정보
    from dual; --더미테이블 듀얼    
    
select *from tab;

select * from employees;

/*
임플로이 테이블의 모든 목록을 다음과 같이 조회
king 사원의 사원번호는 100번이고 연봉은 24000입니다
kochhar 사원의 사원번호는 101번이고 연봉은 1700입니다
...
Gietz사원의 사원번호는 107번이고 연봉은 8300입니다
*/

select LAST_NAME || '사원의 사원번호는' || employee_id || '이고 연봉은' || SALARY || '입니다' as 사원정보
    from employees
    where employee_id = 100;
    
select * from employees;    
    
-- employee테이블에서 연봉이 5000이상인 사원 조회

select *
    from employees
    where salary >= 5000;
    
-- employees 테이블에서 부서번호가 (department_id) 80인 사원목록 조회

select *
    from employees
    where department_id = 80;
    
-- employees 테이블에서 부서번호가 (department_id) 80 아닌 목록 ㅎ죄
    
select *
    from employees
    where department_id != 80;    

-- employee테이블에서 연봉이 10000~20000이상인 사원 조회

select *
    from employees
    where salary >= 10000 and salary <= 20000;
    
--같은 코드
select *
    from employees
    where salary between 10000 and 20000;
    
-- employees 테이블에서 부서번호가 (department_id) 90이거나 연봉이 15000이상인 사원 조회
select *
    from employees
    where salary >= 15000 or department_id = 80;
    
-- employees 테이블에서 부서번호가 (department_id) 80,90,100인 사원 조회
    
select *
    from employees
    where department_id = 80 
       or department_id = 90 
       or department_id = 100;

select *
    from employees
    where salary >= 15000 or department_id = 80;

select employees.department_id --올바르게 어떤 테이블에 어떤 컬럼인지 표기하는 방법
    from employees --현재는 참조하는 테이블이 한개기때문에 생략해도 무방하다
    where department_id in (80,90,100);

select employees.department_id, employees.* --나머지를 모두 출력해주기위해 저 별이 어떤 테이블을 가리키는지 지칭해준다
    from employees                          --같은 컬럼은 존재할 수 없기때문에 맨뒤에 department_id_1 언더바 1이 붙는다
    where department_id in (80,90,100);
    
select e.department_id, e.*
    from employees e --테이블명에는 앨리어스 쓰지않는다, 축약가능
    where department_id in (80,90,100);
    
------------like-----------------------------

employee 테이블에서 first_name 'peter'인 사원목록 조회
select *
    from employees
    where first_name = 'Peter';
    
--employee 테이블에서 first_name의 앞글자가 'P'인 사원목록 조회

select *
    from employees
    where first_name like 'P%';   --like와 찾으려는 문자다음 무엇이 올지 모를때 %를 붙여준다
                                    --%는 0개 이상이라는뜻
                                    
--employee 테이블에서 first_name의 앞글자가 'P'이면서 다섯글자인 사원목록 조회
select *
    from employees
    where first_name like 'P____'; 

--employee 테이블에서 first_name의 두 번째 글자가 'e'인 사원목록 조회
select *
    from employees
    where first_name like '_e%';
    
--employee 테이블에서 first_name에 't'가 포함되는 사원목록 조회

select *
    from employees
    where first_name like '%t%'; 
--DB도 검색을 위해 트리구조 비슷한 인덱스를 사용하나 검색하려는 문자열앞에 %가 붙으면 인덱스를 무시하게되므로
--이는 지양해야하는 방법이다.

--commission_pct가 없는 사원목록조회
select *
    from employees
    where commission_pct IS NULL; 
--null이라는 값을 검색할수는없기때문에 is null 이라는 연산자를 이용한다

--commission_pct가 null이 아닌 사원목록조회
--null은 연산을 통해 어떤 값을 더하든 빼든 null이기때문에 다른 연산자를 쓸수없다 때문에 is not null이라는 연산자를 따로 이용한다
select *
    from employees
    where commission_pct is not null; 

--커미션이 존재하는 사원들에 한해 사원번호, 연봉, 커미션, 보너스조회,
--보너스는 커미션 * 연봉

select e.employee_id, e.salary, e.commission_pct, e.salary * e.commission_pct as 보너스
    from employees e
    where commission_pct is not null; 

--모든사원의 사원번호 연봉 커미션 보너스 조회하나 커미션이 없는 사원은 커미션,보너스를 0으로 조회
--nvl(컬럼명 , value) : 
--null값을 임의의 값으로 변경하는 함수
select e.employee_id
     , e.salary
     , nvl(e.commission_pct, 0)
     , e.salary * nvl(e.commission_pct,0) as 보너스
    from employees e;















