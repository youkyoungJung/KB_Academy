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
	<table>
		<td>이름 ${user.name }</td><br>
		<td>이메일 ${user.email }</td><br>
		<td>연락처${user.phone }</td><br>
	</table>


</body>
</html>