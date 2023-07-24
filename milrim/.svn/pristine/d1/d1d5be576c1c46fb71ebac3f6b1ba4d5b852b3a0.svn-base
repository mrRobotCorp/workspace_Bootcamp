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
    <link rel="stylesheet" href="./css/header.css">
    <link rel="stylesheet" href="./css/main.css">
    <link rel="stylesheet" href="./css/login.css">
</head>

<body>
    <header>
        <nav>
            <ul class="gnb">
                <li>
                    <a href="./home.html"><img class="headLogo" src="./source/logo_noBg_b.png"></a>
                </li>
                <li><a href="./home.html">밀림의 숲</a></li>
            </ul>
        </nav>
    </header>

    <section>
        <div class="joinInner">
            <div class="joinForm">
                <h3>회원가입</h3>
                <div  class="logInput">
                    <label>이름</label>
                    <input type="text" id="name" name="name" maxlength="16" placeholder="닉네임을 입력하세요" 
                    onfocus="this.placeholder=''" onblur="this.placeholder='이름을 입력하세요.'">
                </div>
                <div  class="logInput">
                    <label>아이디</label>
                    <input type="text" id="id" name="id" maxlength="16" placeholder="아이디를 입력하세요" 
                    onfocus="this.placeholder=''" onblur="this.placeholder='아이디를 입력하세요.'" oninput="checkId()">
                    <p id="idCheck">이미 사용중인 아이디입니다.</p>
                    <!-- p태그 js에서 innerText로 활용해서 문구 나오게... -->
                </div>
                <div class="logInput">
                    <label>비밀번호</label>
                    <input type="password" id="pass" name="pass" maxlength="16" placeholder="영문, 숫자, 특수기호(@,!,#,$,?,/)포함 8글자 이상" 
                    onfocus="this.placeholder=''" onblur="this.placeholder=
                    '영문, 숫자, 특수기호(@,!,#,$,?,/)포함 8글자 이상'" oninput="checkPwd()">
                    <p id="pwdCheck">비밀번호가 올바르지 않습니다.</p>
                </div>
                <div class="logInput">
                    <label>비밀번호 확인</label>
                    <input type="password" id="pass" name="pass" maxlength="16" placeholder="비밀번호를 입력하세요" 
                    onfocus="this.placeholder=''" onblur="this.placeholder='비밀번호를 입력하세요'" oninput="dbcheckPwd()">
                    <p id="pwddbCheck">비밀번호가 일치하지 않습니다.</p>
                </div>
                <div class="logInput">
                    <label>이메일</label>
                    <input type="text" id="email" name="email" maxlength="30" placeholder="이메일을 입력하세요" 
                    onfocus="this.placeholder=''" onblur="this.placeholder='이메일을 입력하세요'">
                </div>
                <div class="phoneInner">
                    <div class="phoneInput">
                        <label>휴대폰 번호</label>
                        <input type="number" placeholder="휴대폰 번호를 입력하세요" id="phoneNumber" name="phoneNumber"
                        onfocus="this.placeholder=''" onblur="this.placeholder='휴대폰 번호를 입력하세요'">
                    </div>
                    <input type="button" class="codeBtn" value="인증번호 발송" onclick="sendMsg()">
                </div>
                    <div class="phoneInner">
                        <div class="phoneInput">
                            <label>인증번호 확인</label>
                            <input type="number" placeholder="인증번호를 입력하세요" 
                            onfocus="this.placeholder=''" onblur="this.placeholder='인증번호를 입력하세요'">
                        </div>
                        <input type="button" class="codeBtn" value="인증번호 확인" onclick="checkMsg()">
                    </div>
                    <p id="codeCheck" class="codeCheck">인증번호가 일치하지 않습니다.</p>


                <div class="agreeForm">
                    <div class="allAgree">
                        <p>다음 약관에 모두 동의</p>
                       <input type="checkbox" name="check_all" class="ckAgree" id="allAgree"> 
                       <label for="allAgree"></label>
                    </div>
                    <div class="agree">
                        <p>밀림 이용약관 동의 (필수)</p>
                        <input type="checkbox" name="agree"class="ckAgree" id="fAgree">
                        <label for="fAgree"></label>
                    </div>
                    <div class="agree">
                        <p>개인 정보 수집 및 이용에 대한 안내 (필수)</p>
                        <input type="checkbox" name="agree" class="ckAgree" id="sAgree">
                        <label for="sAgree"></label>
                    </div>
                    <div class="agree">
                        <p>맞춤 할인 및 이벤트 소식 메일 수신 (선택)</p>
                        <input type="checkbox" name="agree" class="ckAgree" id="tAgree">
                        <label for="tAgree"></label>
                    </div>
                </div>
                <input type="submit" class="joinBtn" id="join" value="회원가입" onclick="letJoin()">
            </div>

        </div>
    </section>

    <footer>
        <img src="./source/logo_noBg.png">
        <p>© Milrim, Inc. 2023. No more dull moments!</p>
    </footer>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
    <script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
    <script src="./js/header.js"></script>
    <script src="./js/main.js"></script>
    <script src="./js/login.js"></script>
</body>

</html>