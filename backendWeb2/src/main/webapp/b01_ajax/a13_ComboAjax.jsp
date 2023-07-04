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
<script src = "https://code.jquery.com/jquery-3.7.0.js" type="text/javascript"></script>
    
    <script type="text/javascript">
    	// window.onload와 동일한 메서드
    	$(document).ready( function(){
    		
    		
    	});
    </script>    
</head>

<script type="text/javascript">
	function schCode13(){
		if(event.keyCode==13){
			schCode();
		}
	}
	function schCode(){
		var titleOb = document.querySelector("#title")
		var refnoOb = document.querySelector("#refno")
		var xhr = new XMLHttpRequest()
		xhr.open("post","z13_comboList.jsp",true)
		xhr.setRequestHeader("Content-Type",
				"application/x-www-form-urlencoded")
		xhr.send("title="+titleOb.value+"&refno="+refnoOb.value)
		xhr.onreadystatechange=function(){
			if(xhr.readyState==4&&xhr.status==200){
				var codeList = JSON.parse(xhr.responseText)
				var show=""
				codeList.forEach(function(code){
					show+="<tr ondblclick='detail()' class='text-center "+(code.refno==0?'table-info':'')+"'>"
					show+="<td>"+code.no+"</td>"
					show+="<td>"+code.title+"</td>"
					show+="<td>"+(code.val==undefined?'':code.val)+"</td>"
					show+="<td>"+code.refno+"</td>"
					show+="<td>"+code.ordno+"</td>"
					show+="</tr>"
				})
				var tBody = document.querySelector("tbody")
				tBody.innerHTML = show;
			}
		}		
	}
	
	function detail(no) {
		document.querySelector("#insertModal").click();
		// ajax로 상세 데이터 가져와서 화면에 데이터 넣기
		document.querySelector(".modal-title").innerText 
			= "코드 상세 화면 [코드번호:" + no + "]";
		$("#regBtn").hide();
		$("#uptBtn").show();
		$("#delBtn").show();
	}
	
	function insModal() {
		document.querySelector(".modal-title").innerText = "코드등록";
		$("#regBtn").show();
		$("#uptBtn").hide();
		$("#delBtn").hide();
	}
</script>
<body>
	<div class="container mt-3">
		<h2>Combox list</h2>
		<div class="mb-3 mt-3">
			<label for="title">제목:</label> <input type="text"
				class="form-control" id="title" onkeyup="schCode13()"
				placeholder="타이틀 입력" name="title">
			<label for="">상위코드:</label> 
				<input type="text" value="0"
				class="form-control" id="refno" onkeyup="schCode13()"
				placeholder="상위코드 입력" name="refno">
		</div>
		
		<div id="detailModal" data-bs-toggle="modal"
			data-bs-target="#myModal"></div>
		<button type="button" onclick="insModal()" id="insertModal" class="btn btn-success" data-bs-toggle="modal"
			data-bs-target="#myModal">코드등록</button>

		<button onclick="schCode()" type="button" class="btn btn-primary">조회</button>
		<table class="table table-striped table-hover">
			<thead class="table-success">
				<tr class="text-center">
					<th>번호</th>
					<th>제목</th>
					<th>값</th>
					<th>상위번호</th>
					<th>정렬</th>
				</tr>
			</thead>
			<tbody>
				<tr class="text-center">
					<td>John</td>
					<td>Doe</td>
					<td>john@example.com</td>
					<td>john@example.com</td>
				</tr>
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
					<button type="button" id="modalClsBtn" class="btn-close" data-bs-dismiss="modal"></button>
					
				</div>

				<!-- Modal body 
				
				/*
SELECT * FROM CODE c 
WHERE NO=?

UPDATE CODE 
SET TITLE = ?,
	REFNO = ?,
	ORDNO = ?,
	val = ?
WHERE no = ?;

DELETE 
FROM code
WHERE NO = ?;
*/
				-->
				<form id="regFrm">
				<div class="modal-body">
					<div class="mb-3 mt-3">
						<label for="title">제목:</label> 
						<input type="text"
							class="form-control" id="title"
						placeholder="타이틀 입력" name="title">
					</div>
					<div class="mb-3 mt-3">
						<label for="val">값:</label> 
						<input type="text"
							class="form-control" id="val"
						placeholder="값 입력" name="val">
					</div>
					<div class="mb-3 mt-3">
						<label for="number">상위번호:</label> 
						<input type="text"
							class="form-control" id="refno"
						placeholder="상위번호 입력" name="refno">
					</div>
					<div class="mb-3 mt-3">
						<label for="ordno">정렬순서:</label> 
						<input type="number"
							class="form-control" id="ordno"
						placeholder="정렬순서 입력" name="ordno">
					</div>										
				</div>
				</form>
				
				<div class="modal-footer">
					<button type="button" class="btn btn-success"
						id="regBtn" onclick="ajaxSave()">등록</button>
					<button type="button" class="btn btn-primary"
						id="uptBtn" onclick="ajaxUpdate()">수정</button>
					<button type="button" class="btn btn-warning"
						id="delBtn" onclick="ajaxDelete()">삭제</button>
					<button type="button" class="btn btn-danger"
						data-bs-dismiss="modal">Close</button>
						
				</div>

			</div>
		</div>
	</div>
	<script type="text/javascript">
		function ajaxSave(){
			// 입력 val
			var title=document.querySelector(".modal-body #title").value
			var val=document.querySelector(".modal-body #val").value
			var refno=document.querySelector(".modal-body #refno").value
			var ordno=document.querySelector(".modal-body #ordno").value
			var qStr = "title="+title+"&refno="+refno
					+"&ordno="+ordno+"&val="+val
			//alert(qStr)		
			// ajax 처리..
			var xhr = new XMLHttpRequest()
			xhr.open("post","/backendWeb/codeIns.do",true)
			xhr.setRequestHeader("Content-Type",
					"application/x-www-form-urlencoded")
			xhr.send(qStr)
			xhr.onreadystatechange=function(){
				if(xhr.readyState==4&&xhr.status==200){
					var result = xhr.responseText
					if(result=="Y"){
						alert("등록성공")
						schCode()
						document.querySelector("#regFrm").reset()
						if(!confirm("계속등록하시겠습니까?")){
							// 창닫기 처리
							document.querySelector("#modalClsBtn").click()
						}
					}else{
						alert("등록실패")
					}
				}
			}
			
			
		}
		// 초기에 수행 처리..(화면에 검색된 상태에서 처리)
		schCode();
		document.querySelector("#")
		
	</script>

</body>
</html>