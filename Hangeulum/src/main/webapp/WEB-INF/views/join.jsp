<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style type="text/css">
#joinForm div{
	color:red;
	font-size:8pt;
	font-weight:bold;
}
</style>


<body>

<h1>회원가입</h1>

<form id="joinForm" name="joinForm">




<input type="text" id="userid" name="userid"/>
아이디
<div id="idDiv"></div>

<input type="text" id="password" name="password"/>
비밀번호
<div id="pwdDiv"></div>

<input type="text" id="username" name="username" />
이름
<div id="nameDiv"></div>


<input type="text" id="userbirth" name="userbirth"/>
생일
<div id="birthDiv"></div>


<input type="text" id="userphone" name="userphone"/>
휴대번호
<div id="phoneDiv"></div>


<input type="text" id="gender" name="gender"/>
성별
<div id="genderDiv"></div>


<input type="text" id="useremail" name="useremail"/>
이메일
<div id="emailDiv"></div>


<input type="button" value="회원가입" id="joinBtn"/>

</form>


<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.4.min.js"></script>
<script type="text/javascript" src="../js/userjoin.js"></script>

</body>
</html>