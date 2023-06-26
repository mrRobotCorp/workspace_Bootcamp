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
<%
	String id = request.getParameter("id");
%>
	<script>
	// ex) a03_callId.jsp
	// id : [   ] [ 등록여부확인 ]
	// z03_data.jsp
	// higirl,goodGirl,hiLady
	// 데이터와 동일여부 확인해서 없으면 등록 가능, 있으면 등록된 아이디입니다. 처리
	
	// form 하위에 있는 input은 기본적으로 enter 자동 submit 처리됨
	// 이것을 방지하기 위해 event.preventDefault();
	// 기본 이벤트 방지 처리
		function checkId() {
			let xhr = new XMLHttpRequest();
			xhr.open("get", "z03_data.jsp", false);
			xhr.send();
			let data = xhr.responseText;
			let arr = data.split(",");
			let id = document.querySelector("#id").value;
			let hasId = false;
			
			arr.forEach(function(e, i) {
				if(e == id) {
					hasId = true;
				}
			});
			
			if(hasId) {
				alert("등록된 ID가 있음");
			} else {
				alert("등록 가능");
			}
		}
	
	</script>
    <div class="container mt-3">
       <h2 >아이디 등록 여부 확인</h2>
       <form action="" method="post">
            <div class="mb-3 mt-3">
            <label for="id">아이디 :</label>
            <input type="text" class="form-control" 
              id="id" placeholder="아이디 입력" name="id">
            </div>
            <button onclick="checkId()" type="submit" class="btn btn-primary">확인</button>
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