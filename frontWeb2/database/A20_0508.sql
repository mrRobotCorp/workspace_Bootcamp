--1. employee 테이블 전체를 조회하고, 해당 컬럼을 조회해보세요.
SELECT *
FROM emp;

--2. 정보와 데이터의 차이점을 기술하세요.
/*
	데이터 ) 현실 세계에서 단순히 관찰하거나 측정하여 수집한 사실이나 값
	정보 ) 의사 결정에 유용하게 활용할 수 있도록 데이터를 처리한 결과물
	ex) 원유와 가공우유로 비유하면 원유는 데이터고, 이를 정제한 가공우유가 정보임.
*/

--3. 데이터의 형태에 따른 분류를 하고, 예를 나타내세요.
/*
	데이터의 형태에 따라서는 정형데이터와 반정형 데이터, 비정형 데이터로 나누어진다.
	정형데이터는 미리 정해진 구조가 있는 데이터로, 엑셀,관계형 데이터베이스의 테이블 등이 있다.
	반정형 데이터는 내용 안에 구조에 대한 설명이 같이 있는 데이터이다. html, xml, json문서 등이 그 예이다.
	비정형 데이터는 정해진 구조가 없는 데이터이다. 소셜 데이터의 텍스트, 영상, 이미지, 음성 등이 그 예이다.
*/

--4. 이산형 데이터와 연속형 데이터의 차이점을 기술하세요
/*
	이산형 데이터는 갯수를 셀 수 있는 데이터로 고객의 수, 판매량, 합격자 수 등을 예시로 들 수 있다.
	연속형 데이터는 측정을 할 수 있는 데이터이다. 키, 몸무게, 온도, 점수 등이 그 예시이다.
*/

--5. 테이블과 컴럼명의 alias를 사용하는 방법을 예제를 통해서 기술하세요.
-- ename, job, sal 칼럼 순으로 출력하면 각 칼럼 이름은 사원명, 직업, 급 여 이다.
SELECT ename AS 사원명, job 직업, sal "급 여 "
FROM emp; 

--7. 하나의 테이블을 사용할 때도 alias를 사용하는 경우를 기술하세요.
SELECT ename || '의 직업은 ' || job || '이다' msg
FROM emp;

--8. 아래의 형태로 사원정보(emp) 테이블의 컬럼이름에 맞는 데이터를 출력하세요
-- 부서번호 - deptno 사원번호(empno) 직책(job) 급여(sal*12) 보너스
SELECT deptno "부서번호", empno "사원번호", job "직책", sal "급여", (sal * 12) "보너스"
FROM emp;

--9. 아래의 형식으로 컬럼간의 연산과 연결처리를 하여 alias로 출력하세요.
-- 1) @@님의 사원번호는 @@이고, 올해 연말보너스는 연봉의 20%인 @@원입니다. @@님(ename)
-- 2) @@님의 입사일은 @@이고, 현재 연봉의 1/13인 월급여는 @@만원. 입사일 @@(hiredate)
SELECT ename || '님의 사원번호는 ' || empno || '이고, 올해 연말 보너스는 연봉의 20%인 ' || (sal * 0.2) 
		|| '만원 입니다.' || ename || '님' "보너스 정보"
FROM emp;


SELECT ename || '님의 입사일은 ' || HIREDATE || '이고, 현재 연봉의 1/13인 월급여는 ' || (sal / 13) 
		|| '만원입니다. 입사일 : ' || HIREDATE "급여 정보"
FROM emp;




