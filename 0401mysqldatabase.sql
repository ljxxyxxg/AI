-- dept 데이터 넣기
insert into dept(deptno, dename, loc) values( 10, '경리부', '서울');
insert into dept(deptno, dename, loc) values( 20, '영업부', '경기');

select * from db1.dept;

-- 40
update dept set loc = '서울' where deptno = 40;usersusers
-- 방금 바꾼 것을 원래로 하기
rollback;

-- 30 총무부 해외부
-- 40 삭제하기
delete from dept where deptno =  40;