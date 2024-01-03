SET SERVEROUTPUT ON
BEGIN
  DBMS_OUTPUT.PUT_LINE('Hello World!'); 
END;
/

select * from emp;

DECLARE
  VEMPNO NUMBER(4);
  VENAME VARCHAR2(10);
BEGIN
  VEMPNO := 1001;
  VENAME := '김사랑';   
  DBMS_OUTPUT.PUT_LINE('   사번    이름'); 
  DBMS_OUTPUT.PUT_LINE('  ---------------');
  DBMS_OUTPUT.PUT_LINE('   ' || VEMPNO || '   ' || VENAME); 
END;
/


DECLARE
  VEMPNO EMP.EMPNO%TYPE;
  VENAME EMP.ENAME%TYPE;
BEGIN
  SELECT EMPNO, ENAME INTO VEMPNO, VENAME
  FROM EMP
  WHERE ENAME='김사랑';
  DBMS_OUTPUT.PUT_LINE('   사번    이름'); 
  DBMS_OUTPUT.PUT_LINE('  ---------------');
  DBMS_OUTPUT.PUT_LINE('   ' || VEMPNO || '   ' || VENAME); 
END;
/

DECLARE
   VEMPNO 	 EMP.EMPNO%TYPE;
   VENAME 	 EMP.ENAME%TYPE;
   VDEPTNO   EMP.DEPTNO%TYPE;
   VDNAME 	 VARCHAR2(20) := NULL;
BEGIN
   SELECT EMPNO, ENAME, DEPTNO 
   INTO VEMPNO, VENAME, VDEPTNO 
   FROM  EMP
   WHERE EMPNO=1001;
   
   IF (VDEPTNO = 10)  THEN
      VDNAME := 'ACCOUNTING';
   END IF;
   IF (VDEPTNO = 20)  THEN
     VDNAME := 'RESEARCH';
   END IF;
   IF (VDEPTNO = 30)  THEN
      VDNAME := 'SALES';
   END IF;
   IF (VDEPTNO = 40) THEN  
      VDNAME := 'OPERATIONS';
   END IF;

   DBMS_OUTPUT.PUT_LINE('   사번     이름      부서명');
   DBMS_OUTPUT.PUT_LINE('  ---------------------------');
   DBMS_OUTPUT.PUT_LINE('   ' || VEMPNO||'    '
                ||VENAME||'    '||VDNAME);
END;
/


DECLARE
  VEMP EMP%ROWTYPE;
  ANNSAL NUMBER(7,2);
BEGIN    
  SELECT * INTO VEMP
  FROM EMP
  WHERE ENAME='김사랑';

  IF (VEMP.COMM IS NULL) THEN 
    ANNSAL:=VEMP.SAL*12;       
  ELSE     
    ANNSAL:=VEMP.SAL*12+VEMP.COMM; 
  END IF;

  DBMS_OUTPUT.PUT_LINE('  사번    이름    연봉'); 
  DBMS_OUTPUT.PUT_LINE('--------------------------');
  DBMS_OUTPUT.PUT_LINE('  '||VEMP.EMPNO||'   '
         ||VEMP.ENAME||'   '||ANNSAL); 
END;
/

DECLARE
  VEMP EMP%ROWTYPE;
  VDNAME VARCHAR2(14);
BEGIN  
  SELECT * INTO VEMP
  FROM EMP
  WHERE ENAME='김사랑';

  IF (VEMP.DEPTNO = 10)  THEN
    VDNAME := 'ACCOUNTING';
  ELSIF (VEMP.DEPTNO = 20)  THEN
    VDNAME := 'RESEARCH';
  ELSIF (VEMP.DEPTNO = 30)  THEN
    VDNAME := 'SALES';
  ELSIF (VEMP.DEPTNO = 40) THEN  
    VDNAME := 'OPERATIONS';
  END IF;

  DBMS_OUTPUT.PUT_LINE('  사번    이름     부서명'); 
  DBMS_OUTPUT.PUT_LINE('------------------------------');

  DBMS_OUTPUT.PUT_LINE('  '||VEMP.EMPNO
        ||'    '||VEMP.ENAME||'   '||VDNAME); 
