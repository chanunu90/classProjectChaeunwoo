-- 2023 0412
-- sub query

-- 스칼라 부속질의 : SELECT 절에 쓸수 있는 서브쿼리 , 단일값(질의의 결과가 단일행 단일열)
SELECT DEPTNO , (SELECT DNAME FROM DEPT WHERE DEPT.DEPTNO=EMP.DEPTNO)
FROM EMP
WHERE ENAME = 'SCOTT';

SELECT o.custid , C.NAME , SUM(o.saleprice)
FROM orders O, customer C
WHERE O.custid = C.custid
GROUP BY O.CUSTID, C.NAME;

SELECT O.custid  , SUM(O.saleprice) , (SELECT NAME FROM customer C WHERE O.custid = C.custid)
FROM orders O
GROUP BY custid;

-- 인라인 뷰 : FROM 절 뒤에 오는 서브쿼리 , 가상의 테이블 ,테이블처럼 사용
SELECT EMPNO , ENAME , JOB , HIREDATE FROM EMP WHERE DEPTNO = 30;

SELECT *
FROM (SELECT EMPNO , ENAME , JOB , HIREDATE FROM EMP WHERE DEPTNO = 30) -- 범위가 제한된 테이블(뷰)를 만들어서 사용할수도 있따.
WHERE ENAME='SCOTT';

SELECT ROWNUM, ENAME , hiredate
FROM EMP;

SELECT ROWNUM, ENAME , hiredate FROM EMP ORDER BY HIREDATE;

SELECT ROWNUM , ENAME , HIREDATE
FROM (SELECT ROWNUM, ENAME , hiredate FROM EMP ORDER BY HIREDATE);

-- EMP 테이블에서 최고급여를 받는 사람 5명을 뽑아서 사원의 이름 급여 정보를 출력해보자
SELECT ROWNUM, ENAME ,sal 
FROM (SELECT ROWNUM, ENAME , hiredate ,sal FROM EMP ORDER BY sal DESC)
WHERE ROWNUM < 6;

-- 중첩 질의 : WHERE 절 뒤에오는 비교연산과 연산자를 통해 처리할 때

-- 비교 : 단일값이 나오는 서브쿼리를 사용해야 합니다.
-- 평균급여보다 더많은 급여를 받는 사원들을 찾아라.
SELECT rownum , empno , ename , hiredate , sal
FROM ( SELECT empno , ename , hiredate , sal FROM EMP order by sal desc )
WHERE SAL > ( SELECT ROUND(AVG(SAL)) FROM EMP );


-- 평균 주문금액 이하의
-- 주문에 대해서 주문번호와 금액을 보이시오.
select orderid, saleprice
from orders
where saleprice <= (select max(saleprice) from orders);

-- 각 고객의 평균 주문금액보다 큰 금액의 주문 내역에 대해서
-- 주문번호, 고객번호, 금액을 보이시오.
select orderid, saleprice
from orders
where saleprice <= (select avg(saleprice) from orders);

--==============================================================

select o1.orderid , o1.custid , saleprice
from orders o1
where saleprice > (select avg(saleprice) from orders o2 where o2.custid=o1.custid); -- 고객의 평균 구매액 평균비교할떄 매우좋다.
-- 1번 고객의 평균 구매액
select avg(saleprice) from orders where custid=1;

--================================================================
-- 주어진 문제가 3000 이상 받는 사원이 소속된 부서(10번, 20번)와 동일한 부서에서 근무하는 사원이기에 
-- 서브 쿼리의 결과 중에서 하나라도 일치하면 참인 결과를 구하는 IN 연산자와 함께 사용되어야 합니다.

select *
from emp
where sal >=3000;

select deptno
from emp
where sal >=3000;

select *
from emp
where deptno in (
    select distinct deptno
    from emp
    where sal >= 3000
);

-- 대한민국에 거주하는 고객에게 판매한 도서의 총 판매액을 구하시오. 
-- 판매한 도서의 총 판매액을 구하시오.
select sum(saleprice)
from orders
where custid in (select custid from customer where address like '%대한민국%');

-- 대한민국에 거주하는 고객 번호
select custid from customer where address like '%대한민국%';

-- 대한민국에 거주하지않는 고객 번호
select custid from customer where address not like '%대한민국%';

-- 
select sum(o.saleprice)
from orders o, customer c
where o.custid = c.custid
and c.address like '%대한민국%';

--============================================

--다음은 부서번호가 30번인 사원들의 급여 중 가장 작은 값(950)보다 많은 급여를 받는 사원의 이름, 급여를 출력하는 예제를 작성해 봅시다

SELECT *
FROM orders
WHERE saleprice > (select max(saleprice) from orders where custid = 3);

--3번 고객이 주문한 최고 금액
select * from orders where custid = 3;
select max(saleprice) from orders where custid = 3;

--all : 서브쿼리의 결과 데이터 모두와 비교해서 참일 때 => 참
SELECT *
FROM orders
WHERE saleprice > all (select saleprice from orders where custid = 3);

SELECT *
FROM orders
WHERE saleprice > 6000 and saleprice > 12000 and saleprice > 13000;

--다음은 부서번호가 30번인 사원들의 급여 중 가장 작은 값(950)보다 많은 급여를 받는 사원의 이름, 급여를 출력하는 예제를 작성해 봅시다. 
--sal > 2850 or sal > 1600 > or sal > 1250 or sla > 1500 or sal > 500 or sal > 950

SELECT * FROM emp where deptno = 30;
SELECT min(sal) FROM emp where deptno = 30;

select ename, sal
from emp
where sal > all (SELECT sal FROM emp where deptno = 30);

select ename, sal
from emp
where sal > (SELECT max(sal) FROM emp where deptno = 30);

--===============================================================SET

-- exists, not exists
-- 상관관계가 반드시 필요한 서브쿼리가 조건의 결과로 사용 :  select의 결과가 존재 하는지 여부에 따라 결과 처리
-- EXISTS 연산자로 대한민국에 거주하는 고객에게 판매한 도서의 총 판매액을 구하시오.
-- EXISTS 존재할경우에만 실행 아닐경우 null 트루나 펄스냐의 차이임

SELECT sum(saleprice)
FROM Orders o
WHERE EXISTS (select * from customer c where c.custid=o.custid and c.address like '%대한민국%' );





