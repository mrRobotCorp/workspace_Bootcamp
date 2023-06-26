<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a01_basic</title>
</head>
<body>
	<script>
		function goAjax() {
			let xhr = new XMLHttpRequest();
			// alert(xhr);
			xhr.open("get", "z01_data.jsp", false); // 동기 방식
			xhr.send();
			document.querySelector("#show").innerText = xhr.responseText;
		}
		// ex) a02_callData.jsp z02_data.jsp 물건명 가격 갯수 선언
		//		클릭 시 테이블에 데이터 삽입
	</script>
    <div class="container mt-3">
       <h2 onclick="goAjax()">XMLHttpRequest 통신의 나라..? (클릭..)</h2>
       <h3 id="show"></h3>
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
                 <th>Firstname</th>
                 <th>Lastname</th>
                 <th>Email</th>
               </tr>
          </thead>
          <tbody>
               <tr>
                 <td>John</td>
                 <td>Doe</td>
                 <td>john@example.com</td>
               </tr>
          </tbody>
        </table>         
     </div>
</body>
</html>