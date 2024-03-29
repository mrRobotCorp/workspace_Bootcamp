SELECT DISTINCT  deptno
FROM emp
ORDER BY DEPTNO ;

SELECT d.*, e.*
FROM EMP e , DEPT d 
WHERE e.DEPTNO(+) = d.DEPTNO
ORDER BY d.DEPTNO ;

SELECT ename, deptno
FROM emp;

SELECT dname 부서명, nvl(ename, '사원없음') 사원명
FROM emp e, dept d
WHERE e.DEPTNO (+) = d.DEPTNO 
ORDER BY dname;

SELECT DISTINCT department_id
FROM EMPLOYEES;

SELECT * FROM EMPLOYEES e ;
SELECT * FROM DEPARTMENTS d  ;
-- ex) employees와 departments의 department_id 기준으로
--		부서별 사원명(first_name) 출력, 사원이 없는 곳은 미배정이라고 표시
SELECT department_name 부서명, 
		nvl(first_name, '미배정') 이름
FROM EMPLOYEES e, DEPARTMENTS d
WHERE e.DEPARTMENT_ID(+)  = d.DEPARTMENT_ID
ORDER BY department_name;

-- 부서 별로 할당된 인원 현황 (반드시 outer join 설정 필요)
SELECT DEPARTMENT_name 부서명, 
		count(first_name) 인원수
FROM EMPLOYEES e, DEPARTMENTS d
WHERE e.DEPARTMENT_ID(+)  = d.DEPARTMENT_ID
GROUP BY DEPARTMENT_name
ORDER BY DEPARTMENT_name;

SELECT empno, ename, mgr
FROM emp;

SELECT empno, ename, mgr
FROM emp
WHERE empno = 7902;

SELECT empno, ename, mgr
FROM emp
WHERE empno = 7566;

SELECT e.empno 사원번호, e.ename 사원명, e.mgr 관리자번호,
		m.ename 관리자이름
FROM emp e, emp m
WHERE e.mgr = m.empno; 
-- 하위 테이블의 mgr(관리자번호)과 상위테이블의 empno가 연관관계로 self join됨

SELECT '사원명 ' || e.ename || '의 관리자는 ' || m.ename || '입니다. ' show
FROM emp e, emp m
WHERE e.mgr = m.empno; 

--1. Group 함수 연습 예제:
--   1.1 직업별로 평균 급여를 계산하시오.
--   1.2 각 부서별로 가장 높은 급여를 받는 사람을 찾으시오.
SELECT job, avg(sal)
FROM EMP
GROUP BY job;

SELECT * FROM emp;

SELECT *
FROM EMP e,
(
	SELECT DEPTNO, max(sal) sal
	FROM emp
	GROUP BY deptno
) me
WHERE e.deptno = me.deptno
AND e.sal = me.sal;

--2. Subquery 연습 예제:
--   2.1 급여가 평균 급여보다 많이 받는 사원들의 이름과 급여를 찾으시오.
--   2.2 Smith의 급여보다 많은 급여를 받는 사원들의 이름과 급여를 찾으시오.
SELECT ename, e.sal
FROM EMP e,
(
	SELECT AVG(sal) sal
	FROM emp
) me
WHERE e.sal > me.sal;

SELECT ename, e.sal
FROM EMP e ,
(
	SELECT sal
	FROM emp 
	WHERE ename = 'SMITH'
) me
WHERE e.sal > me.sal;
-- or
SELECT ename, e.sal
FROM EMP e
WHERE e.sal > (SELECT sal FROM emp WHERE ename = 'SMITH');

--3. Outer Join 연습 예제:
--   3.1 사원들의 이름과 부서 이름을 가져오시오. (부서에 할당되지 않은 사원도 포함)
--   3.2 각 부서별로 최대 급여를 받는 사원의 이름을 가져오시오. (부서에 할당되지 않은 사원도 포함)
-- 사원 1000 사원명 null/50
--		null 뿐만 아니라 부서정보에 없는 사원의 부서번호도 포함
-- outer join null이 나올 수 있는 테이블과 컬럼에 (+)를 처리
SELECT e.FIRST_NAME , d.DEPARTMENT_NAME 
FROM EMPLOYEES e, DEPARTMENTS d ;

-- correct
SELECT e.ename, d.dname
FROM emp e, dept d
WHERE e.DEPTNO(+) = d.DEPTNO 
AND sal = (SELECT max(sal) FROM emp WHERE DEPTNO = d.DEPTNO);

