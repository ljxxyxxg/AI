use spldb;
select * from usertbl;
-- userId 'BBK','JMK'
select * from usertbl where userid in ('BBK', 'JKW');
-- 김씨 성을 가진 사람

select * from usertbl where name like '김%';
-- 1단계 김경호 키는?
select height from usertbl where name = '김경호';
-- 2단계 조건 찾기
select * from usertbl where height >= 177;
-- 1단계 2단계 동시 작성
select * from usertbl where height >= (select height from usertbl where name = '김경호'); -- 서브커리

-- 은지원 나이가 어린 사람?
select birthYear from usertbl where name ='은지원';
select * from usertbl where birthYear > ( select birthYear from usertbl where name = '은지원');

select * from buytbl;

-- 노트북의 분류랑 같은거 찾기
-- 1단계
select groupName from buytbl where prodName = '노트북';
-- 두가지 방법
select userid, prodName, groupName from buytbl where groupName = '전자';

select userid, prodName, groupName from buytbl where groupName = (select groupName from buytbl where prodName = '노트북');

-- 김범수 산 물건?
-- 1단계
select prodName, userID from buytbl where userID = 'KBS';

-- 2단계
select prodName, userID from buytbl where userID = (select userID from usertbl where name = '김범수');

select * from usertbl;
-- 주소가 서울인 사람 뽑기
select * from usertbl where addr = '서울';
-- 서울에 사는 사람의 키보다 작은 키를 가진 사람 any 최소값보다 큰것 또는

select * from usertbl where height <= any(select height from usertbl where addr = '서울');

 -- 서울에 사는 사람의 키보다 작은 키를 가진 사람 all and 그리고 같은 뜻
 select * from usertbl where height <= all(select height from usertbl where addr = '서울');


select * from usertbl where height <= some(select height from usertbl where addr = '서울');

select * from buytbl;

-- 운동화를 산 사람의 이름은?
select userID from buytbl where prodName = '운동화';
select name from usertbl where userid = any( select userID from buytbl where prodName ='운동화');

-- 키가 제일 큰 사람 3명
select * from usertbl order by height desc limit 3;

-- 나이가 제일 많은 사람 5명 검색
select * from usertbl order by birthyear asc limit 5;

-- 테이블 만들기 구조가 usertbl 동일한 테이블 만들고 싶다.
create table usertbl2 ( select * from usertbl);
select * from usertbl2;

-- 테이블 만들기 서울에 있는 사람
create table usertblSeoul ( select * from usertbl where addr ='서울');
select * from usertblSeoul;

-- 키가 175 ~ 180 사이인 사람만 userid, name, height  열만 테이블 만들기
create table heightTbl ( select userid, name, height from usertbl where height between 175 and 180);
select * from heightTbl;
-- 단 제약조건 (px, fk)은 만들어지지 않는다.


-- group by절 : 여러개가 들어가도 답이 1개가 나오는 것
select userid, sum(amount), avg(amount), max(amount), count(amount), std(amount), var_samp( amount) from buytbl group by userid;

-- 총구매액이 300원 이상인 사람의 사용자명과 총구매액 구하기
select userid, sum(price) from buytbl group by userid having sum(price) >= 300;

-- 경품 대상인 사람을 테이블 만들어기, userid, mobile1, mobile2, addr
create table eventTbl (select userid, mobile1, mobile2, addr from usertbl where userid = any(select userid from buytbl group by userid having sum(price) >= 300));

select * from eventTbl;

select * from buytbl;

-- groupName 그룹화 하기
select groupName, sum( amount), sum(price) from buytbl group by groupName;


-- 테이블 가장 높은 groupName, prodName, amount, price 만들기
-- 1단계 전자 찾기
select groupName, max( price ) from buytbl group by groupName having max(price) >= (select max(price) from buytble);

-- 2단계 
create table maxGrouptbl (select groupName, amount, price from buytbl where groupName = (select groupName from buytbl group by groupName having max(price) >= (select max(price) from buytbl)));
 
select * from maxGrouptbl;
select groupName, prodName, amount, price from buytbl where groupName = '전자';

