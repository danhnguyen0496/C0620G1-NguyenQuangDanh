<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/14/2020
  Time: 4:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>

<strong><h3>Calculator</h3></strong>

<form action="/calculator" method="post">
    <input type="text" name="number1" value="${number1}"/>
    <input type="text" name="number2" value="${number2}"/>
    <br><br>
    <button value="+" id="addition" name="operator" onclick="operator()" >Addition</button>
    <button value="-" id="subtraction" name="operator" onclick="operator()">Subtraction</button>
    <button value="*" id="multiplication" name="operator" onclick="operator()">Multiplication</button>
    <button value="/" id="division" name="operator" onclick="operator()">Division</button>

    <strong><h3>Result Calculator</h3></strong>
    ${result}
</form>

<script>
    function operator() {
        document.getElementById("addition").value = "+";
        document.getElementById("subtraction").value = "-";
        document.getElementById("multiplication").value = "*";
        document.getElementById("division").value = "/";
    }
</script>
</body>
</html>
