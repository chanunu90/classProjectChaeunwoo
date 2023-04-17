--1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
--(5) 박지성이구매한도서의출판사수
SELECT COUNT(DISTINCT b.publisher)
FROM ORDERS O, BOOK B, CUSTOMER C 
WHERE O.BOOKID=B.BOOKID AND O.CUSTID = C.CUSTID
AND C.NAME = '박지성';
--(6) 박지성이구매한도서의이름, 가격, 정가와판매가격의차이
SELECT BOOKNAME, SALEPRICE , PRICE - SALEPRICE
FROM ORDERS O, BOOK B, CUSTOMER C 
WHERE O.BOOKID=B.BOOKID AND O.CUSTID = C.CUSTID
AND C.NAME = '박지성';

--(7) 박지성이구매하지않은도서의이름
SELECT BOOKNAME
FROM BOOK
WHERE BOOKID NOT IN (
    SELECT DISTINCT BOOKID
    FROM ORDERS O, CUSTOMER C 
    WHERE O.CUSTID = C.CUSTID
    AND C.NAME = '박지성'
);

--2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
--(8) 주문하지않은고객의이름(부속질의사용)
    SELECT *
    FROM customer
    WHERE CUSTID NOT IN 
    (
        SELECT DISTINCT(c.custid)
        FROM ORDERS O,CUSTOMER C 
        WHERE O.CUSTID = C.CUSTID
    );
    
--(9) 주문금액의총액과주문의평균금액
        SELECT AVG(SALEPRICE) , SUM(SALEPRICE)
        FROM ORDERS;
    
--(10) 고객의이름과고객별구매액
        SELECT c.name , SUM(o.saleprice)
        FROM ORDERS O,CUSTOMER C 
        WHERE O.CUSTID = C.CUSTID
        GROUP BY c.custid , C.NAME
        ORDER BY c.custid;

--(11) 고객의이름과고객이구매한도서목록
        SELECT NAME , BOOKNAME
        FROM ORDERS O, BOOK B, CUSTOMER C 
        WHERE O.BOOKID=B.BOOKID AND O.CUSTID = C.CUSTID
        ORDER BY NAME;

--(12) 도서의가격(Book 테이블)과판매가격(Orders 테이블)의차이가가장많은주문
        
        SELECT BOOKNAME , PRICE - SALEPRICE AS GAP
        FROM ORDERS O, BOOK B
        WHERE O.BOOKID=B.BOOKID
        AND PRICE - SALEPRICE IN (
            SELECT MAX(PRICE - SALEPRICE)
            FROM ORDERS O, BOOK B
            WHERE O.BOOKID=B.BOOKID
        );
            
--(13) 도서의판매액 평균보다 자신의구매액평균이더높은고객의이름
        SELECT NAME
        FROM ORDERS NATURAL JOIN CUSTOMER
        WHERE SALEPRICE > (SELECT AVG(PRICE) FROM BOOK);
        
    
--3. 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.
--(1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름

        SELECT NAME
        FROM ORDERS O, BOOK B, CUSTOMER C 
        WHERE O.BOOKID=B.BOOKID AND O.CUSTID = C.CUSTID
        and publisher in (
                SELECT DISTINCT b.publisher
                FROM ORDERS O, BOOK B, CUSTOMER C 
                WHERE O.BOOKID=B.BOOKID AND O.CUSTID = C.CUSTID
                AND C.NAME = '박지성'
        ) and c.name != '박지성';
        

        
        

--(2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름

            SELECT c.custid , c.name , count(distinct b.publisher)
            FROM ORDERS O, BOOK B, CUSTOMER C 
            WHERE O.BOOKID=B.BOOKID AND O.CUSTID = C.CUSTID
            group by c.custid , c.name
            having count(distinct b.publisher) > 1;
            
            
-- 2개 이상의 출판사의 책을 구매한 회원 id 
    select c.name
    from customer c , orders o , book b
    where o.custid = c.custid and o.bookid = b.bookid
    group by c.name
    HAVING count(DISTINCT b.publisher) > 1;
            


    select count(distinct b.publisher) , c.custid
    from orders c , book b
    where b.bookid = c.bookid
    group by c.custid
    HAVING count(DISTINCT b.publisher) > 1;
    
    
    select *
    from customer
    where custid in  
    (
            select c.custid
            from orders c , book b
            where b.bookid = c.bookid
            group by c.custid
            HAVING count(DISTINCT b.publisher) > 1
    )

            

