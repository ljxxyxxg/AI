select empno, ename
from emp  
order by empno desc;

--첫 번째 미션해결하기
--하나. 사원의 이름과 급여와 입사일자만을 출력하기
select deptno, dname
from dept;
--둘. 컬럼 이름에 별칭을 지정하기
select deptno 부서번호, dname as 부서명
from dept;
--셋. 직급이 중복되지 않고 한 번씩 나열하기
select distinct job
from emp;

--두 번째 미션 해결하기
--하나. 급여가 300 이하인 사원의 사원번호, 사원 이름, 급여를 출력하기
select empno, ename, sal
from emp
where sal<=300;
--둘. 이름이 “오지호”인 사원의 사원번호, 사원명, 급여를 출력하기
select empno, ename, sal
from emp
where ename='오지호'
--셋. 급여가 250이거나 300이거나 500인 사원들의 사원 번호와 사원명과 급여를 검색하기
select empno, ename, sal 
from emp
where sal=250 or sal=300 or sal=500; 

select empno, ename, sal 
from emp
where sal IN (250, 300, 500);

--넷. 급여가 250이거나 300이거나 500도 아닌 사원들을 검색하기
select empno, ename, sal 
from emp
where sal <> 250 and sal <> 300 and sal <> 500; 

select empno, ename, sal 
from emp
where sal not IN (250, 300, 500);


--세 번째 미션 해결하기
--하나.  LIKE 연산자와 와일드 카드를 사용하여 사원들 중에서 이름이 “김”으로 시작하는 사람과 이름 중에 “기”를 포함하는 사원의 사원번호와 사원이름을 출력하기
select empno, ename 
from emp 
where ename  like '김%'
or ename like '%기%';
--둘. 상관이 없는 사원(사장이 되겠지요!)을 검색하기
select *
from emp 
where mgr IS NULL;
--셋. 사원 테이블에서 최근 입사한 직원 순으로 사원번호, 사원명, 직급, 입사일 컬럼만 출력하기
select empno, ename, job, to_char(hiredate, 'YYYY/MM/DD')
from emp  
order by hiredate desc

--넷. 부서 번호가 빠른 사원부터 출력하되 같은 부서내의 사원을 출력할 경우 입사한지 가장 오래된 사원부터 출력하기
select deptno, empno, ename, job, to_char(hiredate, 'YYYY/MM/DD')
from emp  
order by deptno asc, hiredate asc
