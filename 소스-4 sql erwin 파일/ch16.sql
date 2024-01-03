drop table emp01;

create table emp01
as
select *  from emp;

select * from emp01;

create or replace procedure del_all
is
begin
   delete from emp01;
   commit;
end;
/

EXECUTE DEL_ALL

DESC USER_SOURCE

select name, text from user_source;


create or replace procedure 
        del_ename(vename emp01.ename%type)
is
begin
   delete from emp01 where ename like vename;
   commit;
end;
/

EXECUTE DEL_ENAME('이%');

CREATE OR REPLACE PROCEDURE SEL_EMPNO
( VEMPNO IN 	EMP.EMPNO%TYPE,
  VENAME OUT EMP.ENAME%TYPE,
  VSAL OUT EMP.SAL%TYPE,
  VJOB OUT EMP.JOB%TYPE
)
IS
BEGIN
  SELECT ENAME, SAL, JOB INTO VENAME, VSAL, VJOB
  FROM EMP
  WHERE EMPNO=VEMPNO;
END;
/

VARIABLE VAR_ENAME VARCHAR2(15);
VARIABLE VAR_SAL NUMBER;
VARIABLE VAR_JOB VARCHAR2(9);

EXECUTE SEL_EMPNO(1001, :VAR_ENAME, :VAR_SAL, :VAR_JOB)

PRINT VAR_ENAME 
PRINT VAR_SAL  
PRINT VAR_JOB


create or replace function cal_bonus(
      vempno in emp.empno%type )
  return number
is
  vsal number(7, 2);
begin
  select sal into vsal
  from emp
  where empno = vempno;

  return (vsal * 200); 	
end;
/

variable  var_res  number;

execute :var_res := cal_bonus(1001);

print  var_res;

select sal, cal_bonus(1001)
from emp
where empno=1001;

create or replace procedure cursor_sample01
is
   vdept dept%rowtype;
   cursor c1 
   is
   select * from  dept; 
begin
   
   dbms_output.put_line('부서번호  부서명   지역명'); 
   dbms_output.put_line('--------------------------------------');

   open c1;
   
   loop
      fetch c1 into vdept.deptno, vdept.dname, vdept.loc;
      
      exit when c1%notfound;

      dbms_output.put_line(vdept.deptno||
            '      '||vdept.dname||'    '||vdept.loc);   
   end loop;

   close c1;
end;
/
SET SERVEROUTPUT ON
EXECUTE CURSOR_SAMPLE01;

create or replace procedure cursor_sample02
is
   vdept dept%rowtype;
   cursor c1 
   is
   select * from  dept; 
begin
   dbms_output.put_line('부서번호  부서명   지역명'); 
   dbms_output.put_line('-----------------------------');
   for vdept in c1 loop
      exit when c1%notfound;
      dbms_output.put_line(vdept.deptno||
            '    '||vdept.dname||'    '||vdept.loc);      
   end loop;
end;
/
EXECUTE CURSOR_SAMPLE02;

drop table emp02;
drop table sal01;

create table emp02(
	empno number(4) primary key,
	ename varchar2(20),
	job   varchar2(20)
);
create or replace trigger trg_01
after insert 
on emp02
begin
  dbms_output.put_line('신입사원이 입사했습니다.');
end;
/
set serveroutput on
insert into emp02 values(1, '한예슬', '대리');

create table sal01(
	salno number(4) primary key,
	sal number(7,2),
	empno number(4) references emp02(empno)
);

create sequence sal01_salno_seq; 

create or replace trigger trg_02
after insert 
on emp02
for each row
begin  
 insert into sal01 values(
   sal01_salno_seq.nextval, 100, :new.empno); 
end;
/

insert into emp02 values(2, '오지호', '과장');
commit;
select * from emp02;
select * from sal01;

delete from emp02 where empno=2;
create or replace trigger trg_03
after delete on emp02
for each row
begin
  delete from sal01 where empno=:old.empno;
end;
/
delete from emp02 where empno=2;
select * from emp02;
select * from sal01;
drop trigger trg_02;

insert into emp02 values(3, '이병헌', '부장');


CREATE TABLE 상품(
	상품코드 CHAR(6) PRIMARY KEY,
	상품명 VARCHAR2(12) NOT NULL,
	제조사 VARCHAR(12),
	소비자가격 NUMBER(8),
	재고수량  NUMBER DEFAULT 0
);

CREATE TABLE 입고(
	입고번호 NUMBER(6) PRIMARY KEY,
	상품코드 CHAR(6) REFERENCES 상품(상품코드),
	입고일자 DATE DEFAULT SYSDATE,
	입고수량 NUMBER(6),
	입고단가 NUMBER(8),
	입고금액 NUMBER(8)
);

INSERT INTO 상품
(상품코드, 상품명, 제조사, 소비자가격)
VALUES('A00001','세탁기', 'LG', 500);
INSERT INTO 상품
(상품코드, 상품명, 제조사, 소비자가격)
VALUES('A00002','컴퓨터', 'LG', 700);
INSERT INTO 상품
(상품코드, 상품명, 제조사, 소비자가격)
VALUES('A00003','냉장고', '삼성', 600);


