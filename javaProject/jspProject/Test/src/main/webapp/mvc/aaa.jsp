<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	// 데이터 처리만 !
	String type = request.getParameter("type");
	String cool = "cool";
	
	request.setAttribute("result", type);
	request.setAttribute("type", cool);
	
	String[] str = {
			"aaa",
			"bbb",
			"ccc"
	};
	
	request.setAttribute("list", str);
	
%>

<%-- <jsp:forward page="bbb.jsp"/> --%>
<jsp:include page="bbb.jsp"/>