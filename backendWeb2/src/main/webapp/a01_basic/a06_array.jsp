<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	select { width: 80px; cursor:pointer;}
</style>
<title>Insert title here</title>
</head>
<body>
	<ol>
	<%
	String[] fruits = {"apple", "cherry", "mango"};
	for(String f:fruits) {
	%>	
		<li><%=f %></li>
	<%
	}
	%>
	
	</ol>
	
	<%--
	ex) select 의 option 내용에 맞는 부서 정보를 배열로 선언하고 출력
		select 인사/회계/재무/기획
	 --%>
	 
	 <select name="dept" onchange="alert('선택값 : ' + this.value)">
	 <%
	 String[] dept = {"인사", "회계", "재무", "기획"};
	 for(int i=0; i<dept.length; i++) {
	%>
		<option value="<%=i%>"><%=dept[i] %></option>
	 
	<%
	 }
	 %>
	 </select>
	 	<button type="submit">확인</button>








</body>
</html>