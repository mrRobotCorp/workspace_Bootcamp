<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<div class="container mt-3">
		<h2>사원정보 등록</h2>
		<form method="post">
			<div class="mb-3 mt-3">
				<label for="pay">구매 금액 입력 :</label> <input type="number"
					class="form-control" id="pay" placeholder="구매 금액 입력" name="pay">
			</div>
			<button type="submit" class="btn btn-primary">등록</button>
		</form>
		<%
		String payS = request.getParameter("pay");
		int pay = 0;
		if (payS != null) {
			pay = Integer.parseInt(payS);
			if (pay >= 50000) {
			%>
			<jsp:forward page="a07_mvp.jsp"></jsp:forward>
			<%--mvp 사이트 --%>
			<%
			} else {
			%>
			<jsp:forward page="a08_nor.jsp"></jsp:forward>
			<%--일반 사이트 --%>
	
			<%
			}
		}
		%>
	</div>
</body>
</html>





