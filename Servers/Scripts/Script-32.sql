SELECT *
FROM EMP;

SELECT job
FROM EMP e WHERE empno = 7369;

SELECT deptno
FROM EMP e WHERE empno = 7521;

SELECT job
FROM EMP e 
WHERE ename='SMITH';
----------------------------------------------
SELECT sal
FROM EMP e 
WHERE empno = 7844;

SELECT mgr
FROM emp
WHERE ename = 'CLARK';

SELECT * FROM JOB_HISTORY jh  ;

SELECT hiredate
FROM EMP e WHERE empno = 7844;

SELECT *
FROM emp;

SELECT *
FROM DEPT01 d ;

SELECT *
FROM DEPT01;
INSERT INTO DEPT01 values(11, '인사', '서울');

/*
1. student02(sno, name, kor, eng, math)
	입력 처리
	공통에 student Vo 등록
2. 아래 항목과 같이 ename 키워드 검색 sal 시작 마지막 범위로 조회
	mybatis에서 emp 등록
	resultType="emp"
 * */
SELECT *
FROM EMP e WHERE ENAME LIKE '%' || '' || '%'
AND sal BETWEEN 1000 AND 3000;

SELECT *
FROM STUDENT02 s ;

INSERT INTO STUDENT02 s VALUES(11, '파닥몬', 90, 59, 87);


INSERT INTO LOCATIONS10 l 
values(1000, '강남구 역삼동 111', 2433, '서울', '대한민국', 'KR');

SELECT *
FROM EMP e WHERE ename LIKE '%' || '' || '%'
AND sal BETWEEN 1000 and 3000;

SELECT *
FROM EMP
WHERE ename LIKE '%'||'A'||'%'
AND job LIKE '%'||'ER'||'%';

SELECT *
FROM EMP
WHERE job IN ('CLERK', 'MANAGER');

SELECT *
FROM DEPT01 d ;

INSERT INTO dept01 VALUES (21, '회계', '제주');



