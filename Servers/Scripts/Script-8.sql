SELECT * FROM dept;
SELECT * FROM emp02;
CREATE TABLE dept01
AS SELECT * FROM dept;
SELECT  * FROM dept01;

-- first_name 과 last_name을 합쳐서 키워드 검색
-- salary 범위 정해서 검색 처리
SELECT * FROM EMPLOYEES 
WHERE FIRST_NAME  || LAST_NAME  LIKE '%' || 'A' || '%'
AND SALARY BETWEEN 0 AND 12000;

SELECT *
FROM JOB_HISTORY
WHERE JOB_ID LIKE '%' || 'A' || '%'
AND DEPARTMENT_ID BETWEEN 10 AND 120;

SELECT *
FROM JOBS
WHERE JOB_TITLE LIKE '%' || 'S' || '%'
AND MIN_SALARY BETWEEN 1000 AND 10000;


SELECT * FROM emp02;

-- sysdate : 현재 날짜/시간
-- 전체 컬럼데이터 입력
INSERT INTO emp02 VALUES(1000, 'Amy', '사원', 7902, sysdate, 4000, 1000, 10 );

-- 특정 컬럼데이터 입력
-- 테이블명(컬럼명1, 컬럼명2, ...)
-- 날짜로변경('입력 할 문자열', '입력 할 문자열의 형식')
SELECT to_date('2020-01-01', 'YYYY-MM-DD') FROM dual;
INSERT INTO emp02(empno, ename, hiredate, sal)
	values(1002, 'Joe', to_date('2020-01-01', 'YYYY-MM-DD', 3500);

SELECT * FROM emp02 ORDER BY empno ASC;


-- ex) 1003 사원번호로 전체 데이터 입력
INSERT INTO EMP02 values(1003, 'Sam', 'manager', 7900, sysdate, 3500, 300, 10);

-- ex) 1004 2023-06=01, 'oh'를 입력
INSERT INTO emp02(empno,ename, hiredate)
	values(1004, 'Kate', to_date('2023-06-01', 'YYYY-MM-DD'));

/*
INSERT INTO EMP02 values(?, ?, ?, ?, to_date(?, 'YYYY-MM-DD'), ?, ?, ?);
입력 Vo, MAP, 배열
*/

SELECT * FROM emp02 ORDER BY EMPNO ;

SELECT * FROM DEPARTMENTS;

CREATE TABLE DEPARTMENTS10
AS SELECT * FROM DEPARTMENTS;

SELECT * FROM DEPARTMENTS10;
/*
private int d_id;
private String d_name;
private int manager_id;
private double loc_id;
*/
--INSERT INTO DEPARTMENTS10 values(?, ?, ?, ?);

SELECT * FROM DEPARTMENTS10
ORDER BY department_id asc;

UPDATE emp02
	SET ENAME = 'Kevin(upt)',
		job = '사원',
		sal = 4000,
		HIREDATE = to_date('2023/05/01', 'YYYY/MM/DD')
	WHERE empno = 7369;

/*

UPDATE emp02
	SET ENAME = 'James(upt)',
		job = '대리',
		sal = 5900,
		HIREDATE = to_date(?, 'YYYY/MM/DD')
	WHERE empno = 7369;
**/

SELECT * FROM EMP02 e ;

CREATE TABLE LOCATIONS10
AS SELECT * FROM LOCATIONS;

SELECT * FROM LOCATIONS10;

UPDATE LOCATIONS10
	SET street_address = '종로 1가', 
		postal_code = '456789',
		city = 'seoul',
		state_province = 'guro',
		country_id = 'SE'
	WHERE location_id = 1000;

/*
UPDATE LOCATIONS10
	SET street_address = '종로 1가', 
		postal_code = '456789',
		city = 'seoul',
		state_province = 'guro',
		country_id = 'SE'
	WHERE location_id = 1000;

*/


