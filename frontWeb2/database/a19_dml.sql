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

INSERT INTO dept03 VALUES (50, 'IT', null);







