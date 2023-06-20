<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a21</title>
</head>
<body>
	<%
	String name = "Joe";
	int age = 25;
	boolean isAdult = age>=18;
	%>
	<script>
		let name = "<%=name%>";
		let age = <%=age%>;
		let isAdult = <%=isAdult%>;
		
		alert("이름은 : " + name);
		alert("나이는 : " + age);
		
		if(isAdult) {
			alert("성년");
		} else {
			alert("미성년");
		}
	// 다시 서버에 넘기는 어쩌구
	// a22_conn_js.jsp 
	// java 구매 물건명, 가격, 갯수 설정 후
	// js에 해당 내용 할당 후 총계, 5만원 이상이면 고가/아니면 저가 alert
	</script>
    <div class="container mt-3">
       <h2 onclick="call()">사원정보 등록</h2>
       <script>
       	function call() {
       		alert("서버에서 온 이름 : " + name)
       	};
       </script>
       <form action="/">
            <div class="mb-3 mt-3">
            <label for="empno">사원번호:</label>
            <input type="number" class="form-control" 
              id="empno" placeholder="사원명 입력" name="empno">
            </div>
            <button type="submit" class="btn btn-primary">등록</button>
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