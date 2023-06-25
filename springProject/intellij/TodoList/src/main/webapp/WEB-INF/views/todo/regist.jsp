<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-12
  Time: 오전 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>result</title>
</head>
<body>
    <h1> todo : ${todo} </h1>
    <h1> duedate : ${duedate} </h1>

    <hr>

    <h1> todo : ${todoRequest.todo} </h1>
    <h1> duedate : ${todoRequest.duedate} </h1>
    <h1> 전체 : ${todoRequest} </h1>

</body>
</html>
