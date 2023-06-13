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
	query string에 의해 데이터 받기
	a02_request.jsp?name=""
	age, loc로 나이, 사는 곳 데이터 입력, 화면에 각각 출력
	
	a03_req.jsp?name=Mark&kor=70&eng=70&math=70
	
	String korS = request.getParameter("kor");
	String engS = request.getParameter("eng");
	
	int kor = 0;
	if(kor != null) {
		kor = Integer.parseInt(korS);
	}
	
	int tot = kor + eng;
	
	
	 --%>
	<h2>query string 통해서 데이터 받기</h2>
	<h3>이름 : <%=request.getParameter("name") %></h3>
	<p>나이 : <%=request.getParameter("age") %></p>
	<p>사는 곳 : <%=request.getParameter("loc") %></p>
</body>
</html>