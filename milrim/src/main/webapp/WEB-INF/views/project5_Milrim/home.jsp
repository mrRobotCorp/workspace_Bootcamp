<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>   
<fmt:requestEncoding value="utf-8"/>
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
    <link rel="stylesheet" href="./css/home.css">
    <link rel="stylesheet" href="./css/header.css">
</head>

<body>
    <header>
        <nav>
            <ul class="gnb">
                <li>
                    <a href="home.jsp"><img class="headLogo" src="./source/logo_noBg_b.png"></a>
                </li>
                <li><a href="login.jsp">밀림의 숲</a></li>
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

    <main>
        <div class="mainComm">
            <div class="mainLogo">
                <img src="./source/logo_noBg.png">
            </div>
            <p>No more dull moments!</p>
        </div>
        <a href="#" class="startBtn">
            <p class="btnText">밀림 시작하기</p>
            <div class="btnArrow">
                <p class="btnText2">>></p>
            </div>
        </a>
        <a href="#" class="regBtn">회원가입하기</a>
    </main>

    <footer>
        <img src="./source/logo_noBg.png">
        <p>© Milrim, Inc. 2023. No more dull moments!</p>
    </footer>
    <script src="./js/header.js"></script>
</body>

</html>