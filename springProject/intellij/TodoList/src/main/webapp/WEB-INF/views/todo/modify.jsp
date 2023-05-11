<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-11
  Time: 오전 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>수정페이지</title>
</head>
<body>

    <h1>수정페이지 두둥.</h1>
    <hr>
    <h1>${read}</h1>
    <form method="post">

        tno : <input type="text" name="tno"><br>

        todo : <input type="text" name="todo"><br>

        duedate : <input type="date" name="duedate"><br>

        완료여부 : <input type="checkbox" name="complat"><br>

        <input type="reset" value="초기화">
        <br>
        <input type="submit" value="리스트로 돌아가라">


    </form>

<%--    <a href="/todo/list">리스트로 돌아간다.</a>--%>
    <a href="/todo/delete">삭제 합니다.</a>



</body>
</html>
