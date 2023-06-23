
1) 도서관의 도서 대출 테이블
| 대출ID | 도서ID | 도서제목 | 대출일자 | 회원ID | 회원이름 |
- 제2정규화 적용:
    - 테이블을 분리하여 대출 정보와 도서, 회원 정보를 별도의 테이블로 나눕니다.
    - 대출 테이블:
      | 대출ID | 대출일자 | 회원ID |
    - 도서 테이블:
      | 도서ID | 도서제목 |
    - 회원 테이블:
      | 회원ID | 회원이름 |

2) 랜트카 시스템의 차량 랜트 테이블
| 랜트ID | 차량ID | 차량모델 | 랜트일자 | 고객ID | 고객이름 |
- 제2정규화 적용:
    - 테이블을 분리하여 랜트 정보와 차량, 고객 정보를 별도의 테이블로 나눕니다.
    랜트 테이블:
      | 랜트ID | 랜트일자 | 차량ID | 고객ID |
    - 차량 테이블:
      | 차량ID | 차량모델 |
    - 고객 테이블:
      | 고객ID | 고객이름 |

3) SNS의 좋아요 테이블
| 좋아요ID | 게시글ID | 게시글제목 | 좋아요시간 | 사용자ID | 사용자이름 |
- 제2정규화 적용:
    - 테이블을 분리하여 좋아요 정보와 게시글, 사용자 정보를 별도의 테이블로 나눕니다.
    - 좋아요 테이블:
      | 좋아요ID | 좋아요시간 | 게시글ID | 사용자ID |
    - 게시글 테이블:
      | 게시글ID | 게시글제목 |
    - 사용자 테이블:
      | 사용자ID | 사용자이름 |

5. 계층적 구조로 게시물과 답글을 작성하고, 계층적 SQL을 이용해서 처리하는 예제 코드는 아래와 같습니다:

게시물과 답글을 저장하기 위한 Oracle 테이블을 생성하고, 계층적 SQL을 사용하여 출력하는 예제를 제시합니다.

테이블 구조:


-- 게시물 테이블
CREATE TABLE posts (
  post_id NUMBER,
  title VARCHAR2(100),
  content VARCHAR2(4000),
  parent_id NUMBER,
  CONSTRAINT posts_pk PRIMARY KEY (post_id),
  CONSTRAINT posts_fk FOREIGN KEY (parent_id) REFERENCES posts (post_id)
);

-- 시퀀스 생성
CREATE SEQUENCE posts_seq START WITH 1 INCREMENT BY 1;
```

데이터 입력:

-- 게시물 데이터 입력
INSERT INTO posts (post_id, title, content, parent_id) 
	VALUES (posts_seq.nextval, '게시물 1', '첫 번째 게시물입니다.', NULL);
INSERT INTO posts (post_id, title, content, parent_id)
	 VALUES (posts_seq.nextval, '게시물 2', '두 번째 게시물입니다.', NULL);
INSERT INTO posts (post_id, title, content, parent_id) 
	VALUES (posts_seq.nextval, '답글 1-1', '첫 번째 게시물의 답글입니다.', 1);
INSERT INTO posts (post_id, title, content, parent_id)
	 VALUES (posts_seq.nextval, '답글 1-2', '첫 번째 게시물의 두 번째 답글입니다.', 1);
INSERT INTO posts (post_id, title, content, parent_id)
 VALUES (posts_seq.nextval, '답글 2-1', '두 번째 게시물의 답글입니다.', 2);
```

SELECT * FROM posts;


SELECT
    LPAD(' ', (LEVEL - 1) * 4, ' ') || title AS title,
    content
FROM
    posts
START WITH
    parent_id IS NULL -- 최상위 게시물만 시작점으로 설정
CONNECT BY PRIOR
    post_id = parent_id
ORDER SIBLINGS BY
    post_id ASC;
    
   
   
   
   
   
   
   
   