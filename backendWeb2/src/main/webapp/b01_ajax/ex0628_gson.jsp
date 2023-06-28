<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "com.google.gson.Gson"
    import = "java.util.List"
    import = "backendWeb2.z01_vo.Dept"
    import = "backendWeb2.a01_dao.A04_PreParedDao"
    
    %>
<%
String dname = request.getParameter("dname");
if(dname == null) dname= "";
String loc = request.getParameter("loc");
if(loc == null) loc= "";

A04_PreParedDao dao = new A04_PreParedDao();
List<Dept> dlist =dao.getDeptList(dname, loc);
Gson gson = new Gson();

%>

<%=gson.toJson(dlist)%>