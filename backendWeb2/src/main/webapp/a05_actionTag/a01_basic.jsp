<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="backendWeb2.z01_vo.Emp"
	import="backendWeb2.a01_dao.A04_PreParedDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<%
	String ename = request.getParameter("ename");
	if (ename == null)
		ename = "";
	String job = request.getParameter("job");
	if (job == null)
		job = "";
	A04_PreParedDao dao = new A04_PreParedDao();
	%>
	<div class="container mt-3">
		<h2>사원정보 등록</h2>
		<%--
       주의 : include 지시자와 달리 따로 class 구성이 처리되기 때문에 공통된 데이터는
       		전달 형식으로 넘겨야 함
        --%>
		<jsp:include page="a02_schForm.jsp">
			<jsp:param name="ename" value="himan" />
			<jsp:param name="job" value="manger" />

		</jsp:include>
		<jsp:include page="a03_list.jsp"></jsp:include>
	</div>


</body>
</html>