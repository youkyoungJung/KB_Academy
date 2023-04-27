<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>곱셈게임</title>
</head>
<body>
	<h1>곱셈게임</h1>
	<!-- action을 비워두면 현재 url로 전송된다. -->

	<form action="" method="post">
		<input type="hidden" name="answer" value="${answer }"> 
		<input type="hidden" name="n1" value="${n1 }"> 
		<input type="hidden" name="n2" value="${n2 }"> 
		<input type="hidden" name="number" value="${number }"> 
		<div>${number }. ${n1 }
			* ${n2 } = <input type="number" name="wanswer" size="5">
			<input type="submit" value="정답확인">
		</div>
		
	</form>
	<div> ${finish }</div>
</body>
</html>