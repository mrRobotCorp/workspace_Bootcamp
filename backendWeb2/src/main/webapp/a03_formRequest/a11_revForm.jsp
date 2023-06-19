<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a11</title>
</head>
<body style="background: request.getParameter("color01")">
	<h3>다양한 form 요소 객체 받기</h3>
	<%
	String num = request.getParameter("num01");
	String color = request.getParameter("color01");
	String date = request.getParameter("date01");
	%>
	
	<h3> 숫자 : <%=num %></h3>
	<h3> 색상 : <%=color %></h3>
	<h3> 날짜 : <%=date %></h3>
</body>
</html>