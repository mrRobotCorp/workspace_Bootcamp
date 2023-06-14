/*
[1단계:개념] 1. 제약조건의 각각의 특징을 기본 예제를 통해서 설정하고 확인하세요.
[1단계:코드] 2. 쇼핑몰의 회원 정보/구매정보/물품정보를 테이블로 만들 때, 오늘 배운 제약조건 5가지를 통해 만드세요
[1단계:코드] 3. 컴퓨터부품테이블(부품key, 부품명, 가격, 재고량, 부품 설명)만들되, sequence를 이용해서 
부품key를 설정해서 할당하도록 하세요.
[1단계:코드] 4. Enrollments라는 테이블을 생성하고, 학생의 학번(student_id)과 수강한 강의의 
고유번호(course_id)를 저장하는데,
각각의 값은 Students 테이블과 Courses 테이블의 학번과 고유번호를 참조하는 외래키로 설정되도록 하세요.

*/

-- not null, unique key, primary key, foreign key, check
CREATE TABLE shpmall(
	shop varchar2(10) CONSTRAINT shopmall_shop_pk PRIMARY KEY,
	meminfo varchar2(30) CONSTRAINT shopmall_meminfo_nn NOT NULL,
	binfo varchar2(30) CONSTRAINT shopmall_binfo_up UNIQUE,
	pinfo varchar2(30) CONSTRAINT shopmall_shop_ck  check(pinfo IN ('A', 'M'))
);

INSERT INTO shpmall VALUES ('aaa', 'member', 'something', 'A');

SELECT * FROM shpmall;


-------------------------
CREATE SEQUENCE seqex
	START with 100;

SELECT seqex.nextval 부품번호
FROM dual;

INSERT INTO computer(asset) VALUES('AS' || seqex.nextval);

CREATE TABLE computer(
	asset varchar2(20) PRIMARY KEY,
	aname varchar2(20),
	price number(20),
	cnt number(10),
	ainfo varchar2(30)
);

SELECT * FROM computer;

-----------------------------
CREATE TABLE Students(
	student_id varchar2(20) PRIMARY key
);

CREATE TABLE Courses(
	course_id varchar2(20) PRIMARY key
);

DROP TABLE students;
DROP TABLE courses;
DROP TABLE Enrollments;

INSERT INTO students VALUES('st-101');
INSERT INTO students VALUES('st-102');
INSERT INTO students VALUES('st-103');

INSERT INTO Courses VALUES('cs-901');
INSERT INTO Courses VALUES('cs-902');
INSERT INTO Courses VALUES('cs-903');

CREATE TABLE Enrollments(
	eno number(5) PRIMARY KEY,
	student_id varchar2(20) CONSTRAINT Enrollments_student_id_fk
	references Students(student_id),
	course_id varchar2(20) CONSTRAINT Enrollments_course_id_fk
	references Courses(course_id)
);

INSERT INTO Enrollments VALUES(1, 'st-101', 'cs-902');
INSERT INTO Enrollments VALUES(2, 'st-103', 'cs-901');
INSERT INTO Enrollments VALUES(3, 'st-102', 'cs-903');

SELECT * FROM enrollments;








