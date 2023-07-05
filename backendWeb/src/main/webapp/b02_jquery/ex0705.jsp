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
    		
    		$("#regBtn").click(function() {
    			$.ajax({
    				url: "${path}/ex0705_02.do",
    				type:"post",
    				data:"price=" + $("#price").val() + "&ratio=" + $("#ratio").val(),
    				dataType:"json",
    				success:function(p) {
    					console.log(dept);
    					var add = "<td>" + p.price + "</td>";
    					add += "<td>" + p.ratio + "</td>";
    					add += "<td>" + p.tot + "</td>";
    					$("#show").html(add);
    				},
    				error:function(err) {
    					console.log(err);
    				}
    			})
    			
   			})
    	
    	});
    </script>      
    
    
</head>
<body>
<%--
[1단계:개념]1. jquery ajax의 속성에 대하여 기술하세요.
기본 속성으로 url, type, data, dataType, succeess:function(data){}, error:function(err){} 등이 있다.
url : 호출하는 backend 단 주소
type : get/post
data : 요청 query string
dataType : 서버에서 받는 데이터 유형
success ... 는 성공 시 받는 데이터 함수
error는 ... 는 실패 시 받는 데이터 함수
를 입력하는 속성이다.

[1단계:코드]2. 화면에서 가격, 할인율을 입력하는 순간, 서버에서 전달해서 서버에서 최종 가격을 전달해서 받아오게 출력하세요.
(controller[가격계산], 화면jsp 구현)

[1단계:코드]3. 급여등급을 선택시, 최소와 최대을 출력되게 하세요.
[1단계:코드]4. 사원번호를 입력해서 enter키 시, dao에 사원정보를 출력되게 하세요(없으면 해당사원없음 표시)
 --%>
    <div class="container mt-3">
    	<h2>물건 가격 입력</h2>
	  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  		<div class="container-fluid">    	
	    	<form method="post"  class="d-flex align-items-center" >
	            <input type="number" class="form-control me-2" 
	      	     id="price" placeholder="가격 입력" name="price"  aria-label="Search">
	            <input type="text" class="form-control me-2" 
	      	     id="ratio" placeholder="할인율 입력" name="ratio"  aria-label="Search">
				
	         	<button type="submit" id="regBtn" class="btn btn-primary" style="width:300px;">가격 조회</button>
	     	</form>
	 	    </div>
	 	</nav>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>물건 가격</th>
				    <th>할인율</th>
				    <th>최종 가격</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr id="show" class="text-center">
			   	</tr>
		 	</tbody>
		</table>      	
    </div>
</body>
</html>