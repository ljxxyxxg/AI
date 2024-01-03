--첫 번째 미션 해결하기
--하나. SUBSTR 함수를 사용하여 9월에 입사한 사원을 출력하기
SELECT *
FROM emp
WHERE SUBSTR(hiredate, 4, 2)='09';
--둘. SUBSTR 함수를 이용하여 2003년도에 입사한 사원을 검색하기
SELECT *
FROM emp
WHERE SUBSTR(hiredate, 1, 2)='03';
--셋.  SUBSTR 함수를 이용하여 “기”로 끝나는 사원을 검색하기
SELECT *
FROM emp
WHERE SUBSTR(ename, -1, 1)='기';  
--넷. 이름의 두 번째 글자가 “동”이 있는 사원을 검색하기
SELECT empno, ename
FROM emp
WHERE INSTR(ename, '동', 2, 1)=2;  
--두 번째 미션 해결하기
--하나. 직급에 따라 직급이 '부장'인 사원은 5%, '과장'인 사원은 10%, '대리'인 사원은 15%, '사원'인 사원은 20% 급여 인상하기
SELECT empno, ename, job, sal,
       DECODE(job, '부장', sal*1.05,                         
                   '과장', sal*1.10,
                   '대리', sal*1.15,
                   '사원', sal*1.20, 
                    sal) Upsal
FROM emp;

--세 번째 미션 해결하기
--하나. 입사일을 연도는 2자리(YY), 월은 숫자(MON)로 표시하고 요일은 약어(DY)로 지정하여 출력하기
SELECT  hiredate, 
        TO_CHAR (hiredate, 'YY/MON/DD DY')  
FROM emp;

SELECT *
FROM emp
WHERE MOD(empno, 2)=1;

SELECT hiredate, SUBSTR(hiredate, 7, 4) 년도, 
       SUBSTR(hiredate, 4, 2) 월, SUBSTR(hiredate, 1, 2) 일
FROM emp



SELECT ROUND(SYSDATE-hiredate) 근무일수
FROM emp;

SELECT hiredate, ROUND (hiredate, 'MONTH') 
FROM emp;
    

SELECT empno, ename, NVL(TO_CHAR(mgr, '9999'), ' C E O ') as "직속 상관"
FROM emp
WHERE mgr IS NULL;

