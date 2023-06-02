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
SELECT empno, ename, DECODE(empno, MOD(empno,2)=0, '홍팀',
									MOD(empno,2)=1, '청팀', '') "사원번호"
FROM emp;

-- ex) 사원의 직책(job)이 SALESMAN이면 보너스(comm)이 null이 아닌 경우에는
-- 영업직, 그 외는 비영업직이라는 영업직 여부를 사원번호, 사원명, 직책, 보너스, 영업직 여부 출력







		