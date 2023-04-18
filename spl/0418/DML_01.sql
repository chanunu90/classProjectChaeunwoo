--2023.04.18
--DML : 입력 , 수정, 삭제
--Create(insert) , Read(select) , Update(update) , Delete(delete) => CRUD

--INSERT : 데이터를 행단위로 입력

--테스트 테이블 생성
CREATE TABLE DEPT01 (
    
    DEPTNO NUMBER(2) CONSTRAINT PK_DEPT01_DEPTNO PRIMARY KEY,
    DNAME VARCHAR2(10) NOT NULL,
    LOC VARCHAR(10) 
    

);

--테이블의 컬럼 타입을 수정해준다.
ALTER TABLE DEPT01 
MODIFY (
    LOC VARCHAR2(20)
);

INSERT INTO DEPT01
( DEPTNO , DNAME , LOC )
VALUES
( 10 , 'KANG' , 'SSAULABIJANGGUM'  );


INSERT INTO DEPT01
( LOC , DEPTNO , DNAME)
VALUES 
( '충청' , 20 , '누누'  );

----에러 만들기-------
--01 벨류절이 많음
INSERT INTO DEPT01
( DEPTNO , DNAME , LOC )
VALUES
( 30 , 'SON' , '서울' , 'ASDASD' );

--02 벨류절이 적음
INSERT INTO DEPT01
( DEPTNO , DNAME , LOC )
VALUES
( 30 , 'SON'  );

--03 제약오류
INSERT INTO DEPT01
( DEPTNO , DNAME  )
VALUES
( NULL , 'SON'  );

--04 컬럼이 NOT NULL이기 떄문에 생략되면 NULL로 들어가는 컬럼이 있으면 오류 발생
--즉 NOT NULL이 있는 컬럼은 반드시 입력해줘야한다.
INSERT INTO DEPT01
( DEPTNO , LOC  )
VALUES
( NULL , '서울'  );

--05 식별자(컬럼명)을 잘못쓰면 나는에러
INSERT INTO DEPT01
( DEPTNOOO , LOOOC  )
VALUES
( NULL , '서울'  );

---------------------------------


--식별자를 넣지 않고도 INSERT해줄수 있지만 테이블생성시 만든 컬럼 순서대로 입력을 해주어야한다.
INSERT INTO DEPT01 VALUES( 40, '기획팀' , '서울'  );

-- NULL 값을 입력
-- 명시적 입력
INSERT INTO DEPT01 VALUES( 50, 'TEST' , NULL  );
INSERT INTO DEPT01 VALUES( 70, 'TEST111' , ''  );

-- 암묵적 입력 : 이건 따로 앞에 식별자 위치 지정해주어야함
INSERT INTO DEPT01 (DEPTNO , DNAME) VALUES( 60, 'TEST123' );


--서브쿼리를 이용한 데이터 입력
CREATE TABLE DEPT02
AS
SELECT * FROM DEPT WHERE 1=0;
----이거 많이 좋다.------
INSERT INTO DEPT02
SELECT * FROM DEPT;
-------------------


-- UPDATE : 핻단위 컬럼들의 데이터를 변경 - > 해당 컬럼의 값을 입력/수정/삭제
-- UPDATE : 테이블 이름 SET 컬럼1=새로운값 , 컬럼2=새로운값 , ... WHERE 행을 선택하는 조건

-- 10번부서의 이름을 '디자인팀'으로 변경하고 , 위치 정보를 '판교'로 수정하자.
SELECT * FROM DEPT01;

UPDATE DEPT01 
SET DNAME = '디자인팀', LOC = '판교'
WHERE DEPTNO = 10;

ALTER TABLE DEPT01 MODIFY(
    DNAME VARCHAR(20)
);

DROP TABLE DEPT02;

CREATE TABLE DEPT02
AS
SELECT  * FROM DEPT;

SELECT * FROM DEPT02 ;
DESC DEPT02;

DROP TABLE EMP01;

CREATE TABLE EMP01
AS
SELECT  * FROM EMP;

SELECT * FROM EMP01 ;
DESC EMP01;


UPDATE EMP01
SET DEPTNO=30
WHERE 1=1;

--모든 사원의 급여를 10% 인상시키는 UPDATE
UPDATE EMP01
SET SAL = SAL*1.1;


-- 모든 사원의 입사일을 오늘로 수정
--UPDATE EMP01 SET HIREDATE = SYSDATE;

-- 특정행을 수정할 경우 WHERE 의 조건으로 행을 선택
-- 부서번호가 10번인
-- 사원의 부서번호를 30번으로 수정합니다.

UPDATE EMP01
SET DEPTNO = 30
WHERE DEPTNO = 10;


-- 1987년에 입사한 사원의
-- 입사일이 오늘로 수정합시다.
UPDATE EMP01
SET HIREDATE = SYSDATE
WHERE SUBSTR(HIREDATE , 1 , 2) = 87;

SELECT *
FROM EMP01
WHERE SUBSTR(HIREDATE , 1 , 2) = 87;


--SCOTT 사원의 부서번호는 40번으로 직급은 MANAGER로 수정하자
UPDATE EMP01
SET JOB = 'MANAGER' , DEPTNO = 40
WHERE ENAME = 'SCOTT';

SELECT * FROM EMP01;

--서브쿼리를 이용한 데이터 수정
--20번 부서의 지역명을 40번 부서의 지역명으로 변경
SELECT * FROM DEPT02;

UPDATE DEPT02 
SET LOC = (SELECT LOC FROM DEPT02 WHERE DEPTNO=40) 
WHERE DEPTNO=20;


--서브 쿼리를 이용해서
--부서번화가 20번 부서의 부서명과 지역명을
--부서 번화가 30번인 부서와 동일 하게 변경하도록
-- 이거 진짜 짱짱좋음
UPDATE DEPT02
SET (DNAME, LOC) = (SELECT DNAME, LOC FROM DEPT02 WHERE DEPTNO=30 )
WHERE DEPTNO=20;

--삭제 DELETE : 테이블의 행단위 삭제
--DELETE 
--FROM 
--WHERE ; --DELETE 쓸때는 꼭 웨어절을 넣어야한다 안넣으면 다날라간다. 큰일난다.

SELECT * FROM DEPT01;
-- DEPT01 테이블의 모든 행을 삭제, 모든 부서정보를 삭제
DELETE FROM DEPT01;
ROLLBACK;
-- 부서 테이블의 DEPT02에서 30번 부서만 삭제합시다.
DELETE FROM DEPT02  WHERE DEPTNO=30;
SELECT * FROM DEPT02;

--사원 테이블은 부서명이 SALES인 사원을 모두 삭제한다.
SELECT * FROM EMP01;                                                  

DELETE FROM EMP01 WHERE DEPTNO = (SELECT DEPTNO FROM DEPT02 WHERE DNAME='RESEARCH');





