<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@
	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" 
%>    
<!DOCTYPE html>
<html>
<head>
<style>
	.red {
		color : red;
	}
</style>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:forEach var="member" items="${members}">
		
		<!-- null이 아니면 그냥 그대로 나온다 -->
		<c:out value="${member.name}" escapeXml="false" default="noname"/>
		
	</c:forEach>
	
	<hr>
	
	${members[0]} <br>
	${members[1]} / ${members[1].name} / ${members[0].name} <br>
	
	<c:out value="${members[0].name}"></c:out><br>
	
	<!-- null인 경우 이름 입력값 없음 으로 나오게 한다 -->
	<c:out value="${members[1].name}" escapeXml="false">
		<span class="red">이름 입력값 없음</span>	
	</c:out><br>
	
	<!-- null이 아니면 그냥 그대로 나온다 -->
	<c:out value="${members[0].name}" escapeXml="false">
		<span class="red">이름 입력값 없음</span>	
	</c:out><br>
	
	<hr>
	${members}
	
</body>
</html>