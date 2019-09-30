--------------------------------------------------------
--  파일이 생성됨 - 월요일-9월-30-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table KD_COMMENT
--------------------------------------------------------

  CREATE TABLE "MOMSMAP"."KD_COMMENT" 
   (	"CMID" NUMBER(6,0), 
	"KDID" VARCHAR2(20 BYTE), 
	"WRITER" VARCHAR2(20 BYTE), 
	"IDATE" DATE, 
	"CONTENTS" VARCHAR2(1000 BYTE), 
	"SCORE" VARCHAR2(10 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into MOMSMAP.KD_COMMENT
SET DEFINE OFF;
Insert into MOMSMAP.KD_COMMENT (CMID,KDID,WRITER,IDATE,CONTENTS,SCORE) values (3,'SD003','minji',to_date('19/09/17','RR/MM/DD'),'hi','4');
Insert into MOMSMAP.KD_COMMENT (CMID,KDID,WRITER,IDATE,CONTENTS,SCORE) values (4,'SP038','minji',to_date('19/09/17','RR/MM/DD'),'？？？','1.3');
Insert into MOMSMAP.KD_COMMENT (CMID,KDID,WRITER,IDATE,CONTENTS,SCORE) values (5,'SC029','minji',to_date('19/09/17','RR/MM/DD'),'hi','4');
Insert into MOMSMAP.KD_COMMENT (CMID,KDID,WRITER,IDATE,CONTENTS,SCORE) values (1,'SC029','삼둥이맘',to_date('19/08/06','RR/MM/DD'),'유치원비가 좀 비싸긴 한데 ㅠ 그만큼 시설이 좋아요','3.8');
Insert into MOMSMAP.KD_COMMENT (CMID,KDID,WRITER,IDATE,CONTENTS,SCORE) values (2,'SC029','조폭마누라',to_date('19/08/06','RR/MM/DD'),'우리 민지가... 폭력성이 좋아졌네요.','5.0');
Insert into MOMSMAP.KD_COMMENT (CMID,KDID,WRITER,IDATE,CONTENTS,SCORE) values (3,'SC029','다둥스',to_date('19/08/06','RR/MM/DD'),'청계숲의 기운을 애가 얻어 영어를 잘해요.','4.1');
Insert into MOMSMAP.KD_COMMENT (CMID,KDID,WRITER,IDATE,CONTENTS,SCORE) values (4,'SC029','조맘',to_date('19/08/06','RR/MM/DD'),'우리 규상이가 인사성이 밝아졌어요~','4.6');
Insert into MOMSMAP.KD_COMMENT (CMID,KDID,WRITER,IDATE,CONTENTS,SCORE) values (1,'JG004','minji',to_date('19/08/07','RR/MM/DD'),'hihi','5');
Insert into MOMSMAP.KD_COMMENT (CMID,KDID,WRITER,IDATE,CONTENTS,SCORE) values (2,'JG014','minji',to_date('19/08/07','RR/MM/DD'),'？？？？？？？？','4');
