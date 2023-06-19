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
	
	[1단계:코드] 2. form형식으로 다중 처리하는 예제를 아래 3가지 형식으로 선언하고 다음 페이지에 출력하세요
	1. 구매할 물건명 입력(type=text)
	2. 결재할 물건의 가격(type=checkbox) : 선택된 것만
	3. select로 구매할 물건의 가격 : ctrl로 선택된 것만
	[1단계:코드] 3. bootstrap형식으로 회원등록 화면 form 만들고, 등록시, 요청값 받아 VO객체로 생성 및 출력한 내용을 처리하세요.
 --%>
 	<%
 	int price[] = {1500, 2000, 3000, 4500};
 	int cnt[] = {5, 10, 15, 20 };
 	%>
    <div class="container mt-3">
    <h2>사원정보 등록</h2>
    <form action="ex0619Show.jsp">
         <div class="mb-3 mt-3">
            <label for="pname">물건명:</label>
            <input type="text" class="form-control" 
              placeholder="물건명 입력" name="pname">
         </div>
         <div class="mb-3 mt-3">
            <label for="price1">물건의 가격1:</label>
            <%for(int p:price) {
            	%>
            <%=p %>
            <input type="checkbox"  
              placeholder="물건의 가격 입력" name="price" value=<%=p %>>
             <%}%>
         </div>
         <div class="mb-3 mt-3">
            <label for="pname">물건의 가격2:</label>
            <select name = "cnt" multiple>
            <%for(int c:cnt) {
            	%>
            	<option value="<%=c%>"><%=c%></option>
            <%}%>
            </select>
         <button type="submit" class="btn btn-primary">등록</button>
     </form>
  </div>


</body>
</html>