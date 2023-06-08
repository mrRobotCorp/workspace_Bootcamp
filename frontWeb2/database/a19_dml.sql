SELECT * FROM EMP03 e ;

CREATE TABLE emp03
AS SELECT * FROM emp;

SELECT max(empno) FROM EMP03 e ;
INSERT INTO EMP03 VALUES (1000, 'Amy', '사원', 7902, sysdate, 4000, 300, 10);

ROLLBACK;
COMMIT;

-- 입력 후 commit rollback 기능 확인
-- ex) 1002, 'Kevin' 입력

INSERT INTO emp03 VALUES (1002, 'Kate', '사원', 7903, sysdate, 3800, 290, 10);
SELECT * FROM EMP03 e ;

INSERT INTO emp03(empno, ename, job, sal) VALUES(1003, 'Tom', '대리', 6000);

-- ex) 사원번호, 이름, 직책, 입사일(2023/01/01 todate 함수), 부서번호 
INSERT INTO EMP03 (empno, ENAME, job, HIREDATE, DEPTNO) 
VALUES (1004, 'James', '과장' ,to_date('2023/01/01', 'YYYY/MM/DD'), 10); 

INSERT INTO emp03 VALUES (1100, 'Chris', NULL, NULL, sysdate, 5000, NULL, 10);

-- ex) dept03 테이블을 복사테이블로 만들고 dname, loc의 컬럼 크기 변경.
--	전체 컬럼 입력 > 지정 컬럼 입력(부서번호 부서명) > null 지정 컬럼 입력
SELECT * FROM dept03;

CREATE TABLE dept03
AS SELECT * from dept;

INSERT INTO dept03 VALUES (50, null, 'BUSAN');
INSERT INTO dept03(deptno, dname) VALUES (60, '재무');
INSERT INTO dept03 VALUES (70, 'IT', 'SEOUL');


CREATE TABLE emp04
AS SELECT * FROM emp WHERE 1=0;
-- WHERE 1=0 : false기 때문에 데이터는 안들어간 동일 구조의 테이블이 만들어짐
SELECT * FROM emp04;

INSERT INTO emp04
SELECT * FROM EMP
WHERE sal BETWEEN 3000 AND 5000;

-- ex) emp05 데이터가 없는 테이블 생성, emp의 부서번호가 10인 사원 정보 입력
CREATE TABLE emp05
AS SELECT * FROM emp WHERE 1=0;

INSERT INTO emp05
SELECT * FROM EMP
WHERE deptno = 10;

SELECT * FROM emp05;

-- empno, ename 총 2개의 컬럼 구조만 생성
CREATE TABLE emp06
AS SELECT empno, ename FROM emp WHERE 1=0;

SELECT * FROM emp06;

-- ex) 부서별 최고 급여를 입력 할 수 있는 부서번호와 급여가 있는 테이블(emp07)을 만들고
--		emp의 부서별 최고 급여 입력
CREATE TABLE emp07
AS SELECT deptno, sal FROM emp WHERE 1=0;
SELECT * from emp07;

INSERT INTO emp07
SELECT e.deptno, e.sal
FROM EMP e,
(
	SELECT deptno, max(sal) sal
	FROM EMP
	GROUP BY deptno
) m
WHERE e.DEPTNO = m.deptno
AND e.sal = m.sal;


-- ex) emp의 복사테이블로 부서별 최고 급여자의 정보가 있는 테이블(emp08) 생성
CREATE TABLE emp08
AS SELECT * FROM emp WHERE 1=0;

SELECT * FROM emp08;
DROP TABLE emp08;

INSERT INTO emp08
SELECT * 
FROM EMP e
WHERE sal = (SELECT max(sal) FROM EMP
				WHERE deptno = e.deptno);
			
------------------------------------------------------
/*




*/
			
CREATE TABLE emp11
AS SELECT * FROM emp;

SELECT * FROM emp11;
--1. 아래의 EMP 테이블에 새로운 사원 데이터를 추가해보세요. 이름은 '최길동', 사원 번호는 2000, 직책은 '과장', 급여는 5000으로 설정하세요. 
INSERT INTO emp11(ename, empno, job, sal) VALUES ('James', 2000, '과장', 5000);

--2. EMP 테이블에서 '최길동'의 급여를 6000으로 수정해보세요. 
UPDATE emp11
SET sal = 6000
WHERE ename = 'James';

--3. EMP 테이블에서 사원 번호가 2000인 사원 정보를 삭제해보세요. 
DELETE 
FROM emp11
WHERE empno = 2000;

--4. EMP 테이블에서 사원들의 급여를 10% 인상하는 SQL 문을 작성해보세요. 
UPDATE emp11
SET sal = sal + (sal *0.1);

--5. 새로운 사원 정보를 추가하고, 바로 롤백하여 원래 상태로 돌리는 SQL 문을 작성해보세요. 
INSERT INTO emp11(ename, empno, job, sal) VALUES ('Kevin', 2000, '과장', 5000);

COMMIT;
ROLLBACK;











