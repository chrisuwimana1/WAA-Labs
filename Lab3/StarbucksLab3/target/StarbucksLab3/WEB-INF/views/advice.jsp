<%--
  Created by IntelliJ IDEA.
  User: Christian
  Date: 5/4/2019
  Time: 5:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored = "false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Advice</title>
</head>
<body>

<h2>Ask for advice about your favorite roast:</h2>
<p />
<form action = "advice" method="post">
    <select name="roastKey"   >
        <option value="-">  --Select Roast-- </option>

        <c:forEach var="roast" items="${roasts}">
            <option value="${roast.key}" > ${roast.value}</option>
        </c:forEach>
    </select>

    <p><input type="submit" value = "Submit"/></p>
</form>

</body>
</html>
