<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a06</title>
</head>
<body>
	<h3>동일한 name값 여러 데이터 전달</h3>
	<form action="a07_rev.jsp">
		<div>
			<span>등록 회원 1: </span>
			<input type="text" name="member">
		</div>
		<div>
			<span>등록 회원 2: </span>
			<input type="text" name="member">
		</div>
		<div>
			<span>등록 회원 3: </span>
			<input type="text" name="member">
		</div>
		<div>
			<span>물건 가격 1: </span>
			<input type="text" name="price">
		</div>
		<div>
			<span>물건 가격 2: </span>
			<input type="text" name="price">
		</div>
		<div>
			<span>물건 가격 3: </span>
			<input type="text" name="price">
		</div>
		<input type="submit" value="제출">
	</form>

</body>
</html>