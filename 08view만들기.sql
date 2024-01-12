
use sqldb;
select * from usertbl;

create view vuser
as
select * from usertbl;

select * from vuser;

-- 뷰사용 이유? 1. 보안 2. 복잡한 쿼리문 단순화 시키기alter

use sqldb;

create view v1
as
select u.userid as 'userid', u.name 'user name', b.prodName as 'prduct name'
from usertbl u
inner join buytbl b
on u.userid = b.userid;

select * from v1;

select 'user id', 'user name', 'product name' from v1
	where 'user id' = 'KBS' order by 'product name'; -- ' 백틱 ~키와 같이 있는것
    
-- view 수정하기
alter view v1
as 
select
	u.name as 'name' , u.addr 'addr' , concat_ws('-', u.mobile1, u.mobile2) 'tel'
from usertbl u
	inner join buytbl b
    on u.userid = b.userid;
    
select * from v1;
select 'name' , 'tel' from v1; -- name, tel
create or replace view v1
as
select name, birthyear from usertbl where name = '김범수';

select * from v1;

-- 뷰 삽입 테이블이 삽입 될까?
-- usertbl을 복사하기
create table copyusertbl
as
select * from usertbl;

-- 뷰만들기
create or replace view v2
as
select userid, name, birthyear, addr, height from copyusertbl;

select * from v2; -- 뷰에 삽입 됐다
insert into v2 values( 'HGD','홍길동', 2020,'서울', 175 );

select * from copyusertbl; -- 테이블에 삽입된다.

-- 테이블 안에 삽입하기 뷰에 붙였을경우
insert into copyusertbl (userid, name, birthyear, addr )
	values ('ADM', '관리자', 2021, '인천');

-- 뷰에 수정 테이블이 수정 가능한가
select * from v2;
select * from copyusertbl;
-- 홍길동 birthyear 2019 수정하기
update v2 set birthyear = 2019 where name = '홍길동' ;

-- 뷰 삭제 테이블이 삭제될까
-- 관리자 지우기
delete from v2 where name = '관리자';

-- view 삭제하기
drop view v2;

-- ----------------------------------
-- 테이블스페이스 : 물리적 공간
-- DBA 데이터베이스 관리 - 서버계정, 공간 할당
-- ----------------------------------

-- 인덱스
-- 자료 찾을 때 색인표 붙여 두는것
-- 목적 : 빠르게 검색하려고
-- B -Tree //시간이 많이 들고 공간이 많이 차지된다

-- 장점 : 검색 속도가 빠르다. 시스템의 성능 향상
-- 단점 : 추가 공간 필요, 데이터베이스 전체 용량의 10퍼 필요
-- 처음인덱스 생성시 오래 걸림

-- 인덱스를 생성하는 경우
-- 인덱스는 열단위에 생성
-- where 절에서 사용 되는 열에 인덱스를 만들어야한다
-- 자주 사용 하는 열에 생성
-- 조인을 자주하는 열에 생성

-- primary key, unique 지정한 열은 자동으로 인덱스 처리

-- 스토어드 프로그램
-- 고급 sql문 상위레벨

-- 종류 1. 스토어드 프로시저, 2. 스토어드 함수, 3. 커서, 4. 트리거

/* 1. 스토어드 프로시저 형식
delimiter $$
 create procedure 이름( 입력 또는 출력 파라미터(매개변수) )
 begin	
	내용
end $$
delimiter ;
call 이름(실제값을) ;
*/

delimiter $$
create procedure p1()
begin
	select sysdate();
end $$
delimiter ;

call p1();

drop procedure if exists p1;


-- 바비팀의 레코드 검색
delimiter $$
create procedure p2( in userName varchar(10) )
begin
	select * from usertbl where name = userName;
end $$
delimiter ;

call p2('바비킴');

-- 생일 1973년보다 크고 키가 170 보다 큰 사람
drop procedure p3;
delimiter $$
create procedure p3( in birth int, in h int )
begin
	select * from usertbl where birthyear >= birth and height >= h;
end $$
delimiter ;

call p3(1973, 170);


-- testtbl 안에 데이터를 삽입하고 검색겨롸를 출력하는 프로시저

create table testtbl
 (id int auto_increment primary key, name char(10) );
insert into testtbl values(null, '홍길동');

delimiter $$
create procedure p4( in inVar char(10), out outVar int )
begin
	insert into testtbl values( null, inVar);
    select count(id) into outVar from testtbl;
end $$
delimiter ;

drop procedure p4;
call p4('이순신', @countVar);
select @countvar;
select * from testtbl;

-- -----------------------------------------------
drop procedure ifelseProc;
delimiter $$
create procedure ifelseProc( in userName varchar(10), out byear int)
begin
	
	select birthyear into byear from usertbl where name = username;
	if (byear >= 1980 ) then
		select '아직 젊군요';
	else
		select '나이가 지긋하네요';
	end if;
end $$
delimiter ;

call ifelseProc('조용필', @yearOut);
select @yearOut; -- ?? 1950년