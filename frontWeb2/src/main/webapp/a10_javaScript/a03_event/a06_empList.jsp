<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="frontWeb2.A04_PreParedDao"
    import="frontWeb2.vo.Employee"
    import="java.util.*"
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>사원정보 리스트</h2>
	<table>
		<%
		A04_PreParedDao dao = new A04_PreParedDao();
		Map<String, String> sch = new HashMap<String, String>();
		sch.put("name", "");
		sch.put("minSal", "0");
		sch.put("maxSal", "9999");
		for(Employee e: dao.getEmpList(sch)){ 
			
			%>
			<tr>
			     <td><%=e.getEmployee_id() %></td>
			     <td><%=e.getFirst_name() %></td>
			     <td><%=e.getSalary() %></td>
			     <td><%=e.getDepartment_id()%></td>
			</tr>
		<%}%>	

	</table>
</body>
</html>