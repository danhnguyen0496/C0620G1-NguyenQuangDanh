<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/14/2020
  Time: 3:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>Sandwich Condiments</title>
  </head>
  <body>

  <h4>Sandwich Condiments</h4>

  <form action="/save">
    <input type="checkbox" name="condiments" value="Lettuce"/> Lettuce
    <input type="checkbox" name="condiments" value="Tomato"/> Tomato
    <input type="checkbox" name="condiments" value="Mustard"/> Mustard
    <input type="checkbox" name="condiments" value="Sprouts"/> Sprouts
    <input type="submit" value="Save"/>
  </form>

  </body>
</html>
