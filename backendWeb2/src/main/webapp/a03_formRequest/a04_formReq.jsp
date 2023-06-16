<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a04</title>
</head>
<body>
	<%--
	a05_record.jsp?name=@@@&kor=24 ... math까지
	a05_record.jsp에서는 국영수 출력, 총점, 평균 계산
	 --%>
	<h3>학생의 국영수 점수</h3>
	<form action="a05_record.jsp">
		<div>
			<span>국어 : </span>
			<input type="text" name="kor">
		</div>
		<div>
			<span>영어 : </span>
			<input type="text" name="eng">
		</div>
		<div>
			<span>수학 : </span>
			<input type="text" name="math">
		</div>
		<input type="submit" value="제출">
	</form>
</body>
</html>