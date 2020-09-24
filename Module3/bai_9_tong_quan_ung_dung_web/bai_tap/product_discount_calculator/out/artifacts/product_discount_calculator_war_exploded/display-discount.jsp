<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/24/2020
  Time: 11:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<strong>Product Description: </strong>
<p><%=request.getAttribute("result_description")%></p>

<strong>List Price: </strong>
<p><%=request.getAttribute("result_price")%></p>

<strong>Discount Percen: </strong>
<p><%=request.getAttribute("result_discount_percent")%></p>

<strong>Discount Amount: </strong>
<p><%=request.getAttribute("result_discount_amount")%></p>

<strong>Discount Price: </strong>
<p><%=request.getAttribute("result_price_stage")%></p>
</body>
</html>
