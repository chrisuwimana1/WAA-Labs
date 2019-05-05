<%--
  Created by IntelliJ IDEA.
  User: Christian
  Date: 5/5/2019
  Time: 9:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../../resources/mystyle.css">
    <title>Calculator</title>
</head>
<body>
<form action='calculator' method='post'>
    <input name= "num1" type = "text" size = "2"/> + <input name="num2" type = "text" size = "2"/> = <input type = "text" name="sum" size = "4" readonly/>
    <br>
    <input name="num3" type = "text" size = "2"/> * <input name="num4" type = "text" size = "2"/> = <input type = "text" name="product" size = "4" readonly />
    <br>
    <input type="submit" value="Submit" />
</form>
</body>
</html>

