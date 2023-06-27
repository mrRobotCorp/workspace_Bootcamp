<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
</head>
<body>
	<script>
		function getSyn(page){
			let xhr = new XMLHttpRequest();
			xhr.open("get",page,false);
			xhr.send();
			return xhr.responseText;
		}
		
		function showEx02() {
			let ex02 = document.querySelector(".ex02");
			ex02.innerHTML = getSyn("ex0627_data1.jsp");
		}
		
		function showEx03() {
			let pname= document.querySelector("#pname").value;
			let price = document.querySelector("#price").value;
			let ex03 = document.querySelector(".ex03");
			ex03.innerHTML = getSyn("ex0627_data2.jsp?pname=" + pname
					+ "&price=" + price);
		}
		
		function showEx04() {
			let mgrBd = document.querySelector(".mgrBd");
			mgrBd.innerHTML = getSyn("ex0627_data3.jsp");
			
		}
		
		function showEx05() {
			let memInfo = document.querySelector(".memInfo");
			
		}
		
		
	</script>
    <div class="container mt-3">
       <h3 onclick="showEx02()">2번 내용 출력(click)</h3>
       <div class="ex02"></div>
       <form action="" method="post">
   			<div class="mb-3 mt-3">
            <label for="pname">물건명:</label>
            <input type="text" class="form-control" 
              id="pname" placeholder="물건명 입력" name="pname">
            </div>
            <div class="mb-3 mt-3">
            <label for="price">가격:</label>
            <input type="number" class="form-control" 
              id="price" placeholder="가격 입력" name="price">
            </div>
            <button type="button" onclick="showEx03()" class="btn btn-primary">전송 및 화면 호출</button>
        </form>
        <div class="ex03"></div>
        <button onclick="showEx04()">4번 내용 출력(click)</button>
       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>사원번호</th>
                 <th>사원명</th>
                 <th>부서명</th>
               </tr>
          </thead>
          <tbody class="mgrBd">
          </tbody>
        </table>   
        
        <form action="" method="post">
   			<div class="mb-3 mt-3">
            <label for="id">아이디:</label>
            <input type="text" class="form-control" 
              id="id" placeholder="아이디 입력" name="id">
            </div>
            <div class="mb-3 mt-3">
            <label for="pw">비밀번호:</label>
            <input type="password" class="form-control" 
              id="pw" placeholder="비밀번호 입력" name="pw">
            </div>
            <button type="button" onclick="showEx05()" class="btn btn-primary">로그인</button>
        </form>  
        <table class="table">
          <thead class="table-success">
               <tr>
                 <th>사원번호</th>
                 <th>사원명</th>
                 <th>부서명</th>
               </tr>
          </thead>
          <tbody class="memInfo">
          </tbody>
        </table>     
     </div>
</body>
</html>