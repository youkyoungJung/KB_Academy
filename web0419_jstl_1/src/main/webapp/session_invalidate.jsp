<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>session_invalidate.jsp</title>
</head>
<body>
<%
	//세션을 새로 생성 할당 - 모든 속성이 다 사라지고 생성.
	session.invalidate();

	
%>
session.invalidate();
</body>
</html>