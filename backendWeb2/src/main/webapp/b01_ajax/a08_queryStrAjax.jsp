<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>a08</title>
    <script>
	    function getSyn(page){
			var xhr = new XMLHttpRequest();
			xhr.open("get",page,false);
			xhr.send()
			return xhr.responseText;
		}
	    function getPInfo() {
	    	let player  = document.querySelector("#player").value;
			let seat = document.querySelector("#seat").value;
			let hit = document.querySelector("#hit").value;
			let page = "z08_reqJson.jsp?player=" + player
					+ "&seat=" + seat + "&hit=" + hit;
			let pInfo = JSON.parse( getSyn(page));
			let tds = document.querySelectorAll("tbody td");
			tds[0].innerText = pInfo.player;
			tds[1].innerText = pInfo.seat;
			tds[2].innerText = pInfo.hit;
			tds[3].innerText = pInfo.percent;
	    }
	    // ex) 선수명 : [  ] 타석 : [  ] 안타 : [  ] 타율확인버튼
	    // z10_reqJson.jsp {"player" : "@@@", "seat" : @@@, "hit" : @@@}
	    // 테이블로 선수명, 타석, 안타, 타율 출력
    </script>
</head>
<body>
    <div class="container mt-3">
       <h2>선수정보 등록</h2>
       <form action="" method="post">
            <div class="mb-3 mt-3">
            <label for="player">선수명:</label>
            <input type="text" class="form-control" 
              id="player" placeholder="선수명 입력" name="player">
            </div>
            <div class="mb-3 mt-3">
            <label for="seat">타석:</label>
            <input type="number" class="form-control" 
              id="seat" placeholder="타석 입력" name="seat">
            </div>
            <div class="mb-3 mt-3">
            <label for="hit">안타:</label>
            <input type="number" class="form-control" 
              id="hit" placeholder="안타 입력" name="hit">
            </div>
            <%-- type="submit"은 동시방식으로의 전송 --%>
            <button type="button" onclick="getPInfo()" class="btn btn-primary">확인</button>
        </form>
       <table class="table">
          <thead class="table-success">
               <tr>
                 <th>선수명</th>
                 <th>타석</th>
                 <th>안타</th>
                 <th>타율</th>
               </tr>
          </thead>
          <tbody>
               <tr>
                 <td></td>
                 <td></td>
                 <td></td>
                 <td></td>
               </tr>
          </tbody>
        </table>         
     </div>
</body>
</html>