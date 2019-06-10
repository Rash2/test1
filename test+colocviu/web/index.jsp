<%--
  Created by IntelliJ IDEA.
  User: codru
  Date: 6/10/2019
  Time: 2:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>New account</title>
  </head>
  <body>
  <form action="/signup" method="post">
    Username: <input type="text" name="username"><br>
    Password: <input type="password" name="pass"><br>
    <input type="submit" value="Sign Up">
  </form>
  </body>
</html>
