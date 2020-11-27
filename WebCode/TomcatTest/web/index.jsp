<%--
  Created by IntelliJ IDEA.
  User: Monster
  Date: 2020/11/18
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>下载文件</title>
  </head>
  <body>
  <form action="/login">
    <p>用户<input type="text" name="userName"></input></p>
    <p>密码<input type="text" name="password"></input></p>
    <p>验证码<input type="text" name="code"></input></p>
    <p><img id="image" src="/checkCodeServlet" /></p>
    <p><% Object error = request.getAttribute("error");
      if(error != null) {
        out.write((String) error);
      }

    %> </p>
    <p><button type="submit" style="text-align: center">登录</button></p>
  </form>
    <a href="/respDemo06?fileName=哪吒.jpg">下载文件</a>

  </body>
  <script>

    window.onload = function(){
      document.getElementById("image").onclick = function(){
        this.src="/checkCodeServlet?time="+new Date().getTime();
      }
    }

  </script>



</html>
