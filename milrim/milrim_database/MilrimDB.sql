-- Member table
CREATE TABLE Member (
    ID VARCHAR2(100) PRIMARY KEY,
    Pass VARCHAR2(100),
    Name VARCHAR2(100),
    Email VARCHAR2(100),
    PhoneNumber VARCHAR2(100),
    Auth VARCHAR2(100)
);
-- Select all data from Member table
SELECT * FROM Member;

SELECT * FROM MEMBER WHERE ID like 'heoyoun38' AND PASS like '00000000';

SELECT * FROM MEMBER WHERE id LIKE '%'||'heoyoun38'||'%' and NAME LIKE '%'||'윤석민'||'%';

INSERT INTO MEMBER values('heoyoun38','00000000','윤석민','heoyoun38@naver.com','01022222222','admin');
-- Video Post table
CREATE TABLE VideoPost (
    VideoID VARCHAR2(100) PRIMARY KEY,
    Title VARCHAR2(100),
    Synopsis VARCHAR2(100),
    Image VARCHAR2(100),
    Video VARCHAR2(100),
    UploadDate DATE,
    ParentNumber VARCHAR2(100)
);

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

