<%--
  Created by IntelliJ IDEA.
  User: eric gu
  Date: 2022-1-13
  Time: 上午 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="uploadfile.do" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <button type="submit">提交</button>
</form>
</body>
</html>
