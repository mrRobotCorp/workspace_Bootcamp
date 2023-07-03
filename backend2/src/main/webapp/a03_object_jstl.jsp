<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="backendWeb2.z01_vo.*"
    %>
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
<%
// controller 단 설정 가정
request.setAttribute("p01", new Person("Amy", 25, "seoul"));
%>

<body>
    <div class="container mt-3">
    	<%--
    	jsp scope와 함께 변수를 설정
    	page | request | session | application
    	1. MVC
    		controller request.setArttribute
    		
    	 --%>
    	<h3>request 범위 p01 : ${p01.name }</h3>
    	<%--
    	2. request 범위 Person 객체를 session으로 이름 변경해서 할당
    		기존의 request 범위의 p01 객체는 session 범위로 변경됨
    	 --%>
    	<c:set var="person" value="${p01 }" scope="session"></c:set>
    	<h3>request 범위 p01 : ${p01.name }</h3>
    	<h3>session 범위 person : ${person.name }</h3>
    	<h3>session 범위 person : ${person.age }</h3>
    	<c:set target="${person }" property="age" value="21"/>
    	
    	<%--
    	3. 속성 변경
    		1) 주의 property get/set
    			person.setAge(21);
    			
 		ex) a04_object.jsp
 			Product 를 클래스 prod 로 request 설정.
 			session 범위로 prodSess로 처리하여 호출.
 			물건 가격 변경 처리 
    	 --%>
    	<h3>session 범위 - 변경된 age : ${person.age }</h3>
    	<h3>session 범위 - 변경된 age : ${p01.age }</h3>
    	<form action="" method="post">
         	<div class="mb-3 mt-3">
            <label for="empno">사원번호:</label>
            <input type="number" class="form-control" 
      	     id="empno" placeholder="사원번호 입력" name="empno">
         	</div>
         	<div class="mb-3 mt-3">
            <label for="ename">사원명:</label>
            <input type="text" class="form-control" 
      	     id="ename" placeholder="사원명 입력" name="ename">
         	</div>
         	<button type="submit" class="btn btn-primary">등록</button>
     	</form>
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