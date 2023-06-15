-- 제 1 정규화 전 테이블
CREATE TABLE normalForm00(
	cuid varchar2(50), -- 고객 아이디
	eventno varchar2(100), -- 이벤트 번호
	ck_yn varchar2(50), -- 당첨여부
	grade varchar2(10), -- 등급
	discount number(4,2) -- 할인율
);

INSERT INTO normalForm00 values(
	'apple', 'E001, E005, E010',
	'Y,N,Y', 'gold', 0.1
);

INSERT INTO normalForm00 values(
	'banana', 'E002, E010',
	'N,Y', 'vip', 0.2
);

INSERT INTO normalForm00 values(
	'carrot', 'E003, E007',
	'Y,Y', 'gold', 0.1
);

INSERT INTO normalForm00 values(
	'orange', 'E004',
	'N', 'silver', 0.05
);

SELECT * FROM normalForm00;

-- ex) 제1정규화 테이블로 normalForm01 테이블 구조 생성, 데이터 입력
CREATE TABLE normalForm01
AS SELECT * FROM normalForm00 WHERE 1=0;

SELECT * FROM normalForm01;

INSERT INTO normalForm01 VALUES	(
	'apple', 'E001', 'Y', 'gold', 0.1
);
INSERT INTO normalForm01 VALUES	(
	'apple', 'E005', 'N', 'gold', 0.1
);
INSERT INTO normalForm01 VALUES	(
	'apple', 'E010', 'Y', 'gold', 0.1
);
INSERT INTO normalForm01 VALUES	(
	'banana', 'E002', 'Y', 'vip', 0.2
);
INSERT INTO normalForm01 VALUES	(
	'banana', 'E005', 'Y', 'vip', 0.2
);
INSERT INTO normalForm01 VALUES	(
	'carrot', 'E003', 'Y', 'gold', 0.1
);
INSERT INTO normalForm01 VALUES	(
	'carrot', 'E007', 'Y', 'gold', 0.1
);
INSERT INTO normalForm01 VALUES	(
	'orange', 'E004', 'N', 'silver', 0.05
);

SELECT * FROM normalForm01;

CREATE TABLE normalForm001 (
	student_id int PRIMARY KEY,
	student_name varchar(100),
	course1 varchar(100),
	course2 varchar(100),
	course3 varchar(100)	
);

-- 위 내용을 course1을 course2,3 등으로 한 학생이 여러 과목을 수강하는 경우
-- 학생의 정보가 중복되어 저장될 수 있음
CREATE TABLE normalForm002 (
	employee_id int PRIMARY KEY,
	eployee_name varchar2(100),
	phone_numbers varchar2(100)
);

-- 위 테이블의 경우에 phon_numbers에 여러 개의 전화번호를 입력하는 경우
-- 제 1정규화에 위배될 수 있음. 이 경우도 특정 데이터의 일부분을 추출하거나 특정 값을 검색하기 어려워지는
-- 경우 발생

CREATE TABLE normalForm011(
	student_id int PRIMARY KEY,
	student_name varchar2(100)
);

CREATE TABLE normalForm021(
	course_id int PRIMARY KEY,
	course_name varchar(100)
);

CREATE TABLE normalForm031(
	student_id int ,
	course_id int,
	FOREIGN KEY(student_id) REFERENCES normalForm011(student_id),
	FOREIGN KEY(course_id) REFERENCES normalForm021(course_id)
);

CREATE TABLE normalForm12(
	employee_id int PRIMARY KEY,
	employee_name varchar2(100)
);

-- 사원 : 010-3323-2332, 010-3333-3333
--> himan 010-3323-2332
--> himan 010-3333-3333

CREATE TABLE normalForm22(
	phone_id int PRIMARY KEY,
	employee_id int,
	phone_number varchar2(100),
	FOREIGN KEY(employee_id) REFERENCES
		normalForm12(employee_id)
);

SELECT * FROM normalForm031;
/*
ex) 아래 구조의 내용을 테이블로 만들고(정규화 전 테이블)
	정규화가 정리된 테이블도 생성
	주문정보
		주문번호	고객이름	주문날짜		상품목록
		1		ㅁㅁㅁ	2023-02-01 	사과
		1		ㅁㅁㅁ	2023-02-01 	바나나
		1		ㅁㅁㅁ	2023-02-01 	오렌지
		1		ㅁㅁㅁ	2023-02-01 	오렌지
		1		ㅁㅁㅁ	2023-02-01 	오렌지
		1		ㅁㅁㅁ	2023-02-01 	오렌지 오
	--> 제1정규화가 적용된 주문상품 테이블
	
	학생 정보 테이블
		학생id	학생이름	과목1		과목2		과목3
		1		ㅇㅇㅇ	수학		영어		과학
		2		ㅇㅇㅇ	역사		지리		음악
		3		ㅇㅇㅇ	체육		미술		수학
	--> 제1정규화 처리 테이블
		학생테이블
			학생id	학생이름
			1		ㅁㅁㅁ
			2		ㅁㅁㅁ
			3		ㅁㅁㅁ
		과목테이블
			과목id	과목이름
			1		수학
			2		영어
			3		과학
			4		역사
			5		지리
			6		음악
			7		체육
			8		미술
									
		학생 과목 연계 테이블
			1		1
			1		2
			1		3
			2		5
	-------------------------------------------
			
	ex) 아래 테이블을 정규화 과정을 처리
	주문정보 테이블
	주문번호	고객명	주문일자		상품명
	1		ㅇㅇㅇ	2022-01-01	노트북
	2		ㅇㅇㅇ	2022-01-02	스마트폰
	3		ㄴㄴㄴ	2022-02-10	모니터
	--> 테이블 분리, 컬럼지정
	
	주문정보(주문-고객)
	주문번호	고객번호	주문일자
	1		1		2022-01-01
	1		1		2022-01-01
	1		1		2022-01-01
	1		1		2022-01-01
	1		1		2022-01-01
	
	주문상품정보(주문-상품)
	주문번호	상품명
	1		노트북
	1		스마트폰
	1		키보드
	1		마우스
	1		모니터
	
	
	
		
*/
















