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
	if(id == null) id = "";
	String isReg  = "I";
	// 초기화면 / 등록여부 확인 구분
	if(id.equals("himan")) {
		isReg  = "Y";
	} else if(id.equals("")) { // 초기화면
		isReg = "I";
	} else {
		isReg = "Y";		
	}
	%>
	
	
    <div class="container mt-3">
       <h2>회원 등록</h2>
       <form method="post">
            <div class="mb-3 mt-3">
	            <label for="id">ID:</label>
	            <input type="text" class="form-control" 
	              id="id" placeholder="아이디 입력" name="id">
            </div>
            <button type="submit" class="btn btn-primary">등록여부 확인</button>
        </form>
     <script>
		// ex) a24_js_request.jsp
		// 회원등록
		// id [] [등록된 여부] --> 
		// jsp : 요청값으로 himan
		// js : 등록 여부에 따라 등록된 회원 있다 없다 출력
		let btn = document.querySelector(".btn-primary");
		let isReg = "<%=isReg%>";
		let id = "<%=id%>";
		
		if(isReg == "Y")) {
			alert("등록 회원이 있습니다.");
		}
		if(isReg == "N") {
			alert("등록 가능한 아이디 입니다.");
			document.querySelector("#id").value = "<%=id%>";
			// id에 대한 유효성이 완료될 때 회원정보 등록이 가능하게 할 때 꼭 필요
			btn.value = "유효성 확인 완료";
		};
		
		// 버튼으로 submit 처리하는 법
		// <button type="submit">
		btn.onclick = function() {
			alert("click");
			document.querySelector("form").submit();
		}
	</script>
        
     </div>
</body>
</html>