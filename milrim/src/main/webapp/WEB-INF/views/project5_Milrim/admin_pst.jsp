<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>   
<fmt:requestEncoding value="utf-8"/>
<c:set var="path" value="${pageContext.request.contextPath}"/> 
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta property="og:title" content="project5 Milrim">
    <meta property="og:url" content="https://mrrobotcorp.github.io/project5_Milrim/">
    <meta property="og:image" content="https://mrrobotcorp.github.io/project5_Milrim//source/thumbnail.png">
    <meta property="og:description" content="4조 프로젝트 사이트 - Milrim">
    <meta name="twitter:card" content="summary">
    <meta name="twitter:title" content="project5 Milrim">
    <meta name="twitter:url" content="https://mrrobotcorp.github.io/project5_Milrim/">
    <meta name="twitter:image" content="https://mrrobotcorp.github.io/project5_Milrim//source/thumbnail.png">
    <meta name="twitter:description" content="4조 프로젝트 사이트 - Milrim">
    <meta name="description" content="4조 프로젝트 사이트 - Milrim">
    <meta name='keywords' content='project, milrim, toy project, community, ott service'>

    <link rel="icon" href="./source/favicon-32x32.png" sizes="32x32">
    <link rel="apple-touch-icon" href="./source/apple-icon-180x180.png" sizes="180x180">
    <title>Milrim | 밀림</title>
	<script src="https://cdn.jsdelivr.net/npm/vue@2.6.14/dist/vue.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/list.js/2.3.1/list.min.js"></script>
    <link href="./css/header.css" rel="stylesheet">
    <link href="./css/admin.css" rel="stylesheet">

</head>

<body>
    <header>
        <nav>
            <ul class="gnb">
                <li>
                    <a href="#"><img class="headLogo" src="./source/logo_noBg_b.png"></a>
                </li>
            </ul>
            <div class="mypageAll">
                <div class="myProfile">
                    <img class="profImg" src="./source/none.png">
                    <span>유저 이름</span>
                </div>
                <div class="adminAll">
                    <img class="profImg" src="./source/apple-icon-180x180.png">
                    <span>밀림 관리자</span>
                </div>
                <ul class="mpList">
                    <li>
                        <img class="profImg" src="./source/none.png">
                        <span>유저 이름</span>
                    </li>
                    <li>
                        <a href="#">프로필 관리</a>
                    </li>
                    <li>
                        <a href="#">보관함</a>
                    </li>
                    <li>
                        <a href="#">설정</a>
                    </li>
                    <li>
                        <a href="#">로그아웃</a>
                    </li>
                </ul>
            </div>
        </nav>
    </header>
    <div class="sidebar">
        <ul class="nav">
            <li><a href="${path}/admin_mem.do"><img src="./source/memIco.png"> 회원 조회</a></li>
            <li><a href="${path}/admin_vid.do"><img src="./source/vidIco.png"> 영상 조회</a></li>
            <li><a href="${path}/admin_pst.do"><img src="./source/pstIco.png"> 게시물 조회</a></li>
        </ul>
    </div>

    <section class="pstSection" id="posts">
        <form method="post" class="memSchBox schBox search">
            <button type="button"></button>
            <input name="adm_pstSch" placeholder="게시글 제목을 검색" value="" id="schPost">
        </form>

        <form method="post" class="listBox" id="test-list">
            <span>
                <input type="checkbox" name="pstOne" id="allCh">
                <label for="allCh">전체 선택</label>
            </span>
            <!-- 
                <button type="button" class="uptBtn">수정</button>
            -->
            <button type="button" class="delBtn">삭제</button>

            <ul class="listHead pst">
                <li>글 제목</li>
                <li>작성일</li>
                <li>회원 ID</li>
            </ul>

            <ul class="listAll list" v-for="post in jsonPost" :key="post.postid">
                <li>
                    <ul class="listRow">
                        <span class="pstCheck">
                            <input type="checkbox" name="pstOne" id="pst0" value="pst0">
                            <label for="pst0"></label>
                        </span>
                        <div class="pstInfo">
                            <li class="pstTitle">{{post.title}}</li>
                            <li class="pstDate">{{post.fbdate}}</li>
                            <li class="pstMem">{{post.id}}</li>
                        </div>
                    </ul>
                </li>

            </ul>
            <ul class="pagination"></ul>
        </form>

        <!-- -------- 모달창 ------------ -->
        <!--

            <div id="modal1" class="modal">
                <div class="modalCon">
                    <button type="button" class="modal-close"></button>
    
                    <h4>게시물 정보 수정</h4>
                    <form method="post" class="uptFrm">
                        <div class="uptRow">
                            <span class="uptSub">글 제목</span>
                            <input type="text" name="uptTitle" placeholder="게시글의 제목 입력">
                        </div>
                        <div class="uptRow">
                            <span class="uptSub">작성일</span>
                            <input type="text" name="uptDate" placeholder="작성일 입력">
                        </div>
                        <div class="uptRow">
                            <span class="uptSub">회원 ID</span>
                            <input type="text" name="uptMem" placeholder="회원의 ID 입력">
                        </div>
                    </form>
                </div>
                <button type="button" class="modalUpt">수정</button>
            </div>
        -->
    </section>
    <script src="./js/header.js"></script>
    <script src="./js/materialize.js"></script>
    <script src="./js/admin.js"></script>
<!--     <script>
        var options = {
            valueNames: ['pstCheck', 'pstTitle', 'pstDate', 'pstMem'],
            page: 9,
            pagination: true
        };

        var pstList = new List('posts', options);  


        // --- 임시 데이터 생성 -----
        for (let i = 1; i < 20; i++) {
            pstList.add({
                pstCheck: `<input type="checkbox" name="pstOne" id="pst` + i + `" value="pst`+ i +`">
                <label for="pst` + i + `"></label>`,
                pstTitle: "게시글의 제목을 넣~는~곳" + i,
                pstDate: "2023-05-0" + i,
                pstMem: "회원" + i
            });
        }
    </script> -->
	    <script type="text/javascript">
         var vm = new Vue({
            el: ".pstSection",
            data: {
                jsonPost: [], // 초기 데이터 설정
            },
            methods: {
                rePostJson: function() {
                    // AJAX 요청을 이용하여 데이터 가져오기
                    $.ajax({
                        url: "${path}/admin_pst_List.do",
                        type: "post",
                        data: "title="+$("#schPost").val(),
                        dataType: "json",
                        success: function(plist) {
                            console.log(plist);
                            vm.jsonPost = plist; // jsonData 업데이트
                        },
                        error: function(err) {
                            console.log(err);
                        }
                    });
                }
            },
            created: function() {
                // 페이지가 로드되면 데이터를 가져오도록 초기 실행
                this.rePostJson();
            }
        });

        // 버튼 클릭 시 데이터를 다시 가져오도록 설정
        $("#asdf").click(function() {
            vm.jsonPost();
        }); 
        
        
        
        
    </script>

</body>

</html>