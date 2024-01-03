create sequence dept_deptno_seq
increment by 10
start with   10;

DESC USER_SEQUENCES

select sequence_name, min_value, max_value,
         increment_by, cycle_flag
from user_sequences;

select dept_deptno_seq.nextval from dual;

select dept_deptno_seq.currval from dual;

select dept_deptno_seq.nextval from dual; 

create sequence sample_seq;
select sample_seq.currval from dual;
select sample_seq.nextval from dual;
select sample_seq.currval from dual;

create sequence emp_seq
                start with 1 
                increment by 1 
                maxvalue 100000 ; 

insert into emp01
values(emp_seq.nextval, 'JULIA' , SYSDATE); 

select sample_seq.nextval from dual;

select sample_seq.currval from dual;


create sequence emp_seq
                start with 1 
                increment by 1 
                maxvalue 100000 ; 

drop table emp01;

create table emp01(
empno number(4) primary key,
ename varchar(10),
hiredate date
);


select constraint_name, constraint_type, table_name
from user_constraints
where table_name in('EMP01');

select constraint_name, column_name, table_name
from user_cons_columns
where table_name in('EMP01');

insert into emp01
values(emp_seq.nextval, '홍길동' , SYSDATE); 
insert into emp01
values(emp_seq.nextval, '강감찬' , SYSDATE); 

select * from emp01;
select sequence_name, min_value, max_value,
         increment_by, cycle_flag
from user_sequences;

drop sequence dept_deptno_seq;

create sequence dept_deptno_seq
                 start with   10
                 increment by 10
                 maxvalue 30; 

select dept_deptno_seq.nextval from dual;

alter sequence dept_deptno_seq
maxvalue 1000;

create table dept_example(
	deptno number(4) primary key,
	dname varchar(15),
	loc varchar(15)
);

select constraint_name, constraint_type, table_name
from user_constraints
where table_name in('DEPT_EXAMPLE');


select constraint_name, column_name, table_name
from user_cons_columns
where table_name in('DEPT_EXAMPLE');


create sequence dept_example_seq
increment by 10
start with   10
nocycle;


insert into dept_example
values(dept_example_seq.nextval, '인사과','서울');

insert into dept_example
values(dept_example_seq.nextval, '경리과','서울');

insert into dept_example
values(dept_example_seq.nextval, '총무과','대전');

insert into dept_example
values(dept_example_seq.nextval, '기술팀','인천');

select * from dept_example;

select index_name, table_name , column_name
from user_ind_columns
where table_name in('EMP', 'DEPT');

drop table emp01;

create table emp01
as
select * from emp;


select table_name, index_name, column_name 
from user_ind_columns
where table_name in('EMP01');

insert into emp01(empno, ename) values(1111, 'syj');

select index_name, table_name , column_name
from user_ind_columns
where table_name in('EMP01');


drop index idx_emp01_ename;


select index_name, table_name 
from user_indexes
where table_name in('EMP01');

select *
from emp01 
where  deptno=10;

create index idx_emp01_deptno
on emp01(deptno);

drop table dept01;

create table dept01
as
select * from dept where 1=0;



insert into dept01 values(10, '인사과', '서울');
insert into dept01 values(20, '총무과', '대전');
insert into dept01 values(30, '교육팀', '대전');

select * from dept01;


create UNIQUE index IDX_DEPT01_DEPTNO
on dept01(deptno);

create UNIQUE index IDX_DEPT01_LOC
on dept01(loc);

create index IDX_DEPT01_LOC
on dept01(loc);

create index idx_dept01_com
on dept01(deptno, dname);

select index_name, column_name
from user_ind_columns
where table_name in('DEPT01');

