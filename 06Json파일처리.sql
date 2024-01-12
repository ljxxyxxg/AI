-- json 파일 처리하기
-- 1. json 만들기alter-
-- json.array()
select json_array( 1,"abc", Null, True, curtime() ); -- [] 배열, 리스트
-- json_object()
select json_object ( "score" , 87 , "name" , "hong" , "age" , 25);
set @jsonData = json_object ( "score" , 87 , "name" , "hong" , "age" , 25);
select @jsonData;

select * from usertbl;

-- 키 userId, addr 값 json을 만들기

select
	json_object( userId, addr)
from usertbl;

-- 키 userId, 값 [ 010, 000000] 형태로 json 만들기
select
	json_object( userId, json_array( mobile1, mobile2))
from usertbl;

-- 외부로 내보내기 json 파일로 만들기
select
	json_object( userId, json_array( mobile1, mobile2))
from usertbl
into outfile 'D:/a1/study/temp/movies/jssonOutput.json' ;

-- 자료형이 json인지 판단하기
-- json_valid()
set @jsonData = json_object ( "score" , 87 , "name" , "hong" , "age" , 25);
select json_valid( @jsonData); -- json 자료형이므로 1을 반환

select
if( json_valid( @jsonData) = 1,
	'json 자료다',
    'json 자료가 아니다' );
    
-- json 자료안에 값을 검색하기
SET @j = '["abc",[{"k":"10"}, "def"], [{"x":"abc1"}, {"x2":"abc2"}, {"x5":"abc5"}], {"y:bcd"}]';

select
	json_search( @j, 'all', 'abc1'); -- 못찾으면 null  반환 -- 찾으면 리스트 위치를 알려준다
    
    
    
-- json extract

-- json_insert = 키가 들어있으면 삽입되지 않는다.
set @j = '{"a" : 1, "b": [2,3]}';
select json_insert( @j, '$.c', 10); -- 키가 새것이면 삽입된다.
select json_insert( @j, '$.a', 10);  -- 키가 이미 있으면 삽입되지 않는다.    
select json_insert( @j, '$.b', '[2,3,4]'); -- 키가 새것이 아니면 insert 되지 않는다

-- json_replace
set @j = '{"a":1, "b": [2,3] }';
select json_replace(@j, '$.a', 10); -- 키가 기존이면 수정
select json_replace(@j, '$.s', 10); -- 키가 없으면 아무것도 작동 x

-- --------------------------- 조인
select * from usertbl;
select * from buytbl;

select usertbl.name, buytbl.prodName from usertbl -- 1번으로 처리
	inner join buytbl -- 2번으로 처리 병합 후 
		on usertbl.userid = buytbl.userid -- 조건으로 추림
where birthyear between 1970 and 1980 order by usertbl.name limit 3; -- 결과 도출

-- 애칭으로 변경
select u.name, b.prodName from usertbl u -- 1번으로 처리
	inner join buytbl b -- 2번으로 처리 병합 후 
		on u.userid = b.userid -- 조건으로 추림
where u.userid  = 'BBK'; -- 결과 도출


create table stdtbl(
	stdName varchar(10) not null primary key,
    addr char(4) not null
);

create table clubtbl(
	clubName varchar(10) not null primary key,
    roomNo char(4) not null
);

create table stdclubtbl(
	num int auto_increment not null primary key,
    stdName varchar(10) not null,
    clubName varchar(10) not null,
    foreign key(stdName) references stdtbl(stdName),
    foreign key(clubName) references clubtbl(clubName)
);
insert into stdtbl
values
('김범수','경남'), ('성시경','서울'), ('조용필','경기'), ('은지원','경북'), ('바비킴','서울'),('정인', '경남');

insert into clubtbl
values
('수영','101호'), ('골프','111호'), ('볼링','103호'), ('탁구','204호'), ('당구','112호');

insert into stdclubtbl
values
(null,'김범수','당구'), (null,'성시경','볼링'), (null,'조용필','탁구'), (null,'은지원','골프'), (null,'바비킴','당구'), (null,'정인',' ');

select * from stdtbl;
select * from clubtbl;
select * from stdclubtbl;

-- 1. 요구사항 학생테이블, 동아리 테이블, 학생 동아리 테이블을 이용하여
-- 학생을 기준으로 학생이름, 지역, 가입한 동아리, 동아리방 보기
select s.stdName, s.addr, c.clubName, c.roomNo
from stdtbl s
	inner join stdclubtbl sc
    on s.stdName = sc.stdName
    inner join clubtbl c
    on sc.clubName = c.clubName;

