<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "com.google.gson.Gson"
    import = "java.util.List"
    import = "backendWeb2.z01_vo.Code"
    import = "backendWeb2.a01_dao.A04_PreParedDao"
    %>
    
<%
String title = request.getParameter("title");
if(title == null) title = "";
String refnoS = request.getParameter("refno");
int refno = 0;
if(refnoS != null && !refnoS.equals("")) refno = Integer.parseInt(refnoS);
A04_PreParedDao dao = new A04_PreParedDao();

Gson gson = new Gson();

	%>
	<%=gson.toJson(dao.getCodeList(title, refno)) %>

