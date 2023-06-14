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

