<%--
  Created by IntelliJ IDEA.
  User: Christian
  Date: 5/3/2019
  Time: 9:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>

<form action='calculator' method='post'>
    <input name="num1"> + <input name="num2"> = <input name="sum" readonly>
    <br>
    <input name="num3"> * <input name="num4"> = <input name="product" readonly>
    <br>
    <input type="submit" value="Submit" >
</form>
</body>
</html>
