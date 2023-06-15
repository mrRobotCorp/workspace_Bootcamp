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
	ex) 물건명 = ### & 가격 = @@@ &물건명&가격=ㅇㅇㅇ
	물건명 배열, 가격 배열 따로 받아서 테이블 삽입
	no		물건명	가격
	1		@@@		ㅇㅇㅇ
	1		@@@		ㅇㅇㅇ
	1		@@@		ㅇㅇㅇ
		총 비용 ##
	 --%>
	 <table>
	 	<tr>
	 		<th>no</th>
	 		<th>물건명</th>
	 		<th>가격</th>
	 	</tr>
	 	
	 	<%
	 	String prodS[] = request.getParameterValues("prod");
	 	String priceS[] = request.getParameterValues("price");
	 	int tot = 0; 	

	 	for(int i=0; i<prodS.length; i++) {
	 		out.print("<tr>");
	 		out.print("<td>" + i + "</td>");
	 		out.print("<td>" + prodS[i] + "</td>");
	 		out.print("<td>" + priceS[i]+ "</td>");
	 		out.print("</tr>");
	 		tot += Integer.parseInt(priceS[i]);
	 	}
	 	%>
	 	<tr>
	 		<td>총비용</td>
	 		<td colspan='2'><%=tot %></td>
	 	</tr>	
	 	
	 
	 </table>
</body>
</html>