SELECT * FROM emp;
SELECT deptno, ename, sal -- 열단위 선택 - 컬럼단위로 열을 선택
FROM EMP 
WHERE sal >= 3000; -- 행단위 필터링 - sal이 3000이상인 경우만 검색
-- group 함수 처리
SELECT deptno, sal
FROM EMP
ORDER BY DEPTNO; -- order by 컬럼명. 특정 컬럼 기준으로 정렬. DEPTNO에 따라 오름차순 정렬.

SELECT deptno, avg(sal) msal -- 그룹할 컬럼, 함수명 (컬럼명) deptno를 기준으로 sal의 최대값(max), 최소값(min), 평균값(avg)
FROM EMP
GROUP BY deptno;

-- ex) order by 컬럼명 desc|asc 정렬 기준 처리
SELECT ename, sal
FROM EMP
ORDER BY sal;

SELECT ename AS name, sal salary, DEPTNO 부서번호,
		EMPNO "사원 번호", JOB "직책 번호" -- 해당 컬럼 큰 따옴표 안 내용으로 정의되어 출력
FROM EMP;






