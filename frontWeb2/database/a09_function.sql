-- 문자함수 : 문자 데이터를 입력하여 문자나 숫자를 결과로 반환하는 함수
SELECT ename, INITCAP(ename), job, INITCAP(job)  
FROM emp;

-- ex) || 연결연산자, initcap()을 활용하여 사원명은 직책명 중에 하나이다.
-- Smith is a Clerk <- 이 형식으로 표현
SELECT INITCAP(ename) || 'is a ' || INITCAP(job) || '!' msg
FROM emp;

SELECT ename, LOWER(ename) "사원명(소문자)",
		JOB  || UPPER('- hello friend') "조합(대문자)" 
FROM EMP;

SELECT first_name || ' ' || LAST_NAME "전체 이름1",
		UPPER( FIRST_NAME || ' ' || LAST_NAME ) "전체 이름2" 
FROM EMPLOYEES;

-- ex) job_id는 소문자,  email은 소문자, first_name은 대문자로 변환하여 
-- 		직책 ##인 @@@의 이메일은 &&& 입니다. <- 형식으로 출력
SELECT '직책' || LOWER(job_id) || '인 ' || UPPER(first_name) || '의 이메일은 '
		|| LOWER(EMAIL) || '입니다.' 	"result"
FROM EMPLOYEES;