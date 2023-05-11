<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-10
  Time: 오후 5:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <h1>test1로 잘들어 와쓰요.</h1>
  <h2>${msg}</h2>
  <hr>
  <h2>${uid}</h2>
  <hr>
  <h2>${password}</h2>

  <form method="post">

      id <input type="text" name="uid"> <br>
      pw <input type="text" name="password"> <br>




      <input type="submit" value="포스트버튼">


  </form>


</body>
</html>
