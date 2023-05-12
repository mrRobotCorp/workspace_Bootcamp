SELECT *
FROM EMPLOYEES;

-- 사원번호 empno, 사원명 ename, 직책 job, 관리자 번호 mgr, 입사일 hiredata, 급여 sal
-- 보너스 comm, 부서번호 deptno

-- 급여가 3000이상 2000미만이고 부서명이 30이 아닌 데이터 검색 
SELECT *
FROM emp
WHERE (sal >= 3000 OR SAL < 2000) AND (DEPTNO !=30);

-- 사원명과 관리자 번호 mgr - null인 경우 0으로 출력
SELECT ename, mgr 
FROM EMP
WHERE mgr IS NULL;

-- null 이 아닌 경우만 중복되지 않는 관리자번호를 출력
SELECT DISTINCT MGR 
FROM EMP
WHERE mgr IS NOT NULL;

-- 급여가 2000이상이고 보너스가 null이 아닌 경우를 출력
SELECT *
FROM EMP
WHERE sal >= 2000 AND comm IS NOT NULL;

-- 직책이 salesman이거나 부서번호 20인 경우 사원명, 직책, 부서번호 출력
SELECT ename, job, deptno
FROM EMP
WHERE job = 'SALESMAN' OR deptno = 20;


