<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a01</title>
    <style>
    	table { text-align: center;}
    </style>
</head>
<body>
    <div class="container mt-3">
       <h2>session scope에 따른 데이터(page 범위)</h2>
       <%
       pageContext.setAttribute("page01", "페이지 범위임");
       request.setAttribute("request02", "리퀘스트 범위임");
       session.setAttribute("session03", "세션 범위임");
       application.setAttribute("application01", "어플리케이션 범위임");
       %>
       <table class="table">

          <tbody>
               <tr>
                 <td><%=pageContext.getAttribute("page01")  %></td>
               </tr>
               <tr>
                 <td onclick="location.href = 'a02_request.jsp'"
                 ><%=request.getAttribute("request02")  %> click</td>
               </tr>
               <tr>
                 <td onclick="location.href = 'a04_session.jsp'"
                 ><%=session.getAttribute("session03")  %> click</td>
               </tr>
               <tr>
                 <td><%=application.getAttribute("application01")  %></td>
               </tr>
          </tbody>
        </table>         
     </div>
</body>
</html>