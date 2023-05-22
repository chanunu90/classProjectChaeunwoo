

-- tbl_board SQL

-- select
select * from tbl_board;


-- insert
insert into tbl_board (title, content, writer) 
values ('게시글 테스트1', '게시글 쓰기 테스트 1', '테스터');

-- insert into tbl_board (title, content, writer) values (#{}, #{}, #{})



-- update
update tbl_board 
set title='test11', content='test22', writer='test33', file='aa.jpg' 
where bno=8;
-- update tbl_board set title=#{}, content=#{}, writer=#{}, file=#{} where bno=#{}



-- delete