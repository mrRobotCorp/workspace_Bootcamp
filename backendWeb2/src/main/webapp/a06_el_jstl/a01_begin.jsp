<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a01_begin</title>
</head>
<body>
<%
	request.setAttribute("name", "Amy");

	request.setAttribute("pname", "jelly");
	request.setAttribute("price", "2000");
	request.setAttribute("cnt", "5");
%>
    <div class="container mt-3">
       <h2>이름 : ${name}</h2>
       <%--
       String name = request.getAttribute("name")
       <%=name%> 과 동일
        --%>
        <h3 onclick="location.href='a02_el_session.jsp'">session 범위 확인하러 가기</h3>
       <%--
       a02_el_session.jsp 
       <h2>이름 : ${name}</h2> 
       <h2>나이 : ${age} </h2>
       <%
       	int age = (Integer)session.getAttribute("age")
       	<%=age%>
       %>
       
       ex) 물건명, 가격, 갯수를 설정하고 el로 호출, 아래 화면에 출력
        --%>
        <h4>물건명 : ${pname}</h4>
        <h4>가격 : ${price}</h4>
        <h4>갯수 : ${cnt}</h4>
        <h4>총계 : ${price * cnt}</h4>
        <h4>비용등급 : ${price * cnt >= 3000}</h4>
        <h4>비용등급 : ${price * cnt >= 3000?'고비용':'저비용'}</h4>
        
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