<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
</head>
<body>
<%
	request.setAttribute("id", "himan");
	request.setAttribute("pw", "7777");
%>

<%--
2. include로 all.jsp 하위에 top.jsp, main.jsp, bottom.jsp를 만들어서 포함 시켜 출력하되
	   request.getParameter(), request.setAttribute()데이터 설정으로 main.jsp에서 로그인 id pass를 만들어서
	   all.jsp를 호출하게 할때, himan//7777이면  top.jsp에서는 id를 보내어 @@ 로그인 중 그외는 login하세요 라고
	   표시되게 처리
 --%>
</body>
</html>