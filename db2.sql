select 24*60 as 계산 from dual;

select * from dual; --dual 오라클에 제공하는 테이블 용도 계산용

select sign( 10 ) from dual;
select round(3.456, 2) from dual;
select trunc(53.4587, -1) from dual; //-이면 소수점 자리에서 앞으로 2칸가서 뒷부분 자르기
select trunc(5353.4587, -2) from dual;

select mod(25, 4) from dual; --25%4 나머지

select*from student;
select upper(stu_email) from student;
select lower(stu_email),initcap(stu_email),upper(stu_email) from student;

select length('oracle'), length('오라클') from dual;
select lengthb('oracle'), lengthb ('오라클') from dual;

--substr(대상, 시작위치, 추출할 갯수)
select substr('Welcome to oracle', 9, 2) from dual; //첫 위치는 1번부터

--문종헌의 이메일이 앞부분을 추출하기 결과
select substr(stu_email,1,4) from student where stu_name = '문종현';

--stu_id가 101 ~ 110까지의 사람들 이메일이 맨 뒷부분 즉 com을 추출하기
select substr(stu_email,-3,3) from student where stu_id between 101 and 110;

--instr(대상, 찾는문자) 대상에서 찾는 문자의 위치를 숫자로 반환함
select instr('Welcome to oracle', 'e') from dual;//제일 앞에서부터 찾아준다

--instr(대상, 찾는문자, 시작위치) 대상에서 찾는 문자의 위치를 숫자로 반환함
select instr('Welcome to oracle', 'e',3) from dual;//시작위치에서부터 찾아준다

--instr(대상, 찾는문자, 시작위치, 몇번째발견) 대상에서 찾는 문자의 위치를 숫자로 반환함
select instr('Welcome to oracle', 'e',3,2) from dual;//제일 앞에서부터 찾아준다 //시작위치부터'e'를 찾는데 두번째 발견한것.

select*from student;
--모든학생의 이메일의 @ 위치알기
select instr(stu_email,'@') from student;

--모든학생의 id를 구하기
select substr(stu_email,1,instr(stu_email,'@')-1) id from student; 

--LAPD left padding
--RAPD right padding
select lpad('oracle',20,'#')from dual;
select rpad('oracle',20,'#')from dual;

select lpad('oracle',20,'#')from dual;
select rpad('oracle',20,'#')from dual;

select*from emp;
select lpad(job,10,' ')from emp;

--3형변환 함수
--to_char() to_date() to_number()

--현재시간을 구해준다
select sysdate from dual;
select sysdate, to_char(sysdate,'YYYY- mm - dd day am hh:mi:ss') from dual;

select*from emp;
select hiredate, to_char(hiredate,'yyyy-mm-dd-dy') from emp;

select to_char(12345678, '000,000,000') from dual; --012.345.678
select to_char(12345678, '000,000') from dual; --#으로 채운다 에러

select to_char(12345678, '999,999,999') from dual;
select to_char(12345678, '000,000') from dual;

select to_char(12345678, 'L999,999,999') from dual;//통화기호 L추가
select to_char(12345678, '000,000') from dual;

--to date() 날짜형을 바꾸기 ****
//오라클에서 기본 날짜형은 'mm/dd/yy'
// to_date('문자', '형식') 문자 -> 형식에 맞춰서 날짜로 변환
select * from emp;
select to_char(12345678, '000,000') from dual;//에러발생

select * from emp where hiredate = to_date(20070402,'yymmdd');

--오늘날짜 - 특정일
//select sysdate -'2023/01/03'from dual; 에러발생

select trunc(sysdate - to_date(20230103,'yyyymmdd'),0)from dual;

select * from emp;
--안성기 입사일 - 김사랑 입사일 빼기
select '961004'-'070301' from dual;
select 961004-070301 from dual;

select to_date('20070321','yyyymmdd') - to_date('20070310','yyyymmdd')from dual;

--to_number(',가있는 숫자','형식')
select to_number('20,000', '99,999') - to_number('10,000','99,999') from dual;

select '20000' - '10000' from dual;

--날짜 함수
--어제 오늘 내일
select to_char(sysdate -1, 'yyyy-mm-dd day') 어제, sysdate 오늘, sysdate +1 내일 from dual;

--months_between
select months_between(sysdate, '2023/12/31') from dual;
select add_months( '2023/10/01', 10) from dual;
select round(to_date('20/01/01', 'yy/mm/dd'), 'month') from dual;

select hiredate, trunc(hiredate,'month') from emp; --입사일의 일을 모두 01일로 고치기

select * from emp;

--근무년수, 근무달수
--오늘날짜 - 입사일 년수 달수
select ename, sysdate, hiredate from emp;
select ename 사원명, sysdate 현재일, hiredate 입사일, months_between( sysdate, hirdate) 근무달수 from emp;
select ename 사원명, sysdate 현재일 ,hiredate 입사일, trunc(months_between(sysdate, hiredate),0) 근무달수 from emp;
-- years betweet은 없는 값이라 months between을 12로 나눠서 계산한다.
select ename 사원명, sysdate 현재일 ,hiredate 입사일, trunc(months_between(sysdate, hiredate)/12,0) 근무년수 from emp;

