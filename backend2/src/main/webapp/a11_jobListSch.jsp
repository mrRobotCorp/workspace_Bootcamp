<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
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
    	<h2>사원정보 등록</h2>
    	<form action="" method="post">
         	<div class="mb-3 mt-3">
            <label for="jobTitle">직책명 :</label>
            <input type="text" class="form-control" 
      	     id="jobTitle" placeholder="직책명 입력" name="jobTitle">
         	</div>
         	<div class="mb-3 mt-3">
            <label for="minSal">최소급여 :</label>
            <input type="number" class="form-control" 
      	     id="minSal" placeholder="최소급여 입력" name="minSal">
         	</div>
         	<div class="mb-3 mt-3">
            <label for="manSal">최고급여 :</label>
            <input type="number" class="form-control" 
      	     id="manSal" placeholder="최고급여 입력" name="manSal">
         	</div>
         	<button type="submit" class="btn btn-primary">등록</button>
     	</form>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>직책 ID</th>
				    <th>직책명</th>
				    <th>최소급여</th>
				    <th>최대급여</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<c:forEach var="job" items="${jobList}">
			   	<tr  class="text-center">
			        <td>${job.job_id}</td>
			        <td>${job.job_title}</td>
			        <td>${job.min_salary}</td>
			        <td>${job.max_salary}</td>
			   	</tr>
			   	</c:forEach>
		 	</tbody>
		</table>      	
    </div>
</body>
</html>