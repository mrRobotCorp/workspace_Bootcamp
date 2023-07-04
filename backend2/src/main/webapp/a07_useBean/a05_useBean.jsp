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
    <div class="container mt-3">
    	<jsp:useBean id="mem" class="backendWeb2.z01_vo.Member"/>
     	<jsp:setProperty property="*" name="mem"/>
     	<jsp:useBean id="list" class="java.util.ArrayList" scope="session"/>
    	<jsp:useBean id="dao" class="backendWeb2.a01_dao.A05_MemberDao"/>
     	<c:if test="${not empty mem.id }">
     		<${dao.insertMember(mem) }
     	</c:if>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>아이디</th>
				    <th>이름</th>
				    <th>권한</th>
		      	</tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="m" items="${dao.mlist() }">
			   	<tr  class="text-center">
			        <td>${m.id }</td>
			        <td>${m.name }</td>
			        <td>${m.auth }</td>
			   	</tr>
		    	</c:forEach>
		 	</tbody>
		</table>
     	
    	<form action="" method="post">
    		<input type="text" class="form-control me-2"
    			id="deptno" placeholder="부서번호 입력" name="deptno" >
    		<input type="text" class="form-control me-2"
    			id="dname" placeholder="부서명 입력" name="dname" >
    		<input type="text" class="form-control me-2"
    			id="loc" placeholder="부서위치 입력" name="loc" >

         	<button type="submit" class="btn btn-primary">등록</button>
     	</form>     	
    </div>
</body>
</html>