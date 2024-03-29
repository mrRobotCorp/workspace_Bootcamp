SELECT * FROM emp;
SELECT deptno, ename, sal -- 열단위 선택 - 컬럼단위로 열을 선택
FROM EMP 
WHERE sal >= 3000; -- 행단위 필터링 - sal이 3000이상인 경우만 검색
-- group 함수 처리
SELECT deptno, sal
FROM EMP
ORDER BY DEPTNO; -- order by 컬럼명. 특정 컬럼 기준으로 정렬. DEPTNO에 따라 오름차순 정렬.

SELECT deptno, 
			MIN(sal) msal, MAX(sal) mxsal, avg(sal) msal -- 그룹할 컬럼, 함수명 (컬럼명) deptno를 기준으로 sal의 최대값(max), 최소값(min), 평균값(avg)
FROM EMP
GROUP BY deptno;

-- ex) order by 컬럼명 desc|asc 정렬 기준 처리
SELECT ename, sal
FROM EMP
ORDER BY sal;

SELECT ename AS name, sal salary, DEPTNO 부서번호,
		EMPNO "사원 번호", JOB "직책 번호", sal "#급여@" -- 해당 컬럼 큰 따옴표 안 내용으로 정의되어 출력
FROM EMP;

-- ex) empno -> no, ename -> 사 원 명, mgr -> 관리자번호 로 표현하여 컬럼 출력
SELECT empno "no", ename "사 원 명", mgr "관리자번호"
FROM EMP;

SELECT sal, sal * 2 "2배수", sal/100 "100나누기"
FROM emp;

SELECT ename || '/' || job "이름과 직책" 
FROM emp;

-- ex) 사원의 이름은 ### 입니다. 처리하세요....
SELECT ENAME, '사원의 이름은 ' || ename || '입니다' msg
FROM EMP;

SELECT a.*, sal + bonus
FROM (
	SELECT ename, sal, sal * 0.2 bonus
	FROM EMP	
) a; -- sunbuery 활용

SELECT ename, sal, sal * 0.2 "보너스(급여의 20%)"
FROM EMP;

-- ex) 사원의 이름은 @@@ 이고, 급여와 보너스 (급여의 15%)의 합산은 @@@만원이다.
SELECT ename, sal, '사원의 이름은 ' || ename || '이고, 급여와 보너스 합산은 ' || (sal + sal*0.15) || '만원이다' msg
FROM emp;

-- 문자열 안에 연산을 처리할 때는 ()로 우선 연산을 처리해서 사용.

SELECT deptno FROM emp;
-- 중복되는 데이터를 제거하고 출력 할 때 사용되는 distinct
SELECT DISTINCT deptno FROM emp; 
SELECT * FROM emp;

-- job과 mgr 각각 중복 데이터를 제거한 데이터 내용 리스트 출력
SELECT DISTINCT job FROM emp;
SELECT DISTINCT mgr FROM emp;

-- distinct 컬럼1, 컬럼2
-- 컬럼1과 컬럼2 두 개 모두 비교해서 다른 데이터 로딩
SELECT DISTINCT job, mgr 
FROM emp
ORDER BY job, MGR;

















