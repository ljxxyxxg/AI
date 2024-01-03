create table employee03(    
   empno number(4),
   ename varchar(20),
   job varchar(20),
   sal number(7, 3)
);
desc employee03
insert into employee03 values(1000, '한용운', '승려', 100);
insert into employee03 values(1010, '허준', '의관', 150);
insert into employee03 values(1020, '주시경', '국어학자', 250);
insert into employee03 values(1030, '계백', NULL, 250);
insert into employee03 values(1040, '선덕여왕', '', 200);

update employee03 set sal=sal+50
where sal<200;

commit;

delete employee03
where job is null; 

create table dept02 
as select * from dept where 1=0

select * from dept01
