SELECT mgr, comm
FROM EMP;

-- 사원정보에서 급여 + 보너스 합산하여 출력
-- null 포함되어 있을 땐 + 연산자 처리는 null
SELECT ename, sal, comm, sal + comm
FROM EMP;

-- nvl(컬럼, 대체데이터) : 해당 컬럼이 null 값일 때 컬럼과 같은 유형의 데이터를 지정. 지정된 데이터로 null 대신 처리
SELECT comm, nvl(comm, 0)
FROM emp;

-- 대체 데이터가 해당 컬럼과 다른 유형이면 에러 발생
SELECT comm, nvl(comm, ' ')
FROM emp;

-- 기존 emp와 동일한 데이터로 table 새로 생성
CREATE TABLE emp01
AS SELECT * FROM EMP;

INSERT INTO emp01(empno) VALUES(8000);
INSERT INTO emp01(empno) VALUES(8001);
INSERT INTO emp01(empno) VALUES(8002);

-- 사원 이름(문자 데이터)가 null 일 때 대체 데이터로 문자 공백 삽입
SELECT empno, nvl(ename, '이름없음') 이름,
		nvl(job, '0') 직책 -- 숫자는 자동 casting 되어 '0' 처리
FROM emp01
WHERE ename IS NULL;

-- ex) employees 기준으로 last name과 salary, commisstion_pct 기준으로 보너스 출력
-- 		사원명, 급여, 보너스(%), 보너스, 급여+보너스 처리 (nvl 활용)
SELECT LAST_NAME 사원명, SALARY 급여, nvl(COMMISSION_PCT, 0)* 100 "보너스(%)",
		nvl(SALARY  * COMMISSION_PCT, 0) 보너스,
		SALARY + nvl(SALARY  * COMMISSION_PCT, 0) "급여 + 보너스"
FROM EMPLOYEES e ;

SELECT * FROM emp;

-- 보너스 null이거나 0인 데이터를 제외하고 사원정보에서 급여와 보너스를 확인할 때
SELECT ename, sal, COMM
FROM EMP
WHERE comm IS NOT NULL AND comm != 0;
--WHERE NOT(comm IS NULL OR comm != 0);

-- nvl로 처리한 경우
SELECT ename, sal, comm
FROM EMP
WHERE nvl(comm, 0) != 0; 
-- null도 아니고 0이 아닌 경우 (null일 때는 0으로 대체 시키고 전체에서 0이 아닐 때를 출력하면 null, 0 모두 제외 출력됨)

-- 사원번호 7499, 7521, 7566에 대한 데이터를 가져올 때
SELECT *
FROM emp
WHERE empno = 7499
OR empno = 7521
OR empno = 7566
OR empno = 7654;

-- 컬럼명 in (데이터1, 데이터2, 데이터3, 데이터4)
-- 지정한 데이터가 or조건으로 연결될 때 사용
SELECT *
FROM EMP
WHERE empno IN (7499, 7521, 7566, 7654);

SELECT * FROM EMP
WHERE ename IN ('SMITH', 'ALLEN', 'JONES');

-- ex) 부서번호가 20이거나 30인 경우, 급여가 2000 미만인 데이터를 출력
SELECT *
FROM emp
WHERE DEPTNO IN (20, 30) AND sal < 2000;

SELECT ename, job
FROM EMP
WHERE ename LIKE '%A%' -- A가 포함되어 있는 데이터 검색
AND job LIKE '%MAN'; -- MAN이 끝에 포함되어 있는 데이터

-- 키워드 검색 형식 - 컬럼명 LIKE '%키워드%' : 해당 키워드가 포함되어 있는 데이터 검색
-- 컬럼명 LIKE '키워드%' : 키워드로 시작하는 데이터
-- 컬럼명 LIKE '%키워드' : 키워드로 끝나는 데이터

-- ex) first_name, last_name 검색할 때 
-- 		1) 특정한 키워드 포함되는 경우 처리, 2) first/last_name은 특정한 키워드로 시작하는 데이터 검색 
--		3) first_name에 'er'로 끝나는 데이터 검색
SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE  FIRST_NAME LIKE 'A%';

SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE  FIRST_NAME LIKE '%er';

SELECT *
FROM emp
WHERE ename LIKE '%' || 'A' || '%';

-- ex) a02_memberERD.exerd 생성
-- 		현재 프로젝트의 회원 정보 테이블을 논리적/물리적 모델로 생성할 것
SELECT *
FROM DEPT;












