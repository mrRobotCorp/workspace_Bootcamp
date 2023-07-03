<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a01</title>
    <script src="https://code.jquery.com/jquery-3.7.0.min.js"></script>
	<script>
		$(document).ready( function() {
			// $("선택") text : innerText 와 동일
			$("h2").text("jqeury 선언 후 text 삽입");
			
		});
	</script>
</head>
<body>
	<%--
	<c:set var="변수명" value="데이터"/>
	ex) 물건명 가격 갯수 c:set으로 선언하고 출력 처리
		scope="session" 이동함 a02_show.jsp에서 확인
	 --%>
	 <%--
	 session.setAttribute("", "");
	 --%>
    <div class="container mt-3">
       <c:set var="msg" value="jstl 로딩 성공"/>
       <c:set var="num01" value="25"/>
       <c:set var="num02" value="25"/>
       <c:set var="tot" value="${num01 * num02} "/>
       
       <c:set var="pname" value="jelly" scope="session"/>
       <c:set var="price" value="1500" scope="session"/>
       <c:set var="cnt" value="5" scope="session"/>
       <c:set var="tot" value="${price * cnt}" scope="session"/>
       <h2>사원정보 등록</h2>
       <h3>${msg}</h3>
       <h3>${num01 + num02}</h3>
       <h3>${tot}</h3>
       
       <h4 onclick="location.href='a02_show.jsp'">물건 정보 확인(a02)</h4>
       <form action="/">
            <div class="mb-3 mt-3">
            <label for="empno">사원번호:</label>
            <input type="number" class="form-control" 
              id="empno" placeholder="사원명 입력" name="empno">
            </div>
            <button type="submit" class="btn btn-primary">등록</button>
        </form>
       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>Firstname</th>
                 <th>Lastname</th>
                 <th>Email</th>
               </tr>
          </thead>
          <tbody>
               <tr>
                 <td>John</td>
                 <td>Doe</td>
                 <td>john@example.com</td>
               </tr>
          </tbody>
        </table>         
     </div>
</body>
</html>