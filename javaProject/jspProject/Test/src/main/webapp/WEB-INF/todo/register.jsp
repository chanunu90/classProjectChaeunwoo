<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산기</title>
</head>
<body>
<div id="form">
	 
	<h1><%= request.getAttribute("title") %></h1>
	
	<form  action = "/aa/list" method="post">
		
		<input type="text" name="name">
		<br>
		<input type="date" name="date">
		<br>
		<input type="submit" name="RESET" value="RESET">
		<input type="submit" name="REGISTER" value="REGISTER">
		
	</form>
	
</div>
</body>
</html>