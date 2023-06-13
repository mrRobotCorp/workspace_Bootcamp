<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a12</title>
</head>
<body>
<%--ex) a12_main.jsp 아래 내용 include 지시자로 호출 + 변수 사용
		a13_sub.jsp(js, java 변수 선언) 화면 2*2 테이블 생성
	  --%>
	  
	<%@ include file="a13_sub.jsp" %>
	<h2>메인 화면</h2>
	<h3>사용 변수 : <%=num %></h3>
	<h3 class="cls01">안녕하세요 <%=name %></h3>
	
	<script>
		let tdArr = document.querySelectorAll(".a13T td");
		tdArr.forEach( (td, i) => {
			td.innerText = i + 1;
		});
		alert("가격 : " + price + ", 갯수 : " + cnt);
	</script>
</body>
</html>