<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
 	import = "backendWeb2.z01_vo.Emp"   
    
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a12</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<%
	
	%>
	<%--
	사원 정보 등록 form 생성
	문자열, 숫자, 날짜 형태로 요청값 받고 a13에 VO의 getXXX 으로 출력 설정
	직책명/관리자명 select, 부서명 radio, 급여 number, 입사일 date
	 --%>
	 <h3>사원 정보 등록</h3>
 
	 <form action="a13_insertEmp.jsp">
		 <div class="mb-3">
		 		<label for="ename">사원 이름 : </lable>
		 		<input type="text" name="ename" class="form-control" placeholder="사원명">
		 	</div>
		 	<div class="mb-3">
		 		<label for="eno">사원 번호 : </lable>
		 		<input type="number" name="eno">
		 	</div>
		 	<div class="mb-3">
		 		<label for="job">직책명 : </lable>
		 		<select type="form-control" name="job">
		 			<option>ANALYST</option>
		 			<option>CLERK</option>
		 			<option>PRESIDENT</option>
		 			<option>SALESMAN</option>
		 		</select>
		 	</div>
		 	<div class="mb-3">
		 		<label for="mgr">관리자 : </lable>
		 		<select type="form-control" name="mgr">
		 			<option value="7698">BLAKE</option>
		 			<option value="7782">CLARK</option>
		 			<option value="7902">FORD</option>
		 			<option value="7566">JONES</option>
		 			<option value="7839">KING</option>
		 		</select>
		 	</div>
		 	<div class="mb-3">
		 		<lable for="hired">입사일 : </lable>
		 		<input type="date" name="hired">
		 	</div>
		 	<div class="mb-3">
		 		<label for="sal">급여 : </lable>
		 		<input type="number" name="sal" placeholder="급여 입력">
		 	</div>
		 	<div class="mb-3">
		 		<label for="comm">보너스 : </lable>
		 		<input type="number" name="comm" placeholder="보너스 입력">
		 	</div>
		 	<%
		 	String[][] dept = {{"10","ACCOUNTING"}, { "20",  "SALES"}, {"30",  "RESEARCH"}, {"40", "OPERATIONS"}};
		 	%>
		 	<div class="mb-3">
		 		<label for="deptno">부서 : </lable>
		 		<% for(String[] d:dept) {
	 			%>
		 		<input type="radio" class="form-radio-input"
		 		name="deptno" value="<%=d[0]%>">
		 		<%=d[1] %>
		 		<%}%>
		 	</div>
		<button type="submit" class="btn btn-primary">등록</button>
	</form>
	 
</body>
</html>