<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a03</title>
</head>
<body>
	<%--
	ex) a03_req.jsp?name=Mark&kor=70
	이름 :, 국어(+10) :
	
	ex) a04_req.jsp?pname=apple&price=3000&cnt=5
	구매물품 : @@
	구매가격
	구매갯수
	총액
	 --%>
	 <%
	 String name2 = request.getParameter("name");
	 String kor2 = request.getParameter("kor");
	 int kor = 0;
	 if(kor2 != null) {
		 kor = Integer.parseInt(kor2) + 10;
	 }
	 %>
	 <strong>이름 : <%=name2 %></strong><br>
	 <strong>국어 : <%=kor %></strong>
</body>
</html>