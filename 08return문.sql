-- stored procedure program
-- 설계 -> 인스턴스화 -> 사용

delimiter $$
create procedure userProc()
begin
	select * from usertbl;
    
end $$
delimiter ;

call userProc();

drop procedure if exists userProc1;
desc usertbl; -- 테이블의 구조보기
-- 파라미터를 넣어 처리형식
delimiter $$
create procedure userProc1( in _addr char(2))
begin
	select * from usertbl where addr = _addr;
    
end $$
delimiter ;

call userProc1('서울');

drop procedure if exists userProc2;
-- userIdBBK 또는 LJB 검색하기
delimiter $$
create procedure userProc2( in _userId1 varchar(10), in _userId2 varchar(10))
begin
	select * from usertbl where userId in (_userId1, _userId2);
    
end $$
delimiter ;

call userProc2('BBK','LJB');

delimiter $$
create procedure userProc3( in _addr char(2), out_result int)
begin
	select count(addr) into_result from usertbl where addr = _addr;
    
end $$
delimiter ;

call userProc3('서울',@_result);
select @_result; -- 답 4

select * from buytbl;

-- 문제 groupName을 입력하면 price 값이 가장 큰것을 찾기 변수로 받기
-- 처리결과 입력은 전자 답은 노트북 1000
-- 			   의류 답은 청바지  50
--			   서적 답은 책	 15

drop procedure if exists buyPro1;
delimiter $$
create procedure buyPro1( in _gN char(4), out _pN char(6), out _price int)
begin
-- 여러개의 출력값을 얻으려면 select문을 여러개 쓰기
select prodName into _pN from buytbl where groupName = _gN
	group by prodName order by max(price) desc limit 1;
select max(price) into _price from buytbl where groupName = _gN;
end $$
delimiter ;

call buyPro1('전자', @pNVar, @priVar);
select @pNVar, @priVar;


call buyPro1('의류', @pNVar, @priVar);
select @pNVar, @priVar;


call buyPro1('서적', @pNVar, @priVar);
select @pNVar, @priVar;

select * from buytbl where groupName = '전자';

-- 2) procedure function 함수 결과 1개 나온다 return 
-- 주의 사항 : 사전에 해야되는 작업 - 함수 생성권한 제한을 풀어두기
set global log_bin_trust_function_creators = 1;


delimiter $$
create function userfun1( v1 int, v2 int) -- 입력 해줄 자료형
	returns int -- 출력해줄 자료형 선언 
begin
	return v1 + v2;

end $$ 
delimiter ;

select userfun1( 100, 200); -- 실행은 select 문으로 하기

-- 요구사항 출생년도를 입력하면 나이가 생성되는 함수 만들기
delimiter $$
create function agefun( birthyear int )
	returns int
begin
	declare age int;
    set age = year( curdate() )  - birthyear;
    return age;
    
end $$
delimiter ;

select agefun( 2000) into @age2000;
select agefun( 2020) into @age2020;
select @2000 - @2020;

-- ---------------------------------

drop table cUsertbl;
create table cUsertbl
as
select * from usertbl;

select * from usertbl;

alter table cUsertbl
	add column years int; -- 컬럼 추가하기
    
-- 요구사항 mDate를 이용해서 근무년수를 구하는 함수를 만들기
-- 1단계 함수 만들기
drop function yearsfun;

delimiter $$
create function yearsfun( y1 date )
	returns int
begin
	declare yy int;
    set yy = year( curdate() )  - year(y1); -- 2024 - 2013 = 11
    return yy;
end $$
delimiter ;

desc cUsertbl;
-- 2단계 함수호출해서 근무년수를 구한다.
select mDate into @mDate from cUsertbl where userId = 'BBK';
select @mDate;

select yearsfun( @mDate) into @years;
select @years;

-- 3단계 years 컬럼 update하기
update cUsertbl set years = @years where userId = 'BBK';

select * from cUsertbl;

-- 'EJW' 업데이트하기
select mDate into @mDate from cUsertbl where userId = 'EJW';
select @mDate;

select yearsfun( @mDate) into @years;
select @years;

-- 3단계 years 컬럼 update하기
update cUsertbl set years = @years where userId = 'EJW';

select * from cUsertbl;

-- 'KBS' 업데이트하기
select mDate into @mDate from cUsertbl where userId = 'KBS';
select @mDate;

select yearsfun( @mDate) into @years;
select @years;

-- 3단계 컬럼 update
update cUsertbl set years = @years where userId = 'KBS';
select * from cUsertbl;

-- 3) cursor 반복처리
-- pointer : 가르키다, 자동으로 한행을 읽으면 아래(다음)로 내려간다.
-- 파일시작 BOF : begin of File, EOF : End of file
-- 처리 순서 1단계 파일을 연다 2단계 파일을 읽는다 행단위로 읽는다 3단계 파일 끝 4단계 닫는다.
-- fetch : 실행(excute)하기 위해 준비 되는 요소들이구나
/*
delimiter $$
create procedure cursorProc()
begin
	-- 변수 선언 6줄 ~ 10줄까지
    -- 커서 선언 12줄
    -- 반복 조건 15줄
    -- 커서 열기
    -- 반복문
    -- 결과 출력
    -- 커서 닫기
    
end $$
delimiter ;*/

