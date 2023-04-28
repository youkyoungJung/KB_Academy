<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인고객</title>
</head>
<body>
	<a href="mypage">비밀번호 변경하기</a>
	<a href="mypage/detail">내정보 확인하기</a>
	<br>
	<form action="mypage" method="post">
		현재비밀번호<input type="text" name=password style="text-align: center; width: 10em;"><br>
		새 비밀번호 <input type="text" name=new_pw style="text-align: center; width: 10em;"><br>
		새 비밀번호 확인 <input type="text" name=new_pw2 style="text-align: center; width: 10em;"><br>
		<input type="submit" value="변경하기" />
	</form>


</body>
</html>