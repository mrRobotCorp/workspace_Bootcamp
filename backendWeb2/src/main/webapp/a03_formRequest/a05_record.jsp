<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a05</title>
</head>
<body>
	<%
	String korS = request.getParameter("kor");
	String engS = request.getParameter("eng");
	String mathS = request.getParameter("math");
	int tot = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;
	double avg = 0;
	
	if(korS != null && engS != null && mathS != null) {
		kor = Integer.parseInt(korS);
		eng = Integer.parseInt(engS);
		math = Integer.parseInt(mathS);
	};
	tot = kor + eng + math;
	avg = tot /3;
	
	%>
	<ul>
		<li>국어 점수 : <%=kor %></li>
		<li>영어 점수 : <%=eng %></li>
		<li>수학 점수 : <%=math %></li>
		<li>총점 : <%=tot %></li>
		<li>평균 : <%=avg %></li>
		
	</ul>
</body>
</html>








