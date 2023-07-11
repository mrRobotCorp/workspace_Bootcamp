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
          
          $("h2").text("스프링 시작")
       });
    </script>      
    
    
</head>
<body>
    <div class="container mt-3">
       <h2>스프링 시작</h2>
       <h3>${msg}</h3>
       
      <table class="table table-striped table-hover">
         <thead class="table-success">
               <tr  class="text-center">
                <th>물건명</th>
                <th>가격</th>
                <th>갯수</th>
                <th>총액</th>
               </tr>
          </thead>
          <tbody>
               <tr  class="text-center">
                 <td>${param.pname }</td>
                 <td>${param.price }</td>
                 <td>${param.cnt }</td>
                 <td>${param.price*param.cnt }</td>
               </tr>
          </tbody>
      </table>         
    </div>
</body>
</html>