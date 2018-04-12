<%--
  Created by IntelliJ IDEA.
  User: wuyiyong
  Date: 2018/3/27
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="name" items="${list}">
    <c:out value="${name.id}" />
    <c:out value="${name.name}" />
    <br>
</c:forEach>
</body>
</html>
