<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import= "backendWeb2.z01_vo.Product"
    
    %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
</head>
<body>
	<%--
	String pname, int price, int cnt
	 --%>
	 <%
	 String pnn = request.getParameter("pname");
	 if(pnn == null) pnn= "";
	 String priceS = request.getParameter("price");
	 String cntS = request.getParameter("cnt");
	 int pr = 0;
	 int cn = 0;
	 
	 if(priceS != null) pr = Integer.parseInt(priceS);
	 if(cntS != null) cn = Integer.parseInt(cntS);
	 
	 Product p = new Product(pnn, pr, cn);
	 
	 %>
	<div class="container mt-3">
	    <table class="table">
	    <thead class="table-success">
	      <tr>
	        <th>물건명</th>
	        <th>물건 가격</th>
	        <th>물건 갯수</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td><%=p.getPname() %></td>
	        <td><%=p.getPrice() %></td>
	        <td><%=p.getCnt() %></td>
	      </tr>
	    </tbody>
	  </table>
	
	</div>


</body>
</html>