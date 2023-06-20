<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a17</title>
</head>
<body>
    <div class="container mt-3">
       <h2>사원정보 등록</h2>
       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>사원번호</th>
                 <th>사원명</th>
               </tr>
          </thead>
          <tbody>
               <tr>
                 <td><%= request.getParameter("empno") %></td>
                 <td><%= request.getParameter("ename") %></td>
               </tr>
          </tbody>
        </table>         
     </div>
     
     <div class="container mt-3">
    <h2>학생 성적 등록</h2>
    <form action="a18_rev.jsp" method="post">
         <div class="mb-3 mt-3">
            <label for="empno">이름:</label>
            <input type="text" class="form-control" 
              placeholder="학생명 입력" name="stuname">
         </div>
         <div class="mb-3 mt-3">
            <label for="empno">국어:</label>
            <input type="number" class="form-control" 
            placeholder="국어 점수 입력" name="kor">
         </div>
         <div class="mb-3 mt-3">
            <label for="empno">영어:</label>
            <input type="number" class="form-control" 
            placeholder="영어 점수 입력" name="eng">
         </div>
         <div class="mb-3 mt-3">
            <label for="empno">수학:</label>
            <input type="number" class="form-control" 
            placeholder="수학 점수 입력" name="math">
         </div>
         
         <button type="submit" class="btn btn-primary">성적 등록</button>
     </form>
  </div>
     
     
     <%--
     a17-> a18_rev.jsp -> 테이블로 각 항목 + 총계 , 평균까지
     이름 []
     국어 []
     영어 []
     수학 []
     성적등록
      --%>
     
     
</body>
</html>