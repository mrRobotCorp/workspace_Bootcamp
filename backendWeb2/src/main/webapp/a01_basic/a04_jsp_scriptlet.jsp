<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name = "Tom";
	String [] arry = {"apple", "banana", "cherry"};
%>

<%
	for(String f: arry) {
%>		
	<%-- 출력 영역 --%>
	<h2>과일 : <%=f %></h2>
<%} %>

	<h2>카운트 업</h2>
	<%-- 1~10까지 h3로 카운트 업 --%>

<%
	for(int i=1; i<=10; i++) {
%>
	<h3>카운트 : <%=i %></h3>
<%
	}
%>

	<%-- ex) 테이블의 1*10으로 카운트 다운 처리 
	--%>
	<table border style="border-collapse:collapse">
			<tr>
<%
	for(int i=10; i<=1; i--){
%>
				<td><%=i %></td>
<%
	}

%>		
			</tr>
	</table>

	<% // <-- 해당 괄호 퍼센트는 java 코드를 표시
	// java 
	String auth = "admin";
	if(auth.equals("admin")) {
	%>
		<span>관리자메뉴</span>
		<span>회원메뉴</span>
		<span>배송관련 처리 메뉴</span>
	
	<%} else { 
	%>
		<span>물품종류1</span>
		<span>물품종류2</span>
		<span>장바구니메뉴</span>
	
	<%
	}
	%>
	
	<%
	int point = (int)(Math.random() * 1000 + 1);
	String grade = "";
	if(point >= 800) {
		grade = "VVIP";
	} else if(point>= 500) {
		grade = "VIP";
	} else {
		grade = "일반고객";
	}
	
	%>
	
	<h3>
		<span>포인트 : <%=point %></span>
		<span>고객등급 : <%=grade %></span>
	
	</h3>
	
	<%--
	ex) 임의의 수를 1-10 까지 발생해서 짝수, 홀수일 때를 나누어 오늘은 운이 좋은 날입니다
	오늘은 운이 안 좋으니 활동을 삼가하십쇼 출력
	 --%>
	 
	 <%
	 	int ranNum = (int)(Math.random() * 10 + 1);
	 	String txt = "";
	 	if(ranNum%2 == 0) {
	 		txt = "운수 좋은 날";
	 	} else {
	 		txt = "운 별로, 활동 삼가";
	 	}
	 %>
	 
	 <p>운 결과 : <%=txt %></p>
	 

	<%--
	ex) 나이는 1~90 임의로 나오게 하여 13 이하: 어린이 사이트입니다
	~18 : 청소년 사이트 입니다
	~65 : 일반 사이트입니다.
	65 초과 : 노인을 위한 사이트 입니다
	 --%>
	
	<%
	int ranAge = (int)(Math.random() * 90 + 1);
	String ageResult = "";
	if(ranAge <= 13) {
		ageResult = "어린이 사이트입니다.";
	} else if( ranAge <=18 ) {
		ageResult = "어린이 사이트입니다.";
	} else if( ranAge <=65 ) {
		ageResult = "일반 사이트입니다.";
	} else {
		ageResult = "노인을 위한 사이트입니다.";
	}
	%>
	
	<h4>랜덤 나이 결과 : <%=ageResult %></h5>







</body>
</html>