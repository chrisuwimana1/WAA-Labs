<%--
  Created by IntelliJ IDEA.
  User: Christian
  Date: 5/1/2019
  Time: 7:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>

<head>
    <title>Advice</title>
</head>
<body>
<h2>Ask for advice about your favorite roast:</h2>
<p />
<form action = "advice.do" method="post">
    <select name="roast"   >

        <c:forEach var="roast" items="${roasts}">
            <option value="${roast.value}" > ${roast.key}</option>
        </c:forEach>

    </select>

    <p><input type="submit" value = "Submit"/></p>
</form>


</body>
</html>
