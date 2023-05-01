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

-- DML update
update tbl_todo set todo='청소' , duedate='2023-05-03' where tno=2;

-- DML delete
delete from tbl_todo where tno=8;


select * from tbl_todo;



