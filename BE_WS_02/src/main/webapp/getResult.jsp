<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Map<String, String> m = (Map<String, String>)request.getAttribute("m");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>get result</title>
</head>
<body>
	<h1>Get Result</h1>
	<h1>pageNo : <%= m.get("pageNo") %></h1>
	<h1>searchWord : <%= m.get("searchWord") %></h1>
	<h1>job : <%= m.get("job") %></h1>
</body>
</html>