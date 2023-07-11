<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    		
    		//$("h2").text("jquery 로딩 성공")
    	});
    </script>      
    
    
</head>
<body>
    <div class="container mt-3">
    	<h2>연산처리</h2>
    	<%--
    	모델어트리뷰터(요청값 + 모델) : 스프링에서 객체로 매개변수 선언 시
    	Calculator -> calculator
    	
    	 --%>
	  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  		<div class="container-fluid">    	
	  		<%--action이 없으면 jsp를 호출한 controller를 호출함
	  			default
	  		 --%>
	    	<form method="post"  class="d-flex align-items-center" >
	            <input type="text" class="form-control me-2" 
	      	     id="num01" placeholder="첫번째 숫자 입력" value="${calculator.num01 }"  name="num01"  aria-label="Search">
	      	   
	      	   <select name="cal" class="form-control me-2">
	      	   	<option value=""> 연산자 선택 </option>
	      	   	<option value=" + "> + </option>
	      	   	<option value=" - "> - </option>
	      	   	<option value=" * "> * </option>
	      	   	<option value=" / "> / </option>
	      	   </select>
	      	   <script>
	      	   	$("[name=cal]").val("${calculator.cal}")
	      	   </script>
	            <input type="text" class="form-control me-2" 
	      	     id="num02" placeholder="두번째 숫자 시작" value="${calculator.num02 }" name="num02"  aria-label="Search">
	      	  
	         	<button type="submit" class="btn btn-primary" style="width:200px;">
				계산</button>
	     	</form>
	 	    </div>
	 	</nav>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>연산식</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr  class="text-center">
			        <td>
			        	<c:if test="${not empty calculator.cal }">
			        	${calculator.num01 }
			        	${calculator.cal}
			        	${calculator.num02 }
			        	=
			        	${calculator.tot }
			        	</c:if>
			        </td>
			   	</tr>
		 	</tbody>
		</table>      	
    </div>
</body>
</html>