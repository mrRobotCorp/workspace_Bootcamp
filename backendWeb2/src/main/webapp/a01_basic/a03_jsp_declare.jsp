<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예제 a03</title>
</head>
<body>
<%!
//ex) 선언 연습 a03_jsp_declare.jsp 생성
	// 		변수로 물건명 가격, 메서드로 물건명(가격) 형태로 리턴하는
	//		내용 선언, 하단에서 h3으로 변수, 메서드 호출
	String name = "서지수";
	String namePlus = "미친놈";
	String getName(String exprss) {
		return name + "(진짜 " + namePlus + ")";
	}
%>
	<h3><%=name %></h3>
	<h3><%=namePlus %></h3>
	<h3><%=getName("") %></h3>
</body>
</html>