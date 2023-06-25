<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-15
  Time: 오전 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fileupload3333</title>
</head>
<body>

  <h1>리포트 업로드 완료33333</h1>

  <h3>report
    이름 : ${report.sname}<br>
    학번 : ${report.snum}<br>
    파일 이름 : ${report.report.originalFilename}<br>
<%--    첫번 쩨 report: 커멘드객체 , 두번 째 report : getReport(), 세번 째 : originalFileName()--%>
  </h3>

  <img src="/uploadfile/report/${report.report.originalFilename}">

</body>
</html>
