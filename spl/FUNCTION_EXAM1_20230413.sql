--2023.04.13
-- function exam1
--SELECT TO_NUMBER(MGR) FROM EMP;
--
----두번째 문자 기준에서 다섯번째 자리까지 뽑아준다.
--SELECT SUBSTR('801212-10245678' , 2 , 5) FROM DUAL;
--
--SELECT TO_CHAR(SYSDATE , 'YY-MM-DD') FROM DUAL;
--
--
--SELECT DEPTNO , COUNT(*) FROM EMP GROUP BY DEPTNO;
--
--SELECT DEPTNO , COUNT(*) ,AVG(SAL) ,MAX(SAL)
--FROM EMP 
--GROUP BY DEPTNO
--HAVING MAX(SAL) > 2900;



--16. SUBSTR 함수를 사용하여 사원들의 입사한 년도와 입사한 달만 출력하시오.
--81/01/12 -> 81/11 

select hiredate , substr(hiredate,1, 5) as "년도와 월만 표기" , substr(hiredate,1, 2) as "년도만 표출" , substr(hiredate,4, 2) as "월만"
from emp
where substr(hiredate,1, 2) = 81; -- 이런식으로 날짜를 잘라서 비교연산 가능


--17. SUBSTR 함수를 사용하여 4월에 입사한 사원을 출력하시오.
select hiredate , substr(hiredate,1, 5) as "년도와 월만 표기" , substr(hiredate,1, 2) as "년도만 표출" , substr(hiredate,4, 2) as "월만"
from emp
where substr(hiredate,4, 2) = 04; -- 이런식으로 날짜를 잘라서 비교연산 가능

--18. MOD 함수를 사용하여 사원번호가 짝수인 사람만 출력하시오.
select *
from emp
where mod(empno , 2) = 0; -- 2로 나웠을때 0으로 떨어지는수 라는 뜻
--19. 입사일을 년도는 2자리(YY), 월은 숫자(MM)로 표시하고 요일은 약어 (DY)로 지정하여 출력하시오.
select ename ,
       to_char(hiredate , 'yy') as "입사 년도",
       to_char(hiredate , 'mm') as "입사 월",
       to_char(hiredate , 'dy') as "입사 요일"
from emp;

​--20. 올해 몇 칠이 지났는지 출력하시오. 현재날짜에서 올해 1월 1일을 뺀 결과를 출력하고 TO_DATE 함수를 사용하여 데이터 형을 일치 시키시오.
select sysdate - to_date('2023-01-01') , trunc(sysdate - to_date('2023-01-01'))
from dual;


--21. 사원들의 상관 사번을 출력하되 상관이 없는 사원에 대해서는 NULL 값 대신 0으로 출력하시오.
select nvl(mgr,0)
from emp;

--22. DECODE 함수로 직급에 따라 급여를 인상하도록 하시오. 직급이 ‘ANALIST”인 사원은 200, ‘SALESMAN’인 사원은 180, ‘MANAGER’인 사원은 150, ‘CLERK”인 사원은 100을 인상하시오.
select ename,job,sal,NVL(decode(job , 'ANALYST' , sal + 200 , 'SALESMAN' , sal + 180 ,'MANAGER' , sal + 150 ,'CLERK' , sal + 100),SAL) as "급여 인상"
from emp;

--23. 모든 사원의 급여 최고액, 최저액, 총액 및 평균 급여를 출력하시오. 평균에 대해서는 정수로 반올림하시오.
SELECT MAX(SAL),MIN(SAL),TO_CHAR(SUM(SAL) , 'L999,999,999'),ROUND(AVG(SAL))
FROM emp;


--24. 각 담당 업무 유형별로 급여 최고액, 최저액, 총액 및 평균 액을 출력하시오. 평균에 대해서는 정수로 반올림 하시오.
SELECT JOB , COUNT(*) , MAX(SAL),MIN(SAL),TO_CHAR(SUM(SAL) , 'L999,999,999'),ROUND(AVG(SAL))
FROM emp
GROUP BY JOB;

--25. COUNT(*) 함수를 이용하여 담당업무가 동일한 사원 수를 출력하시오.
SELECT JOB , COUNT(*)
FROM emp
GROUP BY JOB;

--26. 관리자 수를 출력하시오.
SELECT COUNT(DISTINCT MGR)
FROM emp;

--27. 급여 최고액, 급여 최저액의 차액을 출력하시오.
SELECT MAX(SAL)-MIN(SAL)
FROM emp;

--28. 직급별 사원의 최저 급여를 출력하시오. 관리자를 알 수 없는 사원과 최저 급여가 2000 미만인 그룹은 제외시키고 결과를 급여에 대한 내림차순으로 정렬하여 출력하시오.
SELECT MIN(SAL) , JOB
FROM emp
WHERE MGR IS NOT NULL
GROUP BY JOB
HAVING MIN(SAL) >= 2000
ORDER BY MIN(SAL) DESC;

--29. 각 부서에 대해 부서번호, 사원 수, 부서 내의 모든 사원의 평균 급여를 출력하시오. 평균 급여는 소수점 둘째 자리로 반올림 하시오.
SELECT DEPTNO,
       COUNT(*),
       SUM(SAL)
FROM emp
GROUP BY DEPTNO
ORDER BY DEPTNO;

--30. 각 부서에 대해 부서번호 이름, 지역 명, 사원 수, 부서내의 모든 사원의 평균 급여를 출력하시오. 평균 급여는 정수로 반올림 하시오. DECODE 사용.
SELECT * FROM DEPT;
SELECT DECODE(DEPTNO, 10 ,'ACCOUNTING' , 20 ,'RESEARCH', 30,'SALESE' , 40 , 'OPERATIONS') AS DNAME,
       DECODE(DEPTNO, 10 ,'NEW YORK' , 20 ,'DELLAS', 30,'CHICAGO' , 40 , 'BOSTON') AS DLOC,
       DEPTNO,
       COUNT(*),
       ROUND(AVG(SAL))
FROM emp
GROUP BY DEPTNO
ORDER BY DEPTNO;

--=============================================================================================================================================

--1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
--(3) 박지성의총구매액(박지성의고객번호는1번으로놓고작성)
--(4) 박지성이구매한도서의수(박지성의고객번호는1번으로놓고작성)

--2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
--(1) 마당서점도서의총개수
--(2) 마당서점에도서를출고하는출판사의총개수




