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
		function getSyn(page){
			var xhr = new XMLHttpRequest();
			xhr.open("get",page,false);
			xhr.send()
			return xhr.responseText;
		}
		function getJob() {
			let title = document.querySelector("#jTitle").value;
			let sal1 = document.querySelector("#sal1").value;
			let sal2 = document.querySelector("#sal2").value;
			let jobBd = document.querySelector(".jobBd");
			jobBd.innerHTML = getSyn("z10_jobDBAll.jsp?jTitle="
					+ title + "&sal1=" + sal1 + "&sal2=" + sal2);
		}
		
	</script>
    <div class="container mt-3">
       <h2>직책 급여 정보</h2>
       <form action="" method="post">
            <div class="mb-3 mt-3">
            <label for="jTitle">직책명:</label>
            <input type="text" class="form-control" 
              id="jTitle" placeholder="직책명 입력" name="jTitle">
            </div>
            <div class="mb-3 mt-3">
            <label for="sal1">급여 범위1:</label>
            <input type="number" class="form-control" 
              id="sal1" placeholder="범위 입력" name="sal1">
            </div>
            <div class="mb-3 mt-3">
            <label for="sal2">급여 범위2:</label>
            <input type="number" class="form-control" 
              id="sal2" placeholder="범위 입력" name="sal2">
            </div>
            <button type="button" onclick="getJob()" class="btn btn-primary">등록</button>
        </form>
       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>직책 아이디</th>
                 <th>직책명</th>
                 <th>최소급여</th>
                 <th>최대급여</th>
               </tr>
          </thead>
          <tbody class="jobBd">
          </tbody>
        </table>         
     </div>
</body>
</html>