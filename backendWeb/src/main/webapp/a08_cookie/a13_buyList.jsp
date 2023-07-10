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
    		
    		$("h2").text("jquery 로딩 성공")
    	});
    </script>      
    
    
</head>
<body>
    <div class="container mt-3">
    	<h2>사원정보 등록</h2>
	  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  		<div class="container-fluid">    	
	    	<form method="post"  class="d-flex align-items-center" >
	            <input type="text" class="form-control me-2" 
	      	     id="pname" placeholder="구매 물건 입력"  
	      	      name="pname"  aria-label="Search">
	      	     
	         	<button type="submit" class="btn btn-primary" style="width:200px;">
	         	구매</button>
         	</form>
	 	    </div>
	 	</nav>
	 	<%
	 	String pname = request.getParameter("pname");
	 	if(pname == null) pname = "";
	 	Cookie cks[] = request.getCookies();
	 	String ckPname = "";
	 	
	 	for(Cookie ck:cks) {
	 		if(ck.getName().equals("pname")) {
	 			ckPname += ck.getValue();
	 		}
	 	}
	 	
	 	response.addCookie(new Cookie("pname", ckPname));
	 	%>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>물건명</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr  class="text-center">
			        <td><%=pname %></td>
			   	</tr>
		 	</tbody>
		</table>      	
    </div>
</body>
</html>