--2023.04.19
-- view 객체는 sql을 가진다! => sql 실행결과를 가상의 테이블로 사용
-- view 객체 생성
-- create or replace view 뷰이름 as 서브쿼리
create or replace view emp_view30
as
select empno , ename , deptno
from emp
where deptno=30;

select * from emp_view30;

drop view emp_view30;

-- 주문정보 : orders , book , customer
SELECT o.orderid , c.name , b.bookname, b.price , o.saleprice , o.orderdate , c.phone
FROM ORDERS O, BOOK B, CUSTOMER C 
WHERE O.BOOKID=B.BOOKID AND O.CUSTID = C.CUSTID;

-- view 생성
create or replace view order_info
as
SELECT o.orderid , c.name , b.bookname, b.price , o.saleprice , o.orderdate , c.phone
FROM ORDERS O, BOOK B, CUSTOMER C 
WHERE O.BOOKID=B.BOOKID AND O.CUSTID = C.CUSTID;

drop view order_info;

select name , bookname from order_info where name = '박지성';

select  view_name , text from user_views;


-- view 삭제하기
drop view emp_view30;

select rownum, ename , hiredate from emp order by hiredate;

select rownum , ename , hiredate
from (select ename , hiredate from emp order by hiredate)
where rownum <= 3;
--뷰생성으로 간단하게
create or replace view emp_hiredate_view
as
select ename , hiredate from emp order by hiredate;


select rownum , ename , hiredate
from emp_hiredate_view
where rownum < 4;

select rownum , ename , hiredate
from emp_hiredate_view
where rownum <= 6
order by rownum desc ;

select to_char(hiredate , 'yyyy') from emp;



select * from dept;
select * from dept where deptno = 70;




