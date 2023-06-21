<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "backendWeb2.z01_vo.Member"
    import = "backendWeb2.a01_dao.A05_MemberDao"
    import = "backendWeb2.a01_dao.A02_EmpDao"
    import = "java.uitl.*"
    %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>ex0621</title>
</head>
<body>

<%--
[1단계:개념] 1. session scope의 4가지 범위를 조원들과 함께 이해가 되었는지 확인하세요,
[1단계:코드] 2. member테이블을 기준으로 id가 있는지 여부를 확인하는 DB 처리를 해보세요
회원아이디:[   ][등록여부확인] ==> dao (boolean getMember(String id)) ==> 등록여부에 따라 alert() 출력
[1단계:코드] 3. session 범위로 num01을 할당하고, a01_sess.jsp <==> a02_sess.jsp 이동 시마다 증가하게 하세요.
 --%>
 	<%
 	A05_MemberDao dao = new A05_MemberDao();
    String num = request.getParameter("id");
    String isTF = "N";
    if(num!=null){
    boolean yn = dao.getMember(num);
    if(yn){
       isTF = "Y";
       }
    }

 	%>
 	<script>
	var isTF = "<%=isTF %>";
	   if(isTF=='Y'){
	      alert("있습니다");
	   }else if(isTF=='N'){
	      alert("없습니다");
	   }
	</script>
 	
    <div class="container mt-3">
       <h2>사원정보 등록</h2>
       <form method="post" onsubmit="return false">
            <div class="mb-3 mt-3">
            <label for="id">아이디:</label>
            <input type="text" class="form-control" id="id" placeholder="아이디 입력" name="id">
            </div>
            <button type="submit" class="btn btn-primary">등록여부 확인</button>
        </form>
       	
        
     </div>
</body>
</html>