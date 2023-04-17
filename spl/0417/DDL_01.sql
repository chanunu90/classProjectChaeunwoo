--2023.04.17
--테이블 생성 수정 삭제 등등 
-- create table 테이블 이름 ()
--   컬럼이름 타입 [제약조건] , 
--   컬럼이름 타입 [제약조건] , 
--   컬럼이름 타입 [제약조건] , 
--   컬럼이름 타입 [제약조건] , 
-- );
CREATE TABLE DDL_TEST
(
    --컬럼들을 정의
    NO  NUMBER(3),
    NAME  VARCHAR(10),
    BIRTH DATE DEFAULT SYSDATE
);

desc ddl_test;

--지금까지 실습에 사용했던 사원 테이블과 유사한 구조의 사원번호, 사원이름, 급여 3개의 칼럼으로 구성된 EMP01 테이블을 생성해 봅시다. 
CREATE TABLE EMP01(
    EMPNO NUMBER(4),
    ENAME VARCHAR2(10),
    SAL NUMBER(7, 2)
); 


desc EMP01;
--행기준에서 입력할 컬럼을 지정해줘서 데이터를 입력한다.
insert into emp01(
    empno,
    ename,
    sal
)values(
    1111,
    'SON',
    1000
);


select * from emp01;


-- 서브쿼리를 이용해서 기존 테이블의 구조로 테이블을 생성, 데이터도 저장할수있다. 
-- 그냥 복사나 다름없다. 단 제약조건은 복사되지 않는다.
create table emp02
as
select * from emp;

desc emp02;
select * from emp02;



--원하는 컬럼만 또는 원하는 로우만 선택해서 테이블을 복사 생성 하는법
create table emp03
as
select empno , ename , job, hiredate from emp 
;

desc emp03;
select * from emp03;

-- 30번 부서의 정보만 가지는 새로운 테이블 생성
create table emp04
as
select empno , ename , job, hiredate from emp  where deptno=30;

desc emp04;
select * from emp04;

--데이터가 필요 없이 스키마만 복사라고싶다.
create table emp05
as
select * from emp where 1=0;

desc emp05;
select * from emp05;

--테이블의 변경 : 저장구조 ( 스키마의 구조 : 컬럼들의 집합 ) 가 변경
--컬럼 변경( 테이블에 컬럼을 추가 , 테이블에 있는 컬럼을 삭제 , 컬럼의 내용이나 이름을 수정)
-- 테이블 변경 
-- alter table [ add, modify , drop column ]()
-- emp01 테이블에 job 컬럼을 추가해보자.

desc emp01;
select * from emp01;
--테이블의 컬럼을 추가 삭제하는건 alter다
ALTER TABLE EMP01
ADD(JOB VARCHAR2(9));

delete from emp01 where empno=1111;
commit;
select * from emp01;
desc emp01;

ALTER TABLE EMP01
modify(JOB VARCHAR2(20) not null);

ALTER TABLE EMP01
modify(JOB VARCHAR2(50) null);

--emp01 테이블에서 job컬럼을 삭제 해보자
alter table emp01 
drop column job;

desc emp01;  


-- 테이블 객체의 삭제
-- drop table 테이블 이름 => 스키마 삭제와 저장데이터 삭제
-- DDL : 자동 COMMIT; ROLLBACK 안됨

-- EMP01 테이블을 삭제해보자
DROP TABLE EMP01;
desc emp02;  

--테이블의 모든 행을 삭제 : truncate table 테이블 이름 이것도 rollback안됨;
select * from emp02;
truncate table emp02;

-- 테이블 이름 변경
-- rename 이전이름 to 새이름
-- ddl_test => test
rename ddl_test to test;
desc test; 

-----------------------------------------------------------
-- 제약조건의 필요성
insert into dept values (10 , 'test' , 'test');

-- not null 제약조건 : 설정한 컬럼에 null값 입력을 금지하는 제약조건
-- 컬럼 수준에서만 정의 사용가능

drop table emp02;

--사원테이블 생성 : 사원번호, 사원이름, 직급, 부서명
create table emp02(
    empno number(4) not null, 
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2)
);

insert into emp02 values ( 1111 , null , 'MANAGER' , 30 );
insert into emp02 (job , deptno) values ( 'MANAGER' , 30 );

-- emp03 생성 : 사원번호 , 사원이름 , 직급, 부서번호
-- empno : unique
-- ename : not null
drop table emp03;

create table emp03(
    empno number(4) unique,
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2)
);
select * from emp03;
desc emp03;
-- unique : 컬럼 내부에 중복되는 데이터가 있으면 입력 실패, 수정 실패
insert into emp03 values (1111,'KING' , 'MANAGER' ,10); 
insert into emp03 values (1112,'SON' , 'MANAGER' ,20); 

select * from emp03;
desc emp03;

--
DROP TABLE EMP01;
create table emp01(
    empno number(4) not null unique,
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2)
);
insert into emp01 values (1111,'KING' , 'MANAGER' ,40);
select * from emp01;
desc emp01;

--기본키 제약조건
-- 컬럼옆에 PRIMARY KEY 키워드 사용
DROP TABLE EMP01;
create table emp01(
    empno number(4) primary key,
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2)
);
insert into emp01 values (1111,'KING' , 'MANAGER' ,40);
select * from emp01;
desc emp01;
-----------------------------------------------------------------------------------

