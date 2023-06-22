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
<title>a05</title>
</head>
<body>
	<%--
    ex) a04_main.jsp
    		학생 이름, 국어, 영어, 수학 정보 전달
    		액션태그로 a05_sub.jsp 포함
    	a05_sub.jsp
    		테이블 리스트 받은 정보로 출력
     --%>
	<%
	String stuname = request.getParameter("stuname");
	String kor = request.getParameter("kor");
	String eng = request.getParameter("eng");
	String math = request.getParameter("math");
	%>

	<div class="container mt-3">
		<h2>사원정보 등록</h2>

		<table class="table">
			<thead class="table-success">
				<tr>
					<th>학생명</th>
					<th>국어</th>
					<th>영어</th>
					<th>수학</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><%=stuname%></td>
					<td><%=kor%></td>
					<td><%=eng%></td>
					<td><%=math%></td>
				</tr>
			</tbody>
		</table>
	</div>


</body>
</html>