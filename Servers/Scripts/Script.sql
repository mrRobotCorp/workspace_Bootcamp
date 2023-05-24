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

/*
SELECT * FROM member02
WHERE id = ? AND pass = ?

ShMember
private String id;
private String pass;
private String name;
private int point;
private String auth;
private Date regdate;


*/




