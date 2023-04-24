<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		Object o  = session.getAttribute("mid");
		out.println("mid= "+ o);
	%>
	<hr>
	mid = ${sessionScope.mid }
	<br>
	pwd = ${sessionScope.pwd }
</body>
</html>