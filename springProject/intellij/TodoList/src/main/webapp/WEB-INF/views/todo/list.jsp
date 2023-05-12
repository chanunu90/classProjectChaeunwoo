<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-11
  Time: 오전 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>todolist</title>
</head>
<body>
    <h1>${todoList}</h1>
    <h1>${todoReq}</h1>

    <h2>${todoReq.tno}</h2>
    <h2>${todoReq.todo}</h2>
    <h2>${todoReq.duedate}</h2>
    <h2>${todoReq.finished}</h2>





    <hr>
    <a href="/todo/read">read 페이지</a>
    <a href="/todo/registForm">등록 페이지</a>

</body>
</html>
