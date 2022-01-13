<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="uri/p8.do" method="post">
    <input name="map['mi']"  value="小米"><br>
    <input name="map['iphone']"  value="苹果">
    <button type="submit">提交</button>
</form>
${param.hello}
</body>
</html>
