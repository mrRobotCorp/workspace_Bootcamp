select * from emp;
select empno from emp; -- ctrl + enter
select empno, ename from emp;
-- ex) empno, job, mgr, deptno�� 1,2,3,4 �����ؼ� ��ȸ
select empno from emp;
select empno, job from emp;
select empno, job, mgr from emp;
select empno, job, mgr, deptno from emp;
select deptno, empno, ename 
from emp;
select ename, sal
from emp
where sal >= 2000;
select *
from emp;
-- ex1) sal�� 2000 �̸��� ��� ���� �˻�.
select ename, sal
from emp
where sal < 2000;
-- ex2) sal�� 2000 �̻�, 4000�̸��� ��� �̸�, sal �˻�. (and, or ���)
select ename, sal
from emp
where sal >= 2000 and sal < 4000;

select deptno, ename, sal
from emp
where sal < 2000 or sal >= 5000;

select * from emp;
-- ex3) empno(������) �������� 7500 �̸��̰ų� 7800 �̻��� ����� empno, ename, sal ���
select empno, ename, sal
from emp
where empno < 7500 or empno >= 7800;

select * -- ��ü �� ���
from emp
where ename = 'SMITH'; -- �񱳿����� =ǥ�ô� �ϳ���, ���ڿ��� ''���� ����ǥ��, ��ҹ��� ���� Ȯ����.

SELECT * FROM EMP;






