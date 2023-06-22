SELECT * FROM emp;

SELECT LEVEL, empno, ename, mgr
FROM EMP 
START WITH mgr = 7839
CONNECT BY PRIOR mgr=empno;

SELECT * FROM DEPARTMENTS d;

/*
deptno       dname                     col        loc

100             공과대학

101             정보미디어학부      100

102             메카트로닉스학부   100

103           컴퓨터공학과             101

104            멀티미디어학과        101

105             전자공학과               102

106             기계공학과               102
*/












