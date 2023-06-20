<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "backendWeb2.z01_vo.Emp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a13</title>
</head>
<body>

    <%
	String eMem = request.getParameter("ename");
    if(eMem == null) eMem = "";
	String eno = request.getParameter("eno");
	int num01 = 0;
	String hired = request.getParameter("hired");
	String jobS = request.getParameter("job");
	String mgrS = request.getParameter("mgr");
	String salS = request.getParameter("sal");
	String commS = request.getParameter("comm");
	String deptnoS = request.getParameter("deptno");
	int mrgInt = 0;
	double salDou = 0;
	double commDou = 0;
	int deptInt = 0;
	
	if(eno != null ) num01 = Integer.parseInt(eno);
	if(mgrS != null ) mrgInt = Integer.parseInt(mgrS);
	if(salS != null ) salDou = Double.parseDouble(salS);
	if(commS != null ) commDou = Double.parseDouble(commS);
	if(deptnoS != null ) deptInt = Integer.parseInt(deptnoS);
	
	// VO객체에 만들어서 처리하면 이후에 DB연동이나 필요에 따라 효과적인 처리 가능
	// 1. 생성자에 type에 맞는 순서 확인
	Emp em = new Emp(num01, eMem, jobS, mrgInt, hired, salDou, commDou, deptInt);
	%>
	
	<%--
	int empno, String ename, String job, int mgr, String hiredateS, Double sal, Double comm, int deptno
	 
	ex) a14_formDept.jsp 
		부서번호, 부서명, 직책명
		a15_showDept.jsp
		요청값 -> 객체 -> getXX 로 출력 
	 --%>
	 
	 <div class="container mt-3">
	 
	 	<h3>사원 등록 내역</h3>
		 <table class="table">
	    <thead class="table-success">
	      <tr>
	        <th>사원번호</th>
	        <th>사원명</th>
	        <th>직책번호</th>
	        <th>관리자번호</th>
	        <th>입사일(문자열)</th>
	        <th>급여</th>
	        <th>보너스</th>
	        <th>부서번호</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td><%=em.getEmpno() %></td>
	        <td><%=em.getEname() %></td>
	        <td><%=em.getJob() %></td>
	        <td><%=em.getMgr() %></td>
	        <td><%=em.getHiredateS() %></td>
	        <td><%=em.getSal() %></td>
	        <td><%=em.getComm() %></td>
	        <td><%=em.getDeptno() %></td>
	      </tr>
	    </tbody>
	  </table>
	 </div>


</body>
</html>