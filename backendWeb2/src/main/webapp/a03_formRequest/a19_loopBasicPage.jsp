<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a19</title>
</head>
<body>
	<%
	String ename = request.getParameter("ename");
	String job = request.getParameter("job");
	// ename, job 입력이 없는 초기화면에도 에러 없이 처리하도록 설정
	if(ename ==null) ename = "";
	if(job ==null) job = "";
	%>
	<%--
	화면에 검색한 입력 값을 다시 다음 페이지에서 출력해야 함
	value = "<%=ename%>"을 처리해야 함

	 --%>
    <div class="container mt-3">
       <h2>사원정보 등록</h2>
       <form method="post">
            <div class="mb-3 mt-3">
	            <label for="job">직책명:</label>
	            <input type="text" class="form-control" 
	              value="<%=job %>" placeholder="직책명 입력" name="job">
            </div>
            <div class="mb-3 mt-3">
	            <label for="ename">사원명:</label>
	            <input type="text" class="form-control" 
	              value="<%=ename %>" placeholder="사원명 입력" name="ename">
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