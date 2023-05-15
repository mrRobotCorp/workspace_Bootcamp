SELECT *
FROM EMP
WHERE ENAME LIKE '__A%';

SELECT *
FROM EMP
WHERE job LIKE '%A_';

-- 글자 수가 6자리이고 앞에서 3번째 자리에 R이 있는 데이터 검색
SELECT *
FROM EMP
WHERE ENAME LIKE '__R___';

-- ex) 앞에서 4,5번째 자리에 ES를 포함한 직책 검색
-- ex) 뒤에서 3번째 자리에 M이 포함된 직책 검색
-- ex) 자리 수가 5자리이고 중간에 I자가 포함된 사원명 검색
SELECT *
FROM EMP
WHERE job LIKE '___ES%';

SELECT ename, ''||HIREDATE "문자열로 캐스팅"
FROM EMP;

SELECT ename, hiredate
FROM EMP
WHERE HIREDATE LIKE '___02%'; -- 날짜를 문자열로 캐스팅하면 연도/달/일 로 슬래시까지 출력되므로 ##/ 이후 세번째인 02 달인 데이터 출력

SELECT *
FROM EMP
WHERE job LIKE '%M__';

SELECT *
FROM EMP
WHERE ENAME LIKE '_____' AND ENAME LIKE '%I%';

-- 사원 번호를 기준으로 오름차순/내림차순 정렬
SELECT empno, ename
FROM EMP;

SELECT empno, ename
FROM EMP
ORDER BY empno; -- 오름차순(default), ASC 생략가능
 
SELECT empno, ename
FROM EMP
ORDER BY empno DESC;

SELECT *
FROM EMP
ORDER BY empno DESC;

-- ex) 연봉이 가장 높은 사람부터 가장 낮은 사람으로 급여와 이름 출력
SELECT ename, sal
FROM EMP
ORDER BY sal DESC;

-- ex) 입사일을 기준으로 최근에 입사한 사람으로부터 입사가 먼저된 사람을 출력
SELECT hiredate
FROM EMP
ORDER BY HIREDATE DESC;

-- ex) 부서번호는 오름차순, 연봉은 내림차순 이중 정렬 기준으로 부서번호 급여 사원명으로 출력
SELECT deptno, sal, ename
FROM emp
ORDER BY DEPTNO, sal DESC;







