<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/13/2020
  Time: 4:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Convert</title>
</head>
<body>
<strong><h3>Currency Convert</h3></strong>

<form action="/currencyConvert">
    <label><b>USD</b></label>

    <label>
        <input type="text" placeholder="usd" name="usd"/>
    </label>

    <label><b>Rates</b></label>

    <label>
        <input type="text" placeholder="rate" name="rate"/>
    </label>
    <input type="submit" value="Convert">
</form>
</body>
</html>
