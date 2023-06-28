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
<%--
[1단계:개념] 1. ajax처리시 서버단 처리와 프런트 처리의 내용을 순차별 기술하고, 핵심 코드를 정리하세요
	1. 파일
	    FE (a13_ComboAjax.jsp)
	    
	2. BE (z13_comboList.jsp)
	    요청값 : title
	    import 처리(dao, Gson, Code)
	    Gson으로 json 데이터 로딩
	    
	3. FE ( a13_ComboAjax.jsp)
	    1) 화면 구성
	    2) 이벤트 처리
	    3) 이벤트 핸들러 처리
	    - 검색 DOM
	    - ajax 처리
	    - 화면 리스트 처리
    
[1단계:코드] 2. 부서정보를 ajax로 (부서명,부서위치)키워드 검색하여 리스트 처리하세요.
 --%>
 	<script>
 	function schEmp13() {
		if(event.keyCode == 13) {
			schEmp();
		}
	}

	function schEmp() {
		let dnameOb = document.querySelector("#dname");
		let locOb = document.querySelector("#loc");
		dnameOb.value = dnameOb.value.toUpperCase();
		locOb.value = locOb.value.toUpperCase();
		
		let dname = document.querySelector("#dname").value;
		let loc = document.querySelector("#loc").value;
		let qurStr = "dname=" + ename + "&loc=" + job;
		let deptShow = document.querySelector(".deptShow");
		
		let xhr = new XMLHttpRequest();
		xhr.open("post", "ex0628_gson.jsp", true);
		xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		xhr.send(qurStr);
		xhr.onreadystatechange = function() {
			if(xhr.readyState == 4 && xhr.status == 200) {
				console.log(xhr.responseText);
				let deptList = JSON.parse(xhr.responseText);
				let show = "";
				deptList.forEach(function(d) {
					show += "<tr>";
					show += "<td>" + d.deptno + "</td>";
					show += "<td>" + d.dname+ "</td>";
					show += "<td>" + d.loc + "</td>";
					show += "</tr>";
				})
				deptShow.innerHTML = show;
				
			}
		}
	}
 	</script>
    <div class="container mt-3">
       <h2>부서정보 검색</h2>
       <form action="" method = "post">
            <div class="mb-3 mt-3">
            <label for="dname">부서명:</label>
            <input type="text" class="form-control" 
              id="dname" placeholder="부서명 입력" name="dname">
            </div>
            <div class="mb-3 mt-3">
            <label for="loc">부서위치:</label>
            <input type="text" class="form-control" 
              id="loc" placeholder="부서위치 입력" name="loc">
            </div>
            <button type="button" onclick="schDept()" class="btn btn-primary">등록</button>
        </form>
       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>부서번호</th>
                 <th>부서명</th>
                 <th>부서위치</th>
               </tr>
          </thead>
          <tbody class="deptShow">
          </tbody>
        </table>         
     </div>
</body>
</html>