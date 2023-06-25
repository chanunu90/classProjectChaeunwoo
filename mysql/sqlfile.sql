CREATE TABLE `tbl_todo` (
  `tno` int NOT NULL AUTO_INCREMENT,
  `todo` varchar(100)  NOT NULL,
  `duedate` date DEFAULT (curdate()),
  `finished` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`tno`)
)
insert into tbl_todo values ();

-- DML insert
INSERT INTO tbl_todo
(`tno`,
`todo`,
`duedate`,
`finished`)
VALUES
( 'JSP 공부' , '2023-05-05' , '' , '' );


-- DML insert
INSERT INTO tbl_todo
(
todo,duedate)
VALUES
( 'JSP 공부' , '2023-05-05');
select * from tbl_todo;


-- DML insert
INSERT INTO tbl_todo ( todo,duedate ) VALUES ( 'JSP 공부' , '2023-05-05');
select * from tbl_todo;


-- DML update
update tbl_todo set todo='청소' , duedate='2023-05-02' , finished = '0' where tno=2 ;
-- update tbl_todo set todo=? , duedate=? , finished = ? where tno=? ;
-- DML delete
delete from tbl_todo where tno=8;
-- delete from tbl_todo where tno=?
select * from tbl_todo;

