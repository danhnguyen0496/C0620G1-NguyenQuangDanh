<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/13/2020
  Time: 4:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary Page</title>
</head>
<body>
<form action="/resultTranslate">
    <h4 style="color: darkblue"><strong>Enter the word</strong></h4>
    <label>
        <input type="text" placeholder="enter the word" name="word"/>
    </label>
    <input type="submit" value="Search"/>
</form>
</body>
</html>
