<%--
  Created by IntelliJ IDEA.
  User: Christian
  Date: 5/4/2019
  Time: 5:15 PM
  To cha
  nge this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored = "false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Starbuck's ${roast} Roast Coffees:</h2>
<form action="advice" method="get">

    <table >
        <c:forEach var="coffee" items="${roastList}" varStatus="status">

            <c:choose>
                <c:when test="${(status.index)%2 eq 0}">
                    <tr style="background-color:cyan">
                </c:when>
                <c:otherwise>
                    <tr style="background-color:yellow">
                </c:otherwise>
            </c:choose>
            <td>${coffee}</td>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="Back">
</form>

</body>
</html>
