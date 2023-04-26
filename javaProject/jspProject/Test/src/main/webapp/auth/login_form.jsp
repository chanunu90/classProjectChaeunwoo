<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>

<body>
<div id="form">
	<!-- 
		action : form내부에서 작성한 input 파라미터 데이터를 처리하는 경로
			   : 생략 가능 -> 생략하면 자기 자신의 현재 url로 보내진다.!
	-->
	<h1>로그인하세요</h1>
	<hr>
	<!-- 
		절대경로(서버 루트 경로 기준) : /web/auth/login.jsp
		상대경로(현재파일기준) : login.jsp
	 -->
	<form action="/aa/auth/login" method="get">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="userid"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type ="password" name ="password"> </td>
			</tr>
			<tr>
				<td></td>
				<td><input type ="submit" name ="login"> </td>
			</tr>
			
		</table>
	</form>
</div>
</body>
</html>