<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/14/2020
  Time: 4:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Condiments</title>
</head>
<body>

<h4>List Condiments</h4>

<%--${result}--%>

<c:forEach var="condiment" items="${condiments}">
    <c:out value="${condiment  }"></c:out>
</c:forEach>

</body>
</html>
