<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a22</title>
</head>
<body>
	<%
	String pname = "jelly";
	int price = 10000;
	int cnt = 5;
	
	%>
	<script>
	// a22_conn_js.jsp 
	// java 구매 물건명, 가격, 갯수 설정 후
	// js에 해당 내용 할당 후 총계, 5만원 이상이면 고가/아니면 저가 alert
	
	let pname = "<%=pname%>";
	let price = <%=price%>;
	let cnt= <%=cnt%>;
	let tot = price * cnt;
	
	let txt = "";
	if(tot >= 500000) {
		txt = "고가이다";
	} else {
		txt = "저가이다";
	}
	
	
	</script>
    <div class="container mt-3">
       <h2 onclick="show()">물건 정보(클릭)</h2>
       <script>
       	function show() {
       		alert("총액은 : " + tot + ", " + txt);
       	}
       </script>
        
     </div>
</body>
</html>