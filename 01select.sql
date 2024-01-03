select * from emp;
select * from student;
select * from dept;
select dname from dept;

select ename, sal, job from emp;

//stu_id stu_name sex �÷��� �˻��ϱ�, ��ҹ��� ���� ����
select stu_id, stu_name, sex from student;

//��������� ���� �÷�(��)�� �� �� �ִ�
select empno, sal, ename, sal, sal*12, job from emp;
select empno, sal, ename, sal, sal*12*0.33, job from emp;
select empno as �����ȣ, ename as �����, sal as �޿�, sal*12 as ����, job as ���� from emp;
//�÷���, ��Ī as�� ������ �� �ִ�.
select empno �����ȣ, enam �����, sal �޿�, sal*12 ����, job ���� from emp;

select * from salgrade;
select Hisal + 1000, Losal + 1500 from salgrade;

select grade ���, losal, losal �����ݾ�, losal + 1500 �λ������ݾ�, hisal �ִ�ݾ�, hiasal + 1000 �λ��ִ�ݾ� from salgrade;

//Null�̶�? 0�ƴ� ����� �ƴϴ�. ��Ȯ�� �� �� ���� �ܾ��
select * from emp;

//comm ���ʽ��� + 100�� ��������
select comm, comm + 100 from emp; //null �÷��� +100�� �ȵǰ� null�� ��Ÿ����.
select comm, nvl(comm, 0) + 100 "���ʽ�" from emp; //nvl(comm, 0) null �̸� 0���� null �ƴϸ� comm ������

--
select ename ||'�� ������' ||job||'�Դϴ�' ���� from emp;
--�������� ���̴� 24�� �Դϴ�
select stu_name ||'�� ���̴�'|| age || '�Դϴ�' ���� from student;

select cou_id from student;

--��ü �ڽ��� �����ΰ���?(�ߺ� �����ϱ�)
select distinct cou_id from student;

select * from emp;
--�μ���(deptno)�� ������?(�ߺ������ϱ�)
select distinct deptno from emp;

--�μ����� 20�� ����� ����
select * from emp where deptno = 20;

--job�� ����� �͸� ����
select * from emp where job = '���';

--job�� ����̰ų� ������ �͸� ����
select * from emp where job = '���'or job ='����';

--sal 400 �̻��� ����� �����ȣ, �̸�, �޿� ����
select empno �����ȣ, ename �̸�, sal �޿� from emp where sal >=400;

--sal 400 �̻��̰� job�� ������ ����� �����ȣ �̸�, ����, �޿�����
select empno �����ȣ, ename �̸�,job ����, sal �޿� from emp where sal >=400 and job = '����';

--hiredate �Ի���
--�Ի��� 2005.01.01 ������ �Ի��� ���
select * from emp where hiredate < '05/01/01';

--�Ի��� 05.01.01 ���Ŀ� �Ի��� ���
select * from emp where hiredate > '05/01/01';

--�Ի��� 06.01.01 ~ 07.12.31 ���̿� �Ի��� ���
select * from emp where hiredate <= '07/12/31' and hiredate >= '06/01/01'; 

--like �����ϴ�
select * from emp where ename like '��%';

select * from emp where ename like '��%' or ename like '��%';

--�̾� ���� �ƴ� ���
select * from emp where not ename like '��%';

--in -�ȿ�
--job ����̰ų� �����̰ų� ������ ��� ����ϱ�
select * from emp where job = '���' or job = '����' or job ='����' ;
select * from emp where job in('���', '����', '����') ;

--between ���ۼ� and ���� ���ۼ� ~ �� �� ����
--300 <= sal <= 600 ������ ��� ����ϱ�
select * from emp where sal between 300 and 600;

--�Ի��� 06/01/01 ~ 07/12/31 ���� �Ի��� ���
select * from emp where '06/01/01' <= hiredate and hiredate <= '07/12/31' ;
select * from emp where hiredate between '06/01/01' and '07/12/31' ;

-- MGR(������)�� 1010 ~ 1020����
select * from emp where mgr between 1010 and 1020;

--comm �� null �� ��� ����ϱ�
select * from emp where comm is null;

--�̸� ������������ ����ϱ�
select * from emp order by ename asc; --asc ascending �������� ������ �� �ִ�.
select * from emp order by ename;

--�޿� ������������ ����ϱ�
select * from emp order by sal desc; --descending ��������

--�μ� ��ȣ ������������ ���
select * from emp order by empno;

--job ���� �������� ���
select * from emp order by job desc;

--�μ���ȣ �������� ���� �����ϸ� empno(�����ȣ) ������� ����ϱ�
select * from emp order by deptno, empno;

--�μ���ȣ �������� ���� �����ϸ� sal �������� ������� ����ϱ�
select * from emp order by deptno, sal desc;

--job�� �����̰ų� ������ ����� job ������������ ����ϱ�
select * from emp where job in ('����','����') order by job asc; //���� ���� �߻�

--deptno�� 10�̰ų� 30�� ����� mgr �������� deptno ������������
select * from emp where deptno in (10,30) order by mgr, deptno asc;

select * from group_star;
select * from single_star;

--������ �ߺ��� �� �ѹ��� ���
select * from group_star
union
select * from single_star;

--������ �ߺ��� �� ��� ���
select * from single_star;

--������
select * from group_star
intersect
select * from single_star;

--������
select * from group_star
minus
select * from single_star;

--�޿��� 300������ ����� �����ȣ, ����̸�, �޿��� ����ϱ�
select empno, ename, sal from emp where sal <= 300;

--�̸��� ����ȣ�� ����� �����ȣ ����� �޿��� ����ϱ�
select empno, ename, sal from emp where ename = '����ȣ';

--�޿��� 250 �̰ų� 300 �̰ų� 500�� ������� �����ȣ ������ �޿� ���
select * from emp where sal = 250
union
select * from emp where sal = 300
union
select * from emp where sal = 500;

select empno, ename, sal from emp where sal not in(250,300,500);

select empno, ename from emp where ename like '��%' or ename like '%��%'; --%0�̰ų� ������ ���

select * from emp where mgr is null;

select * from emp order by deptno asc, hiredate asc;



