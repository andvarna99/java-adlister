<%--
  Created by IntelliJ IDEA.
  User: andreavarnado
  Date: 3/13/23
  Time: 11:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<%--  <jsp:include page="/partials/header.jsp">--%>
<%--    <jsp:param name="title" value="Create a new Ad" />--%>
<%--  </jsp:include>--%>
  <title>Create</title>
  <%--Bootstrap--%>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

</head>
<body>
<div class="container">
  <h1>Create a new Ad</h1>
  <form action="/ads/create" method="post">
    <div class="form-group">
      <label for="title">Title</label>
      <input id="title" name="title" class="form-control" type="text">
    </div>
    <div class="form-group">
      <label for="description">Description</label>
      <textarea id="description" name="description" class="form-control" type="text"></textarea>
    </div>
    <input type="submit" class="btn btn-block btn-primary">
  </form>
</div>

<%--Bootstrap--%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

</body>
</html>
