SELECT * FROM emp;

CREATE TABLE grab_member(
	mem_id varchar2(50),
	mem_pw varchar2(50),
	mem_name varchar2(20),
	mem_phone varchar2(11),
	mem_point NUMBER
);

CREATE TABLE grab_product(
	pro_num varchar2(20),
	pro_name varchar2(50),
	pro_cat varchar2(20),
	pro_price NUMBER,
	pro_stock NUMBER,
	pro_addrs varchar2(100)	
);

SELECT * FROM grab_product;
DROP TABLE grab_product;