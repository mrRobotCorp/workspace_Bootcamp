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









