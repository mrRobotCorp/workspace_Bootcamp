<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a05</title>
</head>
<body>
<%--
	ex) 
	fruit01 : 사과 (page 범위 설정)
	fruit02 : 바나나 (request 범위 설정)
	fruit03 : 딸기 (session 범위 설정)
	fruit04 : 수박 (application 범위 설정)
 --%>
	 <%
       pageContext.setAttribute("fruit01", "사과");
       request.setAttribute("fruit02", "바나나");
       session.setAttribute("fruit03", "딸기");
       application.setAttribute("fruit04", "수박");
       %>
    <div class="container mt-3">
       <h2>session scope 범위</h2>
       <table class="table">
          <tbody>
               <tr>
                 <td><%=pageContext.getAttribute("fruit01") %></td>
               </tr>
               <tr>
                 <td onclick = "location.href='a07_request.jsp'"
                 ><%=request.getAttribute("fruit02") %></td>               
               </tr>
               <tr>
                 <td onclick="location.href = 'a06_session.jsp'"
                 ><%=session.getAttribute("fruit03") %></td>               
               </tr>
               <tr>
                 <td><%=application.getAttribute("fruit04") %></td>               
               </tr>
          </tbody>
        </table>         
     </div>
</body>
</html>