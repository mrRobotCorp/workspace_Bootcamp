SELECT *
FROM  dept01 
WHERE dname LIKE '%' || '' || '%';

-- 1. 입력 값에 따라서 검색되는 데이터가 다른 처리
-- 2. 매개변수 : 사원명(ename) 

SELECT sal
FROM emp02 e
WHERE empno = 7499;

SELECT * FROM emp02;

-- 해당 부서의 사원 수
SELECT COUNT(*) cnt -- 그룹 함수로 데이터의 건수
FROM EMP02
WHERE deptno = 10;