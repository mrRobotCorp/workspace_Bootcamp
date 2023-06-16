<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a03</title>
</head>
<body>
	<%
	// fruit=사과,바나나, 딸기
	// cnt=3,2,5
	String fruits[] = request.getParameterValues("fruit");
	if(fruits!= null) {
		for(String f:fruits) {
			out.print("<h3>" + f + "</h3>");	
		}
	}
	String cnts[] = request.getParameterValues("cnt");
	if(cnts!= null) {
		
		int tot = 0;
		for(String c:cnts) {
			int cntInt = Integer.parseInt(c);
			tot += cntInt;
			out.print("<h3>구매 할 갯수 : " + cntInt + "</h3>");	
		}
		out.print("총 구매 갯수 : " + tot);
	}
	%>
	<h4></h4>
	
</body>
</html>