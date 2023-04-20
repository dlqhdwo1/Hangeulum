<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginForm</title>
<head>
	<meta charset="UTF-8">
	<title>네이버 로그인</title>
	<link rel="stylesheet" href="/Hangeulum/views/css/loginForm.css">
	<script src="https://kit.fontawesome.com/51db22a717.js" crossorigin="anonymous"></script>
</head>
<body>
	<div class="main-container">
		<div class="main-wrap">
		<header>
			
			<div class="logo-wrap">
				<a href="./maintest2.jsp"><img width="1050" height="130" class="logo" 
				src="/Hangeulum/image/한걸음로고.png"></a>
			</div>
		</header>
		<section class="login-input-section-wrap">
		
		<form id="loginForm" name ="loginForm">
			<div class="login-input-wrap">	
				<input id="userid" name="userid" placeholder="Username" type="text"></input>
				<div id="idDiv" name="idDiv"></div>
			</div>
			<div class="login-input-wrap password-wrap">	
				<input id="userpassword" name="userpassword" placeholder="Password" type="password"></input>
				<div id="pwdDiv" name="pwdDiv"></div>
			</div>
			<div class="login-button-wrap">
				<button type="button" id="loginBtn" name="loginBtn">로그인</button>
			</div>
			<div class="login-stay-sign-in">
				<i class="far fa-check-circle"></i>
				<span>로그인 상태 유지</span>
			</div>
			
		</form>	
		</section>
		<section class="Easy-sgin-in-wrap">
			
			<ul class="sign-button-list">
				
				<a href="#"><img width="470" height="50"
				 src="${pageContext.request.contextPath}/image/kakaobutton.png"/></a>
			</ul>
			<p class="forget-msg">Forgot your<a href="./findIdForm.jsp">Username</a> or <a href="./findpasswordForm.jsp">Password?</a> | <a href="./joinForm.jsp">Sign up</a></p>
		</section>
		<footer>
			<div class="copyright-wrap">
			<span>	<img src="../../image/한걸음로고.png"> Copyright © NAVER Corp. All Rights Reserved.</span>
			</div>
		</footer>
		</div>
	</div>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.4.min.js"></script>
<script type="text/javascript" src="../js/userlogin.js"></script>
	
</body>
</html>