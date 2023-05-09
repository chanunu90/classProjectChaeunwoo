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
	
	<h1>EMP 읽기(상세정보) 페이지 ${empno}</h1>
	
	<hr>
	
	<form>
		
		사원번호 : <input type="text" value= "${empno}">
		<br>
		사원이름 : <input type="text" value= "${ename}">
		
	</form>

</body>
</html>