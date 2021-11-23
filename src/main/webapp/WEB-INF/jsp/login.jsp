<%--
  Created by IntelliJ IDEA.
  User: ruslan.churilo
  Date: 22.11.21
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="/login" method="post">
        <label for="userName">Username: </label>
        <input type="text" name="username" id="userName"><br>
        <label for="password">Password: </label>
        <input type="password" name="password" id="password"><br>
        <span>${gender}</span>
        <input type="submit" name="Send">
    </form>
</body>
</html>
