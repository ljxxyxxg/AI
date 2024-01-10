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

-- 1. with절
-- 뷰 파생테이블 임시테이블 가상테이블 : 잠깐 쓰고 없어짐
use sqldb;
select * from usertbl;
select * from buytbl;

-- 요구사항 이름 총구매액(price * amount)
select userid, sum(price) * sum(amount) as '총구매액' from buytbl group by userID;

-- 이름 출력하기
select name from usertbl;

with t(tid, total)
as
( select userid, sum(price * amount) from buytbl group by userID) select * from t;

select usertbl.name, buytbl.price from usertbl, buytbl;

select * from usertbl, buytbl; -- 행과 행이 모두 곱해져서 나온다

-- userid name amount prcie 두개 테이블 각각 다른 항목
select usertbl.userID, usertbl.name,  buytbl.amount * buytbl.price
	from usertbl, buytbl
	where usertbl.userID = buytbl.userID;
    
-- select usertbl.name, usertbl.name,  buytbl.amount, buytbl.price
-- 	from usertbl, buytbl
-- 	where usertbl.userID = buytbl.userID
--     group by buytbl.userid;
    
select u.userID, u.name,  b.amount * b.price
	from usertbl u, buytbl b
	where u.userID = b.userID;
    
-- 위에 퀴리를 가상 테이블
with t( id, name, total)
as
(
    select u.userID, u.name,  b.amount * b.price
	from usertbl u, buytbl b
	where u.userID = b.userID
    )
    select name, sum(total) from t group by name;
    
-- 회원테이블에서 각 지역별로 가장 큰 키 1명씩 뽑은 후 그 사람들의 키의 평균을 내보자alter
-- 1단계 각지역별로 가장 큰 키를 1명씩 뽑은 후
select addr, max(height) from usertbl group by addr;
-- 2단계 가상테이블 만들기
with t(avgHeight)
as
(
select max(height) from usertbl group by addr
)
select avg(avgHeight) from t;

select * from buytbl;
-- 요구사항 그룹네임 전자 price 최저인 것의 평균
select groupName, min(price) from buytbl group by groupName;

with t(avgPrice)
as
(
select min(price) from buytbl group by groupName
)
select avg(avgPrice) from t;

select * from usertbl, buytbl;
select * from buytbl, usertbl where usertbl.userid = buytbl.userid;


-- -----------------------------------------------------------------------7장 sql고급
-- 동뎡상 소리 그림 2진수(BLOB) 저장해야된다.
-- 날짜형

select cast( '2020-10-19 12:35:29.123' as date) ; -- cast() 형변환 함수
select cast( '2020-10-19 12:35:29.123' as time) ;
select cast( '2020-10-19 12:35:29.123' as datetime) ;

set @var1 = 10;
set @var2 = '제품판매처 : 삼성';
select @var2, @var1 ;
select @var2, prodName from buytbl;

-- 데이터 형 변화 cast(), convert()
select * from buytbl;
select avg( amount ) from buytbl;

-- 실수형을 정수형으로 변환
select cast( avg( amount) as signed Integer) from buytbl;
select convert( avg( amount), signed Integer) from buytbl;

-- 정수형을 실수형으로 변환
set @var3 = 3;
select cast( @var3 as float );
select convert( @var3, float);

-- 정수형을 문자형으로 변환
set @var4 = 4;
select cast( @var4 as character);
select convert( @var4, char);

--
select '100' + '200';
select concat('100','200');
select concat(100, '200');
select 1 > '2mega'; -- 거짓이니깐 0
select 3 > '2mega'; -- 참이니깐 1
select 0 = 'mega0'; -- 문자는 0으로 바뀌므로 0=0

-- if 함수
-- select if(조건, 참, 거짓)

set @v1 = 10;
set @v2 = 20;
set @v3 = 0;
-- 가장 큰 수 구하기
select if( @v1 > @v2, if( @v1 > @v3 , @v1, @v3 ), if(@v2 > @v3, @v2, @v3) );

