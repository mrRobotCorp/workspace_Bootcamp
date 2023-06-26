<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a02</title>
</head>
<body>
	<script>
		function getProd() {
			let xhr = new XMLHttpRequest();
			xhr.open("get", "z02_data.jsp", false);
			xhr.send();
			
			let data = xhr.responseText;
			let arry = data.split(",");
			
			let tds = document.querySelectorAll(".tbody td");
			
			tds.forEach(function(e, i) {
				e.innerText = arry[i];
			});
		}
		
	</script>
    <div class="container mt-3">
       <h2 onclick="getProd()">물건 정보 불러오기</h2>
       <form action="/">
            <div class="mb-3 mt-3">
            <label for="empno">사원번호:</label>
            <input type="number" class="form-control" 
              id="empno" placeholder="사원명 입력" name="empno">
            </div>
            <button type="submit" class="btn btn-primary">등록</button>
        </form>
       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>물건명</th>
                 <th>가격</th>
                 <th>갯수</th>
               </tr>
          </thead>
          <tbody class="tbody">
          	<td></td>
          	<td></td>
          	<td></td>
          </tbody>
        </table>         
     </div>
</body>
</html>