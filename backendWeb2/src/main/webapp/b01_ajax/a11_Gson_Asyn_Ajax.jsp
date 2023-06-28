<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a11</title>
</head>
<body>
	<script>
		function asyGet(page) {
			let xhr = new XMLHttpRequest();
			xhr.open("get", page, true); // 비동기 옵션 (true)
			xhr.send();
			let ret = "";
			xhr.onreadystatechange = function() {
				// 상태값을 확인해서 전송이 완료되고, 200(정상)일 때
				// 리턴 처리
				if(xhr.readyState == 4 && xhr.status == 200) {
					console.log(xhr.responseText);
					let memObj = JSON.parse( );
					if(memObj.id == "") {
						alert(idOb.value + "은/는 사용가능한 아이디입니다.");
					}else {
						alert(memObj.id + "은/는 이미 등록되어 있습니다.");
						idOb.value = "";
						idOb.focus();
						
					}
				}
			}
			// return ret;
		}
		function checkMem() {
			let idOb = document.querySelector("#id"); 
			// ajax 확인 전, 공백, 크기에 대한 체트 후 ajax 처리
			let page = "z11_memberCheck.jsp?id=" + idOb.value;
			// asyGet(page);
			let xhr = new XMLHttpRequest();
			xhr.open("get", page, true);
			xhr.send();
			xhr.onreadystatechange = function() {
				if(xhr.readyState ==4 && xhr.status ==200) {
					let memObj = JSON.parse(xhr.responseText);
					if(memObj.id == "") {
						alert(idOb.value + "은/는 사용가능한 아이디입니다.");
					}else {
						alert(memObj.id + "은/는 이미 등록되어 있습니다.");
						idOb.value = "";
						idOb.focus();
						
					}
				}
			}
			
		}
	</script>
    <div class="container mt-3">
       <h2>회원정보 등록</h2>
       <form action="" method="post">
            <div class="mb-3 mt-3">
            <label for="id">아이디:</label>
            <input type="text" class="form-control" 
              id="id" placeholder="아이디 입력" name="id">
            </div>
            <button type="button" onclick="checkMem()" class="btn btn-success">유효성 확인</button>
        	<div class="mb-3 mt-3">
            <label for="dd">아이디:</label>
            <input type="text" class="form-control" 
              id="name" placeholder="아이디 입력" name="name">
            </div>
        </form>
       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>Firstname</th>
                 <th>Lastname</th>
                 <th>Email</th>
               </tr>
          </thead>
          <tbody>
               <tr>
                 <td>John</td>
                 <td>Doe</td>
                 <td>john@example.com</td>
               </tr>
          </tbody>
        </table>         
     </div>
</body>
</html>