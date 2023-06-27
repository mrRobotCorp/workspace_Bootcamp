<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "backendWeb2.a01_dao.A04_PreParedDao"
    import = "backendWeb2.z01_vo.*"
    %>
   <%
   A04_PreParedDao dao = new A04_PreParedDao();
   String ename = request.getParameter("ename");
   if(ename == null) ename = "";
   String job = request.getParameter("job");
   if(job == null) job = "";
   
	for(Emp e:dao.getEmpList(ename, job)) {
		%>		
        <tr>
          <td><%=e.getEmpno() %></td>
          <td><%=e.getEname() %></td>
          <td><%=e.getJob() %></td>
          <td><%=e.getMgr() %></td>
          <td><%=e.getHiredate() %></td>
          <td><%=e.getSal() %></td>
          <td><%=e.getComm() %></td>
          <td><%=e.getDeptno() %></td>
        </tr>
     <%}%>
       

