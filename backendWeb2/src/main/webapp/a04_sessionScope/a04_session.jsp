<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
    <style>
    	table { text-align: center;}
    </style>
</head>
<body>
    <div class="container mt-3">
       <h2>session 범위 페이지</h2>
       <table class="table">
          <tbody>
               <tr>
                 <td><%=pageContext.getAttribute("page01")  %></td>
               </tr>
               <tr>
                 <td><%=request.getAttribute("request02")  %></td>
               </tr>
               <tr>
                 <td><%=session.getAttribute("session03")  %></td>
               </tr>
               <tr>
                 <td><%=application.getAttribute("application01")  %></td>
               </tr>
          </tbody>
        </table>        
     </div>
</body>
</html>