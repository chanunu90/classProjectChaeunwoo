<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Todo List</h1>
	
	<ul>
	
		<c:forEach items="${todoList}" var="todo" >
		
			<li><a href="${pageContext.request.contextPath}/todo/read?no=${todo.tno}">${todo.tno}. ${todo.todo} </a> ${todo.duedate}  ${todo.finished ? 'DONE' : 'NOT'}</li>					
					
		</c:forEach>
	
	</ul>
	
	<div>
		${todoList}
	</div>

	<a href="${pageContext.request.contextPath}/todo/register">Todo Register</a>

</body>
</html>