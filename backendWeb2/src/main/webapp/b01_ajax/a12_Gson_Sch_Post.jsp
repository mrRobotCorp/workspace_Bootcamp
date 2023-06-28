<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a12</title>
    <style>
    	table { text-align : center;}
    </style>
</head>

<script>
	function schEmp13() {
		if(event.keyCode == 13) {
			schEmp();
		}
	}

	function schEmp() {
		let enameOb = document.querySelector("#ename");
		let jobOb = document.querySelector("#job");
		enameOb.value = enameOb.value.toUpperCase();
		jobOb.value = jobOb.value.toUpperCase();
		
		let ename = document.querySelector("#ename").value;
		let job = document.querySelector("#job").value;
		let qurStr = "ename=" + ename + "&job=" + job;
		let empShow = document.querySelector(".empShow");
		
		let xhr = new XMLHttpRequest();
		xhr.open("post", "z12_empList.jsp", true);
		xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		xhr.send(qurStr);
		xhr.onreadystatechange = function() {
			if(xhr.readyState == 4 && xhr.status == 200) {
				console.log(xhr.responseText);
				let empList = JSON.parse(xhr.responseText);
				let show = "";
				empList.forEach(function(emp) {
					show += "<tr>";
					show += "<td>" + emp.empno + "</td>";
					show += "<td>" + emp.ename+ "</td>";
					show += "<td>" + emp.job + "</td>";
					show += "<td>" + emp.mgr + "</td>";
					show += "<td>" + emp.sal + "</td>";
					show += "<td>" + emp.comm + "</td>";
					show += "<td>" + emp.deptno + "</td>";
					show += "</tr>";
				})
				empShow.innerHTML = show;
				
			}
		}
	}
</script>
<body>
    <div class="container mt-3">
       <h2>사원정보 등록</h2>
            <div class="mb-3 mt-3">
            <label for="ename">사원명:</label>
            <input onkeyup="schEmp13()" type="text" class="form-control" 
              id="ename" placeholder="사원명 입력" name="ename">
            </div>
            <div class="mb-3 mt-3">
            <label for="job">직책명:</label>
            <input onkeyup="schEmp13()" type="text" class="form-control" 
              id="job" placeholder="직책명 입력" name="job">
            </div>
            <button type="button" onclick="schEmp()" class="btn btn-primary">등록</button>
       
       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>사원번호</th>
                 <th>사원명</th>
                 <th>직책명</th>
                 <th>관리자번호</th>
                 <th>급여</th>
                 <th>보너스</th>
                 <th>부서명</th>
               </tr>
          </thead>
          <tbody class="empShow">
          </tbody>
        </table>         
     </div>
</body>
</html>