END;
/

DECLARE
  N  NUMBER := 1;
BEGIN
  LOOP
    DBMS_OUTPUT.PUT_LINE( N );
    N := N + 1;
    IF N > 5 THEN
      EXIT;
    END IF;
  END LOOP;
END;
/

DECLARE
BEGIN
  FOR N IN 1..5 LOOP
    DBMS_OUTPUT.PUT_LINE( N );
  END LOOP;
END;
/

DECLARE
  N NUMBER := 1;
BEGIN
  WHILE N <= 5 LOOP
    DBMS_OUTPUT.PUT_LINE( N );
    N := N + 1;
  END LOOP;
END;
/
drop table s_emp 
create table s_emp 
as
select * from emp;

select ENAME, sal from s_emp
WHERE ENAME='김사랑';

DECLARE
   VEMP 	   s_emp%ROWTYPE;   
   VDEPTNO   s_emp.DEPTNO%TYPE;   
   VPERCENT  NUMBER(2);
BEGIN
   select deptno into vdeptno
   from dept
   where dname like '%영업%';
   
   SELECT * INTO VEMP
   FROM s_emp
   WHERE ENAME='김사랑';
  
   IF VEMP.deptno  =  vdeptno THEN
      VPERCENT := 10;
   ELSE
      VPERCENT := 5;
   END IF;
   
   update s_emp
   set sal = sal + sal*VPERCENT/100
   where ENAME='김사랑';
   commit;
   END;
/


DECLARE
 -- %ROWTYPE로 행단위로를 저장하는 레퍼런스 변수 선언 
  VEMP EMP%ROWTYPE; 
  ANNSAL NUMBER(7,2);
BEGIN
 -- 김사랑 사원의 전체 정보를 행 단위로 VEMP에 저장한다.  
  SELECT * INTO VEMP
  FROM EMP
  WHERE ENAME='김사랑';

 -- 커미션이 NULL일 경우 0으로 변경해야 올바른 연봉 계산
  IF (VEMP.COMM IS NULL)  THEN
   VEMP.COMM := 0;
  END IF;                      
 -- 스칼라 변수에 연봉을 계산할 결과를 저장한다.
  ANNSAL:=VEMP.SAL*12+VEMP.COMM ; 

-- 결과 출력 
  DBMS_OUTPUT.PUT_LINE('사번 / 이름 / 연봉'); 
  DBMS_OUTPUT.PUT_LINE('------------------------');
  DBMS_OUTPUT.PUT_LINE(VEMP.EMPNO||' /' 
               ||VEMP.ENAME||' /'||ANNSAL); 
END;
/

DECLARE
  DAN  NUMBER := 5;
  I  NUMBER := 1;
BEGIN
  LOOP
    DBMS_OUTPUT.PUT_LINE(
        DAN || ' * ' || I ||' = '|| (DAN*I) );
    I := I + 1;  
    IF I > 9          THEN
       EXIT;   
    END IF;
  END LOOP;             
END;
/

DECLARE
   VDEPT DEPT%ROWTYPE;                        
BEGIN
  DBMS_OUTPUT.PUT_LINE('부서번호 / 부서명 / 지역명'); 
  DBMS_OUTPUT.PUT_LINE('-----------------------');
  -- CNT는 1부터 1씩 증가하다가 4가 되면 반복문을 벗어남
   FOR CNT IN 1..4 LOOP                        
    SELECT * INTO VDEPT
    FROM DEPT
    WHERE DEPTNO=10*CNT;

    DBMS_OUTPUT.PUT_LINE(VDEPT.DEPTNO || '      / ' 
      || VDEPT.DNAME || ' / ' || VDEPT.LOC); 
  END LOOP;
END;
/

DECLARE
  V_CNT  NUMBER := 1;
  V_STR  VARCHAR2(10) := NULL;
BEGIN
  WHILE V_CNT <= 5           LOOP
    V_STR := V_STR || '*';
    DBMS_OUTPUT.PUT_LINE(V_STR);
     V_CNT := V_CNT + 1;                   
  END LOOP;             
END;
/

