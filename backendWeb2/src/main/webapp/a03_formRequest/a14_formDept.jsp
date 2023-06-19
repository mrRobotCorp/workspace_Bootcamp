<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a14</title>
</head>
<body>
	<%--
	int empno, String ename, String job, int mgr, String hiredateS, Double sal, Double comm, int deptno
	 
	ex) a14_formDept.jsp 
		부서번호, 부서명, 직책명
		a15_showDept.jsp
		요청값 -> 객체 -> getXX 로 출력 
	 --%>
    <div class="container mt-3">
    <h2>부서 정보 등록</h2>
    <form action="a15_showDept.jsp">
         <div class="mb-3 mt-3">
            <label for="deptno">부서 번호 : </label>
            <input type="number" class="form-control" 
              placeholder="부서 번호 입력" name="deptno">
         </div>
         <div class="mb-3 mt-3">
            <label for=""dname"">부서명 : </label>
            <input type="text" class="form-control" 
              placeholder="부서명 입력" name="dname">
         </div>
         <div class="mb-3 mt-3">
            <label for="loc">부서 loc : </label>
            <input type="number" class="form-control" 
              placeholder="부서 번호 입력" name="loc">
         </div>
         <button type="submit" class="btn btn-primary">등록</button>
     </form>
  </div>


</body>
</html>