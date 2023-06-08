SELECT * FROM EMP03 e ;

CREATE TABLE emp03
AS SELECT * FROM emp;

SELECT max(empno) FROM EMP03 e ;
INSERT INTO EMP03 VALUES (1000, 'Amy', '사원', 7902, sysdate, 4000, 300, 10);

ROLLBACK;
COMMIT;

-- 입력 후 commit rollback 기능 확인
-- ex) 1002, 'Kevin' 입력

INSERT INTO emp03 VALUES (1002, 'Kate', '사원', 7903, sysdate, 3800, 290, 10);



