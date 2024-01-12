use sqldb;
select * from usertbl;
select * from buytbl;

select userid, name from usertbl
union 
select userid, prodName from buytbl;

select userid, name from usertbl
union all -- 중복된 것 제거하기
select userid, prodName from buytbl;


-- 요구사항 이름 전화번호로 주소록을 만들기 단, 전화번호가 없는 사람은 제외
select name from usertbl where mobile1 is null;

select name, mobile1, mobile2 from usertbl
	where mobile1 is not null;
    
select name, mobile1, mobile2 from usertbl
	where name not in(select name from usertbl where mobile1 is null);   
    
-- sql 구문을 프로그래밍 처럼 만들 수 있다.
drop procedure if exists ifproc;
-- 스트어드 프로스저
delimiter $$
create procedure ifproc()
begin 
	declare var1 int;
    set var1 = 100;
    if var1 = 100 then
		select '100'입니다;
	else
		select '아닙니다';
	end if;


end $$
delimiter ;

call ifproc();
call ifproc();

drop procedure if exists ifproc2;
use employees;

select * from employees;

delimiter $$
create procedure ifproc2()
begin
	declare hiredate date; -- 변수 선언 변수명 자료형
    declare curdate date;
	declare days int;
	
    select hire_date into hiredate from employees.employees
    where emp_no = 1004;
    
    set curDate = current_date();
    set days = datediff(curDate, hiredate);
    
    if(days / 365 ) >= 5 then
		select concat('입사한지', days , '일이나 지났습니다.축하합니다');
    else
		select concat('입사한지', days , '일밖에 안되었네요.열심히 해요');
	end if;
    
end $$
delimiter ;

call ifproc2();

drop procedure if exists ifproc3;
use employees;

select * from employees;

delimiter $$
create procedure ifproc3()
begin
	declare point int; -- 변수 선언 변수명 자료형
    declare credit char(1);
	set point = 77;
    
    if point >= 90 then
		set credit = 'A';
    else if point >= 80 then
		set credit = 'B';
	else if point >= 70 then
		set credit = 'c';
	else if point >= 60 then
		set credit = 'D';
	else
		set credit = 'F';
	end if;
    select concat('취득점수 ==>' , point),  concat('학점 ==>', credit);
end $$
delimiter ;

call ifproc3();

