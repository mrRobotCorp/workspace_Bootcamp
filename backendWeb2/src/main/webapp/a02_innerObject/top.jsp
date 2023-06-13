<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
	<%
	int num=0;
	for(int i=0; i<5; i++) {
		num++;
	%>
		<li><%=num %></li>
	
	<%}
	%>
	</ul>
	
	<script>
		let color = "red";
		let code = "#f00";
	</script>
</body>
</html>