-- 2. 요구사항 학생테이블, 동아리테이블, 학생동아리 테이블을 이용하여
-- 당구를 선택하신 분의 이름과 지역은?
select 
	s.stdName, s.addr
from stdtbl s
	inner join stdclubtbl sc
    on s.stdName = sc.stdName
    inner join clubtbl c
	on sc.clubName = c.clubName
where sc.clubName = '당구';

-- 3. 요구사항 학생테이블, 동아리테이블, 학생동아리 테이블을 이용하여
-- 은지원이 선택한 동아리와 동아리방은? 축구 103호 봉사 104호
select s.stdName, c.roomNo, c.clubName
from stdtbl s
	inner join stdclubtbl sc
    on s.stdName = sc.stdName
    inner join clubtbl c
	on sc.clubName = c.clubName
where sc.stdName = '은지원';

-- 4. 요구사항 학생테이블, 동아리테이블, 학생동아리 테이블을 이용하여
-- 서울지역에 사는 사람이 선택한 동아리명은?
select s.stdName, c.clubName
from stdtbl s
	inner join stdclubtbl sc
    on s.stdName = sc.stdName
    inner join clubtbl c
	on sc.clubName = c.clubName
where s.addr = '서울';

-- 정인  null
select s.stdName, c.clubName
from stdtbl s
	left outer join stdclubtbl sc
    on s.stdName = sc.stdName
    left outer join clubtbl c
	on sc.clubName = c.clubName
where s.addr = '서울';



-- 5. 요구사항 동아리방 101호와 102호를 사용하는 사람들의 이름을 구하기
-- 답은 101호 null, 102호 김범수
select s.stdName, c.roomNo
from stdtbl s
	inner join stdclubtbl sc
    on s.stdName = sc.stdName
    inner join clubtbl c
	on sc.clubName = c.clubName
where c.roomNo in( '101호', '102호');

-- 수영 선택한 자료 없음  + 102호 값이 없음
select s.stdName, c.roomNo
from stdtbl s
	left outer join stdclubtbl sc
    on s.stdName = sc.stdName
    right outer join clubtbl c
	on sc.clubName = c.clubName
where c.roomNo in( '101호', '102호');



-- outer join
-- 조인에 만족하지 않는 행까지 포함 :null값까지 포함
select
	*
from stdtbl s
	left outer join stdclubtbl sc
    on s.stdName = sc.stdName;



-- full
select
	*
from stdtbl s
	left outer join stdclubtbl sc
    on s.stdName = sc.stdName
    left outer join clubtbl c
    on sc.clubName = c.clubName
    
union
    
select
	*
from stdtbl s
	left outer join stdclubtbl sc
    on s.stdName = sc.stdName
    right outer join clubtbl c
    on sc.clubName = c.clubName;
    
-- cross join 비강추( 조건을 넣어서 inner join이랑 비슷하게 만들어 준다 where 절)
select * from stdtbl s, stdclubtbl sc, clubtbl c;
    
select * from stdtbl s
	cross join stdclubtbl sc;
    
    
-- self 조인  ------------------------------------------------------
USE sqldb;
CREATE TABLE empTbl (emp CHAR(3), manager CHAR(3), empTel VARCHAR(8));

INSERT INTO empTbl VALUES('나사장',NULL,'0000');
INSERT INTO empTbl VALUES('김재무','나사장','2222');
INSERT INTO empTbl VALUES('김부장','김재무','2222-1');
INSERT INTO empTbl VALUES('이부장','김재무','2222-2');
INSERT INTO empTbl VALUES('우대리','이부장','2222-2-1');
INSERT INTO empTbl VALUES('지사원','이부장','2222-2-2');
INSERT INTO empTbl VALUES('이영업','나사장','1111');
INSERT INTO empTbl VALUES('한과장','이영업','1111-1');
INSERT INTO empTbl VALUES('최정보','나사장','3333');
INSERT INTO empTbl VALUES('윤차장','최정보','3333-1');
INSERT INTO empTbl VALUES('이주임','윤차장','3333-1-1');


select * from empTbl;

-- 우대리 상관의 연락처 답 '2222 -2'
select
*
from emptbl e 
	inner join emptbl e1
    on e.manager = e1.emp
where e.emp = '우대리';

select 
	e1.manager
from emptbl e
	inner join emptbl e1
    on e.manager =e1.emp
where e.emp = '이주임';


-- 이주임 매니저의 매니저의 전화번호? 3333
-- self join을 2단계한다.
-- 찾으려는 정보를 1줄(행)에 모두 만들어 두고 검색

select 
	e1.manager
from emptbl e
	inner join emptbl e1
    on e.manager =e1.emp
    inner join emptbl e2
    on e1.manager = e2.emp
where e.emp = '이주임';