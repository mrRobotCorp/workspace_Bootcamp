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
SELECT FIRST_NAME, to_char(HIRE_DATE + 120, 'YYYY/MM/DD') "인턴기간",
		to_char(HIRE_DATE - 8, 'YYYY/MM/DD') "8일 전..", 
		SYSDATE - HIRE_DATE "근무일 수"
FROM EMPLOYEES;






		