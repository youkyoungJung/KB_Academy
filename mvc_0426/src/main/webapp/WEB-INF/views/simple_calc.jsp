<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>간단한 계산기 만들기</title>
</head>
<body>
	<h1>간단한 계산기 만들기</h1>
	<!-- action을 비워두면 현재 url로 전송된다. -->
	<form action="" method="post">
		<input type="number" name="n1" size="5">
		<select name="opr">
			<option>+</option>
			<option>-</option>
			<option>*</option>
			<option>/</option>
			<option>%</option>
		</select>
		<input type="number" name="n2" size="5">
		<br>
		<input type="submit" value="정답확인">
		<div>${result }</div>
	</form>
</body>
</html>