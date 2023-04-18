--2023.04.18
--DLL TEST
--제시된 테이블 정의서를 보고 DDL 을 완성해봅시다.
create table phoneInfo_basic(
    idx number(6) constraint pk_phoneInfo_basic_idx primary key not null,
    fr_name varchar2(20) constraint phoneInfo_basic_fr_name not null, 
    fr_phonenumber varchar2(20) constraint phoneInfo_basic_fr_phonenumber not null, 
   
    fr_email varchar2(20) constraint phoneInfo_basic_fr_email null,
    fr_address varchar2(20) constraint phoneInfo_basic_fr_address null,
    fr_regdate DATE default sysdate constraint phoneInfo_basic_fr_regdate null 
);


create table phoneinfo_univ(
    idx number(6) constraint pk_phoneinfo_univ_idx primary key not null,
    fr_u_major varchar2(20) default 'N' constraint phoneinfo_univ_fr_u_major not null, 
    fr_u_year number(1)default 1  constraint phoneinfo_univ_fr_u_year not null, 
    fr_u_ref number(7) constraint phoneinfo_univ_fr_u_ref not null REFERENCES phoneInfo_basic(idx)
);

create table phoneinfo_com(
    idx number(6) constraint pk_phoneinfo_com_idx primary key not null,
    fr_c_company varchar2(20) default 'N' constraint phoneinfo_com_fr_c_company not null, 
    fr_ref number(6) CONSTRAINT FK_EMP01_deptno not null REFERENCES phoneInfo_basic(idx)
);

--전화번호부 테이블을 기준으로 DML 을 작성해봅시다.
--1. phoneInfo_basic 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
select * from phoneInfo_basic;
desc phoneInfo_basic;

insert into phoneInfo_basic (IDX , FR_NAME , FR_PHONENUMBER  , FR_EMAIL , FR_ADDRESS )
                     values (1 , '박효신'   , '010-5478-6321' , 'bark@gmail.com' , '서울' );
insert into phoneInfo_basic (IDX , FR_NAME , FR_PHONENUMBER , FR_EMAIL , FR_ADDRESS , FR_REGDATE)
                     values (2 , '성시경' , '010-5471-9618' , 'sung@gmail.com' , '경기도' , '');
insert into phoneInfo_basic values (4 , '싸이' , '010-5471-9618' , 'ssa@gmail.com' , '경기도' , '');
                     
update phoneInfo_basic
set FR_NAME = '차은우' , FR_EMAIL = 'cha@gmail.com' , FR_REGDATE=sysdate
where idx = 1;

delete
from phoneInfo_basic
where idx = 4;

--2. phoneinfo_univ 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
select * from phoneinfo_univ;
desc phoneinfo_univ;

insert into phoneinfo_univ (IDX , FR_U_MAJOR , FR_U_YEAR , FR_U_REF)
                     values (1 , '발라드' , 4 , 1);
insert into phoneinfo_univ values (2 , '뮤지컬' , 3 , 2);
insert into phoneinfo_univ values (3 , '뮤지컬' , 3 , 2);

update phoneinfo_univ
set FR_U_MAJOR = '춤 댄스' , FR_U_YEAR = 3 , FR_U_REF=1
where idx = 1;

delete
from phoneinfo_univ
where idx = 3;



--3. phoneinfo_com 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
select * from phoneinfo_com;
desc phoneinfo_com;

insert into phoneinfo_com (IDX , FR_C_COMPANY , FR_REF)
                     values (1 , '버블스튜디오' , 1);
insert into phoneinfo_com values (2 , '아시아나' , 2 );
insert into phoneinfo_com values (3 , '버블스튜디오'  , 3 );

update phoneinfo_com
set FR_C_COMPANY = '아스트로' , FR_REF=1
where idx = 1;

delete
from phoneinfo_com
where idx = 2;
commit;


