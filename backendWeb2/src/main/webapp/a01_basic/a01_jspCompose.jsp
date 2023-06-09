<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
jsp 주석 : client에 전달되지 않음
 --%>
 <%
 // 자바 코드
 // PrintWriter out = response.getWriter();이 내장되어 있음
 // service(request, response)메서드로 감싸고 있고,
 // 주요 내장 객체들은 벌써 선언된 상태이다
 // out, session, request, reponse 내장되어 선언된 것을 감싸고 있기에 가능
 	out.print("<h2>hi</h2>");
 	session.setAttribute("s01", "himan");
 	String name = request.getParameter("name");
 	String name01 = "Tom";
 	int age = 25;
 	String loc = "seoul";
 		
// jsp는 java+ html을 servlet으로 만든 최종 html을 client브라우저에 전달하기에
// java 코드는 보이지 않음
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>이름 : <%=name01 %></h2>
	<%-- <%=변수명%> : java로 선언된 내용을 html코드와 함께 출력할 때 사용하는 형식 --%>
	<h2>나이 : <%=age %></h2>
	<h2>사는 곳 : <%=loc %></h2>
</body>
</html>