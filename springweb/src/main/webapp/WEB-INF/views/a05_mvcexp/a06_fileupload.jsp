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
   	<style>
   		.btn { width : 200px; }
   	</style>
    <script src = "https://code.jquery.com/jquery-3.7.0.js" type="text/javascript"></script>
    
    <script type="text/javascript">
    	// window.onload와 동일한 메서드
    	$(document).ready( function(){
    		
    		//$("h2").text("jquery 로딩 성공")
    		let msg = "${msg}";
    		if(msg != "") {
    			
    		}
    	});
    </script>      
    
    
</head>
<body>
    <div class="container mt-3">
    	<h2>파일 업로드 DB 처리</h2>
	  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  		<div class="container-fluid">   
	  		<!-- 
	  		private MultipartFile[] fileInfos;
	private String content;
	  		 --> 	
	    	<form method="post" enctype="multipart/form-data" class="d-flex align-items-center" >
	            <input type="text" class="form-control me-2" 
	      	     placeholder="파일정보 입력" name="content" value="${param.content}"  aria-label="Search">
	            <input type="file" class="form-control me-2" 
	      	     placeholder="파일 업로드" multiple="multiple" name="fileInfos"  aria-label="Search">

	         	<button type="submit" class="btn btn-primary">업로드</button>
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