DROP TABLE EMP01;
create table emp01(
    empno number(4) constraint PK_EMP01_EMPNO primary key, -- constraint 제약 이름
    ename varchar2(10) constraint NN_EMP01_ENAME not null, -- nn은 낫널의 약자이다.
    job varchar2(9) CONSTRAINT UK unique,    -- UK 는 유니크의 약자이다. 
    deptno number(2)
);
insert into emp01 values (1112, 'KING' ,  NULL  ,40);
select * from emp01;
desc emp01;

-- 외래키 제약조건
DROP TABLE EMP01;
create table emp01(
    empno number(4) constraint PK_EMP01_EMPNO primary key, -- constraint 제약 이름
    ename varchar2(10) constraint NN_EMP01_ENAME not null, -- nn은 낫널의 약자이다.
    job varchar2(9) CONSTRAINT UK_EMP01_JOB unique,    -- UK 는 유니크의 약자이다. 
    deptno number(2) CONSTRAINT FK_EMP01_deptno REFERENCES DEPT(DEPTNO) -- DEPT 테이블에있는(다른테이블에있는) PK를 참조하는 외래키 이다.
);

insert into emp01 values (1111, 'KING' ,  NULL  ,90); -- FK에 NULL은 괜찮다.
select * from emp01;
desc emp01;


--CHECK : 범위 , 값을 확인 후 입력 또는 수정
DROP TABLE EMP01;
create table emp01(
    empno number(4) constraint PK_EMP01_EMPNO primary key, -- constraint 제약 이름
    ename varchar2(10) constraint NN_EMP01_ENAME not null, -- nn은 낫널의 약자이다.
    job varchar2(9) CONSTRAINT UK_EMP01_JOB unique,    -- UK 는 유니크의 약자이다. 
    SAL NUMBER(7,2) CONSTRAINT CK_EMP01_SAL CHECK (SAL BETWEEN 800 AND 5000),  -- CHECK 지정한 값을 넘어가면 입력안됨
    gender char(1) CONSTRAINT CK_EMP01_GENDER check (gender in('M','F')), -- CHECK 값을 지정 할 수 도이씁니다.
    deptno number(2) CONSTRAINT FK_EMP01_deptno REFERENCES DEPT(DEPTNO) -- DEPT 테이블에있는(다른테이블에있는) PK를 참조하는 외래키 이다.
);

insert into emp01 values (1111, 'KING' ,  'MANAGER' , 1500 , 'F'  , 40); -- FK에 NULL은 괜찮다.
select * from emp01;
desc emp01;

--------------------------------------------------------------------------------------------------------------------------------
--default : 컬럼에 입력값이 없을때 기본값을 설정해서 데이터 입력
select sysdate from dual;
DROP TABLE EMP01;
create table emp01(
    empno number(4) constraint PK_EMP01_EMPNO primary key, -- constraint 제약 이름
    ename varchar2(10) constraint NN_EMP01_ENAME not null, -- nn은 낫널의 약자이다.
    job varchar2(9) CONSTRAINT UK_EMP01_JOB unique,    -- UK 는 유니크의 약자이다. 
    SAL NUMBER(7,2) CONSTRAINT CK_EMP01_SAL CHECK (SAL BETWEEN 800 AND 5000),  -- CHECK 지정한 값을 넘어가면 입력안됨
    gender char(1) CONSTRAINT CK_EMP01_GENDER check (gender in('M','F')), -- CHECK 값을 지정 할 수 도이씁니다.
    deptno number(2) CONSTRAINT FK_EMP01_deptno REFERENCES DEPT(DEPTNO), -- DEPT 테이블에있는(다른테이블에있는) PK를 참조하는 외래키 이다.
    hiredate DATE default sysdate  -- 값을 넣지 않을경우 NULL이 아니라 SYSDATE가 들어감
);

insert into emp01 values (1111, 'KING' ,  'MANAGER' , 1500 , 'F'  , 40 , SYSDATE);

insert into emp01 ( empno,ename ,job ,SAL ,gender , deptno) 
            values (1112, 'SON' ,  'FA' , 3000 , 'M'  , 40);

select * from emp01;
desc emp01;

--------------------------------------------------------------------------------------------------------------------------------
--옵션 아래에 설정하기
select sysdate from dual;
DROP TABLE EMP01;
create table emp01(
    empno number(4), -- constraint 제약 이름
    ename varchar2(10) constraint NN_EMP01_ENAME not null, -- nn은 낫널의 약자이다.
    job varchar2(9), -- UK 는 유니크의 약자이다. 
    SAL NUMBER(7,2) CONSTRAINT CK_EMP01_SAL CHECK (SAL BETWEEN 800 AND 5000)  ,  -- CHECK 지정한 값을 넘어가면 입력안됨
    gender char(1)  CONSTRAINT CK_EMP01_GENDER check (gender in('M','F')), -- CHECK 값을 지정 할 수 도이씁니다.
    deptno number(2) , -- DEPT 테이블에있는(다른테이블에있는) PK를 참조하는 외래키 이다.
    hiredate DATE default sysdate,  -- 값을 넣지 않을경우 NULL이 아니라 SYSDATE가 들어감
    --아래쪽에 따로 키의 속성을 넣어줄수 있다.
    
    constraint PK_EMP01_EMPNO primary key(empno),
    CONSTRAINT UK_EMP01_JOB unique (job),
    CONSTRAINT FK_EMP01_deptno FOREIGN KEY(deptno)REFERENCES DEPT(DEPTNO)
    
);

insert into emp01 values (1111, 'KING' ,  'MANAGER' , 1500 , 'F'  , 40 , SYSDATE);

insert into emp01 ( empno,ename ,job ,SAL ,gender , deptno) 
            values (1112, 'SON' ,  'FA' , 3000 , 'M'  , 40);

select * from emp01;
desc emp01;













