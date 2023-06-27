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
	
    <div class="container mt-3">
    	<h2>물건 구매</h2>
       <form action="" method="post">
            <div class="mb-3 mt-3">
            <label for="pname">물건명 :</label>
            <input type="text" class="form-control" 
              id="pname" placeholder="물건명 입력" name="pname">
            </div>
            <div class="mb-3 mt-3">
            <label for="price">물건 가격 :</label>
            <input type="number" class="form-control" 
              id="price" placeholder="물건 가격 입력" name="price">
            </div>
            <div class="mb-3 mt-3">
            <label for="cnt">갯수 :</label>
            <input type="number" class="form-control" 
              id="cnt" placeholder="갯수 입력" name="cnt">
            </div>
            <button type="button" onclick="callAjax2()" class="btn btn-primary">등록</button>
        </form>
       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>물건명</th>
                 <th>물건가격</th>
                 <th>갯수</th>
                 <th>총계</th>
               </tr>
          </thead>
          <tbody class="prodTbody">
               <tr>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
               </tr>
          </tbody>
        </table>  
       <h2>사원정보 등록</h2>
       <form action="" method="post">
            <div class="mb-3 mt-3">
            <label for="empno">사원번호:</label>
            <input type="number" class="form-control" 
              id="empno" placeholder="사원번호 입력" name="empno">
            </div>
            <div class="mb-3 mt-3">
            <label for="ename">사원명 :</label>
            <input type="text" class="form-control" 
              id="ename" placeholder="사원명 입력" name="ename">
            </div>
            <button type="button" onclick="callAjax2()" class="btn btn-primary">등록</button>
        </form>
       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>사원번호</th>
                 <th>사원명</th>
                 <th>급여</th>
                 <th>부서번호</th>
               </tr>
          </thead>
          <tbody class="empBody">
               <tr>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
               </tr>
          </tbody>
        </table>         
     </div>
     <script>
     	function getSyn(page){
    		var xhr = new XMLHttpRequest();
    		xhr.open("get",page,false);
    		xhr.send()
    		return xhr.responseText;
    	}
    	function callAjx(){
    		var empnoVal = document.querySelector("#empno").value;
    		var enameVal = document.querySelector("#ename").value;
    		var page="z06_reqJson.jsp?empno="+empnoVal
    				+"&ename="+enameVal
    		var empObj = JSON.parse( getSyn(page) )
    		var tdArr = document.querySelectorAll(".empBody td")
    		tdArr[0].innerText = empObj.empno
    		tdArr[1].innerText = empObj.ename
    		tdArr[2].innerText = empObj.sal
    		tdArr[3].innerText = empObj.deptno
    		
    	}
	// ex) 물건명 가격 갯수 입력 후 클릭 시 z07_reqJson.jsp
	// 에 요청정보 넣고 총계 속성 "tot" : ${param.price * param.cnt}
	// 처리해서 td에 출력. 물건명 가격 갯수 총계
		function getSyn2(page) {
			let xhr = new XMLHttpRequest();
			xhr.open("get", page, false);
			xhr.send();
			return xhr.responseText;	
		}
		
		function callAjax2() {
			let pname = document.querySelector("#pname").value;
			let price = document.querySelector("#price").value;
			let pCnt = document.querySelector("#cnt").value;
			let page = "z07_reqJson.jsp?pname=" + pname
					+ "&price=" + price + "&cnt=" + pCnt;
			let pInfo = JSON.parse( getSyn2(page));
			let tds = document.querySelectorAll(".prodTbody td");
			tds[0].innerText = pInfo.pname;
			tds[1].innerText = pInfo.price;
			tds[2].innerText = pInfo.cnt;
			tds[3].innerText = pInfo.tot;
		}
		
	</script>
</body>
</html>