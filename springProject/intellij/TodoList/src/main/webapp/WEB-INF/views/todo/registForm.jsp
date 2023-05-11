<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-11
  Time: 오전 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>리스트페이지 짜란</h1>
    <form action="" method="post">

        todo <input type="text" name="todo" > <br>
        duedate <input type="date" name="duedate" > <br>

        
        <input type="submit" value="등록 포스트">

    </form>

    <a href="/todo/list">다시 todoList로 돌아간다.</a>



</body>
</html>
