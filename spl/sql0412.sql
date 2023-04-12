--2023.04.12
-- 함수
desc dual;

-- 단일 행 함수 / 집합[그룹]함수
-- 단일행 함수 : 숫자, 문자 ,날짜 , 반환 , 기타 함수

--숫자 함수
-- 절대값 abs
select 10 , -10, abs(-10), abs(10)  from dual;

--float : 소수점 아래를 점사
select 2.1 , 2,9, floor(2.1), floor(2.9) from dual;

--round : 지정한 위치에서 반올림
select 1234.567 , round(1234.567), round(1234.567,1), round(1234.567,-2) from dual;

--round : 특정자리수를 절삭 반내림
select 1234.567 , trunc(1234.567), trunc(1234.567,1), trunc(1234.567,-2) from dual;

--mod : 나머지 연산
select mod(1,3), mod(2,3), mod(0,3), mod(13,0) from dual;

--문자 처리함수
select * from emp where ename='SCOTT';

--문자 함수
--문자열 모두를 소문자로 변경
SELECT 'SCOTT', LOWER('SCOTT') FROM DUAL;

SELECT 'scott', UPPER('scott') FROM DUAL;

select initcap('scott') from dual;
--문자열을 추출 : substr(원본, 시작위치), substr(원본, 시작위치 , 반환할 문자의 개수)
select '안녕하세요. 손흥민입니다.' ,
        substr('안녕하세요 손흥민 입니다.' , 5) , 
        substr('안녕하세요 손흥민 입니다.' , 2,8)
from dual;

--문자열의 길이
select length('안녕하세요.!!!!!') from dual;

--문자열에서 특정 자리수가 지정하고 자리에 데이터가 없을때 패턴을 입력
-- 00010
select '10', lpad('10' , 10 , '0'),rpad('11' , 5 , '*') from dual; 
select deptno, lpad(deptno , 5 , 'a') from dept; 


--trim() : 공백 제거
select '     ABS     ' , TRIM('     ABS     ') FROM DUAL;


select 'Steven King',
       replace('Steven King','Steven ','S.'),
       replace('Steven King','Steven','')
FROM DUAL;

--날짜 함수
select sysdate from dual;
select sysdate,months_between(sysdate,'23/12/15') from dual;

select add_months(sysdate,8) from dual;
select add_months(sysdate,-1) from dual;
select add_months(sysdate,-3) from dual;
select add_months(sysdate,-6) from dual;

select next_day(sysdate,2) from dual; -- 
select last_day(sysdate) from dual; --이번달 마지막 날을 출력해준다
select round(sysdate) from dual; --날짜를 반올림 해준다.


--변환함수
-- DATE -> CHAR
-- to_char(원본,'패턴')
    

select sysdate,
       to_char(sysdate , 'yyyy-mm-dd'),
       to_char(sysdate , 'yyyy.mm.dd'),
       to_char(sysdate , 'yyyy.mm.dd day'),
       to_char(sysdate , 'yyyy.mm.dd. hh24:mi:ss')
from dual;

select 123456789,
    to_char(123456789,'000000000000'),
    to_char(123456789,'000,000,000,000'),
    to_char(123456789,'999999999999'),
    to_char(123456789,'999,999,999,999'),
    to_char(123456789,'l999,999,999,999'),
    to_char(123456789,'999,999')
from dual;

select ename , sal , to_char(sal*1300 , 'l999,999,999') as "원화임"
from emp;


--char -> Date
-- to_date ('문자열' ,'패턴')

select *
from emp
where hiredate = '1981.02.20'; -- 날짜는 자동 형변환됨

select *
from emp
where hiredate = to_date('02198120','mmyyyydd');

select *
from emp
where hiredate = to_date('1981.02.20','yyyy-mm-dd');


insert into emp values(9999,'SON','MAMAGER',7782,to_date('2023-04-12' , 'yyyy/mm/dd'),4000,NULL,10);
SELECT * FROM EMP;
rollback;
commit;

