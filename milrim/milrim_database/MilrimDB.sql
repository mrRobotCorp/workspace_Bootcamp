-- Member table
CREATE TABLE Member (
    ID VARCHAR2(100) PRIMARY KEY,
    Pass VARCHAR2(100),
    Name VARCHAR2(100),
    Email VARCHAR2(100),
    PhoneNumber VARCHAR2(100),
    Auth VARCHAR2(100)
);

DELETE FROM member WHERE id = '1123';

-- Select all data from Member table
SELECT * FROM Member;

SELECT * FROM MEMBER WHERE ID like 'heoyoun38' AND PASS like '00000000';

SELECT * FROM MEMBER WHERE id LIKE '%'||'heoyoun38'||'%' and NAME LIKE '%'||'윤석민'||'%';

INSERT INTO MEMBER values('heoyoun38','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');
INSERT INTO MEMBER values('heoyo123','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');
INSERT INTO MEMBER values('heoyo123','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');
INSERT INTO MEMBER values('heo12338','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');
INSERT INTO MEMBER values('heoy238','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');
INSERT INTO MEMBER values('he2338','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');
INSERT INTO MEMBER values('he12n38','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');
INSERT INTO MEMBER values('heoy23n38','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');
INSERT INTO MEMBER values('heoyo4238','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');
INSERT INTO MEMBER values('heo1238','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');
INSERT INTO MEMBER values('heo2238','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');
INSERT INTO MEMBER values('heo23238','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');

INSERT INTO MEMBER values('heo22338','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');
INSERT INTO MEMBER values('h2323n38','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');
INSERT INTO MEMBER values('heo22338','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');
INSERT INTO MEMBER values('heo22338','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');
INSERT INTO MEMBER values('heo2338','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');

INSERT INTO MEMBER values('heo2338','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');
INSERT INTO MEMBER values('h23o23238','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');

-- Video Post table
CREATE TABLE VideoPost (
    VideoID VARCHAR2(100) PRIMARY KEY,
    Title VARCHAR2(100),
    Synopsis VARCHAR2(100),
    Image VARCHAR2(100),
    Video VARCHAR2(100),
    UploadDate DATE,
    ParentNumber VARCHAR2(100),
  	value VARCHAR2(100)
);

DROP TABLE VIDEOPOST;
DELETE FROM VIDEOPOST;

CREATE SEQUENCE postSQU
    START WITH 1   -- 시작값 설정 (기본값: 1)
    INCREMENT BY 1 -- 증가값 설정 (기본값: 1)
    MAXVALUE 99999
    NOCACHE;
   
SELECT  * FROM VIDEOPOST v ;

INSERT INTO VIDEOPOST VALUES ('v'||postSQU.nextval, '진격의 거인', '설명샬아상라', 'image1', 'video1', sysdate,'진격의거인',NULL);
INSERT INTO VIDEOPOST VALUES ('v'||postSQU.nextval, '갓슈벨', '설명샬아상라1', 'image2', 'video2', sysdate,'갓슈벨',NULL);
INSERT INTO VIDEOPOST VALUES ('v'||postSQU.nextval, '흑집사', '설명샬아상라2', 'image3', 'video3', sysdate,'흑집사',NULL);
INSERT INTO VIDEOPOST VALUES ('v'||postSQU.nextval, '코난', '설명샬아상라3', 'image4', 'video4', sysdate,'코난',NULL);

INSERT INTO VIDEOPOST VALUES ('v'||postSQU.nextval, '진격의 거인1화', '줄거리', 'image1-1', 'video1-1', sysdate,'1','진격의거인');
INSERT INTO VIDEOPOST VALUES ('v'||postSQU.nextval, '진격의 거인2화', '줄거리', 'image1-2', 'video1-2', sysdate,'2','진격의거인');
INSERT INTO VIDEOPOST VALUES ('v'||postSQU.nextval, '진격의 거인3화', '줄거리', 'image1-3', 'video1-3', sysdate,'3','진격의거인');
INSERT INTO VIDEOPOST VALUES ('v'||postSQU.nextval, '갓슈벨 1화', '줄거리', 'image2-1', 'video2-1', sysdate,'1','갓슈벨');
INSERT INTO VIDEOPOST VALUES ('v'||postSQU.nextval, '갓슈벨 2화', '줄거리', 'image2-2', 'video2-2', sysdate,'2','갓슈벨');
INSERT INTO VIDEOPOST VALUES ('v'||postSQU.nextval, '갓슈벨 3화', '줄거리', 'image2-3', 'video2-3', sysdate,'3','갓슈벨');