-- 출력형식 입사일 현재날짜 근속년 근속월 근속일
select hiredate 입사일, sysdate 현재날짜, trunc(months_between(sysdate, hiredate)/12,0) 근무년수,
     trunc(months_between(sysdate,hiredate),0) 근무월수,
     trunc(months_between(sysdate,hiredate),0)*30 근무일수
     from emp;
     
-- 오늘 날짜를 기준으로 최초로 도래하는 수요일의 날짜는?
select to_char(next_day(sysdate,'수'),'yyyy/mm/dd') from dual;

select last_day('24/01/01') from dual;
select*from emp;
select empno 사원번호, last_day(sysdate) 급여일 from emp;

select*from emp;
select comm, nvl(comm,0) from emp;

--nvl(comm, 0)
select * from emp where hiredate is null;

--입사일이 null이면 오늘날짜 넣어주기
select hiredate, nvl( hiredate, sysdate) from emp where hiredate is null;
select hiredate, nvl( hiredate, sysdate) from emp; 

--이름이 null이면 '무명' job이 null 이면 '사원'
select empno, nvl(ename, '무명'), nvl(job, '사원') from emp;

--nvl2(식1, 식2, 식3) 만약에 식1이 null 아니면 식2 반환 null이면 식 3을 반환
select * from emp;
select ename, sal, nvl2( comm, sal*12 + comm, sal * 12) 연봉 from emp;

--coalesce(식1, 식2, ... ,식n)
//식 1이 null이 아니면 식 1값 출력, 식2가 null이 아니면 식2 출력, 모두 다 null이면 식n 출력

--급여가 null 자료 삽입
insert into emp values(1019, null, '대리', 1003, sysdate, null, null, 20);
insert into emp values(1020, null, '대리', 1003, sysdate, null, 100, 20);
select comm sal, coalesce( comm, sal, 0) from emp;

--선택을 위한 decode 함수( switch ~ case문과 비슷함)
/* decode( 표현식, 조건1, 결과1
                  조건2, 결과2
                  조건3, 결과3
                  기본결과n */
select * from emp;
select deptno, decode( deptno, 10, '경리부',
                               20, '인사부',
                               '전산부')
from emp;

select * from student;
--sex가 'm'이면 남자 'f'면 여자
select sex, decode ( sex, 'M', '남자',
                          'F', '여자')
from student;

//표 - 테이블 
//한줄 - 행 - row - 레코드 - 튜플 - 입출력의 기본 단위
//열 - 칸 - colum -항목 -필드 -item -속성

--그룹함수
select count( ename) from emp; // 20행 입력 1행 출력
select ename from emp; //20행 입력 20행 출력
//select ename, count(ename) from emp; 출력행 갯수가 달라서 
select sum( sal) from emp;
select sum( sal), count(ename), avg(sal), max(sal), min(sal) from emp;
--그룹함수에서 sum, count에서는 null 연산에서 제외
--보너스를 받는 사원수는?
select count(comm) from emp;
--직위 종류는?
select count(distinct job) from emp;

select * from emp;
select * from emp order by deptno;

--각부서별로 제일 높은 급여 출력
select deptno, max(sal) from emp group by deptno order by deptno;

--job별로 급여가 제일 낮은 급여
select job,min(sal) from emp group by job;
select * from emp order by job;

--job 별로 급여 평균 출력하기

--사원이거나 대리이거나 과장의 급여 합계
--1단계 사원, 대리, 과장 출력하기
select * from emp where job in('사원', '대리', '과장');

--2단계 그룹으로 지정하기
select job, round(avg(sal)) from emp where job in('사원', '대리', '과장') group by job;

--최대 급여가 700을 초과하는 부서에 대해서 최대급여와 최소급여를 구하기
--결과 20 1000 30
//1단계 부서별 최대값 구하기
select deptno, max(sal) from emp group by deptno;

//2단계 최대 급여가 700이 넘는것? -> 그룹함수의 조건
select deptno, max(sal) from emp group by deptno having max(sal) > 700;

--급별로 급여의 평균이 500이상인 직급, 급여평균, 부서명 출력
//1단계 직급별 그룹하기
select job,avg(sal) from emp group by job;

//2단계 급여의 평균이 500이상 출력
select job,avg(sal) from emp group by job having avg(sal) >= 500;

//평균 급여 오름차순으로 구하기
select job,avg(sal) from emp group by job having avg(sal) >= 500 order by avg(sal) asc;

select*from student;
--최대나이?
select max(age) from student;

--최소나이
select min(age) from student;

--평균나이
select avg(age) from student;

--남자최대나이, 여자최대나이
select sex,max(age) from student group by sex;

--cou_id 별로 평균 나이
select cou_id,avg(age) from student group by cou_id;

--cou_id 별로 평균 나이
select cou_id,avg(age) from student group by cou_id having avg(age) >= 25;

--남자인 경우에 cou_id 별로 평균 나이 오름차순으로 구하기
select cou_id,avg(age) from student where sex group by cou_id having avg(age) >= 25 order by avg(age) asc;
//1단계 남자만 출력
select * from student where sex ='M';

//2단계 남자인 경우 cou_id 그룹별로 출력
select avg(age), cou_id from student where sex ='M' group by cou_id;

//3단계 남자인 경우 cou_id 그룹별로 평균 나이 오름차순
select avg(age), cou_id from student where sex ='M' group by cou_id having avg(age) >= 25 order by avg(age) asc;