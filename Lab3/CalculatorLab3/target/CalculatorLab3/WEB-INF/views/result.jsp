<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Result Page</title>
</head>

<body>
<h2>Result Page</h2>
<form  >
    <input name="num1" type="text" size = "2" readonly value="${calculator.num1}"/>+
    <input name="num2" type="text" size = "2" readonly value="${calculator.num2}"/>=
    <input name="sum" type="text" size = "4"  readonly value="${calculator.sum}"/>
    <br>
    <input name="num3" type="text" size = "2" readonly   value="${calculator.num3}"/>*
    <input name="num4" type="text" size = "2" readonly   value="${calculator.num4}"/>=
    <input name="product" type="text" size = "4" readonly value="${calculator.product}"/>
    <br>
    <button type=button onclick=window.location.href="calculator">Back</button>
</form>
</body>

</html>