<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
</head>
<body>
<script>
	function call() {
		let xhr = new XMLHttpRequest();
		xhr.open("get", "z04_jsonData.jsp", false);
		xhr.send();
		let data = xhr.responseText;
		console.log(typeof(data));
		let ob = JSON.parse(data); // 문자열을 json 객체로 변환
		console.log(typeof(ob));
		let tds = document.querySelectorAll("tbody td");
		tds[0].innerText = ob.name;
		tds[1].innerText = ob.price;
		tds[2].innerText = ob.cnt;
		
	}
	
</script>
    <div class="container mt-3">
       <h2>json 데이터 호출 등록</h2>
       <form action="/">
            <button onclick="call()" type="button" class="btn btn-primary">json 데이터 호출</button>
        </form>
       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>물건명</th>
                 <th>가격</th>
                 <th>갯수</th>
               </tr>
          </thead>
          <tbody>
               <tr>
                 <td></td>
                 <td></td>
                 <td></td>
               </tr>
          </tbody>
        </table>         
     </div>
</body>
</html>