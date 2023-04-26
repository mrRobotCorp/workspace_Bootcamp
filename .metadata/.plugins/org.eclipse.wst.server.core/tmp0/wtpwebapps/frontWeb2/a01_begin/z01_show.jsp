<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="frontWeb2.Person"
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>z01_show</title>
</head>
<%
	Person p01 = new Person();
	p01.name = "taylor";
	p01.age = 25;
	p01.loc = "seoul sadang";
	String name = "joel";
%>
<body>
	<h2>hi <%=name%></h2>
	<h2>hi <%=p01.name%></h2>
	<h2>hi <%=p01.age%></h2>
	<h2>hi <%=p01.loc%></h2>

</body>
</html>