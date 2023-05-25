SELECT round(23423.277, 3) d1, -- 23423.277
	 round(23423.277, 1) d2, -- 23423.3
	 round(23423.277, -1) d3, -- 23420
	 round(23423.277, -3) d4, -- 23000
	 round(23423.277, 1) d5, -- 23423.3
	 round(23423.277, -1) d6,
	 CEIL(23423.277) d7,
	 FLOOR(23423.277) d8 -- 23423
 FROM dual;

-- ex) 급여를 100단위로 반올림처리, 급여 + 보너스를 1000단위로 절삭처리 후 출력
SELECT ename, sal
FROM emp;

SELECT ROUND(sal, -2) 급여,
		TRUNC(sal + nvl(comm, 0), -3) "급여 + 보너스"
FROM emp;
-- sal + nvl(comm, 0) : comm이 null이면 합산값은  null이기에 이를
-- 방지하기 위해 null 값을 0으로 처리하여 사용. 위 내용은 nvl과 trunc 중첩하여 사용

-- ex) 급여를 1/13으로 나누어 소숫점 2자리에서 절삭 출력, 정수형 올림 처리로 출력
SELECT TRUNC((sal/13), 2) "급여",
		CEIL(sal/13) "정수형"
FROM emp;

SELECT MOD(10, 3) d1, -- 1
		mod(11, 2) d2, -- 1
		mod(10, 2) d3 -- 0
FROM dual;

-- ex) 사번이 짝수인 사원번호와 사원명을 출력, 짝홀 구분자로 0/1 도출하여 출력
SELECT empno, ename
FROM emp
WHERE MOD(empno, 2) = 0;

SELECT empno, ename, MOD(empno, 2) "짝홀"
FROM emp;







		