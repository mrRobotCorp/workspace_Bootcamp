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
<title>a04</title>
</head>
<body>
	<%--
    ex) a04_main.jsp
    		학생 이름, 국어, 영어, 수학 정보 전달
    		액션태그로 a05_sub.jsp 포함
    	a05_sub.jsp
    		테이블 리스트 받은 정보로 출력
     --%>
	
	<div class="container mt-3">
		<form action="" method="post">
			<div class="mb-3 mt-3">
				<label for="stuname">학생명:</label> <input type="text"
					class="form-control" id="empno" placeholder="학생명 입력"
					 name="stuname">
			</div>
			<div class="mb-3 mt-3">
				<label for="stuname">국어 점수 :</label> <input type="number"
					class="form-control" id="empno" placeholder="국어 점수 입력"
					name="kor">
			</div>
			<div class="mb-3 mt-3">
				<label for="stuname">영어 점수 :</label> <input type="number"
					class="form-control" id="empno" placeholder="영어 점수 입력"
					name="eng">
			</div>
			<div class="mb-3 mt-3">
				<label for="stuname">수학 점수 :</label> <input type="number"
					class="form-control" id="empno" placeholder="수학 점수 입력"
					name="math">
			</div>
			<button type="submit" class="btn btn-primary">등록</button>
		</form>
	</div>
	<%
	String stuname = request.getParameter("stuname");
	String kor = request.getParameter("kor");
	String eng = request.getParameter("eng");
	String math = request.getParameter("math");
	if(stuname == null) stuname = "";
	if(kor == null) kor = "0";
	if(eng == null) eng = "0";
	if(math == null) math = "0";
	%>
	<jsp:include page="a05_sub.jsp">
		<jsp:param name="stuname" value="<%=stuname %>" />
		<jsp:param name="kor" value="<%=kor %>" />
		<jsp:param name="eng" value="<%=eng %>" />
		<jsp:param name="math" value="<%=math %>" />
	</jsp:include>

</body>
</html>