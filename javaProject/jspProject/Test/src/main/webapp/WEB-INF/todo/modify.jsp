<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

	session.setAttribute("number", request.getParameter("number"));
	session.setAttribute("name", request.getParameter("name"));
	session.setAttribute("date", request.getParameter("date"));
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산기</title>
</head>
<body>
<div id="form">
	
	<h1>수정 페이지</h1>
	
	<form method="post">
		
		<input type="text" name="number" value = "${number} ">
		<br>
		<input type="text" name="title" value =  "${name}">
		<br>
		<input type="date" name="birth" value =  "${date}" >
		<br>
		
		<br>
		<button type="button" name="list" value="list">
			<a href="/aa/todo/read.jsp?number=${number}&name=${name}&date=${date}">Modify/Remove</a>
		</button>
		<br>
		<input type="button" name="list" value="list">
		
	</form>
	
</div>
</body>
</html>