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