DELETE FROM VIDEOPOST WHERE VALUE = '갓슈벨';

SELECT LEVEL, p.*
FROM VIDEOPOST p
START WITH ParentNumber LIKE '%'||''||'%'
CONNECT BY PRIOR ParentNumber = value;

SELECT LEVEL, v.*
FROM VIDEOPOST v
START WITH value IS NULL 
CONNECT BY PRIOR ParentNumber = value;




-- Comment table
CREATE TABLE Comment (
    CommentID VARCHAR2(100) PRIMARY KEY,
    PostID VARCHAR2(100) REFERENCES VideoPost(VideoID),
    Content VARCHAR2(100),
    CDate DATE,
    ID VARCHAR2(100) REFERENCES Member(ID) ON DELETE CASCADE
);

-- Tag table
CREATE TABLE Tag (
    VideoID VARCHAR2(100) REFERENCES VideoPost(VideoID) ON DELETE CASCADE,
    TagName VARCHAR2(100)
);

-- Bookmark table
CREATE TABLE Bookmark (
    ID VARCHAR2(100) REFERENCES Member(ID) ON DELETE CASCADE,
    VideoID VARCHAR2(100) REFERENCES VideoPost(VideoID) ON DELETE CASCADE
);

-- Card table
CREATE TABLE Card (
    ID VARCHAR2(100) REFERENCES Member(ID) ON DELETE CASCADE,
    CardInfo VARCHAR2(100)
);

-- Free Board table
CREATE TABLE FreeBoard (
    PostID VARCHAR2(100) PRIMARY KEY,
    Title VARCHAR2(100),
    Content VARCHAR2(3000),
    FBDate DATE,
    ID VARCHAR2(100) REFERENCES Member(ID) ON DELETE CASCADE
);
      
CREATE SEQUENCE freeboSQU
    START WITH 1   -- 시작값 설정 (기본값: 1)
    INCREMENT BY 1 -- 증가값 설정 (기본값: 1)
    MAXVALUE 99999
    NOCACHE;       
   
SELECT * FROM FREEBOARD f ;

DELETE FROM FREEBOARD WHERE postid = #{postid};
DELETE FROM FREEBOARD WHERE postid = 3;


SELECT postid,title,TO_CHAR (fbdate,'YYYY-MM-DD'),id FROM FREEBOARD WHERE title LIKE '%'||'실험2'||'%';
INSERT INTO FREEBOARD VALUES (freeboSQU.nextval,'실험','안녕~',sysdate,'heoyoun38');
INSERT INTO FREEBOARD VALUES (freeboSQU.nextval,'실험2','안녕~2',sysdate,'himan');
INSERT INTO FREEBOARD VALUES (freeboSQU.nextval,'실험3','안녕~3',sysdate,'himan');
-- Membership table
CREATE TABLE Membership (
    MembershipID VARCHAR2(100) PRIMARY KEY,
    ID VARCHAR2(100) REFERENCES Member(ID) ON DELETE CASCADE,
    MembershipStartDate DATE,
    MembershipEndDate DATE
);


-- Select all data from VideoPost table
SELECT * FROM VideoPost;

-- Select all data from Comment table
SELECT * FROM Comment01;

-- Select all data from Tag table
SELECT * FROM Tag;

-- Select all data from Bookmark table
SELECT * FROM Bookmark;

-- Select all data from Card table
SELECT * FROM Card;

-- Select all data from FreeBoard table
SELECT * FROM FreeBoard;

-- Select all data from Membership table
SELECT * FROM Membership;



-- Drop VideoPost table
DROP TABLE VideoPost;

-- Drop Comment table
DROP TABLE Comment01;

-- Drop Tag table
DROP TABLE Tag;

-- Drop Bookmark table
DROP TABLE Bookmark;

-- Drop Card table
DROP TABLE Card;

-- Drop FreeBoard table
DROP TABLE FreeBoard;

-- Drop Membership table
DROP TABLE Membership;

-- Drop Member table
DROP TABLE Member;

