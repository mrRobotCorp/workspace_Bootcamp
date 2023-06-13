SELECT * FROM emp;
SELECT empno, ename, dname
FROM EMP e , DEPT d 
WHERE e.DEPTNO  = d.DEPTNO
AND empno in (
	SELECT DISTINCT mgr FROM emp
);

SELECT DISTINCT mgr FROM emp;

