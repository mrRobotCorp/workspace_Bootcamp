<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="backendWeb2.z01_vo.Person"
    import="backendWeb2.z01_vo.Member"
    import="backendWeb2.z01_vo.JobHistory"
    %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a03_objectEl</title>
    <style>
    	table { text-align : center;}
    </style>
</head>
<body>
<%
//String name, int age, String lo
session.setAttribute("p01", new Person( "Amy", 33, "seoul"));
//String id, String pass, String name, int point, String auth
session.setAttribute("mem", new Member("himan", "7777", "Amy", 1293, "user"));

// ex) db에 job_history기준으로 vo 생성
// 		session으로 할당하고 출력

//int employee_id, String start_date, String end_date, String job_id, int department_id
session.setAttribute("jb01", new JobHistory(105, "2023-06-26", "2023-06-26", "IT-PROG", 60));
%>
    <div class="container mt-3">
       <h2>el 활용</h2>
       <h3>이름 : ${p01.name}</h3>
       <%--
       주의. get### 메서드로 호출되는 property임
        --%>
       <h3>나이 : ${p01.age}</h3>
       <h3>사는 곳 : ${p01.loc}</h3>
       
       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>아이디</th>
                 <th>패스워드</th>
                 <th>이름</th>
                 <th>권한</th>
                 <th>포인트</th>
               </tr>
          </thead>
          <tbody>
               <tr>
                 <td>${mem.id }</td>
                 <td>${mem.pass}</td>
                 <td>${mem.name }</td>
                 <td>${mem.auth }</td>
                 <td>${mem.point }</td>
               </tr>
               
          </tbody>
          
          
        </table>  
        <table class="table">
          <thead class="table-success">
               <tr>
                 <th>직원 ID</th>
                 <th>입사일</th>
                 <th>퇴사일</th>
                 <th>직책 ID</th>
                 <th>부서 ID</th>
               </tr>
          </thead>
          <tbody>
               <tr>
                 <td>${jb01.employee_id }</td>
                 <td>${jb01.start_dateS}</td>
                 <td>${jb01.end_dateS }</td>
                 <td>${jb01.job_id }</td>
                 <td>${jb01.department_id }</td>
               </tr>  
               
          </tbody>
        </table>  
             
     </div>
</body>
</html>