--------------------------------------------------------
--  파일이 생성됨 - 일요일-5월-21-2023   
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
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-24','기타 스트링 교체 키트 SMALL SYSTEM65','던롭','관리용품',59000,100,'https://www.grabtheguitar.com/care/?idx=538');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-25','친환경 사계절 통기타 습도관리 팩','모도리','관리용품',8000,100,'https://www.grabtheguitar.com/care/?idx=204');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-26','후면보호 투명 픽가드','힐링쉴드','관리용품',16800,100,'https://www.grabtheguitar.com/care/?idx=536');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-27','숨캐비넷 1단 블랙 SGA-700','벤티볼리오','관리용품',895000,100,'https://www.grabtheguitar.com/care/?idx=798');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-30','PRO 통기타 습도관리 메탈 댐핏','리밸러스','관리용품',18000,100,'https://www.grabtheguitar.com/care/?idx=523');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-31','어쿠스틱 기타 하드케이스','벤티볼리오','관리용품',150000,100,'https://www.grabtheguitar.com/care/?idx=682');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-1','SLG200S 사일러트 어쿠스틱 기타','야마하','기타',850000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=854');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-2','W311 탑솔리드 입문용 드레드넛 통기타','웨버','기타',285000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=828');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-3','W313 탑솔리드 입문용 컷어웨이 통기타','웨버','기타',285000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=827');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-16','던롭 정품 기타 피크 모음','던롭','피크',1000,1000,'https://www.grabtheguitar.com/98/?idx=705');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-17','CRADLE 스테인레스 기타 카포','다다리오','카포',90000,100,'https://www.grabtheguitar.com/capo/?idx=606');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-18','RATCHET 기타 카포','다다리오','카포',15000,100,'https://www.grabtheguitar.com/capo/?idx=603');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-19','CURVED TRIGGER 기타 카포','던롭','카포',24000,100,'https://www.grabtheguitar.com/capo/?idx=557');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-20','AXIS DUAL RADIUS 기타 카포','어니볼','카포',19000,100,'https://www.grabtheguitar.com/capo/?idx=564');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-21','원터치 기타 카포','모도리','카포',29000,100,'https://www.grabtheguitar.com/capo/?idx=570');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-22','C-1 기타 카포','올림피아','카포',15000,100,'https://www.grabtheguitar.com/capo/?idx=219');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-23','CT-100 카포 튜너','그랩튠','카포',29000,100,'https://www.grabtheguitar.com/capo/?idx=521');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-24','기타 스트링 교체 키트 SMALL SYSTEM65','던롭','관리용품',59000,100,'https://www.grabtheguitar.com/care/?idx=538');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-25','친환경 사계절 통기타 습도관리 팩','모도리','관리용품',8000,100,'https://www.grabtheguitar.com/care/?idx=204');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-26','후면보호 투명 픽가드','힐링쉴드','관리용품',16800,100,'https://www.grabtheguitar.com/care/?idx=536');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-27','숨캐비넷 1단 블랙 SGA-700','벤티볼리오','관리용품',895000,100,'https://www.grabtheguitar.com/care/?idx=798');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-30','PRO 통기타 습도관리 메탈 댐핏','리밸러스','관리용품',18000,100,'https://www.grabtheguitar.com/care/?idx=523');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-31','어쿠스틱 기타 하드케이스','벤티볼리오','관리용품',150000,100,'https://www.grabtheguitar.com/care/?idx=682');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-1','SLG200S 사일러트 어쿠스틱 기타','야마하','기타',850000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=854');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-2','W311 탑솔리드 입문용 드레드넛 통기타','웨버','기타',285000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=828');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-3','W313 탑솔리드 입문용 컷어웨이 통기타','웨버','기타',285000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=827');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-16','던롭 정품 기타 피크 모음','던롭','피크',1000,1000,'https://www.grabtheguitar.com/98/?idx=705');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-17','CRADLE 스테인레스 기타 카포','다다리오','카포',90000,100,'https://www.grabtheguitar.com/capo/?idx=606');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-18','RATCHET 기타 카포','다다리오','카포',15000,100,'https://www.grabtheguitar.com/capo/?idx=603');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-19','CURVED TRIGGER 기타 카포','던롭','카포',24000,100,'https://www.grabtheguitar.com/capo/?idx=557');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-20','AXIS DUAL RADIUS 기타 카포','어니볼','카포',19000,100,'https://www.grabtheguitar.com/capo/?idx=564');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-21','원터치 기타 카포','모도리','카포',29000,100,'https://www.grabtheguitar.com/capo/?idx=570');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-22','C-1 기타 카포','올림피아','카포',15000,100,'https://www.grabtheguitar.com/capo/?idx=219');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-23','CT-100 카포 튜너','그랩튠','카포',29000,100,'https://www.grabtheguitar.com/capo/?idx=521');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-28','숨캐비넷 1단 화이트 SGA-700W','벤티볼리오','관리용품',940000,100,'https://www.grabtheguitar.com/care/?idx=796');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-29','기타 지판 관리 레몬오일','던롭','관리용품',9000,100,'https://www.grabtheguitar.com/care/?idx=202');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-4','W993HE 올솔리드 컷어웨이 통기타','웨버','기타',980000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=822');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-5','Sting F200 BT 탑솔리드 OM바디 통기타','헥스','기타',229000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=793');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-6','Sting SJ300 CB 점보바디 탑솔리드 통기타','헥스','기타',275000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=790');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-7','R3MCE 컷어웨이 탑솔리드 통기타','래스본','기타',670000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=713');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-8','R3SRCE 컷어웨이 탑솔리드 통기타','래스본','기타',770000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=717');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-9','R3SKCE 컷어웨이 탑솔리드 통기타','래스본','기타',800000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=715');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-10','R2SMPBK OM바디 탑솔리드 통기타','래스본','기타',650000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=711');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-11','GA88 탑백솔리드 컷어웨이 통기타','파크우드','기타',679000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=649');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-12','GA48 탑솔리드 컷어웨이 통기타','파크우드','기타',590000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=648');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-13','S27 탑솔리드 컷어웨이 통기타','파크우드','기타',399000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=643');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-14','S21 탑솔리드 통기타','파크우드','기타',345000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=639');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-15','EArth100 SSF 탑솔리드 통기타','콜트','기타',440000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=635');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-28','숨캐비넷 1단 화이트 SGA-700W','벤티볼리오','관리용품',940000,100,'https://www.grabtheguitar.com/care/?idx=796');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-29','기타 지판 관리 레몬오일','던롭','관리용품',9000,100,'https://www.grabtheguitar.com/care/?idx=202');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-4','W993HE 올솔리드 컷어웨이 통기타','웨버','기타',980000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=822');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-5','Sting F200 BT 탑솔리드 OM바디 통기타','헥스','기타',229000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=793');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-6','Sting SJ300 CB 점보바디 탑솔리드 통기타','헥스','기타',275000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=790');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-7','R3MCE 컷어웨이 탑솔리드 통기타','래스본','기타',670000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=713');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-8','R3SRCE 컷어웨이 탑솔리드 통기타','래스본','기타',770000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=717');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-9','R3SKCE 컷어웨이 탑솔리드 통기타','래스본','기타',800000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=715');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-10','R2SMPBK OM바디 탑솔리드 통기타','래스본','기타',650000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=711');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-11','GA88 탑백솔리드 컷어웨이 통기타','파크우드','기타',679000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=649');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-12','GA48 탑솔리드 컷어웨이 통기타','파크우드','기타',590000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=648');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-13','S27 탑솔리드 컷어웨이 통기타','파크우드','기타',399000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=643');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-14','S21 탑솔리드 통기타','파크우드','기타',345000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=639');
Insert into SCOTT.GRAB_PRODUCT (PRO_NUM,PRO_NAME,PRO_BRAND,PRO_CAT,PRO_PRICE,PRO_STOCK,PRO_ADDRS) values ('P-15','EArth100 SSF 탑솔리드 통기타','콜트','기타',440000,100,'https://www.grabtheguitar.com/acousticguitar/?idx=635');
