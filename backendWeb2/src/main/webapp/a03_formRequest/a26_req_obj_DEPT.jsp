<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "backendWeb2.z01_vo.Departments"
    %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a26</title>
</head>
<body>

	<%
	//ex) 부서정보를 입력 받아 처리. VO 객체에 할다으 getXX로 로그 출력
	// int d_id, String d_name, double loc_id
	String deptnoS = request.getParameter("deptno");
	String dname = request.getParameter("dname");
	if(dname == null) dname = "";
	String locS = request.getParameter("loc");
	int deptno = 0;
	double loc = 0;
	
	if(deptnoS != null) deptno = Integer.parseInt(deptnoS);
	if(locS != null) loc= Double.parseDouble(locS);
	
	Departments d = new Departments(deptno, dname, loc);
	
	log("부서번호 : " + d.getD_id());
	log("부서명 : " + d.getD_name());
	log("소속번호 : " + d.getLoc_id());
	
	%>
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
                 <th>부서번호</th>
                 <th>부서명</th>
                 <th>소속번호</th>
               </tr>
          </thead>
          <tbody>
               <tr>
                 <td><%=d.getD_id() %></td>
                 <td><%=d.getD_name() %></td>
                 <td><%=d.getLoc_id() %></td>
               </tr>
          </tbody>
        </table> 
     </div>
</body>
</html>