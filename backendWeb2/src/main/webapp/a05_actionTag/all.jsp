<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<%--
	2. include로 all.jsp 하위에 top.jsp, main.jsp, bottom.jsp를 만들어서 포함 시켜 출력하되
	   request.getParameter(), request.setAttribute()데이터 설정으로 main.jsp에서 로그인 id pass를 만들어서
	   all.jsp를 호출하게 할때, himan//7777이면  top.jsp에서는 id를 보내어 @@ 로그인 중 그외는 login하세요 라고
	   표시되게 처리
	3. forward 액션을 이용하여, 로딩된 구구단의 임의의 문제가 맞으면 정답페이지로 이동 그렇지 않으면 다시 문제풀이 페이지로 처리되게 하세요.
	
 --%>
	<jsp:include page="main.jsp"></jsp:include>

	<div class="container mt-3">
		<h2>All</h2>
		<h5>아이디 : <%=request.getAttribute("id") %></h5>
		<h5>비밀번호 : <%=request.getAttribute("pw") %></h5>
		
		<%
			if(request.getAttribute("id").equals("himan") && request.getAttribute("pw").equals("7777")) {
		%>
			<jsp:include page="top.jsp"></jsp:include>
			
		<% } else { %>
			<jsp:include page="bottom.jsp"></jsp:include>

		<% } %>
	</div>
	<%
 	int num01 = (int)(Math.random() * 8 + 2);
 	int num02 = (int)(Math.random() * 8 + 2);
 	int result = num01 * num02;
 	
 	
 	%>
 	<script type="text/javascript">
		function ckVal(){
			return true;
		}
	</script>
	
    <div class="container mt-3">
       <h2>구구단</h2>
       <form action="" method="post" onSubmit="return ckVal()">
            <div class="mb-3 mt-3">
            	<input type="number" class="form-control" 
              id="num01" name="num01" value="<%= num01%>">
              <span class="input-group-text"> X </span>
              <input type="number" class="form-control" 
              id="num02" name="num02" value="<%= num02%>">
              <span class="input-group-text"> = </span>
            </div>
            
            <div class="mb-3 mt-3">
            <input type="number" class="form-control" 
              id="input" name="input" placeholder="정답을 입력" required>
            </div>
            <button type="submit" class="btn btn-primary">정답확인</button>
        </form>
        
        <%
        String inputS = request.getParameter("input");
        int input = 0;
        
        if(inputS != null) {
        	input = Integer.parseInt(inputS);
        	if(input == result) {
        	%>
        		<jsp:forward page="exO.jsp"/>
  		    <%} else { %>
        		<jsp:forward page="exX.jsp"/>
        	
        	<%	
        	}
        }
        %>
        
        <script>
        	alert("오답\n다시 풀어보세요");
        	document.querySelector('#num01').value = <%= %>
        </script>
        
       </div>
	
</body>
</html>