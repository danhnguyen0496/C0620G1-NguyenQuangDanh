<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/24/2020
  Time: 11:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form action="/product-discount-calculator" method="post">
    <p>Mô tả của sản phẩm</p>
    <input type="text" name="droduct_description" placeholder="Product Description">
    <p>Giá niêm yết của sản phẩm</p>
    <input type="text" name="list_price" placeholder="List Price">
    <p>Tỷ lệ chiết khấu (phần trăm)</p>
    <input type="text" name="discount_percent" placeholder="Discount Percent">
    <input type="submit" value="Calculate Discount">
  </form>
  </body>
</html>
