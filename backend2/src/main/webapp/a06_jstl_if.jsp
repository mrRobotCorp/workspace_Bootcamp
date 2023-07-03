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
    <title>a06</title>
   
    <script src = "https://code.jquery.com/jquery-3.7.0.js" type="text/javascript"></script>
    
    <script type="text/javascript">
    	// window.onload와 동일한 메서드
    	$(document).ready( function(){
    	
    	});
    </script>      
    
    
</head>
<body>
    <div class="container mt-3">
   	 <%--
    	a06_jstl_if.jsp
    		물건 가격과 갯수를 입력 받아
    		총계가 10만 이상 일 때, 할인대상자입니다.
    		그렇지 않으면 할인대상자가 아닙니다 출력
    --%>
    	<form action="" method="post">
         	<div class="mb-3 mt-3">
            <label for="price">물건 가격:</label>
            <input type="number" class="form-control" 
      	     id="price" placeholder="물건가격 입력" name="price">
         	</div>
         	<div class="mb-3 mt-3">
            <label for="cnt">갯수:</label>
            <input type="number" class="form-control" 
      	     id="cnt" placeholder="물건 갯수 입력" name="cnt">
         	</div>
         	<button type="submit" class="btn btn-primary">할인 확인</button>
     	</form>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>총계</th>
				    <th>할인 여부</th>
		      	</tr>
		    </thead>
		    <c:if test="${not empty param.price and 
		    				not empty param.cnt} ">
   				<c:set var="tot" value="${param.price * param.cnt }"/>
			    <c:set var="msg" value="할인 대상자가 아닙니다."/>
			    <c:if test="${tot >= 100000 }">
			    	<c:set var="msg" value="할인 대상자입니다"/>
			    </c:if>
			    <tbody>
				   	<tr  class="text-center">
				        <td>${tot}</td>
				        <td>${msg }</td>
				   	</tr>
			 	</tbody>
		 	</c:if>
		</table>      	
    </div>
</body>
</html>