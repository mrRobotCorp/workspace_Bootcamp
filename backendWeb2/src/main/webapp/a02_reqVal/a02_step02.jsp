<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a02</title>
<style>
	* { margin: 0; padding:0; text-align : center;}
	.h3Title { margin-top : 30px;}
	form { display:inline-block; padding: 10px 20px; border-radius: 20px;}
	form div { margin-bottom : 15px;}
	form div input { width: 200px; height : 30px; text-align: left;}
	ul { list-style : none; display: flex; width: 80%; align-items:center; justify-content: space-around; margin:0 auto;}
	ul li { font-size : 15px; font-weight: 700; margin : 10px;}
</style>
</head>
<body>
	<%--
		국영수 점수 받아서 총점,평균 처리
	 --%>
	 <h3 class="h3Title">학생의 국영수 점수</h3>
	<form action="a02_step02.jsp">
		<div>
			<span>국어 : </span>
			<input type="text" name="kor">
		</div>
		<div>
			<span>영어 : </span>
			<input type="text" name="eng">
		</div>
		<div>
			<span>수학 : </span>
			<input type="text" name="math">
		</div>
		<input type="submit" value="제출">
	</form>
	<%
	String korS = request.getParameter("kor");
	String engS = request.getParameter("eng");
	String mathS = request.getParameter("math");
	int tot = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;
	int avg = 0;
	
	if(korS != null ) kor = Integer.parseInt(korS);
	if(engS != null ) eng = Integer.parseInt(engS);
	if(mathS != null ) math = Integer.parseInt(mathS);
	
	tot = kor + eng + math;
	avg = tot / 3;
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