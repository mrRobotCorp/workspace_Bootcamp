<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a03</title>
</head>
<body>
	<h3>전송 연습</h3>
	<form>
		<div>
			<span>뭔 과일 : </span>
			<input type="text" name="pname">
		</div>
		<div>
			<span>가격 : </span>
			<input type="text" name="price">
		</div>
		<input type="submit">
	</form>
	
	<h4>받은 과일 : <%=request.getParameter("pname") %></h4>	
	<h4>가격 : <%=request.getParameter("price") %></h4>	

</body>
</html>