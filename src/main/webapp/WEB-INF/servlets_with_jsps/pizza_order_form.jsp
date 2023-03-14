<%--
  Created by IntelliJ IDEA.
  User: andreavarnado
  Date: 3/9/23
  Time: 10:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order Form</title>
  <%--Bootstrap--%>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

</head>
<body>

<h1 class="text-center">Pizza Order Form</h1>
<form action="/pizza-order" method="POST" class="container-fluid border shadow-lg">

    <div class="form-outline container-fluid  mx-auto">
        <label class="form-label w-100 p-2">
            <h6>Address:</h6> <input type="text" name="address" class="form-control" placeholder="Enter Address"/>
        </label>
    </div>

    <div class="container-fluid ">
        <select class="form-select p-2 mb-2" name="crustType">
            <option selected>Select Crust Type</option>
            <option value="thin">Thin</option>
            <option value="regular">Regular</option>
            <option value="deepDish">Deep-dish</option>
        </select>
        <select class="form-select p-2 mb-2" name="sauceType">
            <option selected>Select Sauce Type</option>
            <option value="tomato">Tomato</option>
            <option value="garlicAndOil">Garlic and Oil</option>
            <option value="alfredo">Alfredo</option>
        </select>
        <select class="form-select p-2 mb-2" name="sizeType">
            <option selected>Select Size Type</option>
            <option value="sm">Small</option>
            <option value="med">Medium</option>
            <option value="lg">Large</option>
        </select>
    </div>

    <div class="container-fluid p-2">
        <h6>Toppings:</h6>
        <div class="form-check">
            <input class="form-check-input" type="checkbox" id="topping1" name="toppings" value="cheese" checked>
            <label class="form-check-label" for="topping1">Cheese</label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="checkbox" id="topping2" name="toppings" value="pepperoni">
            <label class="form-check-label" for="topping2">Pepperoni</label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="checkbox" id="topping3" name="toppings" value="sausage">
            <label class="form-check-label" for="topping3">Sausage</label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="checkbox" id="topping4" name="toppings" value="bacon">
            <label class="form-check-label" for="topping4">Bacon</label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="checkbox" id="topping5" name="toppings" value="avocado">
            <label class="form-check-label" for="topping5">Avocado</label>
        </div>
    </div>

    <button type = "submit" value = "Submit" class="btn btn-block btn-primary w-100 p-2 mb-2"> Submit</button>
</form>

<%--Bootstrap--%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

</body>
</html>
