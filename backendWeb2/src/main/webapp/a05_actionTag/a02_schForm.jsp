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
</head>
<body>

	<%
	// <jsp:param name = "ename" value="himan"/> 해당 내용을 아래에 할당 
	String ename = request.getParameter("ename");
	String job = request.getParameter("job");
	%>
	<%--
	요청값 상위에 있는a01_basic.jsp로 넘어감
	 --%>
    <div class="container mt-3">
       <h2>사원정보 등록</h2>
       <form action="/">
            <div class="mb-3 mt-3">
            <label for="empno">사원명:</label>
            <input type="text" class="form-control" 
              id="ename" placeholder="사원명 입력" value="<%=ename %>" name="ename">
            </div>
            <div class="mb-3 mt-3">
            <label for="empno">직책명:</label>
            <input type="text" class="form-control" 
              id="job" placeholder="직책명 입력" value="<%=job %>"  name="job">
            </div>
            <button type="submit" class="btn btn-primary">등록</button>
        </form>       
     </div>
</body>
</html>