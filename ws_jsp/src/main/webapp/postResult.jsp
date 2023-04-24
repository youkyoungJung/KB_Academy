<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="mydto" class="ws.dto.ParameterDto" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="mydto" /><!-- Property의 항목을 다 뽑는 것 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Post Result</h1>
	<table border ="1">
		<tr>
			<td>name</td>
			<td><%=mydto.getName()%></td>
		</tr>
		<tr>
			<td>email</td>
			<td><%=mydto.getEmail()%></td>
		</tr>
		<tr>
			<td>gender</td>
			<td><%=mydto.getGender()%></td>
		</tr>
		<tr>
			<td>hobby</td>
			<td><%= Arrays.toString(mydto.getHobby())%>
			</td>
		</tr>
		<tr>
			<td>favorite</td>
			<td><%=mydto.getFavorite()%></td>
		</tr>
		<tr>
			<td>desc</td>
			<td><%=mydto.getDesc()%></td>
		</tr>
	</table>


</body>
</html>