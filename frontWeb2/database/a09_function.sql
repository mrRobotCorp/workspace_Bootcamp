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
SELECT '직책 ' || LOWER(job_id) || '인 ' || UPPER(first_name) || '의 이메일은 '
		|| LOWER(EMAIL) || '입니다.' 	"result"
FROM EMPLOYEES;

-- 검색 시, 대소문자 입력 상관없이 검색 처리해야 할 경우
-- ex) first_name이 대소문자 상관없이 키워드 검색 처리
-- 1) 컬럼의 데이터 대문자 or소문자로 한 타입으로 모두 전환
-- 2) 대문자 변환 -> 키워드도 대문자로 변경, 소문자 변환 -> 키워드도 소문자로 변경
SELECT FIRST_NAME, LAST_NAME, EMAIL, JOB_ID,
		upper(FIRST_NAME) 이름1, LOWER(FIRST_NAME) 이름2
FROM EMPLOYEES ;

-- first_name을 대소문자 관계 없이 키워드 검색
SELECT LOWER(FIRST_NAME) 이름,  e.*
FROM EMPLOYEES e
WHERE LOWER(FIRST_NAME) LIKE '%'|| LOWER('steVen')  ||'%';

-- 실제 Dao 처리 시, pstmt 에는 pstmt.setString(1, "%" + emp.getFrist_name() + "%")

SELECT *
FROM EMPLOYEES e;
----------------------------------------------------------
-- email과 job_id이 대소문자 관계없이 검색되게 처리.
SELECT email 이메일, job_id 직책id, e.* -- 추가 컬럼, e.*
FROM EMPLOYEES e
WHERE EMAIL LIKE UPPER('%o%') 
AND LOWER(JOB_ID)  LIKE LOWER('%A%');

SELECT ename, LENGTH(ename) "문자길이", 
		LENGTHB(ename) "byte수",
		job, length(job) "문자길이", 
		LENGTHB(job) "byte수"
FROM EMP02;

SELECT 'KING' name, lengthb('KING') "이름(byte)",
		LENGTH('KING') "이름(글자수)"
FROM dual; 

-- ex) 사원 테이블에서 사원명과 직책의 글자 수를 표현
--		직책의 글자갯수가 6이상인 데이터만 출력
SELECT ename, job
FROM EMP02
WHERE LENGTH(job) >= 6;

SELECT empno, ename, job, concat(ename, job) "이름과 직책"
FROM EMP02;

SELECT substr('sql*plus', 5, 4) "데이터" FROM dual;

-- ex) 사원명과 사원번호를 이어서 표현하거, 직책은 2번쨰부터 3글자 추출 출력
SELECT CONCAT(ename, empno) "사원과 사원번호",
		substr(job, 2, 3) "부분 글자"
FROM EMP02;

SELECT * FROM EMP02;











