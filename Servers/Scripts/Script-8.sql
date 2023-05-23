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

/*

*/






