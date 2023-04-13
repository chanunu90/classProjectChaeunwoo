--2023.04.13
--JOIN
--DECODE(DEPTNO, 10 ,'NEW YORK' , 20 ,'DELLAS', 30,'CHICAGO' , 40 , 'BOSTON') AS DLOC,

--짜라라라라라라라라라라라라ㅏ라라라라
--CREATE TABLE salgrade (
--grade NUMBER,
--losal NUMBER,
--hisal NUMBER
--);
--
--INSERT INTO salgrade VALUES (1,700,1200);
--INSERT INTO salgrade VALUES (2,1201,1400);
--INSERT INTO salgrade VALUES (3,1401,2000);
--INSERT INTO salgrade VALUES (4,2001,3000);
--INSERT INTO salgrade VALUES (5,3001,9999);
--
--commit;
--
--select * from salgrade;

-- CROSS JOIN
-- 스키마를 붙이고 결과 행은 모든 경우의 수 -> N * M
-- EMP , DEPT => 14 * 4 => 56의 행이 됨
SELECT *
FROM EMP , DEPT;

SELECT *
FROM EMP CROSS JOIN DEPT;

-- EQUI JOIN -- 동일한 칼럼을 기준으로 조인 
-- EMP.DEPTNO = DEPT.DEPTNO;
SELECT *
FROM EMP , DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO;

SELECT E.DEPTNO , d.deptno , EMPNO , DNAME
FROM EMP E , DEPT D
WHERE E.DEPTNO = D.DEPTNO;

---EQUI JOIN편하다--
SELECT EMPNO ,DNAME ,ENAME ,E.DEPTNO
FROM EMP E , DEPT D
WHERE E.DEPTNO = D.DEPTNO AND ENAME = 'SCOTT';


SELECT *
FROM EMP INNER JOIN DEPT
ON EMP.DEPTNO = DEPT.DEPTNO;

SELECT *
FROM EMP JOIN DEPT
ON EMP.DEPTNO = DEPT.DEPTNO;

SELECT *
FROM EMP NATURAL JOIN DEPT; --이거 대박이다 이거쓰면 IQUI조인 보다 이게 훨씬 편한거같다.

SELECT *
FROM EMP JOIN DEPT 
USING(DEPTNO); -- 이름이 같은 컬럼을 넣어주면 NATURAL JOIN 같은 역할을 하는데 그냥 NATURAL JOIN 쓰면 될거같다. 비교식도 안써도 된다.

SELECT DEPTNO -- 컬럼이 하나밖에 없기때문에 공통 컬럼도 그냥 써도 된다 네츄럴 조인 이거 사기급이다.
FROM EMP NATURAL JOIN DEPT; 


--=============================================================
--사원별 급여 등급 표현
select * from salgrade;
--나쁘지않은 조인

select ename, losal,sal,hisal
from emp e , salgrade s
where sal between losal and hisal
;

--================================================================
-- self join : 자기 자신의 테이블을 조인하는 경우
-- 각 사원의 이름과 각 사원의 메니저 이름을 출력
select e.ename , m.ename as "관리자 이름"
from emp e, emp m
where e.mgr=m.empno
;

--======================================================================
-- outer join : 조건에 만족하지 않는 행도 출력을 하는 join
select e.ename , nvl(m.ename,'없음') as "관리자 이름"
from emp e, emp m
where e.mgr=m.empno(+) --안나오는것도 다나오게해준다. 확장한다는 의미가있다.
;

SELECT * 
FROM EMP E JOIN EMP M
ON E.MGR = M.EMPNO;

SELECT *
FROM EMP E LEFT OUTER JOIN EMP M
ON E.MGR=M.EMPNO;
--위아래 같은거임
SELECT *
FROM EMP E , EMP M
WHERE E.MGR=M.EMPNO(+);

--=======================================================================
--3단 IQUI JOIN

SELECT O.ORDERID, C.NAME, B.BOOKNAME, o.saleprice, O.ORDERDATE
FROM ORDERS O , customer C , BOOK B
WHERE O.CUSTID=C.CUSTID AND O.BOOKID = B.BOOKID
ORDER BY O.ORDERID;





