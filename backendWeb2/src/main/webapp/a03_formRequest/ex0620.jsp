<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="backendWeb2.z01_vo.Salgrade"
    %>
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
[1단계:코드] 2. java로 임의의 구구단을 만들어 html의 form에 출력하고, [ @@] x [@@   ]  정답입력[  ][정답확인]
              정답입력이 맞을시, 정답 그렇지 않을시 오답이 처리되게 하세요. java+js 연동
[1단계:코드] 3. salgrade 테이블을 확인하여, 해당 항목에 맞는 속성으로 form 화면을 구성하고, 입력 후, 확인시, 요청값 처리후,
      Salgrade 객체에 등록이 되어 출력되게 처리하세요.
 --%>
 	<%
 	int num01 = (int)(Math.random() * 8 + 2);
 	int num02 = (int)(Math.random() * 8 + 2);
 	int result = num01 * num02;
 	%>
    <div class="container mt-3">
       <h2>사원정보 등록</h2>
       <form method="post">
            <div class="mb-3 mt-3">
            <input type="number" class="form-control" 
              id="num01" name="num01" value="<%= num01%>">
              <span> X </span>
              <input type="number" class="form-control" 
              id="num02" name="num02" value="<%= num02%>">
            </div>
            
            <div class="mb-3 mt-3">
            <input type="number" class="form-control" 
              id="input" name="input" placeholder="정답을 입력">
            </div>
            <button type="submit" class="btn btn-primary">정답확인</button>
        </form>
        
        <script>
        	let input= document.querySelector("#input");
        	let btn = document.querySelector("button");
        	
        	btn.onclick = function() {
	        	if(input.value == <%=result%>) {
	        		alert("정답입니다.")
	        	} else {
	        		alert("오답입니다.")
	        	}
        		
        	}
        </script>
        
        <%
        String gradeS = request.getParameter("grade");
        String losalS = request.getParameter("losal");
        String hisalS = request.getParameter("hisal");
        int grade = 0;
        int losal = 0;
        int hisal = 0;
        if(gradeS != null) grade = Integer.parseInt(gradeS);
        if(losalS != null) losal = Integer.parseInt(losalS);
        if(hisalS != null) hisal = Integer.parseInt(hisalS);
        // backendWeb2.z01_vo.Salgrade int grade, int losal, int hisal
        
        Salgrade s = new Salgrade(grade, losal, hisal);
        
        
        %>
        
        <form method="post">
            <div class="mb-3 mt-3">
	            <label for="grade">등급 : </label>
	            <input type="number" class="form-control" 
	              id="grade" placeholder="등급 입력" name="grade">
            </div>
            
            <div class="mb-3 mt-3">
	            <label for="grade">최저 : </label>
	            <input type="number" class="form-control" 
	              id="losal" placeholder="최저 입력" name="losal">
            </div>
            <div class="mb-3 mt-3">
	            <label for="grade">최고 : </label>
	            <input type="number" class="form-control" 
	              id="hisal" placeholder="최고 입력" name="hisal">
            </div>
            <button type="submit" class="btn btn-primary">등록</button>
        </form>
        
       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>등급</th>
                 <th>최저</th>
                 <th>최고</th>
               </tr>
          </thead>
          <tbody>
               <tr>
                 <td><%= grade %></td>
                 <td><%= losal %></td>
                 <td><%= hisal %></td>
               </tr>
          </tbody>
        </table>         
     </div>
</body>
</html>