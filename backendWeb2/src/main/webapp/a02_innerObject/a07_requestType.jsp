<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String dbstr = request.getParameter("PI");
	double PI = 0;
	if(dbstr != null) PI = Double.parseDouble(dbstr);
	out.println("파이값 : " + PI);
	
	String boolstr = request.getParameter("bool");
	boolean isTrue = false;
	if(boolstr != null) {
		isTrue = Boolean.parseBoolean(boolstr);
	}
	out.print("boolean값" + isTrue);
	// ?bool=true
	
	// ex) 원의 지름 값을 요청값으로 입력 받아 면적 구하기(실수표현)
	String num = request.getParameter("num");
	double result = 0;
	if(num != null) {
		int n = Integer.parseInt(num);
		result = (n / 2) * (n / 2) * 3.14;
	}
	out.println("면접 값 : " + result);
	%>
</body>
</html>