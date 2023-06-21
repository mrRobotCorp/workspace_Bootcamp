-- id, pass, name, point, auth, regdate
CREATE TABLE MEMBER (
	id varchar2(50),
	pass number(10), 
	name varchar2(100),
	point number(10),
	auth varchar2(50),
	regdate DATE
)

INSERT INTO MEMBER values ('himan', 1111, 'Amy', 666, 'user', sysdate);
INSERT INTO MEMBER values ('skrr', 1111, 'Amy', 666, 'user', sysdate);

SELECT * FROM MEMBER;



