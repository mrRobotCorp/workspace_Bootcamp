<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a18</title>
    <style>
    	table { text-align : center;}
    </style>
</head>
<body>

	<%
	String sname = request.getParameter("stuname");
	if(sname == null) sname = "";
	String korS = request.getParameter("kor");
	String engS = request.getParameter("eng");
	String mathS = request.getParameter("math");
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	if(korS != null ) kor = Integer.parseInt(korS);
	if(engS!= null ) eng = Integer.parseInt(engS);
	if(mathS != null ) math = Integer.parseInt(mathS);
	
	int tot = kor + eng + math;
	int avg = tot / 3;
	
	%>
    <div class="container mt-3">
       <h2>학생 성적 정보</h2>

       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>학생명</th>
                 <th>국어</th>
                 <th>영어</th>
                 <th>수학</th>
                 <th>총계</th>
                 <th>평균</th>
               </tr>
          </thead>
          <tbody>
               <tr>
                 <td><%=sname %></td>
                 <td><%=kor %></td>
                 <td><%=eng %></td>
                 <td><%=math %></td>
                 <td><%=tot %></td>
                 <td><%=avg %></td>
               </tr>
          </tbody>
        </table>         
     </div>
</body>
</html>