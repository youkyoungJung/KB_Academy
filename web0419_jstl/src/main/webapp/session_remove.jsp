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
	//mid 속성만 삭제. 나머지 속성은 유지중
	session.removeAttribute("mid");
%>
</body>
</html>