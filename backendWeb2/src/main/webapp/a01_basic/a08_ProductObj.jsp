<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
   import="backendWeb2.z01_vo.Product"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
	ex) 구매 물품 상세 정보로 테이블과 form요소 객체를 이용하여 
	물건명, 가격, 갯수, 상품정보를 table 안에 출력. vo 객체 생성 후 value값에 할당
 --%>
 
 	<%
 	Product p = new Product("cheese", 5000, 3, "고르곤졸라");
 	%>
 	<form>
 		<table>
 			<tr>
 				<th>물건명</th>
 				<th>가격</th>
 				<th>갯수</th>
 				<th>상품 정보</th>
 			</tr>
 			<tr>
 				<td>
	 				<input type="text" value="<%=p.getPname()%>"> 				
 				</td>
 				<td>
	 				<input type="text" value="<%=p.getPrice()%>"> 				
 				</td>
 				<td>
	 				<input type="text" value="<%=p.getCnt()%>"> 				
 				</td>
 				<td>
	 				<input type="text" value="<%=p.getPinfo()%>"> 				
 				</td>
 			</tr>
 		</table>
 	</form>
</body>
</html>