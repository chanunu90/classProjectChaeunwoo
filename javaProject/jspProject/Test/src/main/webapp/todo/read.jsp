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
	
	<h1>READ페이지</h1>
	
	<form action = "/aa/list" method="post">
		
<%-- 	<input type="text" name="number" value = <%= request.getParameter("number") %>> --%>
		<input type="text" name="number" value = "${number} ">
		<br>
		<input type="text" name="title" value =  "${name}">
		<br>
		<input type="date" name="birth" value =  "${date}" >
		<br>
		<a href=modify.jsp>Modify/Remove</a> <input type="submit" name="list" value="list">
		
	</form>
	
</div>
</body>
</html>