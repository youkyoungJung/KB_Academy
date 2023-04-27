<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>초성게임</title>
</head>
<body>
	<h1>자바초성게임</h1>
	<p1> 힌트 초성 : ${hint}</p1>
	<form action="" method="post">
		<input type="text" name="answer"> <br>
		 <input type="submit" value="정답확인">
	</form>
	<div> ${result }</div>
</body>
</html>
