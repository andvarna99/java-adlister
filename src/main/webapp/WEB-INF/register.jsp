<%--
  Created by IntelliJ IDEA.
  User: andreavarnado
  Date: 3/15/23
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<h1 class="text-center">Register with us!</h1>
<form action="/register" method="POST" class=" container-fluid">
    <div class="form-group">
        <label for="email">Enter email: </label>
        <input id="email" name="email" class="form-control" type="text">
    </div>
    <div class="form-group">
        <label for="username">Create Username: </label>
        <input id="username" name="username" class="form-control" type="text">
    </div>
    <div class="form-group">
        <label for="password">Create Password: </label>
        <input id="password" name="password" class="form-control" type="password">
    </div>
    <input type="submit" class="btn btn-primary btn-block mt-2" value="Register">
</form>

</body>
</html>
