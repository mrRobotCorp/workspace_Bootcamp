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
    <title>Insert title here</title>
   
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
			   		<c:forEach var="cnt" begin="1" end="10" step="2">
			        <td>${cnt}</td>
			   		</c:forEach>
			   	</tr>
		 	</tbody>
		</table> 
		<%
		request.setAttribute("animal", new String[]{"dog","cat","elephant", ""});
		%>
		<table class="table table-striped table-hover">
		    <tbody>
			   	<tr  class="text-center">
			   		<c:forEach var="animal" items="${animal }" >
			        <td>${animal}</td>
			   		</c:forEach>
			   	</tr>
		 	</tbody>
		</table>
    	<form action="" method="post">
         	<div class="mb-3 mt-3">
            <label for="age">나이:</label>
            <input type="number" class="form-control" 
      	     id="age" placeholder="나이 입력" name="age">
         	</div>
         	
         	<button type="submit" class="btn btn-primary">등록</button>
     	</form>
     	<c:if test = "${not empty param.age}" ></c:if>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>나이</th>
				    <th>결과</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr  class="text-center">
			        <td>${param.age} </td>
			        <td>
			        	<c:choose>
			        		<c:when test="${param.age >= 18}">성인입니다</c:when>
			        		<c:otherwise>미성년자입니다</c:otherwise>
			        	</c:choose>
			        </td>
			   	</tr>
		 	</tbody>
		</table>    
		 <table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>아이디</th>
				    <th>비밀번호</th>
				    <th>이름</th>
				    <th>포인트</th>
				    <th>권한</th>
				    <th>등록일</th>
		      	</tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="mem" items="${memList}">
			   	<tr  class="text-center">
			        <td>${mem.id} </td>
			        <td>${mem.pass} </td>
			        <td>${mem.name} </td>
			        <td>${mem.point} </td>
			        <td>${mem.auth} </td>
			        <td>${mem.regdate} </td>
			   	</tr>
			   	</c:forEach>
		 	</tbody>
		</table>
		 
		   	
    </div>
</body>
</html>