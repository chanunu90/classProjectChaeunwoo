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
	
	<h1>EMP 리스트 페이지</h1>
	
	<hr>
	
	<form>
		
		<c:forEach items = "${empList}"  var = "emp">
			
			<ul>
				
				<li><a 
						href="${pageContext.request.contextPath}/read?empno=${emp.empno}&ename=${emp.ename}"
					>
					
					${emp.empno}. ${emp.ename} </a>직업 : ${ emp.job } / 입사일 : ${emp.hiredate } /  연봉 : ${emp.sal}  </li>
				
				
		
				
			</ul>
			
		</c:forEach>
		
	</form>

</body>
</html>