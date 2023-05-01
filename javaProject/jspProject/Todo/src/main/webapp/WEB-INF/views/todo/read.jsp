<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Todo 상세보기</h1>
	
		번호 : <input tyoe="text" name = "no" value = "${no}" readonly>
		할일 : <input type = "text" name = "todo" value = "${todo}" readonly><br>
		날짜 : <input type = "date" name = "duedate" value = "${duedate}" readonly><br>
		완료 : <input type = "checkbox" name = "complete" ${complete == 'done' ? 'checked' : ''} readonly ><br>
					
		<a href="modify?no=${no}">수정</a>
		
		<form action="delete" method="post">
			
			<input type="hidden" name="no" value="${no}"></input>
			<input type="submit" value="삭제"></input>
		
		</form>
		
		
		
		
		<!-- <a href="#">삭제</a> -->

</body>
</html>