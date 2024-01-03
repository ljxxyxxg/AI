CREATE TABLE DEPT01(
  DEPTNO NUMBER(2),
  DNAME VARCHAR2(14),
  LOC   VARCHAR2(13) 
);

desc DEPT01

insert into dept01
values(10, '경리부', '서울');

select * from dept01;

commit;

insert into dept01
(DEPTNO, loc, dname)
values(20, '인천', '인사부');

insert into dept01
(deptno , dname)
values(30, '영업부');

insert into dept01
values(40, '전산부', NULL);

insert into dept01
values(50, '기획부', '');

drop  table emp02;

create table emp02( 
   empno number(4),
   ename varchar2(10),
   job   varchar2(9),
   hiredate date,
   deptno number(2)
);   
 
desc emp02
insert into emp02
values(1001, '김사랑', '사원', '2015/03/01', 20);
 
insert into emp02select * from emp02;
values(1002, '한예슬', '대리', to_date('2014, 05, 01', 'YYYY, MM, DD'), 20);

insert into emp02
values(1003, '오지호', '과장', SYSDATE, 30);

update dept01
set dname='생산부'
where deptno=10;

update dept01
set dname='생산부2', loc='부산'
where deptno=20;
 
update dept01
set dname='생산부3';

delete dept01
where deptno=10; 
commit;

delete dept01;

delete emp02;

ROLLBACK;

delete emp02
where deptno=20; 
