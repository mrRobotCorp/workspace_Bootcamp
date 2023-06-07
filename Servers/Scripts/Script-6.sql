SELECT comm
FROM emp;

-- emp 테이블에서 comm 중 null값을 제외한 데이터들의 갯수
SELECT COUNT(comm) 보너스행갯수
FROM emp;


SELECT max(comm) 최대값, min(comm) 최소값, avg(comm) 평균값
FROM emp;

SELECT deptno, sal
FROM EMP
ORDER BY deptno, sal;

-- 부서별로 sal을 가진 데이터 건수
-- 부서별로 sal을 가진 최대값 데이터
-- 부서별로 sal을 가진 최소값 데이터
-- 부서별로 sal을 가진 평균값 데이터

SELECT deptno, COUNT(sal) 건수, MAX(sal) 최대값, MIN(sal) 최소값
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO ;

-- SELECT 그룹할 컬럼, 함수(통계처리할데이터)
-- from 테이블
-- group by 그룹 할 컬럼명
-- **주의** 그룹 할 컬럼은 하나만 지정해야 함. select 하나만 지정하면 group by 하나만 지정
-- 			통계 처리 할 함수는 여러 개 선언해서 확인하는 것 노상관

SELECT comm
FROM emp;

-- emp 테이블에서 comm 중 null값을 제외한 데이터들의 갯수
SELECT COUNT(comm) 보너스행갯수
FROM emp;


SELECT max(comm) 최대값, min(comm) 최소값, avg(comm) 평균값
FROM emp;

SELECT deptno, sal
FROM EMP
ORDER BY deptno, sal;

-- 부서별로 sal을 가진 데이터 건수
-- 부서별로 sal을 가진 최대값 데이터
-- 부서별로 sal을 가진 최소값 데이터
-- 부서별로 sal을 가진 평균값 데이터

SELECT deptno, COUNT(sal) 건수, MAX(sal) 최대값, MIN(sal) 최소값
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO ;

-- SELECT 그룹할 컬럼, 함수(통계처리할데이터)
-- from 테이블
-- group by 그룹 할 컬럼명
-- **주의** 그룹 할 컬럼은 하나만 지정해야 함. select 하나만 지정하면 group by 하나만 지정
-- 			통계 처리 할 함수는 여러 개 선언해서 확인하는 것 노상관


-- ex) 사원 정보에서 부서별로 평균 급여를 확인
-- avg(sal) 평균 급여, round(데이터, 1) 소숫점 한 자리 반올림 처리
SELECT deptno, ROUND( AVG(sal), 1) 평균급여 
FROM EMP
GROUP BY deptno
ORDER BY deptno; -- 정렬 처리

SELECT * FROM emp;

-- ex) 직책별 가장 먼저 입사한 입사일을 직책 A, B, C 순으로 정렬해서 출력
SELECT job 직책, MIN(HIREDATE) 이전입사일,
		max(HIREDATE) 최근입사일
FROM emp
GROUP BY job
ORDER BY job;

SELECT * FROM EMPLOYEES;

-- ex) manager_id(관리자)별로 최고 급여(salary)를
-- 		관리자id별로 정룔해서 출력

SELECT MANAGER_ID, SALARY  FROM EMPLOYEES e ;

-- 그룹화된 데이터 중, 관리자를 기준으로 검색할 때와 그룹된 최고 급여를 기준으로 검색

/*
주의 사항 - where 조건문, 테이블의 데이터를 기준으로 조건을 비교/처리
SELECT MANAGER_ID 관리자, MAX(SALARY) 최고급여
FROM EMPLOYEES
GROUP BY MANAGER_ID
ORDER BY MANAGER_ID;

max(salary)의 경우 employees에는 salary 정보만 있기에 이것을 따로 검색 조건으로 처리하는데
group by 밑에 having이라는 키워드에 조건문으로 검색 처리해야 함
*/
SELECT MANAGER_ID 관리자, MAX(SALARY) 최고급여
FROM EMPLOYEES 
WHERE MANAGER_ID >=130
GROUP BY MANAGER_ID
HAVING MAX(SALARY) >= 11000 
ORDER BY MANAGER_ID;

SELECT * FROM emp e ;

-- ex) 부서 번호 별로 최고급여를 출력, 부서번호는 10, 20만 
-- 		최고 급여는 4000이상 데이터를 검색
SELECT deptno 부서번호, max(sal) 최고급여
FROM emp
WHERE  deptno in(10, 20)
GROUP BY DEPTNO
HAVING max(SAL) >= 4000
ORDER BY DEPTNO;


















