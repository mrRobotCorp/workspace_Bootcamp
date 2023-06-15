<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>구매한 과일</h2>
	<%
	String fruits[] = request.getParameterValues("fruits");
	
	if(fruits != null) {
		for(String f:fruits) {
			out.print("<h2>" + f + "</h2>");
		}	
	}
	
	// ex) 가입 할 회원의 id들 반복문을 통해
	// 1) ㅇㅇㅇ <-형식으로 넘버링 되어 출력
	%>
	
	<%
	String mem[] = request.getParameterValues("mem");
	int i = 0;
	if(mem != null) {
		for(String m:mem) {
			i++;
			out.println("<h3>" + i  + ") "+ m + "</h3>");
		}
	}
	%>
	
	<h3>구매한 물건들의 가격과 총계</h3>
	<%
	String priceS[] = request.getParameterValues("price");
	int tot = 0;
	if(priceS != null) {
		for(int j=0; j<priceS.length; j++) {
			int price = Integer.parseInt(priceS[j]);
			out.print("<h2>" + (j+1) + ")" + price + "</h2>");
			tot += price;
		}
	}
	
	%>
	<h2>총계 : <%=tot %></h2>

	
	
</body>
</html>