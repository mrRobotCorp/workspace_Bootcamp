<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name = "Tom";
	String [] arry = {"apple", "banana", "cherry"};
%>

<%
	for(String f: arry) {
%>		
	<%-- 출력 영역 --%>
	<h2>과일 : <%=f %></h2>
<%} %>

	<h2>카운트 업</h2>
	<%-- 1~10까지 h3로 카운트 업 --%>

<%
	for(int i=1; i<=10; i++) {
%>
	<h3>카운트 : <%=i %></h3>
<%
	}
%>

	<%-- ex) 테이블의 1*10으로 카운트 다운 처리 
	--%>
	<table border style="border-collapse:collapse">
			<tr>
<%
	for(int i=10; i<=1; i--){
%>
				<td><%=i %></td>
<%
	}

%>		
			</tr>
	</table>

	











</body>
</html>