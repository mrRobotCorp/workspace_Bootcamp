CREATE SEQUENCE seq01
	START with 1000;
	
SELECT seq01.nextval 증가번호, 
		'QA-' || seq01.currval 혼합key
FROM dual;

-- 데이터 입력 시 사용
CREATE TABLE student05 (
	stuCode char(7) PRIMARY KEY
);

INSERT INTO student05 values('QA-' || seq01.nextval);
-- 고정형 코드 데이터 입력 처리
SELECT * FROM student05;

-- ex) sequence 예제 1100으로 시작하는 sequence 를 만들어서 product02
-- 		테이블에 10개 데이터를 입력 처리
CREATE SEQUENCE seq02
	START with 1100;

SELECT seq02.nextval 증가번호
FROM dual;

INSERT INTO prod02(pid, pname) VALUES(200, 'PD-' || seq02.nextval);

SELECT * FROM prod02;

CREATE TABLE student06(
	gender varchar2(1) CONSTRAINT student06_gender_ch check(gender IN ('F', 'M'))
);

INSERT INTO student06 VALUES('F');
INSERT INTO student06 VALUES('M');
INSERT INTO student06 VALUES('남');
INSERT INTO student06 VALUES('여');
INSERT INTO student06 VALUES('F');

SELECT * FROM student06;

-- ex) student07 테이블 생성
-- sno(프라이머리 키), 이름, 성별(남/여), 국어(0-100), 영어 100 수학 100 한글 3bytes

CREATE TABLE student07 (
	sno number(10) PRIMARY KEY,
	sname varchar2(30),
	gender char(10) CONSTRAINT student07_gender_ch CHECK( gender IN('남', '여')),
	kor NUMBER(3) CHECK (kor BETWEEN 0 AND 100),
	eng NUMBER(3) CHECK (kor BETWEEN 0 AND 100),
	math NUMBER(3) CHECK (kor BETWEEN 0 AND 100)
);

INSERT INTO student07 values(1001, 'aaa', '남', 100, 80, 49);

CREATE TABLE teacher01(
	tno NUMBER PRIMARY KEY
);

INSERT INTO teacher01 VALUES(10);
INSERT INTO teacher01 VALUES(20);
INSERT INTO teacher01 VALUES(30);

SELECT * FROM teacher01;

CREATE TABLE student08 (
	name varchar2(10),
	tno NUMBER CONSTRAINT student08_tno_fk
	references teacher01(tno)
);

INSERT INTO student08 values('name1', 10);
INSERT INTO student08 values('name2', 20);
INSERT INTO student08 values('name3', 30);
INSERT INTO student08 values('name4', 40);

SELECT * FROM student08;

-- ex) 물건 테이블 (물건번호, 물건명, 가격, 재고량)
-- 구매 테이블(구매번호, 구매수량, 물건번호-외래키 설정)
CREATE TABLE prod03 (
	pno NUMBER(10) PRIMARY KEY,
	pname varchar2(50),
	price NUMBER(20),
	cnt number(10)
);

INSERT INTO prod03 values(101, 'water', 1000, 2);
INSERT INTO prod03 values(102, 'bottle', 2200, 1);
INSERT INTO prod03 values(103, 'chair', 44000, 2);

CREATE TABLE shopping( 
	sno NUMBER(10) PRIMARY KEY,
	cnt NUMBER(10),
	pno NUMBER CONSTRAINT shopping_pno_fk
	references prod03(pno)
);

INSERT INTO shopping values(11, 2, 101);
INSERT INTO shopping values(12, 1, 102);
INSERT INTO shopping values(13, 2, 103);

SELECT * FROM shopping;


