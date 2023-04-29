<%@page import="member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@
	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" 
%>   


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:if test="${10 eq 1}">
		안녕하세요.
	</c:if>
	
	<br>
	
	이름 : 
	
	<c:if test="${members[1].name eq null}">
		입력된 정보가 없습니다.
	</c:if>
	
	<br>
	
	<c:if test="${ empty members}">
		회원 리스트의 정보가 존재하지않습니다.
	</c:if>
	
	<c:if test="${not empty members}">
		회원 리스트의 정보가 존재합니다.
	</c:if>
	
</body>
</html>