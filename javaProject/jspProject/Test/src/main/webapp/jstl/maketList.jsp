<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="member.Member"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%	
	List<Member> members = new ArrayList<Member>();
	
	members.add( new Member("name00" , "0000" , "cool00") );
	members.add( new Member("name01" , "0001" , null) );
	members.add( new Member("name02" , "0002" , "cool02") );
	members.add( new Member("name03" , "0003" , "cool03") );
	members.add( new Member("name04" , "0004" , null) );
	
	members.add( new Member("name05" , "0005" , null) );
	members.add( new Member("name06" , "0006" , "cool06") );
	members.add( new Member("name07" , "0007" , null) );
	members.add( new Member("name08" , "0008" , "cool08") );
	members.add( new Member("name09" , "0009" , "cool09") );
	
	session.setAttribute("members", members);
	
%>

</body>
</html>