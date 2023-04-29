<%@page import="product.Product"%>
<%@page import="member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	
	session.setAttribute("name", "캉진리");
	
	Member member = new Member();
	member.setId("Cool");
	member.setPassword("1234");
	member.setName("COOL");
	
	session.setAttribute("member", member);
	session.setAttribute("product", new Product());
	
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h4>
		가격 : ${product.price} <br>
		첫번째 제품 : ${product.list[2]} / ${product.list   }
	</h4>


	<h4>
		${ sessionScope.member } <br>
		${ member }
	</h4>

	<h4>
	
		${ member.id } <br>
		${ member.password } <br>
		${ member.name } <br>
		${ member.info } <br>
		
	</h4>

	<h4>
		${true} / ${false} / ${100} / ${3.14} / ${'손흥민'} / ${null} / ${'손흥민'}
	</h4>
		
	<h4>
		${100+10} / ${100 / 3} / ${100 mod 3} / ${10 eq 10} / ${'aaa' eq 'aaa'}
	</h4>
	
	<h4>
		표현식 : <%= request.getAttribute("name") %>	
	</h4>
	
	<h4>
		표현언어 : ${requestScope.name }	/ ${name}
	</h4>
	
	<h4>
	<a href="${pageContext.request.requestURL}?code=100"> link</a><br>
	${pageContext.request.requestURL }<br>
	${pageContext.request.requestURI }<br>
	${pageContext.request.contextPath }<br>
	<%= request.getContextPath() %>	
	</h4>

		
</body>
</html>