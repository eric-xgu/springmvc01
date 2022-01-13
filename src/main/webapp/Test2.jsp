<%--
  Created by IntelliJ IDEA.
  User: eric gu
  Date: 2022-1-11
  Time: 上午 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="static/jquery-3.6.0.min.js"></script>
    <script type="text/javascript">
        function test(){
            $.ajax(
                {
                    type:"post",
                    url:"api1.do",
                    dataType:"json",
                    contentType:"application/json;charset=utf-8",
                    data:JSON.stringify({"id":1,"name":"jack","passwd":"123456","phones":[{"id":1,"name":"苹果"}],"map":{"company":"zjds"}}),
                    success:function (data) {
                        alert(data.name+"--"+data.id);
                    }
                }

            )
        }
    </script>
</head>
<body>
<input type="button" value="请求响应json" onclick="test()"/>
</body>
</html>
