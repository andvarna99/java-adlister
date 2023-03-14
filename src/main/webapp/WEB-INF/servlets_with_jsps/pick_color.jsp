<%--
  Created by IntelliJ IDEA.
  User: andreavarnado
  Date: 3/9/23
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
    <%--Bootstrap--%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

</head>
<body>
<form action="pickcolor" method="POST" class="container-fluid border shadow-lg">
    <div class="mb-3 ">
        <label  for="favoriteColor" class="form-label">Enter your favorite color: </label>
        <input name="favoriteColor" type="text" class="form-control" id="favoriteColor" >
    </div>
    <button type = "submit" value = "Submit" class="btn btn-block btn-primary w-100 p-2 mb-2"> Submit</button>

</form>
<%--Bootstrap--%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

</body>
</html>
