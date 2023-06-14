-- 사원 정보의 제약 조건 테이블에서 확인
SELECT *
FROM sys.all_constraints
WHERE table_name LIKE 'EMP';

-- # not null 제약 조건 설정
CREATE TABLE student03(
	name varchar2(30) CONSTRAINTS student03_name_nn NOT NULL
);

SELECT *
FROM sys.all_constraints
WHERE table_name LIKE 'student03';

INSERT INTO student03 values('Amy');
INSERT INTO student03 values('Mark');
INSERT INTO student03 values('Elliot');

SELECT * FROM student03;
INSERT INTO student03 values(null);

-- ex) student04 테이블로 학생번호(숫자), 이름, 국어, 영어, 수학 테이블 생성
-- 		학생 번호, 이름을 not null로 제약조건 설정, 조회
CREATE TABLE student04 (
	stuno NUMBER(30) CONSTRAINTS student04_stuno_nn NOT NULL,
	name varchar2(30) CONSTRAINTS student04_name_nn NOT NULL,
	kor number(30),
	eng number(30) ,
	math NUMBER(30)
);

SELECT *
FROM sys.all_constraints
WHERE table_name LIKE 'student04';

INSERT INTO student04 values(101, 'Kevin', 70, 40, 65);
INSERT INTO student04 values(102, 'Dalyne', 88, 60, 97);
INSERT INTO student04 values(103, 'Jake', 83, 36, 63);

SELECT * FROM STUDENT04;

-- unique : 중복되지 않는 유일키만 입력 가능. 단, null은 중복 허용

CREATE TABLE EMPLOYEES01(
	empno number(5) CONSTRAINT employees01_empno_up UNIQUE,
	ename varchar2(30) CONSTRAINT employees01_ename_nn NOT NULL,
	sal NUMBER(5)
);

SELECT *
FROM sys.all_constraints
WHERE table_name LIKE 'EMPLOYEES01';

INSERT INTO employees01 VALUES (1, 'Sam', 1000);
INSERT INTO employees01 VALUES (2, 'Tom', 2000);
INSERT INTO employees01(empno, ename) VALUES (3, 'Jimmy');
-- 동일한 사원 정보 입력 시 에러 발생
INSERT INTO employees01 VALUES (3, 'Daniel', 4000);
INSERT INTO employees01 VALUES (null, 'Jessica', 4000);
-- null은 동일하여도 에러 발생하지 않음
INSERT INTO employees01(ename, sal) VALUES ('Taylor', 4000);

SELECT * FROM EMPLOYEES01;

-- primary key : not, unique를 동시에 처리할 수 있는 제약.
-- 일반적으로 행단위 식별 컬럼을 지정할 때 사용됨

CREATE TABLE EMPLOYEES02 (
	empno number(4) PRIMARY KEY -- 제약 조건을 자동 설정
);

CREATE TABLE EMPLOYEES03 (
	empno number(4) CONSTRAINTS employees03_empno_pk PRIMARY KEY 
);

SELECT *
FROM sys.all_constraints
WHERE TABLE_name IN('employees02','employees03' );

INSERT INTO EMPLOYEES02 VALUES(1000);
INSERT INTO EMPLOYEES02 VALUES(1001);
INSERT INTO EMPLOYEES02 VALUES(1002);
INSERT INTO EMPLOYEES02 VALUES(NULL);

SELECT * FROM EMPLOYEES02;









