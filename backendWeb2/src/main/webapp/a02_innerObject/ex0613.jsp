<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"   
	import = "backendWeb2.a01_dao.*"   
	import = "backendWeb2.z01_vo.*" 
	import = "java.util.List"
%>

<%
	A04_PreParedDao dao = new A04_PreParedDao();
	List<Jobs> jlist = dao.getJob();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
	문제풀이

[1단계:실습] 1. 직책정보를 jsp에서 Combo 박스로 출력하세요(- jobs 테이블 참고, DAO,JSP처리)
[1단계:실습] 2. 웹화면에서 main.jsp을 두고, 상단페이지(top.jsp), 하단페이지(bottom.jsp)
를 include지시자로 두어 처리하되, java, js, css 코드를 top.jsp에 선언하여
main.jsp, bottom.jsp에서 호출하는 것을 처리해보세요.
[1단계:실습] 3. 쿼리스트링으로 회원정보(아이디,패스워드,이름,권한,포인트)를 전송하고 이것을 출력하세요
[1단계:실습] 4. 쿼리스트링으로 선수의정보(이름, 타석,안타)를 통해서 타석과 안타를 형변환하여 이름,타율을 출력하세요
	 --%>
	 <h2>직책 정보</h2>
	<select name="mgr" onchange="alert(this.value)">
		<option value='0'>선택</option>
		<% for(Jobs j:jlist) {
		%>	
		
		<option value='<%=j.getJob_id() %>'>
			<%=j.getJob_title() %>
		</option>
		
		<%}%>
		
	</select>
	 
	 <%@ include file="top.jsp" %>
	 
	 <script>
	 	let lis = document.querySelectorAll("li");
	 	lis.forEach( (e, i) => {
	 		lis[i].onclick = function() {
	 			lis[i].style.backgroundColor = color;
	 		}
	 	})
	 </script>
	 
	 <%
	 String id = request.getParameter("id");
	 String pw = request.getParameter("pw");
	 String name = request.getParameter("name");
	 String auth = request.getParameter("auth");
	 String point = request.getParameter("point");
	 
	 int p = 0;
	 if(point != null) {
		 p = Integer.parseInt(point);
	 }
	 
	 %>
	 
	 <h4>아이디 : <%=id %></h4>
	 <h4>비밀번호 : <%=pw %></h4>
	 <h4>이름 : <%=name %></h4>
	 <h4>권한 : <%=auth %></h4>
	 <h4>포인트 : <%=point %></h4>
	 
	 
	 <%
	 String player = request.getParameter("player");
	 String point1 = request.getParameter("point1");
	 String point2 = request.getParameter("point2");
	 
	 int p01 = 0;
	 int p02 = 0;
	 double result = 0;
	 
	 if(point1 != null && point2 != null) {
		 p01 = Integer.parseInt(point1);
		 p02 = Integer.parseInt(point2);
		 result = p01 / p02;
	 }
	 
	 %>
	 
	 <strong>이름 : <%=player %></strong><br>
	 <strong>타율 : <%=result %></strong>
	 
</body>
</html>







