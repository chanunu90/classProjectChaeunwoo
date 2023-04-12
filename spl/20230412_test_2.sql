--1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
--(3) 박지성의총구매액(박지성의고객번호는1번으로놓고작성)
select sum(o.saleprice) as "박지성의 총 구매액"
from customer c , orders o
where o.custid = c.custid and name = '박지성';
--(4) 박지성이구매한도서의수(박지성의고객번호는1번으로놓고작성)
select count(*) as "박지성의 총 도서수"
from customer c , orders o
where o.custid = c.custid and name = '박지성';


--2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
--(1) 마당서점도서의총개수
select count(bookname) as "총 마당서점도서의 총개수"
from book;
--(2) 마당서점에도서를출고하는출판사의총개수
select count(distinct publisher)
from book;
