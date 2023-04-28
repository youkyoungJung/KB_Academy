<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<h1>Login</h1>
	<br>
	<form action="login" method="post">
		이메일<input type="text" name="email" style="text-align: center; width: 10em;"><br>
		비밀번호 <input type="text" name="password" style="text-align: center; width: 10em;"><br>
		<input type="button" onClick="location.href='register'" value="회원가입" />
		<input type="submit" value="로그인" />
	</form>


</body>
</html>

<!-- <form action="<c:url value='login'/>" method="post"> -->