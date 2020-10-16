<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/15/2020
  Time: 3:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Information</title>
</head>
<body>
<p>Language: ${letter.language}</p>
<p>Signature: ${letter.signature}</p>
<p>PageSize: ${letter.pageSize}</p>
<p>Spam Filter: ${letter.spamFilter}</p>
<button><a href="/letter">Back</a></button>
</body>
</html>
