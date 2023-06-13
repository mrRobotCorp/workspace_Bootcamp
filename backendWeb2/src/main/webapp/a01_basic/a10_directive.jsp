<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--jsp include 지시자로 페이지 지정 --%>
	<%@ include file="a11_subPage.jsp" %>
	<h2>현재 페이지의 메인 내용</h2>
<%
	// front 단에서 처리 할 모든 내용도 공통 내용을 선언할 때 활용 가능
	// jsp inclue 지시자를 사용하면 front단, back단의 모든 코드도 공통 사용가능.
	// 포함 될 공통 변수
	String name = "Elliot";

%>
	<h2>선언된 변수 사용 : <%=name %></h2>
	
	
</body>
</html>