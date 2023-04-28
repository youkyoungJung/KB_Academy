<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등록하기</title>
</head>
<body>
	<h1>Register</h1>
	<br>
	<form action="register" method="post" modelAttribute="customer">
	이름 <input type= "text" name="name"  style="text-align:center; width:10em;"><br>
	이메일 <input type= "text" name="email" style="text-align:center; width:10em;"><br>
	연락처<input type= "text"  name="phone" style="text-align:center; width:10em;"><br>
	비밀번호 <input type= "text"  name="password" style="text-align:center; width:10em;"><br>
	비밀번호확인 <input type= "text" name="password2" style="text-align:center; width:10em;"><br>
	<input type="button" onClick="location.href='login'" value="로그인"/>
	<input type="submit" value="회원가입"/>
	</form>

	
</body>
</html>