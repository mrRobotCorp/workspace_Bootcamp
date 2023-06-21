<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "backendWeb2.z01_vo.Member"
    import = "backendWeb2.a01_dao.A05_MemberDao"
    import = "java.uitl.*"
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
	A05_MemberDao dao = new A05_MemberDao();
	String regYN = "F";
	
	if(id != null) {
		int point = Integer.parseInt(pointS);
		Member m = new Member(id, pw, name, point, auth);
		log("-- 회원 등록 VO로 성공 --");
		log(m.getId());
		log(m.getPass());
		log(m.getName());
		log("" + m.getPoint());
		log(m.getAuth());
		dao.InsertMem(m);
		regYN = "Y";
	}
	
	
	%>
	<script>
		let regYN = "<%=regYN%>";
		if(regYN == 'Y') {
			alert("등록 성공");
		}
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
       <h2>부서정보 등록</h2>
       <form method = "post">
            <div class="mb-3 mt-3">
            <label for="deptno">부서번호 입력 :</label>
            <input type="number" class="form-control" 
              id="deptno" placeholder="부서번호 입력" name="deptno">
            </div>
            <div class="mb-3 mt-3">
            <label for="dname">부서명 입력 :</label>
            <input type="text" class="form-control" 
              id="dname" placeholder="부서명 입력" name="dname">
            </div>
            <div class="mb-3 mt-3">
            <label for="loc">소속번호 입력 :</label>
            <input type="number" class="form-control" 
              id="loc" placeholder="소속번호 입력" name="loc">
            </div>
            <button type="submit" class="btn btn-primary">등록</button>
        </form>
        <table class="table">
          <thead class="table-success">
               <tr>
                 <th>아아디</th>
                 <th>이름</th>
                 <th>권한</th>
                 <th>포인트</th>
                 <th>등록일</th>
               </tr>
          </thead>
          <tbody>
          <% 
        	%>
               <tr>
                 <td><%= ""%></td>
                 <td><%= ""%></td>
                 <td><%= ""%></td>
                 <td><%= ""%></td>
                 <td><%= ""%></td>
               </tr>
          <% %>
          </tbody>
        </table> 
     </div>
</body>
</html>