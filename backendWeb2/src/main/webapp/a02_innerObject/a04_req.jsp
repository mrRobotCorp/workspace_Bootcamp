<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--	
	ex) a04_req.jsp?pname=apple&price=3000&cnt=5
	구매물품 : @@
	구매가격
	구매갯수
	총액
	 --%>
	 <%
	 String pname = request.getParameter("pname");
	 String price = request.getParameter("price");
	 String cnt = request.getParameter("cnt");
	 
	 int pr = 0;
	 int c = 0;
	 int tot= 0;
	 
	 if(price != null && cnt != null) { 
		 pr = Integer.parseInt(price);
		 c = Integer.parseInt(cnt);
		 tot = pr * c;
	 }
	 %>
	 
	 
	 <div>
	 	<span>구매 물품 : <%=pname %></span>
	 	<span>구매 가격 : <%=pr %></span>
	 	<span>구매 갯수 : <%=c %></span>
	 	<span>총액 : <%=tot %></span>
	 </div>
	 
	 
	 
	 
	 
	 
</body>
</html>