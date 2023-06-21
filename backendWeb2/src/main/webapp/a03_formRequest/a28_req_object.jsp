<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "backendWeb2.z01_vo.Emp"
    import = "backendWeb2.a01_dao.A04_PreParedDao"
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
    <title>a25</title>
</head>
<body>
	<%
	// 사원정보 등록, 등록된 내용 출력
	String empnoS = request.getParameter("empno");
	String ename = request.getParameter("ename");
	String job = request.getParameter("job");
	String mgrS = request.getParameter("mgr");
	String hiredate = request.getParameter("hiredate");
	String salS = request.getParameter("sal");
	String commS = request.getParameter("comm");
	String deptnoS = request.getParameter("deptno");
	
	if(ename == null) ename = "";
	if(job == null) job = "";
	if(hiredate == null) hiredate = "";
	int empno = 0;
	int mgr = 0;
	double sal = 0;
	double comm = 0;
	int deptno = 0;
	
	if(empnoS != null) empno = Integer.parseInt(empnoS);
	if(mgrS != null) mgr = Integer.parseInt(mgrS);
	if(salS != null) sal = Double.parseDouble(salS);
	if(commS != null) comm = Double.parseDouble(commS);
	if(deptnoS != null) deptno = Integer.parseInt(deptnoS);
	
	A04_PreParedDao dao = new A04_PreParedDao();
	
	dao.insertEmp(new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno));
	boolean isSuc = true;
	
	//int empno, String ename, String job, int mgr, String hiredateS, Double sal, Double comm, int deptno
	
	%>
    <div class="container mt-3">
       <h2>사원정보 등록</h2>
       <form method = "post">
            <div class="mb-3 mt-3">
            <label for="empno">사원번호 입력 :</label>
            <input type="number" class="form-control" 
              id="empno" placeholder="부서번호 입력" name="empno">
            </div>
            <div class="mb-3 mt-3">
            <label for="ename">사원명 입력 :</label>
            <input type="text" class="form-control" 
              id="dname" placeholder="부서명 입력" name="ename">
            </div>
            <div class="mb-3 mt-3">
            <label for="job">직책 입력 :</label>
            <input type="text" class="form-control" 
              id="loc" placeholder="직책 입력" name="job">
            </div>
            <div class="mb-3 mt-3">
            <label for="mgr">권한 입력 :</label>
            <input type="number" class="form-control" 
              id="mgr" placeholder="부서번호 입력" name="mgr">
            </div>
            <div class="mb-3 mt-3">
            <label for="hiredate">입사일 입력 :</label>
            <input type="date" class="form-control" 
              id="hiredate" name="hiredate">
            </div>
            <div class="mb-3 mt-3">
            <label for="sal">급여 입력 :</label>
            <input type="number" class="form-control" 
              id="sal" placeholder="급여 입력" name="sal">
            </div>
            <div class="mb-3 mt-3">
            <label for="comm">보너스 입력 :</label>
            <input type="number" class="form-control" 
              id="comm" placeholder="급여 입력" name="comm">
            </div>
            <div class="mb-3 mt-3">
            <label for="deptno">부서번호 입력 :</label>
            <input type="number" class="form-control" 
              id="deptno" placeholder="급여 입력" name="deptno">
            </div>
            <button type="submit" class="btn btn-primary">등록</button>
        </form>
        
        <script>
        	let isSuc = <%=isSuc%>
        </script>
        
        <table class="table">
          <thead class="table-success">
               <tr>
                 <th>사원번호</th>
                 <th>사원명</th>
                 <th>직책</th>
                 <th>권한</th>
                 <th>입사일</th>
                 <th>급여</th>
                 <th>보너스</th>
                 <th>부서번호</th>
               </tr>
          </thead>
          <tbody>
			<%
				for(Emp e : dao.empListAll()) {
			%>
               <tr>
                 <td><%= e.getEmpno() %></td>
                 <td><%= e.getEname() %></td>
                 <td><%= e.getJob() %></td>
                 <td><%= e.getMgr() %></td>
                 <td><%= e.getHiredate() %></td>
                 <td><%= e.getSal() %></td>
                 <td><%= e.getComm() %></td>
                 <td><%= e.getDeptno() %></td>
               </tr>
			<%}%>

          </tbody>
        </table> 
     </div>
</body>
</html>