-- 고객의 평균키를 구하는 프로시저 커서 이용하기
delimiter $$
create procedure cursorProc()
begin
	-- 변수 선언 6줄 ~ 10줄까지
    declare userheight int; -- 고객의 키
    declare cnt int default 0; -- 고객의 인원수
    declare totalheight int default 0; -- 키의 합계
    declare endofrow boolean default false;
    -- 커서 선언 12줄
    declare userCursor Cursor for
		select height from usertbl; -- 문제가 평균 키를 구하기 
    -- 반복 조건 15줄
    declare continue handler 
		for not found set endofrow = TRUE;
    -- 커서 열기
    open  userCursor;
    -- 반복문
    cursor_loop : Loop
		fetch userCursor into userheight ;
        if endofrow then
			leave cursor_loop; -- leave 반복문에 빠져라
		end if;
        set cnt = cnt + 1;
        set totalheight = totalheight + userheight ;
    end loop cursor_loop;
    -- 결과 출력
    select concat('고객 키의 평균 ==>', (totalheight / cnt) );
    -- 커서 닫기
    close userCursor;
    
end $$
delimiter ;


-- 호출하기
call cursorProc();

-- 고객 테이블 고객 등급 열을 하나 추가하기 등급 넣기
select * from usertbl;
-- 컬럼 추가하기 r1 안데 최 우수고객 / 우수고객 / 일반 고객 / 유령 고객
 
select * from buytbl order by userid; 

drop procedure gP;
    
delimiter $$
create procedure gP()
begin
	-- 변수 선언a
    declare id varchar(10) ; -- 사용자 id 'BBK 담을 변수'
    declare hap bigInt ; -- 총 구매합
    declare userGrade varchar(20) ;-- 1등급 '최우수고객;
	declare endofrow boolean default False ;
	-- 커서
	declare userCursor cursor for
		select u.userid, sum( b.price * b.amount) 
        from buytbl b right outer join usertbl u
        on b.userid = u.userid group by u.userid, u.name;
	-- 반복 조건
	declare continue handler
		for not found set endofrow = TRUE;
	-- 커서 열기
    open userCursor ;
    -- 반복문(라벨) : 반복 시작이다
    grade_loop : Loop 
		fetch userCursor into id, hap ;
        if endofrow then
			leave grade_loop;
         end if;   
	case
		
		when (hap >= 1500) then set userGrade = '최우수고객' ;
        when (hap >= 1000) then set userGrade = '우수고객' ;
        when (hap >= 11) then set userGrade = '일반고객' ;
		else set userGrade = '잠재고객' ;
        end case;
        
		update usertbl set r1 = userGrade where userId = id;
    -- 반복 끝
    end Loop grade_loop ;
    -- 커서 닫기
    close userCursor ;
        
end $$
delimiter ;

call gP();
    
select * from usertbl;

alter table usertbl
	add column r1 varchar( 20 ) ;    
    

-- 04) trigger
-- 예) 기본적인 인적사항이 자동 삽입 급여지금 후 세금 테이블 자동저장
-- 사용은 insert update delete 등 
-- 이벤트가 발생했을 때
-- 직접 실행은 안됨 이벤트가 발생 했을 때 자동 실행

create database if not exists testDB;
use testDB;

create table if not exists testtbl( id int, txt varchar(10));
insert into testtbl values( 1, '레드벨벳');
insert into testtbl values( 2, '잇지');
insert into testtbl values( 3, '블랙핑크');

select * from testtbl;

drop trigger if exists testtrg;

delimiter //
create trigger testtrg -- 트리거가 언제 어느 테이블 적용할지
	after delete -- 이후에
    on testtbl
    for each row
begin
	set @msg = '가수 그룹이 삭제됩니다'; -- 트리거의 처리 내용
end //
delimiter ;

set @msg = '';
insert into testtbl values( 4, '마마무');
select @msg;

update testtbl set txt = '뉴진스' where id = 4 ;

delete from testtbl where id = 4;


-- --------------------------------------------------
-- 요구사항 : 회원테이블에서 update, delete 시도하면 수정된 또는 삭제된 테이블
--			별도의 테이블에 보관 변경일자 변경한 사람 기록.
use sqldb;

create table backup_usertbl
(
userID     CHAR(8) NOT NULL PRIMARY KEY, -- 사용자 아이디(PK)
name       VARCHAR(10) NOT NULL, -- 이름
birthYear   INT NOT NULL,  -- 출생년도
addr        CHAR(2) NOT NULL, -- 지역(경기,서울,경남 식으로 2글자만입력)
mobile1   CHAR(3), -- 휴대폰의 국번(011, 016, 017, 018, 019, 010 등)
mobile2   CHAR(8), -- 휴대폰의 나머지 전화번호(하이픈제외)
height       SMALLINT,  -- 키
mDate       DATE,  -- 회원 가입일
modType char(2), -- 변경된 타입, '수정' 또는 '삭제'
modDate date, -- 변경된 날짜
modUser varchar(256) -- 변경한 사용자
  ) ;
  
-- 트리거 작성하기
delimiter //
create trigger but -- 언제? update 후에 무엇을? usertbl의 모든 행을
	after update
    on usertbl
    for each row
begin -- 어떻게?
	insert into backup_usertbl
    values (OLD.userID,OLD.name,OLD.birthYear, old.addr,       
			old.mobile1,old.mobile2,old.height,old.mDate,
            '수정',curdate(), current_user()
            ) ;
end //
delimiter ;


select * from usertbl;

update usertbl set birthyear = 1977 where userId = 'BBK';
update usertbl set addr = '서울' where userId = 'EJW';
update usertbl set addr = '경남' where userId = 'KBS';
delete from backup_usertbl where userId = 'KBS';

select * from backup_usertbl;