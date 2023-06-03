CREATE TABLE grab_member(
	mem_id varchar2(50),
	mem_pw varchar2(50),
	mem_name varchar2(20),
	mem_phone varchar2(11),
	mem_point NUMBER
);

INSERT INTO grab_member values('ddong','1q2w3e4r','김동현','01092382537',0);
INSERT INTO grab_member values('Qrill','aasdf123','강준규','01088132247',0);
INSERT INTO grab_member values('vanana','banana97','노현우','01055711548',0);
INSERT INTO grab_member values('dolmeng','ggalgga90','박다솜','01011542420',0);

SELECT * FROM grab_member;
DROP TABLE GRAB_MEMBER;