--char -> number
-- to_number('문자열','패턴') => 숫자 타입
select '20000' - '10000'
from dual;

select to_number('20,000' , '999,999,999') - to_number('10,000' , '99,999')
from dual;

-- decode 함수 => = 비교 연산 후 결과 출력 하는 함수  switch~case
select ename, deptno , decode(deptno,10,'ACCOUNTING' ,20,'RESEARCH',30,'SALE',40,'APERATIONS') AS DNAME
from emp
ORDER BY DNAME;

--직급에 따라 급여를 인상하도록 하자. 직급이 'ANAlYST'인 사원은 5%, 'SALESMAN'인 사원은 10%,
--'MANAGER'인 사원은 15%, 'CLERK'인 사원은 20%인 인상한다

SELECT EMPNO , ENAME , JOB , SAL , 
       NVL(DECODE(JOB , 'ANALYST' , SAL * 1.05 , 'SALESMAN' , SAL * 1.1 , 'MANAGER' , SAL * 1.15 ,'CLERK' , SAL * 1.2 ),SAL) AS UPSAL
FROM EMP;


-- 
select ename, deptno , decode(deptno,10,'ACCOUNTING' ,20,'RESEARCH',30,'SALE',40,'APERATIONS') AS DNAME , 
        CASE WHEN DEPTNO=10 THEN 'ACCOUNTING'
             WHEN DEPTNO=20 THEN 'RESEARCH'
             WHEN DEPTNO=30 THEN 'SALES'
             ELSE 'OPERATIONS' END AS DNAME2
from emp
ORDER BY DNAME;

-- 그룹함수,집합함수,집계함수,다중행 함수
-- 하나의 행이 아닌 다중행을 구룹으로 묶어서 처리
-- 일반적인 컬럼은 같이 조회할수없다.
SELECT SUM(SAL) , AVG(SAL) , COUNT(DEPTNO), MAX(SAL) , MIN(SAL)
FROM EMP;

--급여 총액을 구해보자
SELECT SUM(SAL) , MAX(SAL) , TO_CHAR(SUM(SAL),'L999,999')
FROM EMP;

--커미션의 총합
SELECT SUM(COMM) , COUNT(COMM) , AVG(comm)
FROM EMP;

SELECT COMM FROM EMP WHERE COMM IS NOT NULL;

--평균 급여
select avg(sal) as "원본", round(avg(sal)) , trunc(avg(sal))
from emp;

-- 최대 급여 max(), 최소 급여 min()
select max(sal) , min(sal)
from emp;

-- 부서의 개수
select count(*) from dept;

select job
from emp
order by job;

select count(distinct job) as "부서의수"
from emp;

select count(comm)
from emp;

--그룹바이 해당 그룹으로 묶어서 평균이나 그룹함수를 구함
select DEPTNO , avg(sal) as "원본", round(avg(sal)) , trunc(avg(sal))
from emp
group by DEPTNO
order by DEPTNO; --그룹바이로 걸어저있는것만 오더바이 걸수있다.;

select job , avg(sal) as "원본", round(avg(sal)) , trunc(avg(sal))
from emp
group by job
order by job ;--그룹바이로 걸어저있는것만 오더바이 걸수있다.;

select DEPTNO , 
       count(*) as "사원의 총수",
       sum(sal) as "총급여액",
       trunc(avg(sal)) as "평균급여액",
       max(sal) as "최대 급여액",
       min(sal) as "최소 급여액" ,
       count(comm)
from emp
group by DEPTNO
--그룹별 평균 급여가 2000 이상 이거나 총급여액이 10000을 넘는 그룹
having avg(sal) >= 2000 and sum(sal) >= 10000 -- 그룹바이를 썻다면 웨어절이 그룹바이 전에 들어가기떄문에 having이란걸 써야한다.
order by DEPTNO;


select job , count(*) , trunc(avg(sal)) , sum(sal) , max(sal) , min(sal) , max(sal)-min(sal)
from emp
group by job
order by job ;--그룹바이로 걸어저있는것만 오더바이 걸수있다.;



