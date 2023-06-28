<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "com.google.gson.Gson"
    import = "java.util.List"
    import = "backendWeb2.z01_vo.Emp"
    import = "backendWeb2.a01_dao.A04_PreParedDao"
    
    %>
<%
String ename = request.getParameter("ename");
if(ename == null) ename = "";
String job = request.getParameter("job");
if(job == null) job = "";

A04_PreParedDao dao = new A04_PreParedDao();
List<Emp> empList =dao.getEmpList(ename, job);
Gson gson = new Gson();

%>

<%=gson.toJson(empList)%>