select * from emp;
select * from student;
select * from dept;
select dname from dept;

select ename, sal, job from emp;

//stu_id stu_name sex 컬럼만 검색하기, 대소문자 구분 없음
select stu_id, stu_name, sex from student;

//산술연산자 숫자 컬럼(열)만 할 수 있다
select empno, sal, ename, sal, sal*12, job from emp;
select empno, sal, ename, sal, sal*12*0.33, job from emp;
select empno as 사원번호, ename as 사원명, sal as 급여, sal*12 as 연봉, job as 직급 from emp;
//컬럼명, 별칭 as는 생략할 수 있다.
select empno 사원번호, enam 사원명, sal 급여, sal*12 연봉, job 직급 from emp;

select * from salgrade;
select Hisal + 1000, Losal + 1500 from salgrade;

select grade 등급, losal, losal 최저금액, losal + 1500 인상최저금액, hisal 최대금액, hiasal + 1000 인상최대금액 from salgrade;

//Null이란? 0아님 빈공간 아니다. 미확정 알 수 없는 단어다
select * from emp;

//comm 보너스를 + 100씩 지급하자
select comm, comm + 100 from emp; //null 컬럼온 +100이 안되고 null로 나타난다.
select comm, nvl(comm, 0) + 100 "보너스" from emp; //nvl(comm, 0) null 이면 0으로 null 아니면 comm 값으로

--
select ename ||'의 직급은' ||job||'입니다' 직급 from emp;
--문종헌의 나이는 24살 입니다
select stu_name ||'의 나이는'|| age || '입니다' 나이 from student;

select cou_id from student;

--전체 코스는 무엇인가요?(중복 제거하기)
select distinct cou_id from student;

select * from emp;
--부서명(deptno)의 종류는?(중복제거하기)
select distinct deptno from emp;

--부서명이 20인 사원들 보가
select * from emp where deptno = 20;

--job이 사원인 것만 보기
select * from emp where job = '사원';

--job이 사원이거나 과장인 것만 보기
select * from emp where job = '사원'or job ='과장';

--sal 400 이상인 사람의 사원번호, 이름, 급여 보기
select empno 사원번호, ename 이름, sal 급여 from emp where sal >=400;

--sal 400 이상이고 job이 부장인 사람의 사원번호 이름, 직급, 급여보기
select empno 사원번호, ename 이름,job 직급, sal 급여 from emp where sal >=400 and job = '부장';

--hiredate 입사일
--입사일 2005.01.01 이전에 입사한 사람
select * from emp where hiredate < '05/01/01';

--입사일 05.01.01 이후에 입사한 사람
select * from emp where hiredate > '05/01/01';

--입사일 06.01.01 ~ 07.12.31 사이에 입사한 사람
select * from emp where hiredate <= '07/12/31' and hiredate >= '06/01/01'; 

--like 유사하다
select * from emp where ename like '이%';

select * from emp where ename like '이%' or ename like '오%';

--이씨 성이 아닌 사람
select * from emp where not ename like '이%';

--in -안에
--job 사원이거나 과장이거나 부장인 사람 출력하기
select * from emp where job = '사원' or job = '과장' or job ='부장' ;
select * from emp where job in('사원', '과장', '부장') ;

--between 시작수 and 끝수 시작수 ~ 끝 수 사이
--300 <= sal <= 600 사이인 사람 출력하기
select * from emp where sal between 300 and 600;

--입사일 06/01/01 ~ 07/12/31 사이 입사한 사람
select * from emp where '06/01/01' <= hiredate and hiredate <= '07/12/31' ;
select * from emp where hiredate between '06/01/01' and '07/12/31' ;

-- MGR(멘토사번)이 1010 ~ 1020사이
select * from emp where mgr between 1010 and 1020;

--comm 이 null 인 사람 출력하기
select * from emp where comm is null;

--이름 오름차순으로 출력하기
select * from emp order by ename asc; --asc ascending 오름차순 생략할 수 있다.
select * from emp order by ename;

--급여 내림차순으로 출력하기
select * from emp order by sal desc; --descending 내림차순

--부서 번호 오름차순으로 출력
select * from emp order by empno;

--job 내림 차순으로 출력
select * from emp order by job desc;

--부서번호 오름차순 만약 동일하면 empno(사원번호) 순서대로 출력하기
select * from emp order by deptno, empno;

--부서번호 오름차순 만약 동일하면 sal 내림차순 순서대로 출력하기
select * from emp order by deptno, sal desc;

--job이 과장이거나 부장인 사람의 job 오름차순으로 출력하기
select * from emp where job in ('과장','부장') order by job asc; //역순 오류 발생

--deptno가 10이거나 30인 사람의 mgr 오름차순 deptno 오름차순으로
select * from emp where deptno in (10,30) order by mgr, deptno asc;

select * from group_star;
select * from single_star;

--합집합 중복된 것 한번만 출력
select * from group_star
union
select * from single_star;

--합집합 중복된 것 모두 출력
select * from single_star;

--교집합
select * from group_star
intersect
select * from single_star;

--차집합
select * from group_star
minus
select * from single_star;

--급여가 300이하인 사원의 사원번호, 사원이름, 급여를 출력하기
select empno, ename, sal from emp where sal <= 300;

--이름이 오지호인 사원의 사원번호 사원명 급여를 출력하기
select empno, ename, sal from emp where ename = '오지호';

--급여가 250 이거나 300 이거나 500인 사원들의 사원번호 사원명과 급여 출력
select * from emp where sal = 250
union
select * from emp where sal = 300
union
select * from emp where sal = 500;

select empno, ename, sal from emp where sal not in(250,300,500);

select empno, ename from emp where ename like '김%' or ename like '%기%'; --%0이거나 여러개 대신

select * from emp where mgr is null;

select * from emp order by deptno asc, hiredate asc;



