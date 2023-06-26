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

<%--
?name=Amy&price=3000&price=2000&price=1000
 --%>
<body>
	<div class="container mt-3">
		<h2>요청값 처리1</h2>
		<h3>${param.name }</h3>
		<h2>요청값 처리2</h2>
		<h3>${paramValues.price[0]}</h3>
		<h3>${paramValues.price[1]}</h3>
		<h3>${paramValues.price[2]}</h3>
		<%-- 숫자형의 경우 자동 형변환되어 연산 처리되는 것을 확인할 수 있음 --%>
		<h3>${paramValues.price[0] + paramValues.price[1]
       		+ paramValues.price[2] + paramValues.price[3]}</h3>
		<form action="/">
			<div class="mb-3 mt-3">
				<label for="empno">사원번호:</label> <input type="number"
					class="form-control" id="empno" placeholder="사원명 입력" name="empno">
			</div>
			<button type="submit" class="btn btn-primary">등록</button>
		</form>
		<table class="table">
			<thead class="table-success">
				<tr>
					<th>사원번호</th>
					<th>사원명</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${param.empno }</td>
					<td>${param.ename}</td>

				</tr>
			</tbody>
		</table>
		<%--
        ex) 학생명 국어 영어 수학 점수를 form에 입력해서 계산 클릭 시
        아래에 점수와 총점, 평균을 el로 출력되게 설정
         --%>
		<form action="">
			<div class="mb-3 mt-3">
				<label for="sname">학생명 :</label> 
				<input type="text" class="form-control" id="sname" 
				placeholder="학생명 입력" name="sname">
			</div>
			<div class="mb-3 mt-3">
				<label for="sname">국어 점수 :</label> 
				<input type="number" class="form-control" id="sname" 
				placeholder="국어 점수 입력" name="kor">
			</div>
			<div class="mb-3 mt-3">
				<label for="sname">영어 점수 :</label> 
				<input type="number" class="form-control" id="sname" 
				placeholder="영어 점수 입력" name="eng">
			</div>
			<div class="mb-3 mt-3">
				<label for="sname">수학 점수 :</label> 
				<input type="number" class="form-control" id="sname" 
				placeholder="수학 점수 입력" name="math">
			</div>
			<button type="submit" class="btn btn-primary">계산</button>
		</form>
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
					<td>${param.sname }</td>
					<td>${param.kor}</td>
					<td>${param.eng}</td>
					<td>${param.math}</td>
					<td>${param.kor + param.eng + param.math}</td>
					<td>${(param.kor + param.eng + param.math)/3}</td>

				</tr>
			</tbody>
		</table>
		
	</div>
</body>
</html>







