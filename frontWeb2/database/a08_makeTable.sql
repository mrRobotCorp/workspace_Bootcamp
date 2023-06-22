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

CREATE TABLE MEMBER0(
	id varchar2(50),
	pw NUMBER,
	memname varchar2(50),
	point NUMBER,
	admin varchar2(50)
);

INSERT INTO MEMBER0 values('abc', 1234, 'jun3bug', 1305, 'user');
INSERT INTO MEMBER0 values('efg', 1234, 'draagon', 644, 'user');
INSERT INTO MEMBER0 values('hij', 1234, 'mrrobot', 3366, 'user');
INSERT INTO MEMBER0 values('klm', 1234, 'ellis', 745, 'user');

SELECT * FROM MEMBER0;

-- ex) 학생 정보2 테이블 (학생번호, 학생명, 국어, 영어, 수학)

CREATE TABLE student02(
	stunum NUMBER,
	stuname varchar2(50),
	kor NUMBER,
	eng NUMBER,
	math NUMBER 
);

INSERT INTO student02 values(30, 'Kate', 90, 39, 40);
INSERT INTO student02 values(20, 'Kevin', 90, 39, 80);
INSERT INTO student02 values(1, 'Ember', 80, 79, 57);

SELECT * FROM student02;

-- stunum 기준으로 1인 학생
-- 이름과 국어, 영어 수정
UPDATE  STUDENT02 
	SET STUNAME  = 'Ember'
		kor = 97,
		eng = 88
	WHERE STUNUM = 1; 

UPDATE  STUDENT02 
	SET KOR = 100
	WHERE STUNUM = 1;

SELECT * FROM STUDENT02;

-- 위 툴에서 커밋/롤백 처리
-- commit; rollback;으로 코드 직접 처리 가능
-- rollback은 바로 전 commit 직전까지 제한됨. commit한 후 rollback은 변경 전으로 X.
commit;
ROLLBACK;

-- ex) 이름 기준으로 kevin인 경우 국어 80, 영어 80
--		수학 90으로 변경, 변경 후 확인 rollback, commit, rollback 차례대로 처리
UPDATE STUDENT02 
	SET KOR = 80,
		eng = 80,
		math = 90
	WHERE STUNAME = 'Kevin';

SELECT * FROM STUDENT02;

ROLLBACK;
COMMIT;
ROLLBACK;

-- math 5점씩 다 올리는 처리
UPDATE STUDENT02 
	SET math = math + 5; -- 모든 math점수에 5점씩 더한 후 할당처리
	
-- ex) 영어 점수가 80점인 경우, 기존 점수에서 5점 더하기
UPDATE STUDENT02 
	SET eng = eng + 5
	WHERE eng = 80;

SELECT * FROM EMP01;
-- 사원번호가 7369인 데이터 삭제 처리
DELETE 
FROM EMP01
WHERE empno = 7369;

DELETE 
FROM EMP01
WHERE empno >= 7900;

-- ex1) job이 SALESMAN인 데이터 삭제 
-- ex2) sal이 2000 ~ 3000 사이 데이터 삭제 
DELETE 
FROM EMP01
WHERE job = 'SALESMAN';

DELETE 
FROM EMP01
WHERE sal > 2000 AND sal < 3000;

-- 새로운 테이블 생성
CREATE TABLE emp02
AS SELECT * FROM emp;

SELECT * FROM emp02;








	





