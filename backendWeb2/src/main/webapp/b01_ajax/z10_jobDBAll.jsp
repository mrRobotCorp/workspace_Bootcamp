<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.util.Map"
    import = "java.util.HashMap"
    import = "backendWeb2.a01_dao.A04_PreParedDao"
    import = "backendWeb2.z01_vo.*"
    %>
 <%
 // ex) a10_DBAjax.jsp 처리
 A04_PreParedDao dao = new A04_PreParedDao();
 Map<String, String> map = new HashMap<String, String>();
 String jTitle = request.getParameter("jTitle"); 
 if(jTitle == null) jTitle = "";
 String sal1 = request.getParameter("sal1"); 
 if(sal1 == null) sal1 = "0";
 String sal2 = request.getParameter("sal2"); 
 if(sal2 == null) sal2 = "999999";
 
 map.put("title", jTitle);
 map.put("min_sal1", sal1);
 map.put("min_sal2", sal2);
 
 for(Jobs j:dao.getJob(map)) {
	 %>	 
	 <tr>
	   <td><%=j.getJob_id() %></td>
	   <td><%=j.getJob_title() %></td>
	   <td><%=j.getMin_salary() %></td>
	   <td><%=j.getMax_salary()%></td>
	 </tr>
 <%}%>
