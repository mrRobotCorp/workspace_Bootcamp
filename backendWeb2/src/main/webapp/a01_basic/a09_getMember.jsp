<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	import = "backendWeb2.z01_vo.Member"    
	import = "backendWeb2.a01_dao.A05_MemberDao"    
%>

<%
	A05_MemberDao dao = new A05_MemberDao();
	Member m = dao.login("himan", "7777");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a09 getMember</title>
</head>
<body>
	<h2>로그인한 정보</h2>
	<p>아이디 : <%=m.getId() %></p>
	<p>이름 : <%=m.getName() %></p>
	<p>권한 : <%=m.getAuth() %></p>
	
</body>
</html>