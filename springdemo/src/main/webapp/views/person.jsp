<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Wassup Person!</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/springmvcdemo.css">
    </head>
    <body>
        <h2>Your first name: ${person.firstName}</h2>
        <h2>Your last name: ${person.lastName}</h2>
        <h2>Your age: ${person.age}</h2>
        <h2>Your Zip Code: ${person.zipCode}</h2>
        <h2>Your Course Code: ${person.courseCode}</h2>
        <p>
            <img src="${pageContext.request.contextPath}/resources/images/vandelay.jpg">
        </p>
    </body>
</html>