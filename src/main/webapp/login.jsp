<%--
  Created by IntelliJ IDEA.
  User: andreavarnado
  Date: 3/8/23
  Time: 10:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
<%--Bootstrap--%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

</head>
<body>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    System.out.println(username + " " + password);
    if(username != null && username.equals("admin") && password != null && password.equals("password")){
        response.sendRedirect("/profile.jsp");
    }
%>
<%@ include file="partials/navbar.jsp" %>
<%@ include file="partials/header.jsp" %>
    <form action="login.jsp" method = "POST" class="container-fluid border shadow-lg">
        <div class="mt-4 form-outline">
            <label class="form-label w-100">
                Username:
                <input type="text" name="username" class="form-control " placeholder="Enter Username"/>
            </label>
        </div>
        <div class="mb-4 form-outline">
            <label class="form-label w-100">
                Password:
                <input type="password" name="password" class="form-control " placeholder="Enter Password"/>
            </label>
        </div>
        <button type = "submit" value = "Submit" class="btn bg-danger bg-gradient btn-block mb-4 w-100" style="--bs-bg-opacity: .25;"> Log In</button>
    </form>

<%@ include file="partials/footer.jsp"%>

<%--Bootstrap--%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

</body>
</html>
