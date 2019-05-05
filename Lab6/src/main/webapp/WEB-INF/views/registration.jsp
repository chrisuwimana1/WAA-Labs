<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="<c:url value="/resources/css/main.css"/>">
    <title>Registration</title>
</head>
<body>

<h1>Registration Form</h1><br />

<form:form modelAttribute="student" action="registration" method="POST">
    <p>
        <form:errors path="*" cssStyle="color : red;" />
    </p>
    <p>
        <label for="firstname">First Name: </label>
        <form:input path="firstName" id="firstname"/>
    </p>
    <div style="text-align: center;">
        <form:errors path="firstName" cssStyle="color : red;" />
    </div>
    <p>
        <label for="lastname">Last Name: </label>
        <form:input path="lastName" id="lastname"/>
    </p>
    <div style="text-align: center;">
        <form:errors path="lastName" cssStyle="color : red;" />
    </div>
    <p>
        <label for="email">Email: </label>
        <form:input path="email" id="email"/>
    </p>
    <div style="text-align: center;">
        <form:errors path="email" cssStyle="color : red;" />
    </div>
    <p>
        <label for="date">Birth date: </label>
        <form:input path="birthday" id="date"/>
    </p>
    <div style="text-align: center;">
        <form:errors path="birthday" cssStyle="color : red;" />
    </div>
    <p>
        <label for="phone">Phone: </label>
        <form:input path="phone.area" id="phone"/>
        <form:input path="phone.prefix" id="phone"/>
        <form:input path="phone.number" id="phone"/>
    </p>
    <div style="text-align: center;">
        <form:errors path="phone" cssStyle="color : red;" />
    </div>
    <p id="buttons">
        <input id="submit" type="submit" value="Save Info">
    </p>
</form:form>
</body>
</html>


