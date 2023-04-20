<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<a href="/Hangeulum/user/joinForm">test로</a>
<a href="/Hangeulum/user/loginForm">로그인폼으로</a>

<h2>${sessionScope.id}</h2>로그인


</body>
</html>
