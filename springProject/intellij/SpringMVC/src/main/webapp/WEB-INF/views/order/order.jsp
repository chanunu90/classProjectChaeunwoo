<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-12
  Time: 오후 4:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>order 결과값</title>
</head>
<body>

${order}


<br>


<h1>주문내역</h1>

<c:forEach var="item" items="${order.orderItems} ">

    <ul>
        <li>상품명 : ${item.itemId} </li>
        <li>상품 개수 : ${item.number} </li>
        <li>주의사항 : ${item.remark} </li>
    </ul>

</c:forEach>
배송지 :
 ${order.address.zipcode}
 ${order.address.address1}
 ${order.address.address2}

</body>
</html>
