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
            <form:label path="email" cssClass="label">Email</form:label>
            <form:input path="email" />
            <input type="submit" value="Submit">
        </form:form>
    </body>
</html>