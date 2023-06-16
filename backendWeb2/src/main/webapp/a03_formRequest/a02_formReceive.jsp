<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a02</title>
</head>
<body>
	<%
	String name  = request.getParameter("name");
	%>
	<h2>form으로 받았습니다</h2>
	<h3>받은 이름 : <%= request.getParameter("name")%></h3>
	
	<form action="a02_formReceive.jsp">
		전송 할 이름:<input type="text" name="name"><br>
		<input type="submit">
	</form>
	
	<%--
	a03_formRev.jsp?pname=apple&price=3000
	form 요소 객체 생성
	--%>
	
	
</body>
</html>