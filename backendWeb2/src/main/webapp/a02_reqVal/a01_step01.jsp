<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a01</title>
</head>
<body>
	<%
		
	%>
	<h3>초기 요청 페이지</h3>
	<form action="a01_step01.jsp">
		<div>
			<span>음식명 : </span>
			<input type="text" name="food">
		</div>
		<div>
			<span>과일명 : </span>
			<input type="text" name="fruit">
		</div>
		<button type="submit">입력</button>
	</form>
	
	<h4>입력된 음식 : <%=request.getParameter("food") %></h4>
	<h4>입력된 과일 : <%=request.getParameter("fruit") %></h4>
	
	<%--
	물건의 가격 갯수 받아서 출력 
	 --%>
	 
	 <%
	 String priceS = request.getParameter("price");
	 String cntS = request.getParameter("cnt");
	 int price = 0;
	 int cnt = 0;
	 int tot = 0;
	 
	 if(priceS != null && cntS != null) {
		 price = Integer.parseInt(priceS);
		 cnt = Integer.parseInt(cntS);
		 tot = price* cnt;
	 };
	 %>
	 <form action="a01_step01.jsp">
		<div>
			<span>물건 가격 : </span>
			<input type="text" name="price">
		</div>
		<div>
			<span>갯수 : </span>
			<input type="text" name="cnt">
		</div>
		<button type="submit">입력</button>
	</form>
	
	<h4>입력된 가격 : <%=price %></h4>
	<h4>입력된 갯수 : <%=price %></h4>
	<h4>총계 : <%=tot%></h4>
	 
	 
	 
	 
	 
	 
	 
</body>
</html>