--TEST_20230413

--32. EQUI 조인을 사용하여 SCOTT 사원의 부서번호와 부서 이름을 출력하시오.
SELECT DNAME , E.DEPTNO
FROM EMP E , DEPT D
WHERE E.DEPTNO = D.DEPTNO AND ENAME = 'SCOTT';

--33. INNER JOIN과 ON 연산자를 사용하여 사원 이름과 함께 그 사원이 소속된 부서이름과 지역 명을 출력하시오.
SELECT ENAME , DNAME ,  LOC 
FROM EMP INNER JOIN DEPT
ON EMP.DEPTNO = DEPT.DEPTNO;

--36. 조인과 WildCARD를 사용하여 이름에 ‘A’가 포함된 모든 사원의 이름과 부서명을 출력하시오.
SELECT DNAME , ENAME
FROM EMP E , DEPT D
WHERE E.DEPTNO = D.DEPTNO AND E.ENAME LIKE '%A%';

--37. JOIN을 이용하여 NEW YORK에 근무하는 모든 사원의 이름, 업무, 부서번호 및 부서명을 출력하시오.
SELECT ENAME , JOB ,DNAME
FROM EMP E , DEPT D
WHERE E.DEPTNO = D.DEPTNO AND d.loc = 'NEW YORK';


--38. SELF JOIN을 사용하여 사원의 이름 및 사원번호, 관리자 이름을 출력하시오.
select e.ename , e.empno , m.ename as "관리자 이름"
from emp e, emp m
where e.mgr=m.empno
;
--39. OUTER JOIN, SELF JOIN을 사용하여 관리자가 없는 사원을 포함하여 사원번호를 기준으로 내림차순 정렬하여 출력하시오.
select e.empno, e.ename , nvl(m.ename,'없음') as "관리자 이름"
from emp e, emp m
where e.mgr=m.empno(+) 
order by e.empno desc;

--40. SELF JOIN을 사용하여 지정한 사원의 이름, 부서번호, 지정한 사원과 동일한 부서에서 근무하는 사원을 출력하시오. ( SCOTT )
select e.ename , e.empno , m.deptno
from emp e, emp m
where e.deptno = m.deptno and E.ENAME != 'SCOTT' AND M.ENAME = 'SCOTT';

--41. SELF JOIN을 사용하여 WARD 사원보다 늦게 입사한 사원의 이름과 입사일을 출력하시오.
select m.ename , m.hiredate
from emp e, emp m
where e.hiredate < m.hiredate and e.ename ='WARD';

--42. SELF JOIN 을 사용하여 관리자보다 먼저 입사한 모든 사원의 이름 및 입사일을 관리자의 이름 및 입사일과 함께 출력하시오.
select E.ename , E.hiredate , M.ENAME AS "관리자 이름"
from emp e, emp m
where e.mgr=m.empno and e.hiredate < M.hiredate;
