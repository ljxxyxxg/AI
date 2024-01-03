create table emp01(
     eno number(4),
     ename varchar2(14),
     sal  number(7, 3)
);

desc emp01

alter table emp01
add(birth date);

alter table emp01
modify ename varchar2(30);

alter table emp01
drop column ename;

alter table emp01
set unused (eno);

alter table emp01
drop unused columns;

rename emp01 to emp02;

desc emp02

drop table  emp02;

select table_name  from user_tables;

select owner, table_name from all_tables;

select owner, table_name from dba_tables;
