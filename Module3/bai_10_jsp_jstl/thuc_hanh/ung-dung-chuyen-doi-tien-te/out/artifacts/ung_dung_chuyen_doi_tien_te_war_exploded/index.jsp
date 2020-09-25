<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/25/2020
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Ứng dụng chuyển đổi tiền tệ - JSP</title>
  </head>
  <body>
  <form action="/convert" method="post">
    <h4>Currency Converter</h4>

    <label>Rate</label>
    <label>
      <input type="text" placeholder="Rate" name="rate">
    </label>

    <label>USD</label>
    <label>
      <input type="text" placeholder="Usd" name="number">
    </label>

    <input type="submit" value="Converts">
  </form>
  </body>
</html>