-- 가장 작은 수 구하기
select if( @v1 < @v2, if( @v1 < @v3 , @v1, @v3 ), if(@v2 < @v3, @v2, @v3) );

-- 중간 수 구하기
 select if( @v1 < @v2, if( @v1 > @v3 , @v1, @v3 ), if(@v2 < @v3, @v2, @v3) );


-- if null(수식1, 수식2)
select ifnull(null, 100);
select ifnull(200, null);
select ifnull(200, 100);
select ifnull(null, ifnull(null, 300));

-- nullif(수식1, 수식2)
select nullif(100, 100);
select nullif(200, 100);

-- case when else end
set @v1 = 1;
select case 1
	when 1 then '일'
    when 2 then '어'
    when 3 then '삼'
    else '1,2,3이 아님'
end as 'case 연습';

select * from buytbl;
-- userId KBS 김범수, JYP 조용필 나머지는 '모름'
select case userId
	when 'KBS' then '김범수'
    when 'JYP' then '조용필'
	else '모름'
end as '이름', userId
from buytbl;

-- 문자열 함수
-- concat()
-- concat_ws(구분자, 문자열1, 문자열2)
select concat_ws(',', '100', '200');
select elt(1, '하나', '둘', '셋');
select field('김', '이', '박', '최', '김', '성'); -- 처음 위치의 '김'이라는 문자를 뒤에 문자열에서 찾기
select find_in_set('김', '이, 박, 최, 김, 성');
select instr('이, 박, 최, 김, 성', '김');
select locate('김', '이, 박, 최, 김, 송');

select format(123456.123456, 4);

select hex(15);
select hex(10), oct( 8 ), bin(15);

select insert('abcdefghi', 3, 4, '0000');

select trim( '  abc   ');

select substring('대한민국만세', 3, 2);

select substring_index('cafe.naver.co.kr', '.', 1);

set @v = 'cafe.naver.com.co.kr';
set @v2 = substring_index(@v, '.', 4);
select @v2;

-- 요구 사항
-- 1단계 com.co만들기
set @v3 = substring_index( @v2, '.', -2);
select @v3;
set @v4 = substring_index( @v3, '.', 1);
select @v4;

set @v10 = 'a,b,c,d,e';
-- b를 출력하기
set @v10 = substring_index( @v10, '.', 2);
select @v10;

set @v11 = substring_index( @v10, '.', -1);
select @v11;

-- 숫자 함수
select ceiling(4.7), floor(4.7), round(4.7);
select pow( 2, 10);

-- 기억 공간 단위
-- bit < 8bit = 1byte < 1024 byte = 1kb <1024 kb = 1 megabyte < 1024mb = 1gb
-- 1024gb = 1tb < 1024tb = 1hb

select rand(), floor( 1 + ( rand() * (7-1) ));

select truncate(123456789, -3);

-- 날짜, 시간 함수
select mdate, adddate(mdate, interval 31 day )
from usertbl;

select * from usertbl;

select date( now() ), time( now() ), now();
select sysdate();
-- -------------------------------------대용량 파일 처리하기 - 파일  올리고(업로드) 내리기(다운로드)
create database moviedb;

use moviedb;

create table movietbl
	(movie_id int,
     movie_title varchar( 30),
     movie_director varchar(20),
     movie_star varchar( 20 ),
	 movie_script longtext, -- 대본
     movie_film longblob) default charset = utf8mb4;
	
 insert into movietbl
	values( 1, '쉰들러리스트', '스필버그', '리암니슨',
			load_file('D:/a1/study/temp/movies/Schindler.txt'),
            load_file('D:/a1/study/temp/movies/Schindler.mp4'));
            
select * from movietbl;

-- movie_script 와 movie_file이 null이 나온 이유
show variables like 'max_allowed_packet'; -- 패킷의 크기를 보기
show variables like 'secure_file_priv'; -- my sql이 지정한 업로드 경로

