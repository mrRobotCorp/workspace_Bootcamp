SELECT deptno, e.* 
FROM emp e
ORDER by e.DEPTNO ;

SELECT  *
FROM dept;
-- emp테이블과 dept 테이블은 deptno를 공통으로 가지고 있는 연관관계.
-- 이 연관관계에 있는 컬럼을 조건으로 조인하는 것을 기본 조인 구문인 inner 조인이라고 함.

SELECT e.*, d.*
FROM emp e, DEPT d 
WHERE e.DEPTNO = d.DEPTNO;

-- e.* : emp 테이블의 alias명 e를 테이블명으로 하위에 있는 컬럼 접근할 때 사용
-- d.* : dept테이블의 alias명 d를 테이블명으로 하위에 있는 컬럼을 접근할 때 사용
-- 일반적으로 위 e.컬럼명, d.컬럼명을 두 개의 테이블에서 공통되는 컬럼으로 구분할 떄 사용.
-- 공통된 컬럼이 아니면 생략해도 무방.
SELECT empno, ename, e.deptno, dname, loc
FROM emp e, dept d
WHERE e.DEPTNO  = d.deptno; 

-- 두 개의 공통 컬럼을 구분해줘야 함
-- 두 개 테이블의 조인을 통해서 연관관계에 있는 컬럼의 내용을 출력할 수 있음
-- ex) 조인 구문을 이용하여 부서명, 사원명, 부서위치, 급여를 출력
SELECT dname, ename, loc, sal
FROM emp e, dept d
WHERE e.DEPTNO = d.deptno;

-- ex) 조인을 이용하여 부서위치와 사원명을 검색
SELECT * FROM emp;

SELECT  dname, ename
FROM emp e, dept d
WHERE e.DEPTNO  = d.deptno;
-- 조인을 하면 이 기준을 지금까지 했던 조건, group, 함수처리 내용을 연관하여 처리 할수 있음

-- 부서위치를 기준으로 최고 급여 처리
SELECT loc 부서위치, max(sal) 최고급여
FROM emp e, dept d
WHERE e.DEPTNO = d.DEPTNO
GROUP BY loc;

-- 급여가 3000이상인 부서명, 급여를 출력
SELECT dname, sal
FROM emp e, dept d
WHERE e.deptno = d.DEPTNO AND sal >= 3000;

SELECT *
FROM DEPARTMENTS;

SELECT * FROM EMPLOYEES e ;

-- ex) DEPARTMENTS, EMPLOYEES 두 테이블의 공통 컬럼인 DEPARTMENT_id로
--		inner 조인 처리. 조건 - salary는 5000이상, 
--		department_name은 Marketing || Purchasing 데이터를 검색
--		사원명, 급여, 부서명 출력
SELECT first_name, salary, department_name
FROM EMPLOYEES e , DEPARTMENTS d
WHERE e.DEPARTMENT_ID  = d.DEPARTMENT_ID
AND SALARY >= 5000
AND department_name IN('Marketing','Purchasing' );

SELECT *
FROM emp e, dept d;
-- equi join(inner join) 12(emp)*4(dept) = 48건이 조인됨.
-- 범위로 join하는 경우
SELECT ename, sal FROM emp;

-- 등급, 최소급여, 최대급여 : 해당 등급의 최소, 최대 범위를 설정
SELECT * 
FROM SALGRADE s ;

SELECT ename, sal, grade
FROM emp e, SALGRADE s 
WHERE sal BETWEEN losal AND hisal;

-- 4등급에 해당하는 사원 정보를 출력
SELECT grade, e.*
FROM emp e, SALGRADE s 
WHERE sal BETWEEN losal AND hisal
AND grade = 4;

-- ex1) SMITH의 급여와 급여 등급을 출력
SELECT ename, sal, grade
FROM EMP e, SALGRADE s 
WHERE sal BETWEEN losal AND hisal 
AND ename = 'SMITH';

-- ex2) SALESMAN의 급여와 등급을 출력
SELECT ename, job, sal, grade
FROM EMP e , SALGRADE s 
WHERE sal BETWEEN losal AND hisal 
AND job= 'SALESMAN';

-- 사원 정보 중 최고 급여자의 사원 정보 출력
SELECT max(sal)
FROM emp ;

SELECT *
FROM EMP
--WHERE sal = 5000;
WHERE sal = (
	SELECT max(sal)
	FROM emp 
);

-- ex) 사원번호가 가장 낮은 사원의 정보 출력
SELECT *
FROM EMP
WHERE empno = (
	SELECT min(empno)
	FROM emp
);

-- ex) 사원중에서 가장 최근에 입사한 사원의 정보 출력
SELECT *
FROM emp
WHERE hiredate = (
	SELECT max(HIREDATE)
	FROM emp
);

-- view : 가상 테이블, inline view(sql을 통해서 테이블 형태와 같이 바로 처리하는 것을 말함)
SELECT *
FROM EMP e ,
(	
	SELECT max(sal) SAL
	FROM emp
) me
WHERE e.sal = me.sal;

-- 부서 별 최고 급여자에 대한 정보를 출력
SELECT deptno, max(sal)
FROM emp
GROUP BY deptno;

SELECT *
FROM emp,
(
	SELECT deptno, max(sal) sal
	FROM emp
	GROUP BY deptno
) me
WHERE e.deptno= me.deptno
AND e.deptno = me.sal;











