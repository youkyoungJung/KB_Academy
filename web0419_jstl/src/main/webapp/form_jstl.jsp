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
		<!-- ����� ����Ǿ� �ֵ� -->
		<b>${param.id }</b>
	</c:if>
		<c:if test="${param.id == '' }">
		<!-- ����� ����Ǿ� �ֵ� -->
		<b>GEST</b>
	</c:if>
	
	<c:choose>
		<c:when test="${param.color == 'blue' }">
		<!-- ��µ� �ڵ�� -->
		Color : blue
		</c:when>
				<c:when test="${param.color == 'yellow' }">
		<!-- ��µ� �ڵ�� -->
		Color : yellow
		</c:when>
				<c:when test="${param.color == 'orange' }">
		<!-- ��µ� �ڵ�� -->
		Color : orange
		</c:when>
				<c:when test="${param.color == 'pink' }">
		<!-- ��µ� �ڵ�� -->
		Color : pink
		</c:when>
		<c:otherwise>
		Color : �˼�����
		</c:otherwise>
	</c:choose>
</body>
</html>