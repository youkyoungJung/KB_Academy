<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String mid = request.getParameter("mid");
	String pwd = request.getParameter("pwd");
	
%>

<% 
	if(mid.equals("xyz")){
%>
	<jsp:forward page="hello.jsp"></jsp:forward>
<%		
	}else{
		response.sendRedirect("form.jsp");
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>