<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>   
<fmt:requestEncoding value="utf-8"/>
<c:set var="path" value="${pageContext.request.contextPath}"/> 
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
       <h2>사원정보 조회</h2>
       <form method="post">
            <div class="mb-3 mt-3">
            <label for="ename">사원명:</label>
            <input type="text" class="form-control" value="${param.ename }"
              id="ename" placeholder="사원명 입력" name="ename">
            </div>
            <div class="mb-3 mt-3">
            <label for="job">직책명:</label>
            <input type="text" class="form-control" value="${param.job }"
              id="job" placeholder="직책명 입력" name="job">
            </div>
            <button type="submit" class="btn btn-primary">검색</button>
            <button type="button" id="regBtn" class="btn btn-success">등록</button>
        </form>
        <script type="text/javascript">
           $("#regBtn").click(function (){
              location.href="${path}/empInsert.do"
           })
        </script>
        
      <table class="table table-striped table-hover">
         <thead class="table-success">
               <tr  class="text-center">
                <th>사원번호</th>
                <th>사원명</th>
                <th>직책명</th>
                <th>급여</th>
                <th>부서번호</th>
               </tr>
          </thead>
          <tbody>
          <%--
          	controller에서 모델명으로 넘겨 준 데이터
           --%>
          <c:forEach var="emp" items="${empList}">
               <tr ondblclick="goPage(${emp.empno})" class="text-center">
                 <td>${emp.empno }</td>
                 <td>${emp.ename }</td>
                 <td>${emp.job }</td>
                 <td>${emp.sal }</td>
                 <td>${emp.deptno }</td>
               </tr>
          </c:forEach>
          </tbody>
      </table>      
      <script type="text/javascript">
         function goPage(empno){
            location.href = "${path}/empDetail01.do?empno="+empno
         }
      </script>   
    </div>
</body>
</html>