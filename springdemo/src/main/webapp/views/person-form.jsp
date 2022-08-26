<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Person Form</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/springmvcdemo.css">
    </head>
    <body>
        <h2>Person Registration Form</h2>
        <p>Please fill out the form. <em>Fields with asterisks (*) are required.</em></p>
        <form:form action="processForm" modelAttribute="person">
            <form:label path="firstName" cssClass="label">First Name</form:label>
            <form:input path="firstName" title="Arthur"/><br />
            <form:label path="lastName" cssClass="label">Last Name (*)</form:label>
            <form:input path="lastName" />
            <form:errors path="lastName" cssClass="errors" /><br />
            <form:label path="age" cssClass="label">Age (*)</form:label>
            <form:input path="age" />
            <form:errors path="age" cssClass="errors" /><br />
            <form:label path="zipCode" cssClass="label">Zip Code (*)</form:label>
            <form:input path="zipCode" />
            <form:errors path="zipCode" cssClass="errors" /><br />
            <form:label path="courseCode" cssClass="label">Course Code (*)</form:label>
            <form:input path="courseCode" />
            <form:errors path="courseCode" cssClass="errors" /><br />
            <input type="submit" value="Submit">
        </form:form>
    </body>
</html>