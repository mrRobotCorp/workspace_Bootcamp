<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "backendWeb2.z01_vo.Member"
    %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a25</title>
</head>
<body>
	<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String auth = request.getParameter("auth");
	String pointS = request.getParameter("point");
	
	if(id != null) {
		int point = Integer.parseInt(pointS);
		Member m = new Member(id, pw, name, point, auth);
		log("-- 회원 등록 VO로 성공 --");
		log(m.getId());
		log(m.getPass());
		log(m.getName());
		log("" + m.getPoint());
		log(m.getAuth());
	}
	// String id, String pass, String name, int point, String auth
	%>
	<script>
		function checkValid() {
			// 유효성 check 처리
			// 1. 필수 데이터 입력 처리
			// 2. 아이디 사전 check
			// 3. 패스워드 확인
			// 4. 숫자형/날짜  데이터확인
			return true;
		}
	</script>
    <div class="container mt-3">
       <h2>회원 등록</h2>
       <form method="post" onsumit="return checkValid()">
       
            <div class="mb-3 mt-3">
	            <label for="id">아이디:</label>
	            <input type="text" class="form-control" 
	              id="id" placeholder="아이디 입력" name="id">
            </div>
            <div class="mb-3 mt-3">
	            <label for="pw">비밀번호:</label>
	            <input type="password" class="form-control" 
	              id="pw" placeholder="비밀번호 입력" name="pw">
            </div>
            <div class="mb-3 mt-3">
	            <label for="name">이름:</label>
	            <input type="text" class="form-control" 
	              id="name" placeholder="사원명 입력" name="name">
            </div>
            <div class="mb-3 mt-3">
	            <label for="name">권한:</label>
	            <input type="text" class="form-control" 
	              id="auth" placeholder="권한 선택" name="auth">
            </div>
            <div class="mb-3 mt-3">
	            <label for="name">포인트:</label>
	            <input type="number" class="form-control" 
	              id="point" placeholder="초기 포인트 입력" name="point">
            </div>
            
            
            <button type="submit" class="btn btn-primary">등록</button>
        </form>       
     </div>
</body>
</html>