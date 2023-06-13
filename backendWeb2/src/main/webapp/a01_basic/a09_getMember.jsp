<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"   
	import = "backendWeb2.a01_dao.*"   
	import = "backendWeb2.z01_vo.*" 
	import = "java.util.List"
%>

<%
	A04_PreParedDao dao2 = new A04_PreParedDao();
	List<Manager> mlist = dao2.getManager();
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
	
	<h2>관리자 콤보</h2>
	<span>관리자명 : </span>
	<select name="mgr" onchange="alert(this.value)">
		<option value='0'>선택</option>
		<% for(Manager mgr:mlist) {
		%>	
		
		<option value='<%=mgr.getEmpno()%>'>
			<%=mgr.getEname() %>(<%=mgr.getDname() %>)
		</option>
		<%}%>
	</select>
	
</body>
</html>