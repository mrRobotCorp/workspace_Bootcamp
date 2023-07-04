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
	<jsp:useBean id="p01" class="backendWeb2.z01_vo.Person"/>
	<%--
	Person p01 = new Person() 과 동일
	 --%>
	<jsp:setProperty property="name" name="p01" value="Joe"/>
	${p01.setAge(20) }
    <div class="container mt-3">
    	<h2>사원정보 등록</h2>
    	<h3>이름 : <jsp:getProperty property="name" name="p01"/></h3>
    	<%-- p01.getName() 과 동일 --%>
    	<h3>나이 : ${p01.age }</h3>
    	<%--
    	ex) Product useBean을 활용하여 객체 생성 속성 설정하고 el 을 통해 출력
    	 --%>
   	 <jsp:useBean id="prod" class="backendWeb2.z01_vo.Product"/>
   	 <jsp:setProperty property="pname" name="prod" value="jelly"/>
   	 <h3>물건명 : <jsp:getProperty property="pname" name="prod"/></h3>
   	 ${prod.setPrice(1500) }
   	 ${prod.setCnt(2) }
   	 <h3>가격 : ${prod.price }</h3>
   	 <h3>갯수 : ${prod.cnt}</h3>
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