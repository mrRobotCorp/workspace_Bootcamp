<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<c:set var="path" value="$${pageContext.request.contextPath}"/>
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
    <script src = "https://code.jquery.com/jquery-3.7.0.js" type="text/javascript"></script>

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
					show+="<tr ondblclick='detail("+code.no+")' class='text-center "+(code.refno==0?'table-info':'')+"'>"
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
	function detail(no){
		document.querySelector("#detailModal").click()
		document.querySelector(".modal-title").innerText
			="코드상세[코드번호:"+no+"]"
		
		$("#regBtn").hide()
		$("#uptBtn").show()
		$("#delBtn").show()
		// ajax로 상세 데이터를 가져와서 화면에 데이터 넣기
		// /backendWeb/codeDetail.do?no=1005
		// path : 상단에 선언된 project명을 통한 경로 지정.
		
		// ex)
    	// /backendWeb/empList.do?div=y
    	// jquery로 사원정보를 리스트 출력하세요.	
		$.ajax({
			url:"${path}/codeDetail.do",
			type:"post",
			data:"no="+no,
			dataType:"json",
			success:function(data){
				console.log(data)
				//alert(data);
				// title val refno ordno
				$("#regFrm #title").val(data.title)
				$("#regFrm #val").val(data.val)
				$("#regFrm #refno").val(data.refno)
				$("#regFrm #ordno").val(data.ordno)
				
				
			},
			error:function(err){
				console.log(err)
			}
			
		})
		
		
	}
	function insModal(){
		document.querySelector(".modal-title").innerText
		="코드등록"
		$("#regBtn").show()
		$("#uptBtn").hide()
		$("#delBtn").hide()
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
		<div  id="detailModal" data-bs-toggle="modal"
			data-bs-target="#myModal"></div>		
		<button type="button" onclick="insModal()" 
			 class="btn btn-success" data-bs-toggle="modal"
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
				
				-- 제목, 값, 상위번호, 정렬 
-- title, val, refno, ordno 
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
					<button id="regBtn" type="button" class="btn btn-success"
						onclick="ajaxSave()">등록</button>
					<button id="uptBtn"  type="button" class="btn btn-primary"
						onclick="ajaxUpdate()">수정</button>
					<button id="delBtn"  type="button" class="btn btn-warning"
						onclick="ajaxDelete()">삭제</button>
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
		/*
		1. 등록완료
			- 등록 성공
			- 화면에 있는 데이터를 재조회 처리
			- 입력데이터 초기화 
			- 계속 여부 확인
				- 계속시 등록 처리할 수 있게 하고
				- 취소시 창이 닫게 처리.
		2. 리스트데이터
			화면구현
				- 제목:[   ]
			    - 상위코드:[  ]
			js로 요청값 처리	
			계층형 sql로 계층별로 리스트되게 처리.
			sql 처리
			dao 변경
			요청값 상위코드 전달.(Servlet에서)
			
		
		*/
		
	</script>

</body>
</html>