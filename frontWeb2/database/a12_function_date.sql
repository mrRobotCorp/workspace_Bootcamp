SELECT SYSDATE, 
		SYSDATE - 1 "하루 전", 
		SYSDATE + 1 "하루 후",
		SYSDATE + 5/24 "5시간 이후",
		SYSDATE + 30/60/24 "30분 이후",
		SYSDATE + 200/60/24 "200분 이후"
FROM dual;

-- 1일이 24시간이기에 시간 단위까지 계산하면 소숫점 이하가 나타날 수 있음
SELECT (SYSDATE + 5/24) - SYSDATE "이게뭔데"
FROM dual;

-- employees에서 현재일을 기준으로 근무일 수를 계산. 소숫점 이하 처리
SELECT first_name,HIRE_DATE , SYSDATE - hire_date "근무일수",
		FLOOR(SYSDATE - HIRE_DATE) "근무일수(절삭)" ,
		CEIL(SYSDATE - HIRE_DATE) "근무일차(올림)"
FROM EMPLOYEES;

-- ex) 사원명과 함께 인턴기간(입사 후, 120일), 입사 8일 전, 현재일 기준으로 근무일 수 출력
SELECT FIRST_NAME, to_char(HIRE_DATE + 120, 'YYYY/MM/DD') "인턴 막날",
		to_char(HIRE_DATE - 8, 'YYYY/MM/DD') "8일 전..", 
		SYSDATE - HIRE_DATE "근무일 수"
FROM EMPLOYEES;

SELECT ename, hiredate,
		MONTHS_BETWEEN(SYSDATE, hiredate) "근무 개월 수",
		FLOOR(MONTHS_BETWEEN(SYSDATE, hiredate)) "근무 개월 수",
		ceil(MONTHS_BETWEEN(SYSDATE, hiredate)) "근무 개월 차"
FROM emp;

-- 12로 나누면 근무 연한과 근무 연차를 계산
-- ceil, floor 중첩적으로 활용하여 처리할 수 있음

-- ex) dual을 이용하여 오늘로부터 1000일 이후 개월 수 출력
SELECT floor(MONTHS_BETWEEN((sysdate + 1000), SYSDATE) ) "개월 수"
FROM dual;

-- ex) emp 테이블을 ename, hiredate와 위 월단위 함수를 이용해서 ##년 ##개월 근무 <- 출력
SELECT ename, HIREDATE, floor(floor(MONTHS_BETWEEN(SYSDATE , HIREDATE)) / 12) || '년'
		|| MOD(floor(MONTHS_BETWEEN(SYSDATE , HIREDATE)), 12) || '개월 근무' "근무일수"
FROM emp;

-- ex) 오늘로부터 근무하는 것을 기준으로 2000일 이후의 근무연한과 개월 수 출력
-- ## 년 ##개월근무
SELECT floor(floor(MONTHS_BETWEEN(sysdate+2000, SYSDATE)) / 12) || '년 '
	|| MOD(floor(MONTHS_BETWEEN(SYSDATE+2000 , SYSDATE)), 12)  || '개월 근무' "근무일수"
FROM dual;

---------------------------------------------------
SELECT SYSDATE 오늘, ADD_MONTHS(SYSDATE, 4) "4개월 후",
		ADD_MONTHS(SYSDATE, -1) "1개월 전" 
FROM dual;

-- ex) 사원 정보를 기준으로 사원명, 입사일, 인턴기간(3개월)
--		입사 10년 기념일, 입사 20년 기념일, 출력
SELECT ename, hiredate,
		ADD_MONTHS(HIREDATE, 3) "인턴만료일",
		ADD_MONTHS(HIREDATE, 12*10) "입사 10년", 
		ADD_MONTHS(HIREDATE, 12*20) "입사 20년" 
FROM emp;

-- 다가 올 가장 빠른 요일의 날짜 : next_day
-- 오늘 이후 가장 빠른 수요일
SELECT NEXT_DAY(SYSDATE, '수') "가장 빠른 수요일"
FROM dual;

-- ex) 입사 후, 첫 주말(토요일) 날짜 출력
SELECT NEXT_day(hiredate, '토') "첫 주말"
FROM emp;

-- ex) 입사 후 세 번째 되는 일요일의 날짜 출력
SELECT HIREDATE,
		NEXT_DAY(next_day(NEXT_DAY(hiredate, '일'), '일'), '일') "3번째 일요일"
FROM emp;

SELECT LAST_DAY(SYSDATE) "이번 달 마지막 날짜",
		LAST_DAY(SYSDATE) + 1 "다음 달의 첫 날",
		-- 이번 달에서 +1 -1 을 해서 이번 달로 다시 돌아온 후 첫 날로 출력
		ADD_MONTHS(LAST_DAY(SYSDATE) + 1, -1) "이번 달의 첫 날" 
FROM dual;

-- 사원명과 급여일1(그달 종료일 - 10일전), 급여일2 (다음달 10)로 
--	해당 사원의 첫 급여일 1, 2 출력
SELECT ename, HIREDATE,
		LAST_DAY(HIREDATE) - 10 "급여일1",
		add_months(LAST_DAY(HIREDATE) + 10, 1) "보너스일"
FROM emp;























		