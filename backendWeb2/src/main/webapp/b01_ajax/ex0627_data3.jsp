<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "backendWeb2.a01_dao.A04_PreParedDao"
    import = "backendWeb2.z01_vo.*"
    %>
    
<%
	A04_PreParedDao dao = new A04_PreParedDao();
	for(Manager m:dao.getManager()) {
		%>	
		
		<tr>
           <td><%=m.getEmpno() %></td>
           <td><%=m.getEname() %></td>
           <td><%=m.getDname() %></td>
         </tr>
	<%}%>