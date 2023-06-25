<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-12
  Time: 오후 3:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order Form</title>
</head>
<body>
  <h1>주문</h1>
  <h1>오더쪽으로 잘 들어왔어요</h1>
  <hr>
  <form method="post">

    <h3>상품1</h3>
    ID - <input type="text" name = "orderItems[0].itemId"> <br>
    개수 - <input type="number" name = "orderItems[0].number"> <br>
    주의 - <input type="text" name = "orderItems[0].remark"> <br>

    <h3>상품2</h3>
    ID - <input type="text" name = "orderItems[1].itemId"> <br>
    개수 - <input type="number" name = "orderItems[1].number"> <br>
    주의 - <input type="text" name = "orderItems[1].remark"> <br>

    <h3>상품3</h3>
    ID - <input type="text" name = "orderItems[2].itemId"> <br>
    개수 - <input type="number" name = "orderItems[2].number"> <br>
    주의 - <input type="text" name = "orderItems[2].remark"> <br>

    <h3>배송지 주소</h3>
    우편번호 : <input tyoe = "text" name = "address.zipcode"><br>
    주소1 : <input tyoe = "text" name = "address.address1"><br>
    주소2 : <input tyoe = "text" name = "address.address2"><br>

    <input type="submit" value="전송버튼">

  </form>

</body>
</html>
