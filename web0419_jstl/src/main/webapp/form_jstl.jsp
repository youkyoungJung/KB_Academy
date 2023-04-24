<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>form_jstl.jsp</title>
</head>
<body>
	<c:if test="${param.id != null }">
		<!-- 어떤값이 저장되어 있따 -->
		<b>${param.id }</b>
	</c:if>
		<c:if test="${param.id == '' }">
		<!-- 어떤값이 저장되어 있따 -->
		<b>GEST</b>
	</c:if>
	
	<c:choose>
		<c:when test="${param.color == 'blue' }">
		<!-- 출력될 코드들 -->
		Color : blue
		</c:when>
				<c:when test="${param.color == 'yellow' }">
		<!-- 출력될 코드들 -->
		Color : yellow
		</c:when>
				<c:when test="${param.color == 'orange' }">
		<!-- 출력될 코드들 -->
		Color : orange
		</c:when>
				<c:when test="${param.color == 'pink' }">
		<!-- 출력될 코드들 -->
		Color : pink
		</c:when>
		<c:otherwise>
		Color : 알수없음
		</c:otherwise>
	</c:choose>
</body>
</html>