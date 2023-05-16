<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-15
  Time: 오전 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FileUpload</title>
</head>
<body>

    <h1>과제 제출1</h1>
<%--    method="post" enctype="multipart/form-data" 이거없으면 큰일난다 파일형태로 올라가지 않는다.--%>
    <form action="/report/submit1" method="post" enctype="multipart/form-data">

        학번 : <input type="text" name="snum" > <br>
        이름 : <input type="text" name="sname" > <br>
        파일 : <input type="file" name="report" > <br>

        <input type="submit" value="파일 올리기!">

    </form>

    <hr> <hr>

    <h1>과제 제출2</h1>
    <%--    method="post" enctype="multipart/form-data" 이거없으면 큰일난다 파일형태로 올라가지 않는다.--%>
    <form action="/report/submit2" method="post" enctype="multipart/form-data">

        학번 : <input type="text" name="snum" > <br>
        이름 : <input type="text" name="sname" > <br>
        파일 : <input type="file" name="report" > <br>

        <input type="submit" value="파일 올리기!">

    </form>

    <hr> <hr>

    <h1>과제 제출3</h1>
    <%--    method="post" enctype="multipart/form-data" 이거없으면 큰일난다 파일형태로 올라가지 않는다.--%>
    <form action="/report/submit3" method="post" enctype="multipart/form-data">

        학번 : <input type="text" name="snum" > <br>
        이름 : <input type="text" name="sname" > <br>
        파일 : <input type="file" name="report" > <br>

        <input type="submit" value="파일 올리기!">

    </form>


</body>
</html>
