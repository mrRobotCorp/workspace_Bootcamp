-- 숫자형 데이터 비교
SELECT *
FROM EMP 
WHERE EMPNO  = 7369;

-- 문자형 데이터 비교
SELECT *
FROM EMP 
WHERE job = 'SALESMAN';

-- ex) mgr이 7839인 데이터와 deptno가 10, job이 'clerK'인 데이터 각각 출력
SELECT *
FROM EMP
WHERE mgr = 7839;

SELECT *
FROM EMP
WHERE DEPTNO = 10;

SELECT *
FROM EMP
WHERE job = 'CLERK';

-- 부서 번호 deptno가 10번이고 직책이 job인 clerk인 경우 사원 정보 출력
SELECT * FROM emp
WHERE deptno = 10
AND job = 'CLERK';

-- 급여 (sal)가 2000이상이고, 직책 (job)이 MANAGER인 데이터 출력
SELECT * FROM EMP
WHERE sal >= 2000
AND job = 'MANAGER';

-- ex) 사원명이 JONES, BLAKE 데이터 출력
SELECT * FROM EMP
WHERE ename = 'JONES' OR ename = 'BLAKE';

-- 부서번호 deptno 가 30이거나 급여가 sal 20000미만인 데이터 출력
SELECT * FROM emp
WHERE deptno = 30 OR sal < 2000;

SELECT  ename, comm
FROM emp
WHERE comm = NULL; -- 'null' 검색

SELECT  ename, comm
FROM emp
WHERE comm IS NOT NULL ; -- NULL이 아닌 데이터를 검색

SELECT  ename, comm
FROM emp
WHERE comm != NULL; -- X

-- ex) mgr이 null인 데이터와 null이 아닌 데이터를 나누어서 검색
-- 		단 컬럼명으로 empno(사원번호), mgr(관리자)번호를 출력
SELECT  EMPNO "사원번호", mgr "관리자"
FROM emp
WHERE MGR is NULL;

SELECT  EMPNO "사원번호", mgr "관리자"
FROM emp
WHERE MGR IS not NULL;

-- 부서번호가 20번이 아닌 데이터를 검색
SELECT deptno, ename
FROM emp
WHERE deptno != 20;

SELECT deptno, ename
FROM emp
WHERE not(deptno = 20);

-- ex) 부서번호가 10이거나 20번인 경우와 그렇지 않은 경우를 출력
SELECT *
FROM emp
WHERE deptno = 10 OR DEPTNO = 20;

SELECT *
FROM emp
--WHERE deptno != 10 AND DEPTNO != 20;
WHERE NOT(deptno = 10 OR DEPTNO = 20);

SELECT *
FROM emp
WHERE deptno <> 10 AND DEPTNO != 20;

-- sal가 1000에서 2000사이에 있는 사원명과 급여명
SELECT ename, sal
FROM emp
WHERE sal BETWEEN 1000 AND 2000;

-- ex) 사원번호가 7600에서 7900사이에 있는 경우와 그렇지 않은 경우
SELECT EMPNO 
FROM emp
WHERE EMPNO BETWEEN 7600 AND 7900;

SELECT EMPNO -- 방법1
FROM emp
WHERE NOT(EMPNO BETWEEN 7600 AND 7900);

SELECT * -- 방법2
FROM emp
WHERE empno < 7600 OR EMPNO > 7900;










