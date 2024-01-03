SELECT deptno, ROUND(sal, 3)
FROM emp;

SELECT SUM(sal)
FROM emp;

SELECT SUM(sal) as "급여총액",
       ROUND(AVG(sal)) as "급여평균",
       MAX(sal) as "최대급여",
       MIN(sal) as "최소급여"
FROM emp;


SELECT to_date(MAX(hiredate), 'YY/MM/DD'),
       to_date(MIN(hiredate), 'YY/MM/DD')
FROM emp;


SELECT SUM(comm) as "커미션 총액"
FROM emp;


SELECT MAX(sal)
FROM emp;


SELECT ename, MAX(sal)
FROM emp;


SELECT COUNT(comm) as "커미션 받는 사원의 수"
FROM emp;


SELECT COUNT(*) as "전체 사원의 수", 
       COUNT(comm) as "커미션 받는 사원 수"
FROM emp


SELECT COUNT(job) as "업무수"
FROM emp


SELECT job FROM emp
ORDER BY job


SELECT COUNT(distinct job) as "업무수"
FROM emp

SELECT deptno 
FROM emp 
GROUP BY deptno;

SELECT AVG(sal) as "급여 평균"
FROM emp
GROUP BY deptno;

SELECT deptno as "부서 번호", AVG(sal) as "급여 평균"
FROM emp
GROUP BY deptno;

SELECT deptno, ENAME, AVG(sal)
FROM emp
GROUP BY deptno;

SELECT deptno, SUM(sal) as "급여 총액", AVG(sal) as "급여 평균"
FROM emp
GROUP BY deptno

SELECT deptno, MAX(sal) "최대 급여", MIN(sal) "최소 급여"
FROM emp  
GROUP BY deptno

SELECT deptno, COUNT(*) "부서별 사원수", COUNT(comm) "커미션 받는 사원수"
FROM emp 
GROUP BY deptno

SELECT deptno, AVG(sal) 
FROM emp 
GROUP BY deptno
HAVING AVG(sal) >= 500

SELECT deptno, MAX(sal) "최대 급여", MIN(sal) "최소급여"
FROM emp 
GROUP BY deptno
HAVING  MAX(sal) > 500;


 SELECT job, COUNT(*), SUM(sal)
 FROM emp
 WHERE job NOT LIKE '%사원%'
 GROUP BY job
 HAVING SUM(sal) >= 1000
 ORDER BY SUM(sal);


 SELECT MAX(AVG(sal))
 FROM emp
 GROUP BY deptno;
