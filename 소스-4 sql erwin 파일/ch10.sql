select ename, deptno
from emp
order by deptno;

select deptno, dname
from dept;

select deptno
from emp
where ename='이문세';

select dname
from dept
where deptno=10;

select *
from emp, dept;

select *
from emp, dept
where emp.deptno = dept.deptno;

select emp.ename, dept.dname, emp.deptno              
from  emp, dept             
where emp.deptno = dept.deptno 
and ename='이문세';


select * from salgrade;

select ename, sal, grade
from emp, salgrade 
where sal between LOSAL and HISAL
order by grade;

select e.ename, d.dname, e.sal, s.grade
from emp e, dept d, salgrade s
where e.deptno = d.deptno
and e.sal between s.LOSAL  and s.HISAL
order by grade;

select ename, mgr
from emp; 


select empno, ename
from emp;


select employee.ename as "사원이름", manager.ename as "직속상관이름"
from emp employee, emp manager
where employee.mgr = manager.empno;

select * 
from emp cross join dept;

select ename, dname 
from emp, dept
where emp.deptno=dept.deptno;

select ename, dname 
from emp INNER JOIN dept
ON emp.deptno=dept.deptno;


select ename, dname, dept.deptno 
from emp INNER JOIN dept
ON emp.deptno=dept.deptno 
where ename='이문세';

select member.ename as "사원이름", manager.ename as "직속상관이름"
from emp member LEFT OUTER JOIN emp manager
ON member.mgr = manager.empno;


drop table dept01;

CREATE TABLE DEPT01(
	 DEPTNO NUMBER(2),
	 DNAME VARCHAR2(14),
	 LOC   VARCHAR2(13)
);

drop table dept02;

CREATE TABLE DEPT02(
	 DEPTNO NUMBER(2),
	 DNAME VARCHAR2(14),
	 LOC   VARCHAR2(13)
) ;


-- 사원 테이블에 샘플 데이터 추가하기
INSERT INTO dept01 VALUES(10, '경리부', '서울');
INSERT INTO dept01 VALUES(20, '인사부', '인천');

INSERT INTO dept02 VALUES(10, '경리부', '서울');
INSERT INTO dept02 VALUES(30, '영업부', '용인'); 
commit;


select e.ename, d.deptno, d.dname
from emp e INNER JOIN dept d
ON e.deptno = d.deptno 
order by d.deptno;


select *
from dept01 LEFT OUTER JOIN dept02
ON dept01.deptno = dept02.deptno;

select *
from dept01 RIGHT OUTER JOIN dept02
ON dept01.deptno = dept02.deptno;

select *
from dept01 FULL OUTER JOIN dept02
ON dept01.deptno = dept02.deptno;


select e.ename, d.deptno, d.dname
from emp e INNER JOIN dept d
ON e.deptno = d.deptno 
order by d.deptno;


select e.ename, e.hiredate
from emp e, dept d 
where e.deptno =d.deptno                    
and d.dname='경리부';

select e.ename, d.dname
from emp e, dept d                          
where e.deptno =d.deptno                                           
and e.job='과장';

select work.ename, work.job
from emp work, emp manager                          
where work.mgr=manager.empno                                                
and manager.ename='감우성';


select work.ename, friend.ename
from emp work, emp friend                           
where work.deptno=friend.deptno
and work.ename='감우성'                         
and friend.ename<>'감우성;


select e.ename, e.sal
from emp e INNER JOIN dept d
ON e.deptno = d.deptno
and d.loc='인천'; 
