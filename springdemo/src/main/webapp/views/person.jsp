<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Wassup Person!</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/helloworld.css">
    </head>
    <body>
        <h2>Your first name: ${person.firstName}</h2>
        <h2>Your last name: ${person.lastName}</h2>
        <h2>Your football team: ${person.footballTeam}</h2>
        <h2>Your favorite lanugage: ${person.favoriteLanguage}</h2>
        <h2>Your operating system(s):</h2>
        <ul>
            <c:forEach var="os" items="${person.operatingSystems}">
                <li>${os}</li>
            </c:forEach>
        </ul>
        <p>
            <img src="${pageContext.request.contextPath}/resources/images/vandelay.jpg">
        </p>
    </body>
</html>