select * from dept;

insert into dept
values(null, 'test', 'test');

DESC USER_CONSTRAINTS

SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME 
FROM USER_CONSTRAINTS;

drop table employee03

purge recyclebin

SELECT CONSTRAINT_NAME, TABLE_NAME, COLUMN_NAME 
FROM USER_CONS_COLUMNS; 

SELECT *
FROM emp02;

insert into emp02
values(null, null, '사원', '2000/01/02', 20);

DROP TABLE EMP01;

create table emp01( 
   empno number(4), 
   ename varchar2(10), 
   job varchar2(9),
   deptno number(2)
);

select * from emp01;

insert into emp01
values(null, null, '사원', 30);

select constraint_name, constraint_type, table_name 
from user_constraints
where table_name ='emp01';

drop table emp02;

create table emp02( 
   empno number(4) NOT NULL, 
   ename varchar2(10) NOT NULL,  
   job varchar2(9),
   deptno number(2)
);

insert into emp02
values(null, null, '사원', 30);

desc emp02

insert into emp02
values(1000, '허준', '사원', 30);
commit
select * from emp02;

insert into emp02
values(1000, '홍길동', '과장', 20);

create table emp03( 
   empno number(4) UNIQUE, 
   ename varchar2(10) NOT NULL,  
   job varchar2(9),
   deptno number(2)
);

insert into emp03
values(1000, '허준', '사원', 30);

insert into emp03
values(1000, '홍길동', '과장', 20);

insert into emp03
values(null, '안중근', '과장', 20);

insert into emp03
values(null, '이순신', '부장', 10);

create table emp04( 
   empno number(4) CONSTRAINT EMP04_EMPNO_UK UNIQUE,
   ename varchar2(10) CONSTRAINT EMP04_ENAME_NN NOT NULL,  
   job varchar2(9),
   deptno number(2)
);

select constraint_name, constraint_type, table_name 
from user_constraints
where table_name in('EMP04');

insert into emp04
values(1000, '허준', '사원', 30);
insert into emp04
values(1000, '홍길동', '과장', 20);

create table emp05( 
   empno number(4) CONSTRAINT EMP05_EMPNO_PK PRIMARY KEY ,
   ename varchar2(10) CONSTRAINT EMP05_ENAME_NN NOT NULL, 
   job varchar2(9),
   deptno number(2)
);

insert into emp05
values(1000, '허준', '사원', 30);
insert into emp05
values(1000, '홍길동', '과장', 20);

insert into emp05
values(null, '이순신', '부장', 10);

select constraint_name, constraint_type, table_name 
from user_constraints
where table_name in('DEPT');

select constraint_name, table_name, column_name 
from user_cons_columns
where table_name in('DEPT');

select *
from DEPT;

insert into emp
(empno, ename, job, deptno)
values(1010, '홍길동', '사원', 50);

select constraint_name, constraint_type, r_constraint_name, table_name 
from user_constraints
where table_name in('DEPT', 'EMP');

select *
from emp05;
delete emp05 where empno=1010
insert into emp05
values(1010, '홍길동', '사원', 50);

commit;

create table emp06(
   empno number(4) 
       CONSTRAINT EMP06_EMPNO_PK PRIMARY KEY ,
   ename varchar2(10) 
       CONSTRAINT EMP06_ENAME_NN NOT NULL, 
   job varchar2(9),
   deptno number(2) 
       CONSTRAINT EMP06_DEPTNO_FK REFERENCES DEPT(DEPTNO)
);

insert into emp06
values(1010, '홍길동', '사원', 50);

insert into emp06
values(1010, '홍길동', '사원', 30);


select constraint_name, constraint_type, r_constraint_name, table_name 
from user_constraints
where table_name in('EMP06');


create table emp07(
  empno number(4) 
       CONSTRAINT EMP07_EMPNO_PK PRIMARY KEY ,
  ename varchar2(10) 
       CONSTRAINT EMP07_ENAME_NN NOT NULL, 
  sal number(7, 2)
       CONSTRAINT EMP07_SAL_CK CHECK(SAL BETWEEN 500 AND 5000),
  gender varchar2(1) 
   CONSTRAINT EMP07_GENDER_CK CHECK(GENDER IN('M', 'F'))
);

insert into emp07
values(1000, '허준', 200, 'M');

insert into emp07
values(1000, '허준', 200, 'A');

select * 
from dept01;

drop table dept01;

create table dept01(
  deptno number(2) primary key,
  dname varchar2(14),
  loc varchar2(13) default '서울'
);

insert into dept01
(deptno, dname)
values(10, '경리부');


drop table emp01;

create table emp01( 
   empno number(4) PRIMARY KEY,
   ename varchar2(10) NOT NULL, 
   job varchar2(9) UNIQUE,
   deptno number(2) REFERENCES DEPT(DEPTNO)
);

drop table emp02;

create table emp02( 
   empno number(4),
   ename varchar2(10) NOT NULL, 
   job varchar2(9),
   deptno number(2),   
   PRIMARY KEY(EMPNO),
   UNIQUE(JOB),
   FOREIGN KEY(DEPTNO) REFERENCES DEPT(DEPTNO)  
);

select constraint_name, constraint_type, r_constraint_name, table_name 
from user_constraints
where table_name in('EMP02');


drop table emp03;

create table emp03( 
   empno number(4),
   ename varchar2(10) CONSTRAINT EMP03_ENAME_NN  NOT NULL , 
   job varchar2(9),
   deptno number(2),   
   CONSTRAINT EMP03_EMPNO_PK PRIMARY KEY(EMPNO),
   CONSTRAINT EMP03_JOB_UK UNIQUE(JOB),
   CONSTRAINT EMP03_DEPTNO_FK FOREIGN KEY(DEPTNO) 
                  REFERENCES DEPT(DEPTNO)  
);

