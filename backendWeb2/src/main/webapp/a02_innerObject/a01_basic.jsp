<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a01</title>
<style>
	table { border-collapse : collapse; width: 40%; height: 200px;}
	table td { border: 1px solid #999;}
</style>
</head>
<body>
	<h2>script만 사용하는 경우</h2>
	<h4>
		<%for(int i=1; i<=10; i++) {
		%>
			<span><%=i %></span>
		<%} %>
	</h4>
	
	
	<h2>out 객체 사용</h2>
	<h4>
		<%for(int i=1; i<=10; i++) {
			out.print(i + ", ");
		}
		%>		
	</h4>
	
	<%--
	ex) 1~25까지 5*5테이블 out 이용하여 출력, 해당 cell 클릭 시 배경 색 변경
	
	 --%>
	 <table class="a01T">
	 <% for(int i=1; i<=25; i++) {
		 if(i%5==1) out.print("<tr>");
		 out.print("<td>");
		 out.print(i);
		 out.print("</td>");
		 if(i%5==0) out.print("</tr>");
	 %>
		
		
	<%} %>
	 </table>
	 
	 <script>
	 	let td = document.querySelectorAll(".a01T td");
	 	
	 	td.forEach((e, i) => {
	 		td[i].onclick = function() {
	 			td[i].style.backgroundColor = "#00f";
	 			td[i].style.color = "#fff";
	 		}
	 	} )
	 </script>
	 
</html>