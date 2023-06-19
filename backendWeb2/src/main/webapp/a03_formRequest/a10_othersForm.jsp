<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a10 here</title>
</head>
<body>
	<h3>다양한 요소 객체 전송</h3>
	<form action="a11_revForm.jsp">
		<div>
			<span>숫자 : </span>
			<input type="number" value="0" name="num01">
		</div>
		<div>
			<span>색상 : </span>
			<input type="color" value="#fff" name="color01">
		</div>
		<div>
			<span>날짜 : </span>
			<input type="date" value="" name="date01">
		</div>
		<input type="submit" value="제출">
	</form>
</body>
</html>