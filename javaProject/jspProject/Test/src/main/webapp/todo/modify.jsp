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
	
	<h1>수정 페이지</h1>
	
	<form  action = "/aa/list" method="post">
		
		<input type="text" name="number" value = <%= request.getParameter("number") %> >
		<br>
		<input type="text" name="title" value = <%= request.getParameter("title") %> >
		<br>
		<input type="date" name="birth" value = <%= request.getParameter("birth") %>>
		<br>
		<a href="">Modify/Remove</a> <input type="submit" name="list" value="list">
		
	</form>
	
</div>
</body>
</html>