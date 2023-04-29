<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page import="todo.Todo"%>
<%@ page import="java.time.LocalDateTime"%>
<%@ page import="java.util.Date"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<% 	
	
	session.setAttribute("list", request.getAttribute("todoList"));
	
%>  
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산기</title>
	
<style>
	div .lists{ display: flex; }
</style>
</head>
<body>

<div id="form">	
	
	<form action="#" method="post">
		
		<h2>리스트 페이지</h2>
		
		<c:forEach items="${list}" var="listv" varStatus="stat">
 			
			<a class="lists" href="/aa/todo/read.jsp?number=${listv.number}&name=${listv.name}&date=${listv.date}">
				<span>• ${listv.number} ${listv.name} ${listv.date} </span>
			</a>
			
			<br>
		</c:forEach>
		
	</form>
	
</div>
</body>
</html>