SELECT instr('sql*plus', '*') sch1,
		INSTR('s*ql*plus*s', '*', 3, 1) sch2,
		INSTR('s*sl*plus*s', '*', 3, 2) sch3,
		INSTR('s*ql*plus*s', '#', 3, 2) sch4 -- 없는 내용은 0 출력
FROM dual;

-- ex) 직책을 검색, MAN 이 있는 데이터를 검색, 
--		해당 위치와 사원명, 직책명, 검색된 위치 출력
SELECT ename, job, INSTR(job, 'MAN') "검색된 위치"
FROM EMP
--WHERE job LIKE '%MAN%';
WHERE INSTR(job, 'MAN') > 0 ;

SELECT LPAD('sql', 5, '*') show1,
		RPAD('sql', 10, '#') show2
FROM dual;

-- 사원명의 최대 크기 확인 후, 고정형으로 모르는 데이터는 *로 추가
SELECT max(LENGTH(ename)) "최대크기"
FROM emp; -- 최대 크기 -> 6

SELECT ename, RPAD(ename, 6, '*') "사원명"
FROM emp;

SELECT LTRIM('****sql****', '*') str1,
		RTRIM('****sql****', '*') str2,
		TRIM('*' FROM '****sql****') str3
FROM dual;

SELECT job, LTRIM(job, 'S') job1
FROM emp;

-- 직책을 기주능로 왼쪽에 S, 오른쪽에 N을 삭제하고 출력
SELECT job, LTRIM(job, 'S') job2,
		RTRIM(job, 'N') job3,
		RTRIM(LTRIM(job, 'S'), 'N') job4 
FROM emp;

-- 1. 'MANAGER' 직책을 검색하되, 해당 직책이 포함된 사원의 이름, 직책, 검색 위치를 출력하세요
SELECT ename, job, INSTR(job, 'MANAGER') "검색 위치"
FROM EMP
WHERE job = 'MANAGER';

--2. 'SALESMAN' 직책을 검색하되, 해당 직책이 포함된 사원의 이름, 직책, 검색 위치를 출력하세요.
SELECT ename, job, INSTR(job, 'SALESMAN' ) "검색 위치"
FROM EMP
WHERE job = 'SALESMAN';

-- 3. 사원명을 10자리로 맞추고, 왼쪽에 '#'를 추가하여 출력하세요.
SELECT LPAD(ename, 10, '#') "사원명"
FROM emp;

-- 4. 직책을 10자리로 맞추고, 오른쪽에 '@'를 추가하여 출력하세요.
SELECT RPAD(job, 10, '@')
FROM emp;

-- 5. ' Hello' 문자열에서 왼쪽에 있는 공백을 제거하여 출력하세요.
SELECT LTRIM(' ' FROM ' Hello')
FROM dual;

-- 6. 'Java Programming ' 문자열에서 오른쪽에 있는 공백을 제거하여 출력하세요.
SELECT RTRIM('Java Programming ', ' ')
FROM dual;

-- 7. ' Hello World ' 문자열에서 양쪽에 있는 공백을 제거하여 출력하세요.
SELECT TRIM(' ' FROM ' Hello World  ')
FROM dual;

-- 8. 'SALESMAN' 직책에서 'ALE'을 추출하여 출력하세요.
SELECT job, INSTR(job, 'ALE') 검색위치,  
	SUBSTR(job, 1, INSTR(job, 'ALE')) AS "추출 결과1",
	SUBSTR(job, INSTR(job, 'ALE') + 3 ) AS "추출 결과2",
	SUBSTR(job, 1, INSTR(job, 'ALE')) ||
	SUBSTR(job, INSTR(job, 'ALE') + 3) AS "추출 결과3"
FROM EMP
WHERE job = 'SALESMAN';

-------------------------------------------------------

-- 1. EMP 테이블에서 사원명(ename)을 대문자로 출력하세요.
SELECT upper(ename)
FROM emp;

-- 2. EMPLOYEES 테이블에서 사원번호(empno)가 100인 데이터의 이메일(email)을 소문자로 출력하세요.
SELECT EMPLOYEE_ID , lower(email)
FROM EMPLOYEES
WHERE EMPLOYEE_ID  = 100;

-- 3. EMP 테이블에서 사원명(ename)과 부서명(deptno)을 연결한 결과를 출력하세요. 결과 컬럼 이름은 "이름/부서"로 지정하세요.
SELECT CONCAT(ename || '/', deptno) "이름/부서번호"
FROM emp;

-- 4. EMP 테이블에서 직원명(ename)과 입사일(hire_date)을 연결한 결과를 출력하세요. 결과 컬럼 이름은 "이름/입사일"로 지정하세요.
SELECT ename, HIREDATE,
	to_char(HIREDATE, 'YYYY/MM/DD') "변경 날짜 형식",
	CONCAT(ename||'/', to_char(HIREDATE, 'YYYY/MM/DD')) "이름/입사일"
FROM EMP;

-- 5. EMP 테이블에서 입사일(hire_date)이 1981년인 데이터의 사원명(ename)과 입사일(hire_date)을 출력하세요.
SELECT ename, hiredate, '' || HIREDATE  입사일2
FROM emp
WHERE HIREDATE LIKE '%81%';
SELECT * FROM emp;

-- 6. EMPLOYEES 테이블에서 사원번호(empno)가 200 또는 300인 데이터의 이메일(email)과 직무(job_id)를 출력하세요.
SELECT email, job_id
FROM EMPLOYEES
--WHERE EMPLOYEE_ID  = 200 OR EMPLOYEE_ID = 300;
WHERE EMPLOYEE_ID  in(200, 300);
-- 컬럼명 in(데이터1, 데이터2, 데이터3) 해당 데이터를 or 기준으로 검색

SELECT * FROM EMPLOYEES ;

-- 7. EMP 테이블에서 직원명(ename)을 출력하되, 이름의 앞뒤에 있는 공백을 제거한 결과를 출력하세요.
SELECT trim(' ' FROM ename)
FROM emp;

-- 8. EMPLOYEES 테이블에서 이메일(email)에 "J"가 포함된 데이터의 사원명(ename)과 이메일(email)을 출력하세요.
SELECT FIRST_NAME, email
FROM EMPLOYEES
--WHERE INSTR(email, 'J') > 0; 
WHERE email LIKE '%J%';














 

