<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
    Date now = new Date();
	
	request.getParameter("age");
	
	String name = "손흥민";
	
	/* request.setAttribute(name , "이름이래요"); */
	
	LocalDateTime time = LocalDateTime.now();
	
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인타힐</title>
</head>
<body>
	
	<h1> 안녕하세요!!!! </h1>
	<h3><%= now  %><h3>
	<h3><%= name  %><h3>
	<h3><%= time  %><h3>
	<h3><%= "time"  %><h3>
	
</body>
</html>