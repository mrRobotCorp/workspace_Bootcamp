select * from emp;
select empno from emp; -- ctrl + enter
select empno, ename from emp;
-- ex) empno, job, mgr, deptno를 1,2,3,4 선택해서 조회
select empno from emp;
select empno, job from emp;
select empno, job, mgr from emp;
select empno, job, mgr, deptno from emp;
select deptno, empno, ename 
from emp;
select ename, sal /* 보게 될 컬럼 지정 */
from emp
where sal >= 2000; /* 행 단위로 비교 연산자를 통한 검색 */
select *
from emp;
-- ex1) sal이 2000 미만인 사원 정보 검색.
select ename, sal
from emp
where sal < 2000;
-- ex2) sal이 2000 이상, 4000미만인 사원 이름, sal 검색. (and, or 사용)
select ename, sal
from emp
where sal >= 2000 and sal < 4000;

select deptno, ename, sal
from emp
where sal < 2000 or sal >= 5000;

select * from emp;
-- ex3) empno(숫자형) 기준으로 7500 미만이거나 7800 이상인 사원의 empno, ename, sal 출력
select empno, ename, sal
from emp
where empno < 7500 or empno >= 7800;

select * -- 전체 열 출력
from emp
where ename = 'SMITH'; 
-- 비교연산자 =표시는 하나만(sql 에서는 대입 연산자 없음)
-- 문자열은 ''작은 따옴표로, 대소문자 구분 확실히.

SELECT * FROM EMP;
-- ex) sal이 1250인 사원 정보 출력
select *
from emp
where sal = 1250;
-- ex) job이 CLERK인 사원 정보의 empno, ename, job 출력
select empno, ename, job
from emp
where job = 'CLERK';    
/*
db --> ArrayList<Emp>
--- java 예시 코드 ----
class Emp{
    private int empno;
    private String ename;
    private String job;
    private int mgr;
    private Date hiredate;
    private double sal;
    private double comm;
    private int deptno;
    
    생성자, setter, getter 만들기
}
*/
select * from dept;
select * from emp;
select *
from emp, dept
where emp.deptno = dept.deptno;





