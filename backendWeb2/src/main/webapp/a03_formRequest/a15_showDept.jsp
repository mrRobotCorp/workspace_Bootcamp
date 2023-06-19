<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="backendWeb2.z01_vo.Departments"
    %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
</head>
<body>
	<%--
	int d_id, String d_name, int manager_id, double loc_id
	 --%>
	 
	 <%
	 String dname = request.getParameter("dname");
	 if(dname == null) dname = "";
	 String deptnoS = request.getParameter("deptno");
	 String locS = request.getParameter("loc");
	 int deptInt = 0;
	 double locD = 0;
	 
	 if(deptnoS != null) deptInt = Integer.parseInt(deptnoS);
	 if(locS != null) locD = Double.parseDouble(locS);
	 
	 Departments dep = new Departments(deptInt, dname, 11, locD);
	 
	 %>
    <div class="container mt-3">
    <h2>사원정보 등록</h2>
    <table class="table">
    <thead class="table-success">
      <tr>
        <th>부서번호</th>
        <th>부서명</th>
        <th>부서위치</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td><%=dep.getD_id() %></td>
        <td><%=dep.getD_name() %></td>
        <td><%=dep.getLoc_id() %></td>
      </tr>

    </tbody>
  </table>
  </div>


</body>
</html>