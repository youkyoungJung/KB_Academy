<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>chosun_agme_main.jsp</title>
</head>
<body>
	<h1>자바초성게임</h1>
	<!-- action을 비워두면 현재 url로 전송된다. -->
	<h3>힌트초성 : ${chosun}</h3>
	<a href="chosun_game">게임 다시 시작</a>
	<form action="" method="post">
		<input type="text" name="userInput">
		<input type="submit" value="정답확인">
	</form>
	<div>${result}</div>

</body>
</html>