<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a08</title>
</head>
<body>
	<%
	String food[] = {"apple", "banana", "mango", "cherry", "orange"};
	String loc[] = {"서울", "경기", "인천", "강원도", "충청도", "경상도", "전라도", "제주도"};
	%>
	
	<h3>좋아하는 음식 check</h3>
	<form action="a09_checkRev.jsp">
	<%
	for(String f:food) {
	%>
		<input type="checkbox" name="food" value="<%=f%>">
		<span><%=f %> </span>
			
	<%}
	%>
		<br>
		<h3>지역 check</h3>
		<select name="loc" multiple>
	<%
	for(String l:loc) {
	%>
		<!-- 
		<input type="checkbox" name="loc" value="">
		<span> </span>
		 -->
		 <option><%=l + "[sel]"%></option>
			
	<%}
	%>
		</select>
		<br>
		<input type="submit" value="제출">
	</form>
</body>
</html>