<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a05</title>
</head>
<body>
	<script>
	// z05_json2.jsp 회원정보 json 데이터 선언
	// a05_memberInfo.jsp 회원 정보 가져오기 클릭 시 테이블에 회원정보 출력
	function getMemInfo() {
		let xhr = new XMLHttpRequest();
		xhr.open("get", "z05_json2.jsp", false);
		xhr.send();
		let data = xhr.responseText;
		let ob = JSON.parse(data);
		
		let tds = document.querySelectorAll("tbody td");
		tds[0].innerText = ob.name;
		tds[1].innerText = ob.age;
		tds[2].innerText = ob.point;
		tds[3].innerText = ob.grade;
		
	}
	</script>
    <div class="container mt-3">
       <button class="btn btn-primary" type="button" onclick ="getMemInfo()">회원정보 가져오기</button>
       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>회원명</th>
                 <th>회원 나이</th>
                 <th>포인트</th>
                 <th>등급</th>
               </tr>
          </thead>
          <tbody>
               <tr>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
               </tr>
          </tbody>
        </table>         
     </div>
</body>
</html>