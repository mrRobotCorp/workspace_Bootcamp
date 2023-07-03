<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a09</title>
   
    <script src = "https://code.jquery.com/jquery-3.7.0.js" type="text/javascript"></script>
    
    <script type="text/javascript">
    	// window.onload와 동일한 메서드
    	$(document).ready( function(){
    		
    		$("h2").text("jquery 로딩 성공")
    	});
    </script>      
    
    
</head>
<body>
    <div class="container mt-3">
    	<h2>사원정보 등록</h2>
    	<table class="table table-striped table-hover">
		    <tbody>
			   	<tr  class="text-center">
			   		<c:forEach var="cnt" begin="1" end="10">
			        <td>${cnt}</td>
			   		</c:forEach>
			   	</tr>
		 	</tbody>
		</table>  
		<%
		request.setAttribute("rainbow", new String[]{"red","orange","yellow","green","blue","purple"});
		%>
		<table class="table table-striped table-hover">
		    <tbody>
			   	<tr  class="text-center">
			   		<c:forEach var="color" items="${rainbow }" >
			        <td>${color}</td>
			   		</c:forEach>
			   	</tr>
		 	</tbody>
		</table> 
		<%--
		ex01) 3의 배수를 3부터 51까지 출력
		ex02) 가위바위보를 배열로 선언하여 출력		
		 --%>
		<table class="table table-striped table-hover">
		    <tbody>
			   	<tr  class="text-center">
			   		<c:forEach var="three" begin="3" end="51" step="3">
					        <td>${three}</td>	
			   		</c:forEach>
			   	</tr>
		 	</tbody>
		</table>
		<%
		request.setAttribute("play", new String[]{"가위","바위","보"});
		%>
		<table class="table table-striped table-hover">
		    <tbody>
			   	<tr  class="text-center">
			   		<c:forEach var="sts" var="scissor" items="${play }" >
			        <td>[${sts.index}] ${sts.count} ${scissor}
			        	${sts.first }/${sts.] }
			        </td>
			   		</c:forEach>
			   	</tr>
		 	</tbody>
		</table> 
		 
		    	
    </div>
</body>
</html>