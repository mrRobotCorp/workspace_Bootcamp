SELECT ename, sal, comm, sal + comm 합산,
		nvl(COMM, 0) 보너스초기, -- null값은 숫자 0으로 변환
		sal + nvl(COMM, 0) 합산2
FROM emp;

SELECT ename, sal, comm, NVL2(comm, comm*1.1, 100) "보너스 * 1.1"
FROM emp;

-- ex) comm이 null일 때는 sal의 15%로 설정, null이 아닐 땐 comm에서 sal의 5%를 더해서
-- 보너스 설정. 결과값을 10단위로 절삭처리
SELECT ename, sal,
		NVL2(comm,  trunc(comm + (sal*0.05), -1), trunc(sal*0.15, -1)) 보너스
FROM emp;
		