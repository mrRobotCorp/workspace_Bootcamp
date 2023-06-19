<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a07</title>
</head>
<body>
	<h3>등록한 회원 명단</h3>
	<%
	String mems[] = request.getParameterValues("member");
	for(String m:mems) {
		if( m != null && !m.equals("")) {
			out.print("<h4>" + m + "</h4>");			
		}
	}
	// ex) 구매 물품의 가격 3개를 입력,전송, 총 비용 출력

	String priceS[] = request.getParameterValues("price");
	int tot= 0;
	
	for(String p:priceS) {
		if(priceS != null && !priceS.equals("")) {
			int price = Integer.parseInt(p);
			tot += price;
			out.print("<h4>" + price + "</h4>");
		}		
	}
	
	%>
	<h4>총 비용 : <%=tot %></h4>
	
	
</body>
</html>