select constraint_name, constraint_type, r_constraint_name, table_name 
from user_constraints
where table_name in('EMP03');

create table member01( 
   name varchar2(10),
   address varchar2(30),
   hphone varchar2(16),
   CONSTRAINT MEMBER01_COMBO_PK PRIMARY KEY(NAME, HPHONE)
);

select constraint_name, constraint_type, r_constraint_name, table_name 
from user_constraints
where table_name in('MEMBER01');

select constraint_name, table_name, column_name 
from user_cons_columns
where table_name in('MEMBER01');


drop table emp01;

create table emp01( 
   empno number(4),
   ename varchar2(10), 
   job varchar2(9),
   deptno number(2)
);

select constraint_name, constraint_type, r_constraint_name, table_name 
from user_constraints
where table_name in('EMP01');

alter table emp01
ADD CONSTRAINT EMP01_EMPNO_PK PRIMARY KEY(EMPNO);

alter table emp01
ADD CONSTRAINT EMP01_DEPTNO_FK 
FOREIGN KEY(DEPTNO) REFERENCES DEPT(DEPTNO);

select constraint_name, constraint_type, r_constraint_name, table_name 
from user_constraints
where table_name in('EMP01');

alter table emp01
MODIFY ENAME CONSTRAINT EMP01_ENAME_NN NOT NULL;

select constraint_name, constraint_type, 
       r_constraint_name, table_name 
from user_constraints
where table_name in('EMP05');

select * from emp05;

insert into emp05
values(1000, '안중근', '과장', 20);


select * from emp05;

insert into emp05
values(NULL, '이순신', '부장', 10);


insert into emp05
values(NULL, NULL, '부장', 10);

alter table emp05
DROP CONSTRAINT EMP05_ENAME_NN;

select constraint_name, constraint_type, 
       r_constraint_name, table_name 
from user_constraints
where table_name in('EMP05');

select * from emp05;

select * from dept;
select * from emp;

drop table dept01;
create table dept01(
   deptno number(2) 
      constraint dept01_deptno_pk primary key,
   dname varchar2(14),
   loc varchar2(13)
);

select constraint_name, constraint_type, 
       r_constraint_name, table_name 
from user_constraints
where table_name in('DEPT01');


insert into dept01
values(10, '경리부', '서울');
insert into dept01
values(20, '인사부', '인천');

select * from dept01;

commit

drop table emp01;

create table emp01( 
   empno number(4),
   ename varchar2(10) 
   CONSTRAINT EMP01_ENAME_NN  NOT NULL, 
   job varchar2(9),
   deptno number(2),   
   CONSTRAINT EMP01_EMPNO_PK PRIMARY KEY(EMPNO),
   CONSTRAINT EMP01_JOB_UK UNIQUE(JOB),
   CONSTRAINT EMP01_DEPTNO_FK FOREIGN KEY(DEPTNO) 
                  REFERENCES DEPT01(DEPTNO)  
);

select constraint_name, constraint_type, 
       r_constraint_name, table_name 
from user_constraints
where table_name in('EMP01');

select * from dept01;

select constraint_name, constraint_type, 
       r_constraint_name, table_name 
from user_constraints
where table_name in('EMP01');

insert into emp01
values(1000, '허준', '사원', 10);

insert into emp01
values(1010, '홍길동', '사원', 50);

select * from emp01;

delete from dept01
where deptno=10;

alter table emp01
DISABLE CONSTRAINT EMP01_DEPTNO_FK;


select constraint_name, constraint_type, 
         table_name, r_constraint_name, status
from user_constraints
where table_name in('EMP01');

select * from dept01;


alter table emp01
ENABLE CONSTRAINT EMP01_DEPTNO_FK;


insert into dept01
values(10, '경리부', '서울');

CREATE TABLE test( 
          id number(4)   DEFAULT 1  PRIMARY KEY,                     
          name varchar(20) NULL UNIQUE 
);    
CREATE TABLE employee (
       emp_no             NUMBER(4), 
       emp_name           VARCHAR2(20),
       salary              NUMBER(6), 
       birthday            DATE
);

CREATE TABLE project (  
       pro_no             NUMBER(4),
       pro_content        VARCHAR2(100),
       start_date          DATE,
       finish_date         DATE 
);

CREATE TABLE specialty (
       emp_no             NUMBER(4),
       specialty           VARCHAR2(20)
);

CREATE TABLE assign (
       emp_no              NUMBER(4),
       pro_no               NUMBER(4)
);




ALTER TABLE employee ADD CONSTRAINT employee_pk PRIMARY KEY(emp_no);
ALTER TABLE project  ADD CONSTRAINT project_pk PRIMARY KEY(pro_no);
ALTER TABLE specialty ADD CONSTRAINT specialty_pk  PRIMARY KEY (emp_no, specialty) ;
ALTER TABLE assign ADD CONSTRAINT assign_pk PRIMARY KEY (emp_no, pro_no);

ALTER TABLE specialty ADD CONSTRAINT specialty_fk
FOREIGN KEY(emp_no) REFERENCES employee(emp_no); 

ALTER TABLE assign ADD CONSTRAINT assign_project_fk
FOREIGN KEY (pro_no) REFERENCES project;

ALTER TABLE assign ADD CONSTRAINT assign_employee_fk
FOREIGN KEY (emp_no) REFERENCES employee;

select constraint_name, constraint_type, 
         table_name, r_constraint_name
from user_constraints
where table_name in('EMPLOYEE', 'PROJECT', 'SPECIALTY', 'ASSIGN')