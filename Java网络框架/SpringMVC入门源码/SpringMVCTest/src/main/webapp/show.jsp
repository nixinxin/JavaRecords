<%--
  Created by IntelliJ IDEA.
  User: 003
  Date: 2018/7/11
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <%-- ${name}--%>
    商品名称：${requestScope.goods.name}<br/>
    商品价格：${requestScope.goods.price}
</body>
</html>
