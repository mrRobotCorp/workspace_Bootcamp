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














