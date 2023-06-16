DROP TABLE student08;
DROP SEQUENCE seq01;
SELECT * FROM STUDENT01 s ;

ALTER TABLE student01
ADD sno NUMBER;

-- 1. 해당 컬럼에 데이터가 저장되어 있을 때
-- 설정된 크기가 아니고, 실제 저장된 기준으로 보다 작게는 변경이 불가능
-- 타입의 변경 불가능 (문자 <--> 숫자 <--> 날짜)
-- 2. 해당 컬럼에 데이터가 저장되어 있지 않을 경우
--		크기 상관없이 변경 가능, 타입도 변경 가능






