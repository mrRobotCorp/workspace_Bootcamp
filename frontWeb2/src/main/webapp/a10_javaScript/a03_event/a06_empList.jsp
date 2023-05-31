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
<title>a06_empList</title>
</head>
<body>
	<h2>사원정보 리스트</h2>
	<%-- name="name" value="<%=name%>" --%>
	<%-- a06_empList.jsp?name=&minSal=0&maxSal=99999 <- 서버전송형식 --%>
	<%
	String name = request.getParameter("name");
	if(name == null) name = "";
	String minSal = request.getParameter("minSal");
	if(minSal == null) minSal = "0";
	String maxSal = request.getParameter("maxSal");
	if(maxSal == null) maxSal = "99999";
	%>
	<form>
		<div>
			<span>사원명 : </span>
			<input type="text" name="name" value="<%=name%>">	
		</div>
		<div>
			<span>최소 급여 : </span>
			<input type="text" name="minSal" value="<%=minSal%>">	
		</div>
		<div>
			<span>최대 급여 : </span>
			<input type="text" name="maxSal" value="<%=maxSal%>">	
		</div>
		<input type="submit" value="검색">
	</form>
	
	<table style="border-collapse:collapse" border>
		<tr>
			<th>사원 번호</th>
			<th>사원명(first name)</th>
			<th>사원명(last name)</th>
			<th>급여</th>
			<th>부서 번호</th>
		</tr>
		
		<%
		A04_PreParedDao dao = new A04_PreParedDao();
		Map<String, String> sch = new HashMap<String, String>();
		sch.put("name", name);
		sch.put("minSal", minSal);
		sch.put("maxSal", maxSal);
		for(Employee e: dao.getEmpList(sch)){ 
			
			%>
			<tr>
			     <td><%=e.getEmployee_id() %></td>
			     <td><%=e.getFirst_name() %></td>
			     <td><%=e.getLast_name() %></td>
			     <td><%=e.getSalary() %></td>
			     <td><%=e.getDepartment_id()%></td>
			</tr>
		<%}%>	

	</table>
</body>
</html>