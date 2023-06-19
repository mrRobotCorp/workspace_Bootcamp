<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a09</title>
</head>
<body>
	<h3>선택한 과일</h3>
	<%
	String foods[] = request.getParameterValues("food");
	for(int i=0; i<foods.length; i++) {
		if(foods[i] != null && !foods[i].equals("")) {
			out.print("<h4>" + (i+1) + ") " + foods[i] + "</h4>");	
		}
	}
	%>
	
	<h3>선택한 지역</h3>
	<%	
	// ex) 지역 - 서울 경기 인천 강원도 충청도 경상도 전라도 제주도
	String locs[] = request.getParameterValues("loc");
	for(int i=0; i<locs.length; i++) {
		if(locs[i] != null && !locs[i].equals("")) {
			out.print("<h4>" + (i+1) + ") "  + locs[i] + "</h4>");	
		}
	}
	%>
	

</body>
</html>