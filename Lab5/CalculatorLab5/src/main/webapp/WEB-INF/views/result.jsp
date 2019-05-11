<%--
  Created by IntelliJ IDEA.
  User: Christian
  Date: 5/5/2019
  Time: 12:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="resources/mystyle.css">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Result</title>
</head>
<body>

<h2>Good job - "${param.heading}"</h2>

<h4>Result</h4>
<form action="calculator" method="get" >
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
