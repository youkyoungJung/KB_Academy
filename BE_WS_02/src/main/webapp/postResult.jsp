<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dto" class="dto.ParameterDto" scope="request"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<style>
	table {border: 1px solid black; border-collapse: collapse;}
	td {border: 1px solid black;}
</style>
<meta charset="UTF-8">
<title>post result</title>
</head>
<body>
	<h1>Post Result</h1>
	<table>
	  <tr>
	    <td>name</td>
	    <td><jsp:getProperty property="name" name="dto"/></td>
	  </tr>
	  <tr>
	    <td>email</td>
	    <td><jsp:getProperty property="email" name="dto"/></td>
	  </tr>
	  <tr>
	    <td>gender</td>
	    <td><jsp:getProperty property="gender" name="dto"/></td>
	  </tr>
	  <tr>
	    <td>hobby</td>
	    <% 
	    	String hobby = Arrays.toString(dto.getHobby()).replace("[", "").replace("]", "");
	    %>
	    <td><%= hobby %></td>
	  </tr>
	  <tr>
	    <td>favorite</td>
	    <td><jsp:getProperty property="favorite" name="dto"/></td>
	  </tr>
	  <tr>
	    <td>desc</td>
	    <td><jsp:getProperty property="desc" name="dto"/></td>
	  </tr>
	</table>
</body>
</html>