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




 

