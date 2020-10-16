<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/15/2020
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Letter Home</title>
</head>
<body>

<h2>Setting</h2>

<form:form action="/showInformation" method="get" modelAttribute="letter">
    <label>Languages</label>
    <form:select path="language">
        <option>English</option>
        <option>Vietnamese</option>
        <option>Japanese</option>
        <option>Chinese</option>
    </form:select>

    <br>
    <br>

    <label>Page size: </label>
    <label>Show</label>

    <form:select path="pageSize">
        <option>5</option>
        <option>10</option>
        <option>15</option>
        <option>25</option>
        <option>50</option>
        <option>100</option>
    </form:select>
    <span>emails per page</span>
    <br>
    <br>

    <label>Spam filter:</label>
    <form:checkbox path="spamFilter" value="Enable Spam Filter" /> <span> Enable spams filter</span>
    <br>
    <br>

    <label>Signature</label>
    <form:textarea path="signature" rows="3" cols="20" placeholder="Thor King, Asgard"/>
    <br>
    <br>

    <input type="submit" name="update" value="Update"/>
    <input type="submit" name="cancel" value="Cancel"/>
</form:form>
</body>
</html>
