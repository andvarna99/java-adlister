<%--
  Created by IntelliJ IDEA.
  User: andreavarnado
  Date: 3/9/23
  Time: 2:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Viewing</title>
    <%--Bootstrap--%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div>
    <c:choose>
        <c:when test="${message == 'correct'}">
            <h1 class="text-center">You Won!! Your number was: ${guessedNumber}</h1>
        </c:when>
        <c:otherwise>
            <h1 class="text-center">You Lost!! Your number was: ${guessedNumber}</h1>
            <h1 class="text-center">The correct number was: ${randomNumber}</h1>
        </c:otherwise>
    </c:choose>
</div>

<%--Bootstrap--%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

</body>
</html>
