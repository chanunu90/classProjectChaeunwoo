--43. 사원 번호가 7788인 사원과 담당 업무가 같은 사원을 표시(사원 이름과 담당업무)하시오.
select job
from emp
where empno=7788;
--------------------------------
select *
from emp
where job = (
    select job
    from emp
    where empno=7788
);

--------서브쿼리 말고 조인으로

select *
from emp e1, emp e2 
where e2.empno=7788 and e1.job = e2.job;

--44. 사원번호가 7499인 사원보다 급여가 많은 사원을 표시하시오. 사원이름과 담당 업무

select sal from emp where empno=7499;

select *
from emp
where sal > (select sal from emp where empno=7499);

--45. 최소급여를 받는 사원의 이름, 담당업무 및 급여를 표시하시오. (그룹함수 사용)
select min(sal) from emp;
-------------------------
select *
from emp
where sal = (select min(sal) from emp);

--46. 평균급여가 가장 적은 직급의 직급 이름과 직급의 평균을 구하시오.
select job , avg(sal)
from emp
group by job
HAVING AVG(SAL) =  (select min(AVG(sal)) from emp group by job)
;

--47. 각 부서의 최소 급여를 받는 사원의 이름, 급여, 부서번호를 표시하시오.
SELECT *
FROM EMP E, (select DEPTNO , min(sal) AS A from emp group by DEPTNO) V
WHERE E.DEPTNO = V.DEPTNO AND A = E.SAL;

--48. 담당업무가 ANALYST 인 사원보다 급여가 적으면서 업무가 ANALYST가 아닌 사원들을 표시(사원번호, 이름, 담당 업무, 급여)하시오.
SELECT *
FROM EMP
WHERE JOB != 'ANALYST' AND SAL < ALL (SELECT SAL FROM EMP WHERE JOB = 'ANALYST');

--49. 부하직원이 없는 사원의 이름을 표시하시오.
SELECT DISTINCT MGR
FROM EMP
WHERE MGR IS NOT NULL; -- 부하가 있는 사원들 이니까 야들을 빼면 부하직원이 없는 사원이 나올꺼다.

SELECT *
FROM EMP
WHERE EMPNO NOT IN
(
    SELECT DISTINCT MGR
    FROM EMP
    WHERE MGR IS NOT NULL -- 부하가 있는 사원들 이니까 야들을 빼면 부하직원이 없는 사원이 나올꺼다.
);
--50. 부하직원이 있는 사원의 이름을 표시하시오.
SELECT *
FROM EMP
WHERE EMPNO IN
(
    SELECT DISTINCT MGR
    FROM EMP
    WHERE MGR IS NOT NULL -- 부하가 있는 사원들 이니까 야들을 빼면 부하직원이 없는 사원이 나올꺼다.
);


--51. BLAKE와 동일한 부서에 속한 사원의 이름과 입사일을 표시하는 질의를 작성하시오. ( 단 BLAKE는 제외 )
SELECT DEPTNO FROM EMP WHERE ENAME = 'BLAKE';

SELECT *
FROM EMP
WHERE ENAME != 'BLAKE' AND DEPTNO = (SELECT DEPTNO FROM EMP WHERE ENAME = 'BLAKE');

--52. 급여가 평균 급여보다 많은 사원들의 사원 번호와 이름을 표시하되 결과를 급여에 대해서 오름차순으로 정렬하시오.
SELECT *
FROM EMP
WHERE SAL > (SELECT AVG(SAL) FROM EMP)
ORDER BY SAL;

--53. 이름에 K가 포함된 사원과 같은 부서에서 일하는 사원의 사원 번호와 이름을 표시하시오.
SELECT EMPNO , ENAME
FROM EMP
WHERE DEPTNO IN(SELECT DISTINCT DEPTNO FROM EMP WHERE ENAME LIKE '%K%');

--54. 부서위치가 DALLAS인 사원의 이름과 부서번호 및 담당업무를 표시하시오.
SELECT *
FROM EMP E NATURAL JOIN DEPT D
WHERE DEPTNO IN(SELECT DEPTNO FROM DEPT WHERE loc = 'DELLAS');

--55. KING에게 보고하는 사원의 이름과 급여를 표시하시오.
SELECT ENAME , SAL
FROM EMP
WHERE MGR = (SELECT EMPNO FROM EMP WHERE ENAME='KING' );

--56. RESEARCH 부서의 사원에 대한 부서번호, 사원이름 및 담당 업무를 표시하시오.
SELECT*
FROM EMP
WHERE DEPTNO = (SELECT DEPTNO FROM DEPT WHERE DNAME='RESEARCH');

--UPDATE DEPT  SET LOC = 'NEW YORK' WHERE DEPTNO = 10;
--UPDATE DEPT  SET LOC = 'DELLAS' WHERE DEPTNO = 20;
--UPDATE DEPT  SET LOC = 'CHICAGO' WHERE DEPTNO = 30;
--UPDATE DEPT  SET LOC = 'BOSTON' WHERE DEPTNO = 40;
--ROLLBACK;

--57. 평균 월급보다 많은 급여를 받고 이름에 M이 포함된 사원과 같은 부서에서 근무하는 사원의 사원 번호, 이름, 급여를 표시하시오.

SELECT EMPNO , ENAME, SAL
FROM EMP 
WHERE SAL > (SELECT AVG(SAL) FROM EMP)
AND DEPTNO IN (SELECT DISTINCT DEPTNO FROM EMP WHERE ENAME LIKE '%M%');

--58. 평균급여가 가장 적은 업무를 찾으시오.
select job , avg(sal)
from emp
group by job
HAVING AVG(SAL) =  (select min(AVG(sal)) from emp group by job);
 -- select min(AVG(sal)) from emp group by job; 이거 신기하다 짱이다.
--59. 담당업무가 MANAGER 인 사원이 소속된 부서와 동일한 부서의 사원을 표시하시오.

SELECT *
FROM EMP
WHERE DEPTNO IN (SELECT DISTINCT DEPTNO FROM EMP WHERE JOB='MANAGER');



