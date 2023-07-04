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
<%--
	ex) useBean을 통해 사원정보 등록 조회
	
 --%>
    <div class="container mt-3">
    	<h2>사원정보 등록</h2>
    	<form action="" method="post">
    		<input type="text" class="form-control me-2"
    			id="ename" placeholder="사원명 입력" name="ename" >
    		<input type="text" class="form-control me-2"
    			id="job" placeholder="직책명 " name="job" >
    		<input type="text" class="form-control me-2"
    			id="mgr" placeholder="관리자 번호 입력" name="mgr" >
    		<input type="text" class="form-control me-2"
    			id="hiredate" placeholder="입사일 입력" name="hiredateS" >
    		<input type="number" class="form-control me-2"
    			id="sal" placeholder="급여 입력" name="sal" >
    		<input type="number" class="form-control me-2"
    			id="comm" placeholder="보너스 입력" name="comm" >
    		<input type="number" class="form-control me-2"
    			id="deptno" placeholder="부서번호 입력" name="deptno" >

         	<button type="submit" class="btn btn-primary">등록</button>
     	</form> 
     	
     	<jsp:useBean id="emp" class="backendWeb2.z01_vo.Emp"/>
     	<jsp:setProperty property="*" name="emp"/>
     	<jsp:useBean id="list" class="java.util.ArrayList" scope="session"/>
    	<jsp:useBean id="dao" class="backendWeb2.a01_dao.A04_PreParedDao"/>
		<c:if test="${not empty emp.ename }">
     		<${dao.insertEmp(emp) }
     	</c:if>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>이름</th>
				    <th>직책명</th>
				    <th>관리자</th>
				    <th>입사일</th>
				    <th>급여</th>
				    <th>보너스</th>
				    <th>부서번호</th>
		      	</tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="e" items="${dao.getEmpList() }">
			   	<tr  class="text-center">
			        <td>${e.ename }</td>
			        <td>${e.job }</td>
			        <td>${e.mgr }</td>
			        <td>${e.hiredate }</td>
			        <td>${e.sal}</td>
			        <td>${e.comm}</td>
			        <td>${e.deptno}</td>
			   	</tr>
		    	</c:forEach>
		 	</tbody>
		</table>      	
    </div>
</body>
</html>