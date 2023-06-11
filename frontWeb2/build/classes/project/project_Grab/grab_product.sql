--------------------------------------------------------
--  ������ ������ - �Ͽ���-5��-21-2023   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table GRAB_PRODUCT
--------------------------------------------------------

  CREATE TABLE "SCOTT"."GRAB_PRODUCT" 
   (	"PRO_NUM" VARCHAR2(20 BYTE), 
	"PRO_NAME" VARCHAR2(50 BYTE), 
	"PRO_BRAND" VARCHAR2(50 BYTE), 
	"PRO_CAT" VARCHAR2(50 BYTE), 
	"PRO_PRICE" NUMBER, 
	"PRO_STOCK" NUMBER, 
	"PRO_ADDRS" VARCHAR2(100 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into SCOTT.GRAB_PRODUCT
SET DEFINE OFF;
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-24','��Ÿ ��Ʈ�� ��ü ŰƮ SMALL SYSTEM65','����','������ǰ',59000,100,'https://www.grabtheguitar.com/care/?idx=538');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-25','ģȯ�� ����� ���Ÿ �������� ��','�𵵸�','������ǰ',8000,100,'https://www.grabtheguitar.com/care/?idx=204');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-26','�ĸ麸ȣ ���� �Ȱ���','��������','������ǰ',16800,100,'https://www.grabtheguitar.com/care/?idx=536');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-27','��ĳ��� 1�� �� SGA-700','��Ƽ������','������ǰ',895000,100,'https://www.grabtheguitar.com/care/?idx=798');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-30','PRO ���Ÿ �������� ��Ż ����','���뷯��','������ǰ',18000,100,'https://www.grabtheguitar.com/care/?idx=523');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-31','����ƽ ��Ÿ �ϵ����̽�','��Ƽ������','������ǰ',150000,100,'https://www.grabtheguitar.com/care/?idx=682');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-1','SLG200S ���Ϸ�Ʈ ����ƽ ��Ÿ','�߸���','��Ÿ',850000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=854');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-2','W311 ž�ָ��� �Թ��� �巹��� ���Ÿ','����','��Ÿ',285000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=828');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-3','W313 ž�ָ��� �Թ��� �ƾ���� ���Ÿ','����','��Ÿ',285000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=827');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-16','���� ��ǰ ��Ÿ ��ũ ����','����','��ũ',1000,1000,'https://www.grabtheguitar.com/98/?idx=705');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-17','CRADLE �����η��� ��Ÿ ī��','�ٴٸ���','ī��',90000,100,'https://www.grabtheguitar.com/capo/?idx=606');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-18','RATCHET ��Ÿ ī��','�ٴٸ���','ī��',15000,100,'https://www.grabtheguitar.com/capo/?idx=603');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-19','CURVED TRIGGER ��Ÿ ī��','����','ī��',24000,100,'https://www.grabtheguitar.com/capo/?idx=557');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-20','AXIS DUAL RADIUS ��Ÿ ī��','��Ϻ�','ī��',19000,100,'https://www.grabtheguitar.com/capo/?idx=564');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-21','����ġ ��Ÿ ī��','�𵵸�','ī��',29000,100,'https://www.grabtheguitar.com/capo/?idx=570');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-22','C-1 ��Ÿ ī��','�ø��Ǿ�','ī��',15000,100,'https://www.grabtheguitar.com/capo/?idx=219');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-23','CT-100 ī�� Ʃ��','�׷�ƪ','ī��',29000,100,'https://www.grabtheguitar.com/capo/?idx=521');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-24','��Ÿ ��Ʈ�� ��ü ŰƮ SMALL SYSTEM65','����','������ǰ',59000,100,'https://www.grabtheguitar.com/care/?idx=538');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-25','ģȯ�� ����� ���Ÿ �������� ��','�𵵸�','������ǰ',8000,100,'https://www.grabtheguitar.com/care/?idx=204');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-26','�ĸ麸ȣ ���� �Ȱ���','��������','������ǰ',16800,100,'https://www.grabtheguitar.com/care/?idx=536');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-27','��ĳ��� 1�� �� SGA-700','��Ƽ������','������ǰ',895000,100,'https://www.grabtheguitar.com/care/?idx=798');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-30','PRO ���Ÿ �������� ��Ż ����','���뷯��','������ǰ',18000,100,'https://www.grabtheguitar.com/care/?idx=523');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-31','����ƽ ��Ÿ �ϵ����̽�','��Ƽ������','������ǰ',150000,100,'https://www.grabtheguitar.com/care/?idx=682');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-1','SLG200S ���Ϸ�Ʈ ����ƽ ��Ÿ','�߸���','��Ÿ',850000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=854');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-2','W311 ž�ָ��� �Թ��� �巹��� ���Ÿ','����','��Ÿ',285000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=828');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-3','W313 ž�ָ��� �Թ��� �ƾ���� ���Ÿ','����','��Ÿ',285000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=827');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-16','���� ��ǰ ��Ÿ ��ũ ����','����','��ũ',1000,1000,'https://www.grabtheguitar.com/98/?idx=705');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-17','CRADLE �����η��� ��Ÿ ī��','�ٴٸ���','ī��',90000,100,'https://www.grabtheguitar.com/capo/?idx=606');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-18','RATCHET ��Ÿ ī��','�ٴٸ���','ī��',15000,100,'https://www.grabtheguitar.com/capo/?idx=603');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-19','CURVED TRIGGER ��Ÿ ī��','����','ī��',24000,100,'https://www.grabtheguitar.com/capo/?idx=557');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-20','AXIS DUAL RADIUS ��Ÿ ī��','��Ϻ�','ī��',19000,100,'https://www.grabtheguitar.com/capo/?idx=564');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-21','����ġ ��Ÿ ī��','�𵵸�','ī��',29000,100,'https://www.grabtheguitar.com/capo/?idx=570');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-22','C-1 ��Ÿ ī��','�ø��Ǿ�','ī��',15000,100,'https://www.grabtheguitar.com/capo/?idx=219');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-23','CT-100 ī�� Ʃ��','�׷�ƪ','ī��',29000,100,'https://www.grabtheguitar.com/capo/?idx=521');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-28','��ĳ��� 1�� ȭ��Ʈ SGA-700W','��Ƽ������','������ǰ',940000,100,'https://www.grabtheguitar.com/care/?idx=796');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-29','��Ÿ ���� ���� �������','����','������ǰ',9000,100,'https://www.grabtheguitar.com/care/?idx=202');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-4','W993HE �üָ��� �ƾ���� ���Ÿ','����','��Ÿ',980000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=822');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-5','Sting F200 BT ž�ָ��� OM�ٵ� ���Ÿ','��','��Ÿ',229000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=793');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-6','Sting SJ300 CB �����ٵ� ž�ָ��� ���Ÿ','��','��Ÿ',275000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=790');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-7','R3MCE �ƾ���� ž�ָ��� ���Ÿ','������','��Ÿ',670000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=713');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-8','R3SRCE �ƾ���� ž�ָ��� ���Ÿ','������','��Ÿ',770000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=717');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-9','R3SKCE �ƾ���� ž�ָ��� ���Ÿ','������','��Ÿ',800000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=715');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-10','R2SMPBK OM�ٵ� ž�ָ��� ���Ÿ','������','��Ÿ',650000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=711');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-11','GA88 ž��ָ��� �ƾ���� ���Ÿ','��ũ���','��Ÿ',679000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=649');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-12','GA48 ž�ָ��� �ƾ���� ���Ÿ','��ũ���','��Ÿ',590000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=648');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-13','S27 ž�ָ��� �ƾ���� ���Ÿ','��ũ���','��Ÿ',399000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=643');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-14','S21 ž�ָ��� ���Ÿ','��ũ���','��Ÿ',345000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=639');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-15','EArth100 SSF ž�ָ��� ���Ÿ','��Ʈ','��Ÿ',440000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=635');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-28','��ĳ��� 1�� ȭ��Ʈ SGA-700W','��Ƽ������','������ǰ',940000,100,'https://www.grabtheguitar.com/care/?idx=796');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-29','��Ÿ ���� ���� �������','����','������ǰ',9000,100,'https://www.grabtheguitar.com/care/?idx=202');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-4','W993HE �üָ��� �ƾ���� ���Ÿ','����','��Ÿ',980000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=822');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-5','Sting F200 BT ž�ָ��� OM�ٵ� ���Ÿ','��','��Ÿ',229000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=793');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-6','Sting SJ300 CB �����ٵ� ž�ָ��� ���Ÿ','��','��Ÿ',275000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=790');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-7','R3MCE �ƾ���� ž�ָ��� ���Ÿ','������','��Ÿ',670000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=713');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-8','R3SRCE �ƾ���� ž�ָ��� ���Ÿ','������','��Ÿ',770000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=717');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-9','R3SKCE �ƾ���� ž�ָ��� ���Ÿ','������','��Ÿ',800000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=715');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-10','R2SMPBK OM�ٵ� ž�ָ��� ���Ÿ','������','��Ÿ',650000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=711');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-11','GA88 ž��ָ��� �ƾ���� ���Ÿ','��ũ���','��Ÿ',679000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=649');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-12','GA48 ž�ָ��� �ƾ���� ���Ÿ','��ũ���','��Ÿ',590000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=648');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-13','S27 ž�ָ��� �ƾ���� ���Ÿ','��ũ���','��Ÿ',399000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=643');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-14','S21 ž�ָ��� ���Ÿ','��ũ���','��Ÿ',345000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=639');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-15','EArth100 SSF ž�ָ��� ���Ÿ','��Ʈ','��Ÿ',440000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=635');
