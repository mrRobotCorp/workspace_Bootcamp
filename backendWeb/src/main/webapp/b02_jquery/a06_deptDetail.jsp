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
    		// backendWeb/dept.do?deptno=20
    		// 1. url: "${path}//dept.do",
    		// 2. data : "deptno=" + $("#deptno").val(),
    		// 3. succeess : function(dept) { 받는 객체
    		if(event.keyCode = 13) {
    			$.ajax({
    				url: "${path}//dept.do",
    				type:"post",
    				data:"deptno=" + $("#deptno").val(),
    				dataType:"json",
    				success:function(dept) {
    					console.log(dept);
    					var add = "<td>" + dept.deptno + "</td>";
    					add += "<td>" + dept.dname + "</td>";
    					add += "<td>" + dept.loc + "</td>";
    					$("#deptInfo").html(add);
    				},
    				error:function(err) {
    					console.log(err);
    				}
    			})
    		} 
    	});
    </script>      
    
    
</head>
<body>
    <div class="container mt-3">
    	<h2>부서정보 검색</h2>
	  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  		<div class="container-fluid">    	
	            <input type="number" class="form-control me-2" 
	      	     id="dept" placeholder="부서번호 입력" name="title"  aria-label="Search">

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
			   	<tr id="deptInfo" class="text-center">
			   	</tr>
		 	</tbody>
		</table>      	
    </div>
</body>
</html>