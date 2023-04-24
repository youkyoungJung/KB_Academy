<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${requestScope.msg != null}">
		Message : ${msg }
	</c:if>
	<br>
	<c:if test="${msg2 == null}">
		Message2 : 없음 
	</c:if>
	<br>
	<c:forEach items="${sa}" var="s" >
		[${s }]<br>
	</c:forEach>
	
<!-- 	<h3>구구단 3단</h3>
	<c:set var="dan" value="3"></c:set>
	<c:forEach begin="1" end="9" var="i">
		${dan }* ${i } = ${dan* i}<br>
	</c:forEach> -->
	<%-- 	<h3>구구단 3단</h3>
	<c:set var="dan" value="3"></c:set>
	<c:forEach begin="1" end="9" var="i">
		${dan }* ${i } = ${dan* i}<br>
	</c:forEach> --%>
	
	<hr>
	<c:forEach items="${dtos }" var="dto">
		MID :${dto.mid }
	</c:forEach>
	
</body>


</html>