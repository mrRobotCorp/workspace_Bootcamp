<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a20</title>
</head>
<body>
<%--
	화면에 검색한 입력 값을 다시 다음 페이지에서 출력해야 함
	value = "<%=ename%>"을 처리해야 함
	
	ex) 구매물품
	물건명 []
	가격 []
	갯수 [] [구매]
	--> 총액까지 테이블 생성
	 --%>
	 <%
	 String pname = request.getParameter("pname");
	 if(pname == null) pname = "";
	 String cntS = request.getParameter("cnt");
	 String priceS = request.getParameter("price");
	 int cnt = 0;
	 int price = 0;
	 
	 if(cntS != null) cnt = Integer.parseInt(cntS);
	 if(priceS != null) price = Integer.parseInt(priceS);
	 
	 int tot = price * cnt;
	 %>
	 
    <div class="container mt-3">
       <h2>물건정보 등록</h2>
       <form method="post">
            <div class="mb-3 mt-3">
	            <label for="pname">물건명:</label>
	            <input type="text" class="form-control" 
	              value="<%=pname %>" placeholder="물건명 입력" name="pname">
            </div>
            <div class="mb-3 mt-3">
	            <label for="pname">가격:</label>
	            <input type="number" class="form-control" 
	              value="<%=price %>" placeholder="물건명 입력" name="price">
            </div>
            <div class="mb-3 mt-3">
	            <label for="pname">갯수:</label>
	            <input type="number" class="form-control" 
	              value="<%=cnt %>" placeholder="갯수 입력" name="cnt">
            </div>
            <button type="submit" class="btn btn-primary">구매</button>
        </form>
       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>물건명</th>
                 <th>가격</th>
                 <th>갯수</th>
                 <th>총액</th>
               </tr>
          </thead>
          <tbody>
               <tr>
                 <td><%=pname %></td>
                 <td><%=price %></td>
                 <td><%=cnt %></td>
                 <td><%=tot %></td>
               </tr>
          </tbody>
        </table>         
     </div>
</body>
</html>