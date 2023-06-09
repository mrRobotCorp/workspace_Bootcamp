<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- jsp에서 선언(declaration)을 통해서 가격과 갯수를 선언하고, 
메서드를 통해 가격과 갯수를 받아서 합산을 처리하는 메서드를
선언하고, 하단에서 호출하는 화면을 만드세요. -->
<%!
	String prod = "apple";
	int cnt = 3;
	int price = 1000;
	int getTot() {
		int tot = cnt * price;
		return tot;
	}
	
%>
	<h3>물건 : <%= prod%></h3>
	<h3>가격 : <%= price%></h3>
	<h3>갯수 : <%= cnt %></h3>
	<h3>합산 : <%= getTot() %></h3>
	
<!-- jsp의 sciptlet과 expression을 이용해서 
랜덤 구구단을 테이블로 9X1로 출력해보세요 -->
<%
	int ranNum = (int)(Math.random() * 8 + 2);
%>
	<table>
<%
	for(int i=1; i<=9; i++) {
%>	
		<tr>
			<td><%=ranNum + " X " + i + " = "%></td>
			<td><%=ranNum * i %></td>
		</tr>
<%} %>
	</table>
	
</body>
</html>