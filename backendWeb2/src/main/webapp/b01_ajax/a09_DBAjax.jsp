<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a09</title>
</head>
<body>
	<%--
	DB연동 dao 확인 - dao 패키지 클래스/단위 객체 확인 -> import
	z10_jobDBAll.jsp - 위 내용 import 및 전체 데이터 리스트 처리
	(tr td 데이터) for문 처리
	a09_DBAjax.jsp
		1) 이벤트 핸들러 함수 선언
			기본 ajax 처리 함수 복사
			callAjax() - 위 처리 함수 호출 할 페이지 전달
		2) 출력한 DOM 객체 선언 및 위 getSyn 내용 할당
		
	 --%>
	<script>

		function getSyn(page){
			var xhr = new XMLHttpRequest();
			xhr.open("get",page,false);
			xhr.send()
			return xhr.responseText;
		}
		function callEmpList() {
			let ename = document.querySelector("#ename").value;
			let job = document.querySelector("#job").value;
			let tbd = document.querySelector(".empList");
			tbd.innerHTML = getSyn("z09_empDBAll.jsp?ename=" 
					+ ename + "&job=" + job);
		}
		
		function key13() {
			if(event.keyCode == 13) { // 입력중일 때 enter 입력 시 검색
				callEmpList();
			}
		}
		
		function callJobList() {
			let jbd = document.querySelector(".jobList");
			jbd.innerHTML = getSyn("z10_jobDBAll.jsp");
			
		}
	</script>
    <div class="container mt-3">
       <h2>사원정보</h2>
       <form action="" method = "post">
            <div class="mb-3 mt-3">
            <label for="empno">사원명:</label>
            <input type="text" onkeyup="key13()" class="form-control" 
              id="ename" placeholder="사원명 입력" name="ename">
            </div>
            <div class="mb-3 mt-3">
            <label for="job">직책명:</label>
            <input type="text" onkeyup="key13()" class="form-control" 
              id="job" placeholder="사원명 입력" name="job">
            </div>
            <button type="button" onclick="callEmpList()" class="btn btn-primary">등록</button>
            <button type="button" onclick="callJobList()" class="btn btn-primary">등록</button>
        </form>
       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>사원번호</th>
                 <th>사원명</th>
                 <th>직책명</th>
                 <th>관리자명</th>
                 <th>입사일</th>
                 <th>급여</th>
                 <th>보너스</th>
                 <th>부서번호</th>
               </tr>
          </thead>
          <tbody class="empList">
          </tbody>
        </table>    
        <table class="table">
          <thead class="table-success">
               <tr>
                 <th>직책 아이디</th>
                 <th>직책명</th>
                 <th>최소급여</th>
                 <th>최고급여</th>
               </tr>
          </thead>
          <tbody class="jobList">
          </tbody>
        </table>       
     </div>
</body>
</html>