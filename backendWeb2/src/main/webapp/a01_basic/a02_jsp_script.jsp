<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- html 주석은 client에 전달됨 -->
<%--
jsp 주석은 서버단에서 처리되기에 브라우저를 통해 전달되지 않음
 --%>
 <%!
 	// jsp가 java로 변경될 때 class명 밑에서 선언되는 부분
 	// declaration
 	String pname = "apple";
 	String getName() {
 		return pname + "메서드 리턴";
 	}
 	
 %>
 <h2>jsp의 스크립트</h2>
 <h2>선언된 변수 호출 : <%=pname %></h2>
 <h2>선언된 메서드 호출 : <%=getName() %></h2>
</body>
</html>