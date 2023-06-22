SELECT * FROM emp;

SELECT LEVEL, empno, ename, mgr
FROM EMP 
START WITH mgr = 7839
CONNECT BY PRIOR mgr=empno;

SELECT * FROM DEPARTMENTS d;

/*
deptno       dname                     col

100             공과대학

101             정보미디어학부      100

102             메카트로닉스학부   100

103           컴퓨터공학과             101

104            멀티미디어학과        101

105             전자공학과               102

106             기계공학과               102
ex) part01 테이블을 위 구조와 데이터로 생성
계층적 sql로 level 출력
*/

CREATE TABLE part01(
	deptno number(10),
	dname varchar2(50),
	col number(10)
);

INSERT INTO part01 values(100, '공과대학', null);
INSERT INTO part01 values(100, '공과대학', 100);
INSERT INTO part01 values(101, '정보미디어학부', 100);
INSERT INTO part01 values(102, '메카트로닉스학부', 101);
INSERT INTO part01 values(103, '컴퓨터공학과', 101);
INSERT INTO part01 values(104, '멀티미디어학과', 101);
INSERT INTO part01 values(105, '전자공학과', 102);
INSERT INTO part01 values(106, '기계공학과', 102);
INSERT INTO part01 values(107, '인공지능학과', 101);

SELECT * FROM part01 ORDER BY deptno;

SELECT LEVEL, deptno, dname, col
FROM part01
START WITH col = 101
CONNECT BY PRIOR deptno=col;



















