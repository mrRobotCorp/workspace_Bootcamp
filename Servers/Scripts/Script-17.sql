CREATE TABLE emp10
AS SELECT empno, ename, job, sal FROM emp;

SELECT * FROM emp10;

ALTER TABLE emp10
ADD address varchar2(50) DEFAULT '주소없음';

-- ex) emp11 로 부서명, 사원명, 직책, 급여로 복사테이블 생성
--		bonus 컬럼 추가하고 default 값으로 0 입력 처리
CREATE TABLE EMP12 
AS SELECT d.dname, e.ename, e.job, e.sal
FROM EMP e , DEPT d;

SELECT * FROM emp12;

ALTER TABLE emp12
ADD bonus NUMBER(20) DEFAULT 0 CHECK (bonus >= 0);

UPDATE emp12
	SET bonus = -1
	WHERE bonus = 0;
	
DROP TABLE emp12;

ALTER TABLE emp11 drop COLUMN job;
SELECT * FROM emp11;

ALTER TABLE emp11
MODIFY ename varchar2(1000);

-- 주의. 컬럼 수정 시, 저장된 데이터 보다 작은 유형/다른 데이터 타입으론 수정 불가능.
ALTER TABLE EMP11 MODIFY ename NUMBER; -- 불가능

ALTER TABLE emp11 RENAME TO emp13;
SELECT * FROM emp13;

/*
	ex) emp14을 emp 테이블 기준으로 복사. 
	1. 부서 번호 추가, ename -> empname 컬럼명 변경
		job -> varchar(100) 변경, 
		deptno를 dept 테이블의 foreign key 제약조건 설정
		comm 컬럼 삭제
*/
CREATE TABLE emp14
AS SELECT * FROM emp;

SELECT * FROM emp14;

ALTER TABLE emp14
MODIFY deptno REFERENCES dept(deptno);

ALTER TABLE emp14
MODIFY job varchar2(100);

ALTER TABLE emp14
ADD CONSTRAINT emp14_empno_pk PRIMARY KEY (empno);

ALTER TABLE emp14
DROP COLUMN comm;

SELECT *
FROM sys.all_constraints
WHERE table_name LIKE 'emp14';












