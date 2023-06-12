<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	.pointT { border-collapse: collapse; text-align: center; }
	.pointT th, .pointT td  {width : 50px; border : 1px solid #999;}
	
</style>
<title>Insert title here</title>
</head>
<body>
	<%--
	1~10까지 출력하되 총 합산을 마지막에 출력
	출력형태 1 + 2 + 3 ... = tot
	--%>
	<h3>
	<%
	// 1. java 코드로 처리
	// 2. 괄호<퍼센트% 로 처리 할 내용, <%=% 을 구분, 화면에 처리 할 부분
	int tot=0;
	for(int i=1; i<=10; i++) {
		tot += i;
	%>
		<%=i %>
		
	<%
		if(i==10) {
	%>
		= <%= tot %>
			
		<%
		} else {
		%>
			+
		
		<%
		}
		%>
		
	<%
	}
	%>
	</h3>
	
	<%--
	ex) 반복문을 활용하여 임의의 구구단을 설정
	테이블을 통해서 출력 @@단
	@ X 1 = @@ 형식
	--%>
	<%
	int ranNum = (int)(Math.random() * 8 + 2);
	%>
	
	<table>
		<%
		for(int i=1; i<=9; i++) {
		%>	
		
		<tr>
			<td><%=ranNum %> X = </td>
			<td><%=ranNum * i%></td>
		</tr>
		
		<%
		}
		%>
	</table>
	
	<%--
	홀짝 표시 1~10 출력
	no 구분
	1  홀수
	2  짝수
	--%>
	
	<div>
		<span>no</span>
		<span>구분</span>
	</div>
	<%
	String type = "";
	for(int i=1; i<=10; i++) {
		if(i%2 == 0) {
			type = "짝수";
		} else {
			type = "홀수";
		}
	%>
		<div>
			<span><%=i %>&nbsp;</span>
			<span><%=type %></span>
		</div>	
	<%
	}
	%>
	
	<%--
	ex) form 화면에서 테이블로 학번 국어 영어 수학 평균
					   1  70 80 90 nn
	   점수 부분은 input 형식을 value 값에 점수가 입력되어 출력
	   반복문을 통해 학생 5명 출력
	   점수는 임의로 0-100 사이 정수 설정
	--%>
	
	
	<form>
		<table class="pointT">
			<tr>
				<th>학번<th>
				<th>국어<th>
				<th>영어<th>
				<th>수학<th>
				<th>평균<th>
			</tr>		
			
			<%
			for(int i=1; i<=5; i++) {
				int ranKor = (int)(Math.random() * 100);
				int ranEng = (int)(Math.random() * 100);
				int ranMath = (int)(Math.random() * 100);
				int avg = (ranKor + ranEng + ranMath) / 3;
			%>	
			<tr>
				<td><%=i %></td>
				<td>
					<span>국어 점수 : </span>
					<input type="text" name="kor" value="<%=ranKor %>">
				</td>
				<td>
					<span>영어 점수 : </span>
					<input type="text" name="eng" value="<%=ranEng %>">
				</td>
				<td>
					<span>수학 점수 : </span>
					<input type="text" name="math" value="<%=ranMath %>" >
				</td>
				<td><%=avg %></td>
			</tr>
			
			<%
			}
			%>
		</table>
	</form>
	
	
	
	
	
	
	
</body>
</html>