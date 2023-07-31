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

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/list.js/2.3.1/list.min.js"></script>
	<script src="/milrim/a00_com/vue.js"></script>
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

    <section class="vidSection" id="videos">
        <form method="post" class="memSchBox schBox search">
            <button type="button"></button>
            <input name="adm_vidSch" placeholder="작품의 제목을 검색">
        </form>

        <form method="post" class="listBox" id="test-list">
            <span>
                <input type="checkbox" name="vidOne" id="allCh">
                <label for="allCh">전체 선택</label>
            </span>
            <button type="button" class="uptBtn">수정</button>
            <button type="button" class="delBtn">삭제</button>

            <ul class="listHead vid">
                <li>영상 제목</li>
                <li>영상 ID</li>
                <li>업로드일</li>
            </ul>

            <ul class="listAll list">
                <li>
                    <ul class="listRow">
                        <span class="vidCheck">
                            <input type="checkbox" name="vidOne" id="vid0" value="video0">
                            <label for="vid0"></label>
                        </span>
                        <div class="vidInfo">
                            <li class="vidTitle">
                                <img src="./source/thumb03.jpg"> 
                                <div>
                                    <p>데스노트 리마스터링</p>
                                    <p>총 39회</p>
                                </div>
                            </li>
                            <li class="vidId">VID-0538</li>
                            <li class="upload">2023-05-05</li>
                        </div>
                        <button type="button" class="epShowBtn">
                            <img src="./source/arrow_d.png">
                        </button>
                    </ul>
                    <div class="epListAll">
                        <ul class="epList">
                            <li>
                                <p>2023-07-12</p>
                                <p>1회차의 제목 제목 1회차의 제목 제목</p>
                            </li>
                            <li>
                                <p>2023-07-12</p>
                                <p>2회차</p>
                            </li>
                            <li>
                                <p>2023-07-12</p>
                                <p>3회차의 제목 제목</p>
                            </li>
                            <li>
                                <p>2023-07-12</p>
                                <p>3회차의 제목 제목</p>
                            </li>
                            <li>
                                <p>2023-07-12</p>
                                <p>3회차의 제목 제목</p>
                            </li>
                            <li>
                                <p>2023-07-12</p>
                                <p>3회차의 제목 제목</p>
                            </li>
                            <li>
                                <p>2023-07-12</p>
                                <p>3회차의 제목 제목 3회차의 제목 제목</p>
                            </li>
                            <li>
                                <p>2023-07-12</p>
                                <p>3회차의 제목 제목 3회차의 제목 제목</p>
                            </li>
                            <li>
                                <p>2023-07-12</p>
                                <p>3회차의 제목 제목 3회차의 제목 제목</p>
                            </li>
                            <li>
                                <img class="addBtn" src="./source/addIco.png">
                            </li>
                        </ul>

                    </div>
                </li>

            </ul>
            <ul class="pagination"></ul>
        </form>

        <!-- -------- 모달창 ------------ -->
        <div id="modal1" class="modal">
            <div class="modalCon">
                <button type="button" class="modal-close"></button>
                
                <h4>영상 정보 수정</h4>
                <form method="post" class="uptFrm">
                    <div class="uptRow">
                        <span class="uptSub">영상 제목</span>
                        <input type="text" name="uptName" placeholder="영상의 제목 입력">
                    </div>
                    <div class="uptRow">
                        <span class="uptSub">썸네일</span>
                        <input type="file" name="uptName" placeholder="업로드일 입력">
                    </div>
                    <div class="uptRow">
                        <span class="uptSub">영상물</span>
                        <input type="file" name="uptName" placeholder="업로드일 입력">
                    </div>
                    <div class="uptRow">
                        <span class="uptSub">업로드일</span>
                        <input type="text" name="uptName" placeholder="업로드일 입력">
                    </div>
                    <div class="uptRow">
                        <span class="uptSub">Number</span>
                        <input type="text" name="uptName" placeholder="영상 ID 입력">
                    </div>
                    <div class="uptRow">
                        <span class="uptSub">Value</span>
                        <input type="text" name="uptName" placeholder="업로드일 입력">
                    </div>
                </form>
            </div>
            <button type="button" class="modalUpt">수정</button>
        </div>

    </section>
    <script src="./js/header.js"></script>
    <script src="./js/materialize.js"></script>
    <script src="./js/admin.js"></script>
    <script>

        var options = {
            valueNames: ['vidCheck', 'vidTitle', 'vidId', 'upload'],
            page: 5,
            pagination: true
        };

        var vidList = new List('videos', options);

        // --- 임시 데이터 생성 -----
        for (let i = 1; i < 10; i++) {
            vidList.add({
                vidCheck: `<input type="checkbox" name="vidOne" id="vid` + i + `" value="video`+i+`">
                <label for="vid` + i + `"></label>`,
                vidTitle: `<img src="./source/thumb03.jpg"> 
                            <div>
                                <p>데스노트 리마스터링</p>
                                <p>총 39회</p>
                            </div>`,
                vidId: "VID-100" + i,
                upload: "2023-07-0" + i
            });
        }

        

        // -------------------- 회차 정보 --------------------
        const epBtn = document.querySelectorAll(".epShowBtn");
        const epList = document.querySelectorAll(".epListAll");
        

        epBtn.forEach((e,i) => {
            e.onclick = function() {
                epList[i].classList.toggle("active");
                epBtn[i].classList.toggle("active");
            }
        })

        // ----------------------- modal ---------------------------------
        document.addEventListener('DOMContentLoaded', function () {
            document.querySelector("body").insertAdjacentHTML("afterbegin", `
                <div class="darkBg"></div>`);

            const bg = document.querySelector(".darkBg");
            const uptBtn = document.querySelector(".uptBtn");
            const closeBtn = document.querySelector(".modal-close");
            var elems = document.querySelector('.modal');
            var instances = M.Modal.init(elems, options);
            
            var listRow = document.querySelectorAll(".listRow");

            uptBtn.onclick = function() {
                instances.open();
                bg.classList.add("active");
            }
            
            closeBtn.onclick = function() {
                bg.classList.remove("active");
            }

            listRow.forEach((e) => {
                e.ondblclick = function() {
                    instances.open();
                    bg.classList.add("active");
                }
            });

            // ---- modal 영역 밖 클릭 시 닫기
            document.addEventListener('mouseup', function(e) {
                if(!elems.contains(e.target)) {
                    instances.close();
                    bg.classList.remove("active");
                }
            });

            const ep = document.querySelectorAll(".epList li");
            

            ep.forEach((e) => {
                e.onclick = function() {
                    instances.open();
                    bg.classList.add("active");
                }
            })

        });

    </script>

</body>

</html>