-- wrong
SELECT e.first_name, d.DEPARTMENT_NAME, e.SALARY 
FROM EMPLOYEES e, DEPARTMENTS d,
(
	SELECT max(SALARY) SALARY 
	FROM EMPLOYEES
	GROUP BY DEPARTMENT_ID 
) me
WHERE e.SALARY = me.salary;

--4. Group 함수와 Subquery를 조합한 연습 예제:
--   4.1 각 직업별로 최대 급여를 받는 사원의 이름을 가져오시오.
--   4.2 각 부서별로 최소 급여를 받는 사원의 이름을 가져오시오.
SELECT ename, e.sal
FROM EMP e,
(
	SELECT job, max(sal) sal
	FROM emp
	GROUP BY job
) me
WHERE e.JOB = me.job
AND e.sal = me.sal;

SELECT ename, d.DNAME 
FROM EMP e ,
(
	SELECT dname, min(sal) sal
	FROM emp e, dept d
	WHERE e.deptno = d.deptno
	GROUP BY dname
) d
WHERE e.deptno = d.deptno
AND e.sal = d.sal;

SELECT e.ename, d.dname
FROM EMP e , DEPT d 
WHERE e.deptno = d.DEPTNO 
AND sal = (SELECT min(sal) FROM emp WHERE deptno = e.deptno);

SELECT e.ename, e.dname, e.sal
FROM (
	SELECT ename, dname, e.deptno, sal
	FROM emp e, dept d
	WHERE e.deptno = d.DEPTNO 
	) e,
(
	SELECT deptno, min(sal) sal
	FROM emp e
	GROUP BY e.DEPTNO 
) d
WHERE e.deptno = d.deptno
AND e.sal = d.sal;

-- team 문제 풀이---------------------------------------------
--1. Group 함수 연습 예제:
--   1.1 직업별로 평균 급여를 계산하시오.

SELECT job, trunc(avg(sal),0) 평균급여 FROM emp GROUP BY job ORDER BY job;

--   1.2 각 부서별로 가장 높은 급여를 받는 사람을 찾으시오.
SELECT deptno, max(sal) FROM emp GROUP BY deptno ORDER BY deptno;

SELECT deptno, max(sal) 최고급여 FROM emp GROUP BY deptno
ORDER BY  deptno;

--2. Subquery 연습 예제:
SELECT sal 
--   2.1 급여가 평균 급여보다 많이 받는 사원들의 이름과 급여를 찾으시오.
SELECT e.ename, e.sal FROM emp e WHERE e.sal>(SELECT avg(sal) FROM emp);
--   2.2 Smith의 급여보다 많은 급여를 받는 사원들의 이름과 급여를 찾으시오.
SELECT sal FROM emp WHERE ename='SMITH';
SELECT e.ename, e.sal FROM emp e WHERE e.sal>(SELECT sal FROM emp WHERE ename='SMITH');
--   3.1 사원들의 이름과 부서 이름을 가져오시오. (부서7에7777 할당되지 않은 사원도 포함)
SELECT e.ename, d.dname FROM emp e, dept d WHERE e.deptno(+)=d.deptno;
--   3.2 각 부서별로 최대 급여를 받는 사원의 이름을 가져오시오. (부서에 할당되지 않은 사원도 포함)
SELECT deptno, max(sal) FROM emp GROUP BY deptno;
SELECT e.ename, e.deptno,  d.sal FROM emp e, (SELECT deptno, max(sal) sal FROM emp GROUP BY deptno) d WHERE e.DEPTNO =d.deptno
AND e.sal = d.sal ORDER BY deptno;


--4. Group 함수와 Subquery를 조합한 연습 예제:
--   4.1 각 직업별로 최대 급여를 받는 사원의 이름을 가져오시오.
SELECT job, max(sal) FROM emp GROUP BY job ORDER BY job;
SELECT e.ename, e.job, d.sal FROM emp e, (SELECT job, max(sal) sal FROM emp GROUP BY job ORDER BY job) d
WHERE e.sal=d.sal AND e.job=d.job;

--   4.2 각 부서별로 최소 급여를 받는 사원의 이름을 가져오시오.
SELECT deptno, min(sal) FROM emp GROUP BY deptno ORDER BY deptno;
SELECT e.ename, e.deptno, d.sal FROM emp e, (SELECT deptno, min(sal) sal FROM emp GROUP BY deptno ORDER BY deptno) d
WHERE e.sal=d.sal ORDER BY deptno;

--------------------------------------------------------------------

















