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



