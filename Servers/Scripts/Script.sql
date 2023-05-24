SELECT * FROM member;

CREATE TABLE member02 (
	id varchar2(50),
	pass varchar2(50),
	name varchar2(50),
	point number,
	auth varchar2(50),
	regdate date
);

SELECT * FROM member02;

INSERT INTO member02 values('himan', '7777', 'Amy', 1000, '관리자', sysdate);

SELECT * FROM member02
WHERE id = 'himan' AND pass = '7777';
-- if/while
-- 행이 다수행의 데이터로 나오면 -> while(rs.next())
-- 행이 한 개의 데이터로 나오면 -> if(rs.next())






