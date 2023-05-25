SELECT * FROM EMP
WHERE sal >= '2000';

SELECT ''|| HIREDATE, e.* 
FROM EMP e
WHERE HIREDATE LIKE '81%';

SELECT to_char(SYSDATE, 'CC') "세기" FROM dual; -- 21
SELECT to_char(SYSDATE, 'YYYY') "연도1" FROM dual; -- 2023
SELECT to_char(SYSDATE, 'YYY') "연도2" FROM dual; -- 023
SELECT to_char(SYSDATE, 'YY') "연도3" FROM dual; --23
SELECT to_char(SYSDATE, 'Q') "분기" FROM dual; -- 21
SELECT to_char(SYSDATE, 'MM') "월" FROM dual; -- 2023
SELECT to_char(SYSDATE, 'DD') "일" FROM dual; -- 023
SELECT to_char(SYSDATE, 'YYYY/MM/DD') "날짜" FROM dual; --23
SELECT to_char(SYSDATE, 'YYYY"년 "MM"월 "DD"일 "') "날짜" FROM dual; --23

-- ex) 사원명과 입사분기를 표기해서 출력, 1/4, 2/4분기 입사한 회원만 조회
SELECT ename, TO_CHAR(hiredate, 'Q')
FROM emp
--WHERE TO_CHAR(hiredate, 'Q') = 1 OR TO_CHAR(hiredate, 'Q') = 2;
WHERE TO_CHAR(hiredate, 'Q') IN('1', '2');

-- ex) 사원명은 @@년 @@월 @@일에 @@/4분기에 입사 <- 이 형식으로 출력
SELECT ename,
--		|| TO_CHAR(hiredate, 'YY') || '년 '
--		|| TO_CHAR(hiredate, 'MM') || '월 '
--		|| TO_CHAR(hiredate, 'DD') || '일 '
--		|| TO_CHAR(hiredate, 'Q') || '/4분기에 입사함' "설명"
		to_char(hiredate, 'YY"년 "MM "월 " DD "일 "Q "/4분기" ') || '에 입사 ' "설명"
FROM emp;

SELECT SYSDATE, TO_CHAR(SYSDATE, 'AM HH:MI:SS') -- 오후 03:28:53
FROM dual;
SELECT SYSDATE, TO_CHAR(SYSDATE, 'AM HH24"시 "MI"분 "SS"초"') -- 오후 15시29분36초
FROM dual;

-- ex) dual 이용해서 현재 연도/날짜 24시:분:초를 다 출력
SELECT TO_CHAR(SYSDATE, 'YYYY"/"MM"/"DD " "AM HH24"시"MI"분"SS"초"') "날짜/시간"
FROM dual;

-- 1. `EMP` 테이블에서 `SAL`이 2000 이상인 직원의 `ENAME`와 `SAL`을 출력하세요.
SELECT ename, sal
FROM emp
WHERE sal >= 2000;

-- 2. `EMP` 테이블에서 `HIREDATE`가 1981년에 해당하는 직원의 `ENAME`와 `HIREDATE`를 출력하세요.
SELECT ename, hiredate
FROM emp
WHERE INSTR(HIREDATE, 81) > 0 ; 

-- 3. 현재일짜 날짜로부터 100일 후의 날짜를 'YYYY-MM-DD' 형식으로 출력하세요.
SELECT TO_CHAR((SYSDATE + 100), 'YYYY"-"MM"-"DD')
FROM dual;

-- 4. `EMP` 테이블에서 `ENAME`이 'SMITH'인 직원의 입사일(`HIREDATE`)을 'YYYY년 MM월 DD일' 형식으로 출력하세요.
SELECT TO_CHAR(hiredate, 'YYYY"년 "MM"월 "DD"일"')
FROM EMP
WHERE ename = 'SMITH';

-- 5. `EMP` 테이블에서 `SAL`이 3000 이상인 직원의 `ENAME`, `SAL`, `HIREDATE`를 출력하되, `HIREDATE`는 'YYYY년 Q분기' 형식으로 출력하세요.
SELECT ename, sal,
		TO_CHAR(hiredate, 'YYYY"년 "Q"분기"' )
FROM EMP
WHERE sal >= 3000;

-- 6. `EMP` 테이블에서 모든 직원의 `ENAME`, `SAL`, `HIREDATE`를 출력하되, `HIREDATE`는 'YY년 MM월 DD일에 Q/4분기' 형식으로 출력하세요.
SELECT ename, sal,
		TO_CHAR(hiredate, 'YY"년 "MM"월 "DD"일에 "Q"/4분기"') 
FROM emp;

-- 7. `EMP` 테이블에서 `ENAME`이 'ALLEN'인 직원의 `ENAME`, `SAL`, `HIREDATE`를 출력하되, `HIREDATE`는 'HH24시 MI분 SS초' 형식으로 출력하세요.
SELECT ename, sal,
		TO_CHAR(hiredate, 'HH24"시 "MI"분 "SS"초"')
FROM emp;

-- 8. `EMP` 테이블에서 `ENAME`이 'KING'인 직원의 `ENAME`, `SAL`, `HIREDATE`를 출력하되, `HIREDATE`는 'DD일 DAY YYYY년 Q/4분기' 형식으로 출력하세요.
SELECT ename, sal,
	TO_CHAR(hiredate, 'DD"일 "DAY YYYY"년 "Q"/4분기"') 
FROM emp;

-- 9. 현재 시간을 'HH24시 MI분 SS초' 형식으로 출력하세요.
SELECT TO_CHAR(SYSDATE, 'HH24"시 "MI"분 "SS"초 "')
FROM dual;

-- 10. `EMP` 테이블에서 모든 직원의 `ENAME`, `SAL`, `HIREDATE`를 출력하되, `HIREDATE`는 'YYYY년 MM월 DD일 A.M./P.M.' 형식으로 출력하세요.
SELECT ename, sal,
		TO_CHAR(hiredate, 'YYYY"년 "MM"월 "DD"일 "AM') 
FROM emp;









