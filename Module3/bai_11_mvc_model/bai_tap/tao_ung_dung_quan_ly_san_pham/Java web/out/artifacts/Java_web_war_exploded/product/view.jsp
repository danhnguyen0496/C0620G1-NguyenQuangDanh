<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/28/2020
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/products">Back to customer list</a>
</p>
<table>
    <tr>
        <td>Name:</td>
        <td>${product.getName()}</td>
    </tr>
    <tr>
        <td>Price:</td>
        <td>${product.getPrice()}</td>
    </tr>
    <tr>
        <td>Description:</td>
        <td>${product.getDescription()}</td>
    </tr>
    <tr>
        <td>Manufacturer:</td>
        <td>${product.getManufacturer()}</td>
    </tr>
</table>
</body>
</html>
