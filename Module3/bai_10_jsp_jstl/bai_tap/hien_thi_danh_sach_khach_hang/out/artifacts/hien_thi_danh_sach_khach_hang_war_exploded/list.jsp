<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/25/2020
  Time: 3:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer</title>
    <style>
        .table {
            position: relative;
            left: 250px;
        }

        tr td {
            text-align: center;
        }

        td {
            width: 200px;
        }
    </style>
</head>
<body>
<h2 style="text-align: center"><strong>List customer</strong></h2>
<table class="table" style="text-align: center">
    <tr>
        <th>Name</th>
        <th>Birthday</th>
        <th>Address</th>
        <th>Image</th>
    </tr>
    <jsp:useBean id="listCustomer" scope="request" type="java.util.List"/>
    <c:forEach var="customer" items="${listCustomer}">
        <tr>
            <td colspan="4">
                <hr>
            </td>
        </tr>
        <tr>
            <td>${customer.name}</td>
            <td>${customer.birthday}</td>
            <td>${customer.address}</td>
            <td><img src="${customer.image}" style="width: 200px; height: 180px"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
