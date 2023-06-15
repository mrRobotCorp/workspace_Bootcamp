<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "backendWeb2.z01_vo.Person"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = request.getParameter("name");
	if(name == null) name ="";
	
	String ageS = request.getParameter("age");
	if(ageS == null) ageS ="0";
	
	String locS = request.getParameter("loc");
	if(locS == null) locS ="";
	
	Person p01 = new Person(name, Integer.parseInt(ageS), locS);
	
	%>
	<h2>객체로 받은 요청값 내용</h2>
	<h3>이름 : <%=p01.getName() %></h3>
	<h3>나이 : <%=p01.getAge() %></h3>
	<h3>사는 곳 : <%=p01.getLoc() %></h3>
</body>
</html>