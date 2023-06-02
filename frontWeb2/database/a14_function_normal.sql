SELECT ename, sal, comm, sal + comm 합산,
		nvl(COMM, 0) 보너스초기, -- null값은 숫자 0으로 변환
		sal + nvl(COMM, 0) 합산2
FROM emp;

SELECT ename, sal, comm, NVL2(comm, comm*1.1, 100) "보너스 * 1.1"
FROM emp;

-- ex) comm이 null일 때는 sal의 15%로 설정, null이 아닐 땐 comm에서 sal의 5%를 더해서
-- 보너스 설정. 결과값을 10단위로 절삭처리
SELECT ename, sal,
		NVL2(comm,  trunc(comm + (sal*0.05), -1), trunc(sal*0.15, -1)) 보너스
FROM emp;


SELECT NULLIF('a', 'a') "동일할 때", -- null
		nullif('a', 'b') "다를 때2", -- a
		NULLIF(15, 20) "다를 때2", -- 15
		nvl(NULLIF('a', 'a'), '동일') "중첩1", -- 동일
		nvl(NULLIF('a', 'b'), '동일') "중첩2" -- a
FROM dual;

-- nvl(nullif(데이터1, 데이터2), 'null일 때')
-- 중첩함수를 이용해서 동일 할 때는 문자열 처리, 다를 때 데이터1처리

SELECT comm FROM emp;

-- ex) comm이 0인 경우엔 null을 반환하고 그렇지 않으면 comm 그대로 출력해서
-- 사원명, 급여, comm을 출력
SELECT ename, sal, comm,
		NULLIF(comm, 0) "보너스 결과"
FROM emp;

-- ex) hiredate와 현재 날짜를 비교하여 hiredate가 현재 날짜와 같은 경우 null
-- 다르면 hiredate 반환
SELECT ename, hiredate,
		NULLIF(hiredate, sysdate) "날짜 비교"
FROM emp;

-- 부서정보가 10(인사), 20(총무) 그외는 부서미정이라고 할 때
SELECT ename, DECODE(deptno, 10, '인사',
							20, '총무',
							'부서미정') dname
FROM emp;

-- ex) 직책을 기준으로 팀 정하기
-- CLERK - 1팀, SALESMAN -2팀, 그외는 3팀
SELECT DISTINCT job
FROM emp;

SELECT ename, DECODE(job, 'CLERK', '1팀',
							'SALESMAN', '2팀',
							'3팀') job 
FROM emp;


-- ex) 사원번호를 기준으로 짝수인 경우 홍팀, 홀수인 경우 청팀으로 처리.
SELECT empno, ename, DECODE( MOD(empno,2), 0, '홍팀',
									1, '청팀') "사원번호"
FROM emp;

-- ex) 사원의 직책(job)이 SALESMAN이면 보너스(comm)이 null이 아닌 경우에는
-- 영업직, 그 외는 비영업직이라는 영업직 여부를 사원번호, 사원명, 직책, 보너스, 영업직 여부 출력
SELECT empno, ename, job, comm,
		DECODE(job, 'SALESMAN', DECODE(comm, NULL, '비영업직', '영업직' ), '비영업직') "result"
FROM emp;

-- ex) 부서번호에 따라서 보너스 적용
SELECT ename, deptno, sal, 
		CASE WHEN deptno = 10 THEN sal * 0.2
			WHEN deptno = 20 THEN sal * 0.5
			WHEN deptno = 30 THEN sal * 0.7
			ELSE sal * 1.2
			END 보너스
FROM emp;

-- ex) job에 따른 보너스 적용 CLERK 5%, PRESIDENT 10%, MANAGER 17%, ANALYST 20%
-- 그외는 0%, 급여 합산 출력
SELECT ename, job, sal,
		CASE WHEN job = 'CLERK' THEN sal + (sal * 0.05)
			WHEN job = 'PRESIDENT' THEN sal + (sal * 0.1)
			WHEN job = 'MANAGER' THEN sal + (sal * 0.17)
			WHEN job = 'ANALYST' THEN sal + (sal * 0.2)
			ELSE sal
		END 보너스포함
FROM emp;

SELECT ename, job, sal, per,
		floor(per*100) || '%' "%",
		FLOOR(sal*per) 보너스 
FROM (
	SELECT ename, job, sal,
			CASE WHEN job = 'CLERK' THEN 0.05
				WHEN job = 'PRESIDENT' THEN 0.1
				WHEN job = 'MANAGER' THEN 0.17
				WHEN job = 'ANALYST' THEN 0.2
				ELSE 0
			END per
FROM emp
);

-- ex) 위 ex1을 switch case문 형태로 변환
SELECT ename, job, sal,
	CASE job WHEN 'CLERK' THEN sal + (sal * 0.05)
			WHEN 'PRESIDENT' THEN sal + (sal * 0.1)
			WHEN 'MANAGER' THEN sal + (sal * 0.17)
			WHEN 'ANALYST' THEN sal + (sal * 0.2)
	ELSE SAL 
	END 보너스포함스위치
FROM emp;
	
FROM emp;
-- ex) sal 5000이상 A, 4000대 B, 3000대 C, 2000대 D, 2000미만 F
-- 급여 등급 출력

SELECT ename, sal,
		CASE WHEN sal >= 5000 THEN 'A'
				WHEN (sal >= 4000 AND sal < 5000) THEN 'B'
				WHEN (sal >= 3000 AND sal < 4000) THEN 'C'
				WHEN (sal >= 2000 AND sal < 3000) THEN 'D'
				WHEN sal < 2000 THEN 'F'
		END 등급
FROM emp;

-- 부서번호에 따른 보너스 처리
SELECT ename, deptno, 
	CASE deptno
		WHEN 10 THEN sal * 0.2
		WHEN 20 THEN sal * 0.5
		WHEN 30 THEN sal * 0.7
		ELSE sal * 1.2
	END 보너스
FROM emp;
		
SELECT sign(-5), -- -1 
		sign(0), -- 0
		sign(7) -- 1
FROM dual;
		
-- 급여가 3000 이상인 경우와 그렇지 않은 경우
SELECT sal, sign(sal - 3000) RESULT
FROM emp;

-- decode 함수와 함께 혼합해서 원하는 데이터 처리
-- ex) decode와 sign을 활용해서 2000이상인 경우와 그렇지 않은 경우를 구분해서
-- 2000미만 - 보너스 대상자, 2000이상 - 보너스 대상자 아님 표시
SELECT ename, sal,
	DECODE( SIGN(sal - 2000), -1, '보너스 대상자',
							1, '보너스 대상자 아님') "보너스 여부"
FROM emp;

SELECT EXTRACT(YEAR FROM sysdate) "이번년도", -- 숫자형이라 2,023 출력
		EXTRACT(Month FROM sysdate) "이번년도", -- 6
		EXTRACT(day FROM sysdate) "이번년도" -- 2
FROM dual;

-- ex) employee의 hire_date를 이용해서 숫자형으로 연도, 월, 일 뽑기
-- sign, decode와 혼합해서 2005년 이후 입사자 여부 출력
SELECT first_name, hire_date,
	extract(YEAR FROM hire_date) "연도",
	extract(MONTH FROM hire_date) "월",
	extract(day FROM hire_date) "일",
	decode(sign(extract(YEAR FROM hire_date) - 2005), -1, '2005이전',
													1, '2005이후',
													0, '2005연도') "입사연도구분"
FROM EMPLOYEES;




		

		