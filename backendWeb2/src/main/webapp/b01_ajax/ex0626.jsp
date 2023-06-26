<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="backendWeb2.z01_vo.Person"
    %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title></title>
</head>
<body>
<%--
[1단계:개념확인] 1. 조별로 el 태를 활용한 session scope범위와 실제 코드에 대하여 알고 있는지 확인
            ajax를 처리하기 위해 필요한 기본 형식과 기본 데이터와 json데이터 가져오는 처리형식을 아는지 확인
[1단계:코드] 2. el 태그를 이용하여 4가지 session scope의 범위를 기본 변수로 설정하여 호출해보자.
[1단계:코드] 3. el을 이용하여 클래스 Person을 객체로 session scope로 설정하고 호출해 보자.
[1단계:코드] 4. el을 이용하여 form으로 물품명과 가격과 갯수을 입력해서 해당 내용을 출력처리하자.
[1단계:코드] 5. ajax처리 순서를 기술하고, 서버에 선언된 데이터(하나데이터,배열데이터, json 데이터)를 동기적으로 가져오는 처리를 하여 화면에 할당하세요.
 --%>
 <%
 	pageContext.setAttribute("m01", "link up");
 	request.setAttribute("m02", "invincible");
 	session.setAttribute("m03", "sunflower");
 	application.setAttribute("m04", "start a riot");

	request.setAttribute("p01", new Person( "Amy", 33, "seoul"));
 %>
    <div class="container mt-3">
       <h3 onclick="location.href='ex0626_move.jsp'">ex02 session scope 범위 확인(click)</h3>
       <h5>변수 1 : ${m01 }</h5>
       <h5>변수 2 : ${m02 }</h5>
       <h5>변수 3 : ${m03 }</h5>
       <h5>변수 4 : ${m04 }</h5>
       
       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>이름</th>
                 <th>나이</th>
                 <th>사는 곳</th>
               </tr>
          </thead>
          <tbody>
               <tr>
                 <td>${p01.name }</td>
                 <td>${p01.age }</td>
                 <td>${p01.loc }</td>
               </tr>
          </tbody>
        </table>  
        
        <form action="" method="post">
       <div class="mb-3 mt-3">
            <label for="pname">물건명:</label>
            <input type="text" class="form-control" 
              id="pname" placeholder="물건명 입력" name="pname">
            </div>
            <div class="mb-3 mt-3">
            <label for="price">가격 :</label>
            <input type="number" class="form-control" 
              id="price" placeholder="가격 입력" name="price">
            </div>
            <div class="mb-3 mt-3">
            <label for="cnt">갯수 :</label>
            <input type="number" class="form-control" 
              id="cnt" placeholder="갯수 입력" name="cnt">
            </div>
            <button onclick="getProd()" type="submit" class="btn btn-primary">등록</button>
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
                 <td>${param.pname }</td>
                 <td>${param.price }</td>
                 <td>${param.cnt }</td>
               </tr>
          </tbody>
        </table> 
        
        
        <h3 onclick = "get00()">click</h3>
        <h3 onclick = "get01()">click</h3>
        <h3 onclick = "get02()">click</h3>
        <h5 class="text"></h5>
        <table class="table">
          <thead class="table-success">
               <tr>
                 <th>물건명</th>
                 <th>가격</th>
                 <th>갯수</th>
               </tr>
          </thead>
          <tbody>
               <tr class="tr1">
                 <td></td>
                 <td></td>
                 <td></td>
               </tr>
               <tr class="tr2">
                 <td></td>
                 <td></td>
                 <td></td>
               </tr>
               <tr class="tr3">
                 <td></td>
                 <td></td>
                 <td></td>
               </tr>
          </tbody>
        </table>   
        <script>
        	function get00() {
	       		let xhr = new XMLHttpRequest();
	        	xhr.open("get", "ex0626_data1.jsp", false);
	        	xhr.send();
	        	let txt = xhr.responseText;
        		let out = document.querySelector(".text");
        		out.innerText = txt;
        	}
        	
        	
        	
        	function get01() {
	        	let xhr2 = new XMLHttpRequest();
	        	xhr2.open("get", "ex0626_data2.jsp", false);
	        	xhr2.send();
	        	let data = xhr2.responseText; 
	        	let arr = data.split(",");
	        	let tds2 = document.querySelectorAll(".tr2 td");
	        	tds2.forEach( (e, i) => {
	        		e.innerText = arr[i];
	        	}); 
        		
        	}
        	
        	function get02() {
	        	let xhr3 = new XMLHttpRequest();
	        	xhr3.open("get", "ex0626_data3.jsp", false);
	        	xhr3.send();
	        	let ob = JSON.parse(xhr3.responseText);
	        	let tds3 = document.querySelectorAll(".tr3 td");
	        	tds3[0].innerText = ob.pname;
	        	tds3[1].innerText = ob.price;
	        	tds3[2].innerText = ob.cnt;
        		
        	}
        	
        	
        </script>    
     </div>
</body>
</html>