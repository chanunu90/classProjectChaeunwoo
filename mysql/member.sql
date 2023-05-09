CREATE TABLE `member` (
  `idx` int NOT NULL AUTO_INCREMENT,
  `uid` varchar(45)  NOT NULL,
  `pw` varchar(45) NOT NULL,
  `uuid` varchar(45) DEFAULT NULL,
  `uname` varchar(45) NOT NULL,
  `uphoto` varchar(45) DEFAULT NULL,
  
  PRIMARY KEY (`idx`),
  UNIQUE KEY `uid_UNIQUE` (`uid`)
);

-- --------------------------------------------------------------------

-- insert
INSERT INTO member
(
`uid`,
`pw`,
`uname`,
`uphoto`
)
VALUES
(
 'cool',
 '1111',
 'COOL',
 'photo.jsp'
);
 -- INSERT INTO member ( `uid`,`pw`,`uname`,`uphoto`) VALUES ( ? , ? , ? , ? );

-- select : 로그인처리 -> uid pw 를 조회해서 만든다.


select *
from member
where uid = "cool" and pw = "1111"
;

-- MemberDTO 데이터 저장
-- select idx, uid, uname , uphoto from member where uid = ? and pw = ?



-- DML insert
INSERT INTO member ( todo,duedate ) VALUES ( 'JSP 공부' , '2023-05-05');

-- DML update
update member set todo='청소' , duedate='2023-05-02' , finished = '0' where tno=2 ;
-- update tbl_todo set todo=? , duedate=? , finished = ? where tno=? ;

-- DML delete
delete from member where tno=8;
-- delete from tbl_todo where tno=?


-- select * from emp where empno = 7499;
-- ALLEN 을 차은우로 변경 나중에 다시 ALLEN 으로 변경해라


