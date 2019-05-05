<%--
  Created by IntelliJ IDEA.
  User: Christian
  Date: 5/3/2019
  Time: 9:43 AM
  To change this template use File | Settings | File Templates.
--%>

<%--<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>--%>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action='calculator' method='post'>
    <input name= "num1" type = "text"/> + <input name="num2" type = "text"/> = <input type = "text" name="sum" />
    <br>
    <input name="num3" type = "text"/> * <input name="num4" type = "text"/> = <input type = "text" name="product" />
    <br>
    <input type="submit" value="Submit" />
</form>
</body>
</html>
