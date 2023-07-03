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
    <title>a07</title>
   
    <script src = "https://code.jquery.com/jquery-3.7.0.js" type="text/javascript"></script>
    
    <script type="text/javascript">
    	// window.onload와 동일한 메서드
    	$(document).ready( function(){
    		
    	});
    </script>      
    
    
</head>
<body>

    <div class="container mt-3">
    	<h2>사원정보 등록</h2>
    	<form action="" method="post">
         	<div class="mb-3 mt-3">
            <label for=""point"">포인트:</label>
            <input type="number" class="form-control" 
      	     id="point" placeholder="포인트 입력" name="point">
         	</div>
         	
         	<button type="submit" class="btn btn-primary">등록</button>
     	</form>
     	<c:if test = "${not empty param.point}" ></c:if>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>점수</th>
				    <th>등급</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr  class="text-center">
			        <td>${param.point} </td>
			        <td>
			        	<c:choose>
			        		<c:when test="${param.point >= 90}">A등급</c:when>
			        		<c:when test="${param.point >= 80}">B등급</c:when>
			        		<c:when test="${param.point >= 70}">C등급</c:when>
			        		<c:when test="${param.point >= 60}">D등급</c:when>
			        		<c:otherwise>F등급</c:otherwise>
			        	</c:choose>
			        </td>
			   	</tr>
			   	
		      	
		 	</tbody>
		</table>      	
    </div>
</body>
</html>