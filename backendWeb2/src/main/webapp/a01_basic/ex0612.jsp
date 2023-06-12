<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table { border-collapse: collapse; width:40%; margin-bottom:30px; text-align:center;  }
	.ex02 {height: 400px;}
	.odd, .even { cursor: pointer;}
</style>

</head>
<body>
<%--
실습예제1) jsp 스크립트릿에서 조건문을 활용하여 테이블로 홀/짝을 만들어서 정답을 클릭했을 때, 임의의 정답/오답으로 처리되게 하세요
실습예제2) jsp 스크립트릿에서 조건문/반복문을 활용하여 4행 4열을 만들어 3/6/9게임의 내용을 1~16까지 내용으로 표시하세요
실습예제3) 도서 대출 정보를 VO로 만들어 화면에 표시할 때, 테이블로 화면에 출력하세요.
 --%>
<%
int ranNum = (int)(Math.random() * 100 + 1);

%>
 	<table border>
 		<tr>
 			<td colspan=2><%=ranNum %></td>
 		</tr>
 		<tr>
 			<td class="odd">홀수</td>
 			<td class="even">짝수</td>
 		</tr>
 	</table>
 	
 	<script>
	 	const odd = this.document.querySelector(".odd");
	    const even = this.document.querySelector(".even");
	    
	    odd.onclick = function() {
	    	if(<%=ranNum %> % 2 == 1) {
	    		alert("정답입니다.");
	    	} else {
	    		alert("오답입니다.");
	    	}
	    };
	    
	    even.onclick = function() {
	    	if(<%=ranNum %> % 2 == 0) {
	    		alert("정답입니다.");
	    	} else {
	    		alert("오답입니다.");
	    	}
	    };
 	    
 	</script>
 	
 	
 	<table class="ex02" border>
		 	<% 
		int cnt = 0;
		for(int i=0; i<4;i++ ){ %>
		   <tr>
		   <% for(int j=0; j<4; j++){ 
		      cnt++;
		      if(cnt!=10 && cnt%10%3==0){%>
		         <th>짝</th>
		      <%} else{ %>
		         <th><%=cnt %></th>
		      <%} %>
		   <%} %>
		   </tr>
		<%} %>

 		
 	</table>
 	
 	
</body>
</html>