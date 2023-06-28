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

<script>
	function getList13() {
		if (event.keyCode == 13) {
			getList();
		}
	}

	function getList() {
		let xhr = new XMLHttpRequest();
		let title = document.querySelector("#title").value;
		let tbody = document.querySelector(".tbody");
		let qurStr = "title=" + title;
		xhr.open("post", "z13_comboList.jsp", true);
		xhr.setRequestHeader("Content-Type",
				"application/x-www-form-urlencoded");
		xhr.send(qurStr);

		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				let clist = JSON.parse(xhr.responseText);
				let show = "";
				clist.forEach(function(code) {
					show += "<tr>";
					show += "<td>" + code.no + "</td>";
					show += "<td>" + code.title + "</td>";
					show += "<td>" + code.refno + "</td>";
					show += "<td>" + code.ordno + "</td>";
					show += "</tr>";
				})

				tbody.innerHTML = show;
			}
		}
	}
</script>
<body>
	<div class="container mt-3">
		<h2>Combo List</h2>
		<form action="" method="post">
			<div class="mb-3 mt-3">
				<label for="title">타이틀:</label> <input onkeyup="getList13()"
					type="text" class="form-control" id="title" placeholder="타이틀 입력"
					name="title">
			</div>
			<button type="button" class="btn btn-success" data-bs-toggle="modal"
			data-bs-target="#myModal">코드 등록</button>
			<button type="button" onclick="getList()" class="btn btn-primary">등록</button>
		</form>
		<table class="table">
			<thead class="table-success">
				<tr>
					<th>no</th>
					<th>title</th>
					<th>refno</th>
					<th>ordno</th>
				</tr>
			</thead>
			<tbody class="tbody">
			</tbody>
		</table>
	</div>


	<!-- The Modal -->
	<div class="modal" id="myModal">
		<div class="modal-dialog">
			<div class="modal-content">

				<!-- Modal Header -->
				<div class="modal-header">
					<h4 class="modal-title">코드 등록</h4>
					<button type="button" class="btn-close" data-bs-dismiss="modal"></button>
				</div>

				<!-- Modal body -->
				<div class="modal-body">
					<div class="mb-3 mt-3">
						<label for="title">제목:</label> 
						<input type="text" class="form-control" 
						id="title" placeholder="타이틀 입력"
						name="title">
					</div>
					<div class="mb-3 mt-3">
						<label for="val">값:</label> 
						<input type="text" class="form-control" 
						id="val" placeholder="값 입력"
						name="val">
					</div>
					<div class="mb-3 mt-3">
						<label for="refno">상위번호:</label> 
						<input type="number" class="form-control"
						 id="refno" placeholder="상위번호 입력"
						name="refno">
					</div>
					<div class="mb-3 mt-3">
						<label for="ordno">정렬순서:</label> 
						<input type="number" class="form-control" 
						id="ordno" placeholder="정렬순서 입력"
						name="ordno">
					</div>
				</div>

				<!-- Modal footer -->
				<div class="modal-footer">
					<button type="button" class="btn btn-success"
						onclick="ajaxSave()">Save</button>
					<button type="button" class="btn btn-danger"
						data-bs-dismiss="modal">Close</button>
				</div>

			</div>
		</div>
	</div>
	<script>
		function ajaxSave() {
			// 입력 val
			let title = document.querySelector("#title").value;
			let val = document.querySelector("#val").value;
			let refno = document.querySelector("#refno").value;
			let ordno = document.querySelector("#ordno").value;
			let qStr = "title=" + title + "&refno=" + refno
					+ "&ordno=" + ordno + "&val=" + val;
			// ajax 처리
			let xhr = new XMLHttpRequest();
			xhr.open("post", "/backendWeb2/codeIns.do", true);
			xhr.setRequestHeader("Content-Type",
					"application/x-www-form-urlencoded");
			xhr.send(qStr);
			xhr.onreadystatechange = function() {
				if(xhr.readyState == 4 && xhr.status == 200) {
					let result = xhr.responseText;
					if(result == "Y") {
						alert("등록 성공");
					} else {
						alert("등록 실패");
					}
				}
			}
		}
	</script>


</body>
</html>