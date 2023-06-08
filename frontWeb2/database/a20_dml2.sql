SELECT * FROM emp03;

UPDATE emp03
	SET ename = 'Anne',
	mgr = 7902,
	sal = 5500,
	comm = 1000,
	hiredate = sysdate
WHERE empno = 7369;

-- ex) emp02에서 comm이 null인 데이터를 comm -> 1000으로 수정
UPDATE emp02
SET comm = 1000
WHERE comm is NULL;

-- ex) emp02에서 입사연도가 1/4분기인 사원 정보는 현재 날짜로 수정
UPDATE emp02
SET HIREDATE = sysdate
WHERE to_char(HIREDATE , 'Q') = 1;

SELECT * FROM emp02;
-- ex) emp02에서 1980/1981 인 입사자는 40년을 더해서 입사날짜 변경, sal + 2000
UPDATE emp02
SET HIREDATE = ADD_MONTHS(HIREDATE, 12*40) ,
	sal = sal + 2000
WHERE TO_CHAR(HIREDATE, 'YY') IN('80', '81');

SELECT * FROM emp03;

-- 부서정보가 10인 사원의 급여를 부서번호가 20인 사원의 최고급여로 급여를 수정 처리하는 경우
-- 어떻게 update 구문을 처리하는가
SELECT ename, sal
FROM emp03
WHERE deptno = 10;

SELECT max(sal) sal
FROM emp03
WHERE deptno = 20;

UPDATE emp03
SET sal = (
	SELECT max(sal)
	FROM emp03
	WHERE deptno = 20
)
WHERE deptno = 10;

-- ex) job이 SALESMAN인 사원의 평균 급여를 사원번호 7499의 급여로 수정
UPDATE emp03
SET sal = (
	SELECT floor(avg(sal))
	FROM emp03
	WHERE job = 'SALESMAN'
)
WHERE EMPNO = 7499;

-- ex) 1분기 사원의 최고 급여를 사원명 ALLEN의 급여로 변경
UPDATE EMP03
SET sal = (
	SELECT max(sal)
	FROM emp03
	WHERE TO_CHAR(HIREDATE, 'Q') = 1 
)
WHERE ename = 'ALLEN';

SELECT * FROM emp03;

-- 대상이 되는 2개 이상의 컬럼을 한꺼번에 변경 처리하는 수정
-- 1. 대상이 되는 subquery 작성(sql)
-- 2. update subquery로 처리
SELECT *
FROM emp03;


-- 부서번호가 30번의 최고 급여
SELECT deptno, max(sal)
FROM emp03
WHERE DEPTNO = 30
GROUP BY deptno;

-- 부서가 20인 사원정보에 부서번호와 급여를 수정
SELECT deptno, sal
FROM emp03
WHERE deptno = 20;

UPDATE EMP03 
SET (deptno, sal) = (
	SELECT deptno, max(sal)
	FROM emp03
	WHERE DEPTNO = 30
	GROUP BY deptno
)
WHERE deptno = 20;

SELECT * FROM emp03
WHERE DEPTNO = 30;

-- sal이 3000 미만인 데이터를 삭제
DELETE
FROM EMP03
WHERE sal < 3000;

SELECT * FROM EMP03 e ;

-- ex) 입사일이 2분기 데이터 삭제 
DELETE FROM emp03
WHERE TO_CHAR(HIREDATE, 'Q') = 2; 

SELECT * FROM emp03
WHERE TO_CHAR(HIREDATE, 'Q') = 2

CREATE TABLE emp09
AS SELECT * FROM emp;

SELECT * FROM emp09;

-- 여러 개의 row 데이터를 검색 처리하는 subquery
-- 급여가 2000 이상인 사원 번호
-- 사원 정보를 처리
SELECT empno, sal
FROM emp09
WHERE sal >= 2000;

SELECT * FROM emp09
WHERE empno in(
	SELECT empno
	FROM emp09
	WHERE sal >= 2000
);

-- 부서 별 최고급여 사원의 부서번호와 급여만 출력
SELECT deptno, max(sal)
FROM emp09
GROUP BY deptno;
-- 부서 별 최고급여 사원의 전체 정보
SELECT *
FROM emp09
WHERE (deptno, sal) IN (
	SELECT deptno, max(sal)
	FROM emp09
	GROUP BY deptno
);

-- ex) 직책 별 최근 입사자들의 정보 출력

SELECT *
FROM emp09
WHERE (job, hiredate) IN (
	SELECT job, max(hiredate)
	FROM emp09
	GROUP BY job
);

-- ex) 직책 별 최저 급여인 사원 정보 출력
 SELECT *
 FROM emp09
 WHERE (job, sal) IN (
 	SELECT job, min(sal)
 	FROM emp09
 	GROUP BY job
 );
















