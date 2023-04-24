<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:useBean id="mydto" class="web0417.dto.SimpleDto" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="mydto"/><!-- Property의 항목을 다 뽑는 것 -->

<jsp:forward page="print_form.jsp"></jsp:forward>

