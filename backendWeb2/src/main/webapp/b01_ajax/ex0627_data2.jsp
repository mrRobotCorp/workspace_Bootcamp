<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String pname = request.getParameter("pname");
	if(pname == null) pname = "";
	String price = request.getParameter("price");
	if(price == null) price = "0";
%>
<h3><%=pname %>은/는 <%=price %>원입니다.</h3>