-- roll up
-- 소합계
select num, groupName, sum( price) from buytbl group by groupName, num with rollup;

-- 게시판에서 게시글 번호 자동 번호 넘버링 되면 좋겠다.
-- 학번 부여 자동부여 되게 하고 싶다.
-- auto incerement int형 이고 primary key /unique 이용
create table if not exists testtbl2 ( id int auto_increment primary key, userName char(3), age int );

insert into testtbl2 values( null, '지민', 25);

insert into testtbl2 ( userName, age) values ('유나', 22);
insert into testtbl2 ( userName, age) values ('유경', 21);

alter table testtbl2 auto_increment = 100;
insert into testtbl2 values( null, '지현', 25);

select * from testtbl2;

drop table testtbl2;

-- 240101 시작
alter table testtbl2 auto_increment =240101;
insert into testtbl2 (userName, age) values ('유경', 21);

select * from testtbl2;

-- 증가치를 1씩 아니라 3개씩 증가되게 만들기
set @@auto_increment_increment = 3;
insert into testtbl2 (userName, age) values ('나경', 21);
insert into testtbl2 (userName, age) values ('나경2', 21);


select * from testtbl2;

-- insert 문인데 select 문을 이용해서 삽입하기
create table testtbl4 ( id int, fname varchar(50), Iname varchar(50) );

use employees;
select * from employees;
insert into employees values ( 1004, '05/01/01', '정', '현희', 'F','20/10/05');
insert into employees values ( 1005, '05/01/01', '배', '현희', 'M','20/10/05');
insert into employees values ( 1006, '05/01/01', '이', '현희', 'M','20/10/05');
insert into employees values ( 1007, '05/01/01', '김', '현희', 'F','20/10/05');

select * from employees.employees;

-- sqldb 사용하러 가기
use sqldb;

drop table if exists testtbl4;
select * from buytbl;
-- 상품명 : 상품명 , 가격 테이블 만들기
-- 1단계 테이블 만들기
create table if not exists testtbl4
(prodName varchar(40) not null,
price int not null);
-- 2단계 삽입한다.
select distinct prodName, price from buytbl;

insert into testtbl4
	select distinct prodName, price from buytbl;

select * from testtbl4 order by price desc;

-- 청바지 가격을 100으로 숮정하기
update testtbl4 set price = 100 where prodName = '청바지';
-- 가장 높은 가격인 것을 찾아서 10% 인하하기
-- 1단계 높은가격 찾기
select price from testtbl4 order by price desc limit 1;

-- 2단계 10퍼 인하
update testtbl4 set price = price - price * 0.1 where price = (select price from(select price from testtbl4 order by price desc limit 1) as t);


-- delete문
select * from buytbl;

-- copyBuy 테이블 복사해서 만들기
create table copyBuy
	select * from buytbl;

select * from copyBuy;

-- copyBuy amount가 제일 작은 것 찾아서 삭제하기
 -- 1단계 amount가 제일 작은 것 찾기
 select amount from copyBuy order by amount asc limit 1;
 
 -- 2단계 삭제하기
 delete from copyBuy where amount = (select amount from( select amount from copyBuy order by amount asc limit 1) as t );

select * from copyBuy;

create table testtbl4 ( id int, fname varchar(50), Iname varchar(50) );

select emp_no, first_name, last_name from employees.employees;

insert into testtbl4 
	select emp_no, first_name, last_name from employees.employees;

select * from testtbl4;

select * from buytbl order by price desc;

create table copyBuytbl (select * from buytbl);

select * from copyBuytbl order by price desc limit 3;

-- 가격의 상위 3개 삭제하기
delete from copyBuytbl order by price desc limit 3;

select * from copyBuytbl;

-- 수량 하위 2개 삭제하기
select * from copyBuytbl order by amount asc;
delete from copyBuytbl order by amount asc limit 2;

select * from copyBuytbl;

-- 운동화중 상위 1개 삭제하기
select * from copyBuytbl where prodName = '운동화';

update copyBuytbl set price = 60 where num = 1;

commit;

