<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page import="todo.Todo"%>
<%@ page import="java.time.LocalDateTime"%>
<%@ page import="java.util.Date"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<% 	
	
    List<Todo> lists = new ArrayList();
    for(Todo list : lists){
    	 lists.add(new Todo(request.getParameter("number"),request.getParameter("name"),request.getParameter("date")));
    }
    lists.add(new Todo("2","차차차","1990-12-06"));
    lists.add(new Todo("3","조조조","1991-10-20"));

	session.setAttribute("list", lists);
	
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
	
	<h1> ${list[1].name}</h1>
	<h1> ${list[1].date}</h1>
	<h1> ${list}</h1>
	
	<br>
	
	<form action="#" method="post">
	
		<h2>1~5 까지 반복 (게시판 패이징 넘버)</h2>
		
		<c:forEach items="${list}" var="listv" varStatus="stat">
 			
 			<div class="lists">
 			
				<a href="/aa/todo/read.jsp?number=${listv.number}&name=${listv.name}&date=${listv.date}">
					<span>• ${listv.number}  ${listv.name} ${listv.date} </span>
				</a>
				
				<br>
			<div>
			
		</c:forEach>
		
	</form>
	
</div>
</body>
</html>