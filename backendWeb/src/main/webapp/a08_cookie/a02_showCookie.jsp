<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.net.URLDecoder"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<c:set var="path" value="${pageContext.request.contextPath}"/>
<fmt:requestEncoding value="utf-8"/>

 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
   
    <script src = "https://code.jquery.com/jquery-3.7.0.js" type="text/javascript"></script>
    
    <script type="text/javascript">
    	// window.onload와 동일한 메서드
    	$(document).ready( function(){
    	});
    </script>      
    
    
</head>
<body>
    <div class="container mt-3">
    	<h2>쿠키 생성</h2>
    	 <%
    	 // 쿠키의 저장위치는 클라이언트 브라우저 프로그램 내,
    	 // 화면에 출력하려면 클라이언트 -> 서버로 전송해서 확인 가능
    	 // 전송해서 확인해주는 객체가 request
		 Cookie[] cookies = request.getCookies();
    	 	// default 값을 삭제
			for(Cookie c:cookies) {
				// 쿠키의 키와 값에서 한글이 공백 등 특수문자가 포함되면
				// 반드시 encoding <-> decoding 처리를 통해서
				// 출력하고 저장함
				if(!c.getName().equals("JSESSIONID")) {
					out.print("<h2>" + 
						URLDecoder.decode(c.getName(), "utf-8")
						+ " : " + c.getValue() +  "</h2>");
				}
			}
   	 	/*
   	 	a10_insertEncoding.jsp 키가 한글로 된 쿠키 설정
   	 	a11_showEncoding.jsp 키와 값을 확인 쿠키
   	 	*/
		 %>
	  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  		<div class="container-fluid">    	
	    	<form method="post"  class="d-flex align-items-center" >

	         	<button type="submit" class="btn btn-primary" style="width:200px;">조회</button>
	     	</form>
	 	    </div>
	 	</nav>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>Firstname</th>
				    <th>Lastname</th>
				    <th>Email</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr  class="text-center">
			        <td>John</td>
			        <td>Doe</td>
			        <td>john@example.com</td>
			   	</tr>
		 	</tbody>
		</table>      	
    </div>
</body>
</html>