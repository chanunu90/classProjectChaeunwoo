
--04.11
--select
--로그인한 사용자가 소유하고 있는 테이블의 정보
select * from tab; --사용자의 테이블 정보를 알수있다.

--테이블 정보 확인
DESC emp;
DESC dept;

select (a.sal * 12)
from emp a;

select *
from emp;



-- 데이터 추출하는 질의어 : select
-- select 컬럼이름,컬럼이름,컬럼이름 ... from 테이블이름{VIEW 사용 가능};
-- select * from 테이블이름;

select deptno, loc
from dept;
--where deptno

update DEPT
set loc = '와싱탄'
where deptno = 10;

commit;

--select 구문의 프리젠테이션영역에 테이블이 가지는 컬럼 뿐 아니라 연산(함수)의 결과를 새로운 컬럼으로 출력 
select  sal as 월급,
        sal + 100 as 더하기 ,
        sal - 100 as 빼기  ,
        sal * 10 as 곱하기 , 
        sal / 10 as 나누기
from emp;

--사원 테이블에서 사원의 이름과 급여, 연봉계산 결과를 출력.
--연봉의 계산은 급여 * 12
-- nvl(컬럼명 , 0)또는nvl(컬럼명 , '널값입니다') 넘버일경우는 숫자를 넣고 char 나 verchar2의경우 문자값넣어준다.
select  ename as 사원이름,
        ename ||  ' is a ' || job as "사원의 직무",
        sal as 월급,
        sal * 12 as 연봉,
        nvl(comm , 0) as 상여급,
        decode(comm , null , '상여급 받은적 없음' , 0 , '상여급 받은적 없음' , sal * 12  + comm)  as "상여급 포함"
from emp;

--select [distinct] from... 중복된 데이터를 제거하고 하나씩만 출력해준다.

select distinct deptno
from emp;

select distinct job
from emp;
 
select COUNT(distinct job)  as "직책의 종류 개수"
from emp;


--원하는 행 검색
--where 절을 사용
-- select ... from ... where 조건식;

--급여가 3000이상인 사원의 이름

select empno , ename , sal
from emp
--where sal >= 1000 and sal <= 4000;
--where sal between 1000 and 4000;
where sal in(3000 , 1100 , 1250);


select ename, job , deptno
from emp
where deptno in 10;

--다음은 이름이 FORD인 사원의 사원번호(EMPNO)과 사원이름(ENAME)과 급여(SAL)을 출력하는 예제
select EMPNO , ename, job , SAL
from emp
where ename in ('SCOTT' , 'FORD');

--날짜끼리 비교할때도 (데이터 타입이 DATE여도 문자열처럼 '넣어준다.
select *
from emp
where HIREDATE = '81/12/03';

--DATE는 '를넣어서 문자처럼보이겠지만 연산이 된다.
-- 이후 또는 이전의 날짜를 조회할수있다. DATE타입 좋다.
select *
from emp
where HIREDATE < '81/12/03';


--논리연산자 : AND  , OR , NOT D
--10번 부서의 매니저가 누구인지 찾아보자
select *
from emp
where deptno=10 OR JOB='MANAGER'
ORDER BY deptno ;

select *
from emp
where deptno=10 AND JOB='MANAGER'
ORDER BY deptno ;

select *
from emp
where deptno=20 OR deptno=30 OR deptno=40
ORDER BY deptno ;

select *
from emp
where NOT deptno=10
ORDER BY deptno ;
--======위아래 같은 거임====
select *
from emp
where deptno<>10
ORDER BY deptno ;

--between 나중에 날짜 기간 구할때 매우 많이사용한다.

select *
from emp
where sal between 2000 and 3000;

--=========위아래 같음==========

select *
from emp
where sal >= 2000 and sal <= 3000;

-- 범위 연산자의 연산은 날짜도 가능 날짜는 작은 따움표로 정의
--1987년에 입사한 사원 -> '87/01/01'~'87/12/31'

select *
from emp
--where hiredate between '87/01/01' and '87/12/31';
where hiredate between '81/01/01' and '81/12/31';

--10번 20번 30번 부서에 속한 사원의 정보 출력
select *
from emp
where emp.deptno = 10 or emp.deptno = 20 or emp.deptno = 30;

select *
from emp
where emp.deptno in (10,20,30);


--패턴 검색
--문자열의 패턴
--형식1 : % 앞뒤 무제한
--형식2 :  _한자리 __두자리 __세자리 => __A 앞 두자리는 어떤문자가 와도 상관없고 A로끝나는 세자리 문자열
select ename
from emp
where ename like '%C%';

--아래처럼도 쓸수있다.
select ename
from emp
where ename like '__M%';

--F로 시작하는 이름의 사원리스트
SELECT *
FROM EMP
WHERE ENAME NOT LIKE 'F%';

SELECT *
FROM EMP
WHERE ENAME LIKE '__R%';

-- NULL은 값이 아니다 그래서 IS NULL/IS NOT NULL 같은걸 따로 써주어야한다.
SELECT *
FROM EMP
WHERE COMM IS NULL;

SELECT *
FROM EMP
WHERE COMM IS NOT NULL OR COMM = 0;

SELECT *
FROM EMP
WHERE COMM IS NULL OR COMM = 0;

SELECT *
FROM EMP
--WHERE NOT(COMM IS NULL OR COMM = 0)
ORDER BY SAL ASC; --오름차순

SELECT *
FROM EMP
--WHERE NOT(COMM IS NULL OR COMM = 0)
ORDER BY SAL DESC ; -- 내림차순

-- 문자 정렬
-- 이름 순
SELECT * FROM EMP ORDER BY ENAME DESC;

--입사일이 빠른순서데로 정렬 : 오름 차순
SELECT * FROM EMP ORDER BY HIREDATE ASC;
--입사일이 느린순서데로 정렬 : 내림 차순
SELECT * FROM EMP ORDER BY HIREDATE DESC;


--급여순으로 정렬
SELECT * FROM EMP ORDER BY  SAL , ENAME DESC;


--문제를 풀기위한 테이블들
SELECT * FROM ORDERS;
SELECT * FROM customer;
SELECT * FROM BOOK;