select * from 입고;
select * from  상품;

create or replace trigger trg_04
   after insert on 입고
   for each row
begin
   update 상품
   set 재고수량 = 재고수량 + :new.입고수량
   where 상품코드 = :new.상품코드;
end;
/  

insert into 입고(입고번호, 상품코드, 입고수량, 입고단가, 입고금액) 
values(1, 'A00001', 5, 320, 1600);

insert into 입고(입고번호, 상품코드, 입고수량, 입고단가, 입고금액) 
values(2, 'A00002', 10, 680, 6800);

insert into 입고(입고번호, 상품코드, 입고수량, 입고단가, 입고금액) 
values(3, 'A00003', 3, 220, 660);
insert into 입고(입고번호, 상품코드, 입고수량, 입고단가, 입고금액) 
values(4, 'A00003', 5, 220, 1100);
commit;

insert into 입고(입고번호, 상품코드, 입고수량, 입고단가, 입고금액) 
values(1, 'A00001', 5, 320, 1600);


create or replace trigger trg_05
    after update on 입고
    for each row
begin
        update 상품
        set 재고수량 = 재고수량 + (-:old.입고수량+:new.입고수량)	    
        where 상품코드 = :new.상품코드;
end;
/
update 입고 set 입고수량=10, 입고금액=2200
where 입고번호=3;

commit;
select * from 입고 order by 입고번호;
select * from 상품;
--삭제 트리거
create or replace trigger trg_06
    after delete on 입고
    for each row
begin
        update 상품
        set 재고수량 = 재고수량 - :old.입고수량
        where 상품코드 = :old.상품코드;
end;
/
delete 입고  where 입고번호=3;


create table sung(
  hakbun number(4) primary key,
  hakname char(20),
  kor number(4),
  eng number(4),
  mat number(4),
  tot number(4),
  avg number(4),
  rank number(4)
);
DESC SUNG

insert into sung(hakbun, hakname, kor, eng, mat)
  values(1, '일길동', 90, 70, 80);
insert into sung(hakbun, hakname, kor, eng, mat)
  values(2, '이길동', 100, 70, 80);
insert into sung(hakbun, hakname, kor, eng, mat)
  values(3, '삼길동', 100, 70, 85);
insert into sung(hakbun, hakname, kor, eng, mat)
  values(4, '이길동', 100, 70, 90);
insert into sung(hakbun, hakname, kor, eng, mat)
  values(5, '삼길동', 100, 70, 85);
insert into sung(hakbun, hakname, kor, eng, mat)
  values(6, '일길동', 90, 70, 80);
commit;

create or replace procedure sp_rank
is 
  vsung    sung%rowtype;
  oldsung    sung%rowtype;
  temprank sung.rank%type;
  cursor c1
  is 
  select * from sung order by tot desc, kor desc, eng desc, mat desc;
begin
  update sung set tot=kor+eng+mat;
  update sung set avg=(kor+eng+mat)/3;
  temprank:=1;
  for vsung in c1 loop
    exit when c1%notfound;
    if(oldsung.tot=vsung.tot and oldsung.kor=vsung.kor and
      oldsung.eng=vsung.eng and oldsung.mat=vsung.mat) then
      vsung.rank:=oldsung.rank;
    else 
      vsung.rank:=temprank;
    end if;

    update sung set rank=vsung.rank where hakbun=vsung.hakbun;
    vsung.rank:=temprank;
    temprank:=temprank+1;
    oldsung:=vsung;
  end loop;
end;
/
EXECUTE SP_RANK

create table orderTbl  (
  order_no number(4)  primary key,   -- 주문 일련 번호 자동증가 
  user_id varchar(30),               -- 주문자 아이디
  product_name varchar(30),          -- 상품명 
  order_amount number(4)                    -- 상품 수량
);

DESC orderTbl 

create table productTbl  (
  product_name varchar(30),          -- 상품명 
  amount number(4)                  -- 남은 수량
);

DESC productTbl 
insert into productTbl values ('컴퓨터', 50);
insert into productTbl values ('핸드폰', 300);
insert into productTbl values ('pmp', 120);
insert into productTbl values ('mp3 player', 200);
insert into productTbl values ('디지털 카메라', 150);
insert into productTbl values ('노트북', 45);
insert into productTbl values ('스쿠터', 30);
commit;

select * from productTbl ;

create table deliverTbl(
  deliver_no number(4)  primary key,   -- 주문 일련 번호 자동증가 
  product_name varchar(30),            -- 배송할 상품명 
  amount  number(4)                   -- 배송할 물건 개수
);
DESC deliverTbl 


CREATE TRIGGER Order_trg
   after insert on orderTbl
   for each row
begin     
   UPDATE productTbl 
   SET amount=amount-:new.order_amount
   WHERE product_name=:new.product_name;
end;
/  
insert into orderTbl values (1, 'user1', '컴퓨터', 10);
commit;

select * from productTbl ;
select * from orderTbl ;

