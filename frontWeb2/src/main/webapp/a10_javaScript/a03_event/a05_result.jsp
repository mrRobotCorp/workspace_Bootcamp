<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "frontWeb2.A05_MemberDao"
    import = "frontWeb2.vo.Member"
    %>
<%
	A05_MemberDao dao = new A05_MemberDao();
	// ?id=@@@&pw=@@ <- java 로 받는 방법
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	Member mem = dao.login(id, pw);
	boolean isSuccess = mem!=null; // DB에 데이터 있는지 여부 확인
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>서버로 온 데이터</h2>
	<!-- 서버에서 요청값을 받아서 자바 데이터 + html 코드를 합쳐서 다시 client에 전송 처리 -->
	<h3>로그인 한 아이디 : ${param.id}</h3>
	<h3>로그인 한 패스워드 : ${param.pw}</h3>
	
	
	<script>
		// java -> js 로 전환
		// java + html -> 네트워크 -> html + js
		let isSuccess = <%=isSuccess%>; 
		if(isSuccess) {
			alert("로그인 성공");
		} else {
			alert("로그인 실패\n다시 로그인");
			location.href = "a04_login.html"
		}
		
	</script>
</body>
</html>