-- 문자함수 : 문자 데이터를 입력하여 문자나 숫자를 결과로 반환하는 함수
SELECT ename, INITCAP(ename), job, INITCAP(job)  
FROM emp;

-- ex) || 연결연산자, initcap()을 활용하여 사원명은 직책명 중에 하나이다.
-- Smith is a Clerk <- 이 형식으로 표현
SELECT INITCAP(ename) || 'is a ' || INITCAP(job) || '!' msg
FROM emp;