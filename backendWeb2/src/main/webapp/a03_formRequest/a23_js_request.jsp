<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a23</title>
</head>
<body>
	<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	if(id == null) id = "";
	if(pw == null) pw = "";
	
	String isValid = "I"; // 초기화면
	// 초기화면 제외	
	if(id.equals("") && pw.equals("")) {
		isValid = "I";
	// 인증
	} else if(id.equals("himan") && pw.equals("1111")) {
		isValid = "Y";
	// 미인증
	} else {
		isValid = "N";
	}
	
	%>
	<script>
		let isValid = "<%=isValid%>";
		
		if(isValid == "Y") {
			alert("인증성공");
			// location.href = "a24_main.jsp";
		}
		if(isValid == "N") {
			alert("인증실패");
		}
	// ex) a24_js_request.jsp
	// 회원등록
	// id [] [등록된 여부] --> 
	// jsp : 요청값으로 himan
	// js : 등록 여부에 따라 등록된 회원 있다 없다 출력
	</script>
    <div class="container mt-3">
       <h2>로그인</h2>
       <form method="post">
            <div class="mb-3 mt-3">
	            <label for="id">ID 입력:</label>
	            <input type="text" class="form-control" 
	              id="id" placeholder="아이디 입력" name="id">
            </div>
            <div class="mb-3 mt-3">
	            <label for="pw">PW 입력:</label>
	            <input type="password" class="form-control" 
	              id="pw" placeholder="비밀번호 입력" name="pw">
            </div>
            <button type="submit" class="btn btn-primary">등록</button>
        </form>        
     </div>
     
     
</body>
</html>