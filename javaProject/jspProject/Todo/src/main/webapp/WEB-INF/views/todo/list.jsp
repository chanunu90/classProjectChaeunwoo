<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Todo List</h1>
	
	<ul>
		<li><a href="${pageContext.request.contextPath}/todo/read?no=1">1. 청소</a> 2023-05-01 DONE</li>
		<li><a href="${pageContext.request.contextPath}/todo/read?no=2">2. 청소</a> 2023-05-02 DONE</li>
		<li><a href="${pageContext.request.contextPath}/todo/read?no=3">3. 청소</a> 2023-05-03 DONE</li>
		<li><a href="${pageContext.request.contextPath}/todo/read?no=4">4. 청소</a> 2023-05-04 DONE</li>
		<li><a href="${pageContext.request.contextPath}/todo/read?no=5">5. 청소</a> 2023-05-05 DONE</li>
	</ul>

	<a href="${pageContext.request.contextPath}/todo/register">Todo Register</a>

</body>
</html>