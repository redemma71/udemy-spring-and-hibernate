<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Customer Form</title>
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <h2>CRM - Customer Relation Manager</h2>
            </div>
        </div>
        <div id="container">
            <h3>Save Customer</h3>
            <form:form action="saveCustomer" modelAttribute="customer" method="POST">
                <form:hidden path="id" />
                <table>
                    <tbody>
                        <tr>
                            <td><label for="firstNameField">First name:</label></td>
                            <td><form:input path="firstName" id="firstNameField" /></td>
                        </tr>
                        <tr>
                            <td><label for="lastNameField">Last name:</label></td>
                            <td><form:input path="lastName" id="lastNameField" /></td>
                        </tr>
                        <tr>
                            <td><label for="emailField">Email:</label></td>
                            <td><form:input path="email" id="emailField"/></td>
                        </tr>
                        <tr>
                            <td><label for="saveButton"></label></td>
                            <td><input type="submit" value="Save" class="save" id="saveButton"></td>
                        </tr>
                    </tbody>
                </table>
                <div style="clear;both;">
                    <p><a href="${pageContext.request.contextPath}/customer/list">Back to List</a></p>
                </div>
            </form:form>
        </div>
    </body>
</html>









