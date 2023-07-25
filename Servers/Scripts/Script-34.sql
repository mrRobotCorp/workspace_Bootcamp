CREATE TABLE restore (
	no NUMBER,
	content varchar2(100),
	filename varchar2(100),
	regdte DATE,
	uptdte DATE
);

SELECT * FROM restore;

CREATE SEQUENCE file_seq;

select file_seq.nextval from dual;

insert into restore values(1, '내용', '파일명', sysdate, sysdate);

select * from restore
where no = 1;

DELETE FROM RESTORE;
SELECT * from restore order by regdte DESC;

SELECT * FROM MEMBER02;

SELECT * FROM JOBS
WHERE JOB_ID LIKE '%'||'A'||'%'
AND JOB_TITLE LIKE '%'||'V'||'%';

