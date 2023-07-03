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
    <title>a05</title>
   
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
            <label for="ename">사원명:</label>
            <input type="text" class="form-control" 
      	     id="ename" placeholder="사원명 입력" name="ename">
         	</div>
         	<button type="submit" class="btn btn-primary">등록</button>
     	</form>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>등록 여부</th>
		      	</tr>
		    </thead>
		    <%--
		    form
		    name="ename"을 입력해서 submit 클릭 시, 요청값을
		    param.ename으로 받을 수 있음
		    요청값에 따라 
		    등록된 회원이 아님 -> 기본 값 regMsg
		    등록된 회원임 -> 조건문에 의해 himan일 때만
		     --%>
		    <c:set var="regMsg" value="등록된 회원이 아닙니다."/>
		    <c:if test="${param.ename=='himan'}" >
			    <c:set var="regMsg" value="등록된 회원입니다"/>
		    </c:if>
		    
		    <%--param.ename이 공백이나 null이 아닐 때 el 태그 
		    	empty param.ename : null이거나 입력값이 없을 때
		    	a06_jstl_if.jsp
		    		물건 가격과 갯수를 입력 받아
		    		총계가 10만 이상 일 때, 할인대상자입니다.
		    		그렇지 않으면 할인대상자가 아닙니다 출력
		    --%>
		    <c:if test="${not empty param.ename} ">
		    <tbody>
			   	<tr  class="text-center">
			        <td>${regMsg}</td>
			   	</tr>
		 	</tbody>
		 	</c:if>
		</table>      	
    </div>
</body>
</html>