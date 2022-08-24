<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Person Form</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/springmvcdemo.css">
    </head>
    <body>
        <h2>Person Form</h2>
        <p>Please fill out the form. <em>Fields with asterisks (*) are required.</em></p>
        <form:form action="processForm" modelAttribute="person">
            <form:label path="firstName">First Name</form:label><br>
            <form:input path="firstName" title="Arthur"/><br/>
            <form:label path="lastName">Last Name (*)</form:label><br>
            <form:input path="lastName" />
            <form:errors path="lastName" cssClass="errors" /><br/>
            <input type="submit" value="Submit">
        </form:form>
    </body>
</html>