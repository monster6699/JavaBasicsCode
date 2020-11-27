<%--
  Created by IntelliJ IDEA.
  User: Monster
  Date: 2020/11/27
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<h2>
<% Object userName = request.getAttribute("userName");
    out.write((String)userName + "登录成功");
%>
</h2>
</body>
</html>
