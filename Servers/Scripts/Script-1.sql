-- 학생 테이블1 학생명과 점수
CREATE TABLE student01(
	name varchar2(50),
	point number
);

INSERT INTO student01 values('Joe', 70);
INSERT INTO student01 values('Amy', 80);
INSERT INTO student01 values('Tom', 90);

SELECT * FROM student01;

-- ex) 구매 물건 정보 테이블 (물건일련번호, 물건명, 판매가격)
-- ex) 회원정보 테이블 (회원아이디, 회원패스워드, 회원명, 포인트, 권한)

-- 테이블 생성 및 데이터 입력
-- char() : 데이터의 크기가 고정되어 있을 때 활용
CREATE TABLE prod (
	psid char(10),
	pname varchar2(50),
	price number
);

INSERT INTO prod VALUES('pa101', 'jelly', 1000);
INSERT INTO prod VALUES('pa102', 'candy', 500);
INSERT INTO prod VALUES('pa103', 'milk', 2000);

SELECT * FROM prod;

CREATE TABLE MEMBER(
	id varchar2(50),
	pw NUMBER,
	memname varchar2(50),
	point NUMBER,
	admin varchar2(50)
);

INSERT INTO MEMBER values('abc', 1234, 'jun3bug', 1305, 'user');
INSERT INTO MEMBER values('efg', 1234, 'draagon', 644, 'user');
INSERT INTO MEMBER values('hij', 1234, 'mrrobot', 3366, 'user');
INSERT INTO MEMBER values('klm', 1234, 'ellis', 745, 'user');

SELECT * FROM MEMBER;

-- ex) 학생 정보2 테이블 (학생번호, 학생명, 국어, 영어, 수학)

CREATE TABLE student02(
	stunum NUMBER,
	stuname varchar2(50),
	kor NUMBER,
	eng NUMBER,
	math NUMBER 
);

INSERT INTO student02 values(11, 'Kate', 90, 39, 40);
INSERT INTO student02 values(11, 'Kevin', 90, 39, 80);
INSERT INTO student02 values(11, 'Ember', 80, 79, 57);

SELECT * FROM student02;




