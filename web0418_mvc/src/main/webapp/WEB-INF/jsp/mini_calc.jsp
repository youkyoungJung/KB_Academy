<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h1>간단계산기</h1>
	<form action="mini_calc.do" method="post">
		<input type="number" name="n1" value="${param.n1 }">
		<br>
		<input type="radio" name="opr" value="+" ${param.opr=="+" ? "checked": ""}>+
		<input type="radio" name="opr" value="-" ${param.opr=="-" ? "checked": ""}>-
		<input type="radio" name="opr" value="*" ${param.opr=="*" ? "checked": ""}>*
		<input type="radio" name="opr" value="/" ${param.opr=="/" ? "checked": ""}>/
		<input type="radio" name="opr" value="%" ${param.opr=="%" ? "checked": ""}>%
		<br>
		<input type="number" name="n2"  value="${param.n2 }">
		<br>
		<input type="submit" value="계 산 하 기">
	</form>

	<div id="result"><%= request.getAttribute("result") %></div>
	<div id="result">${param.n1} ${param.opr} ${param.n2} <%= "=" %> ${result} </div>
</body>
</html>