<!DOCTYPE html>
<html>
    <head>
        <title>Hello, World!</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/helloworld.css">
    </head>
    <body>
        <h2>${message}</h2>
        <h2>Your first name: ${firstName}</h2>
        <p>
            <img src="${pageContext.request.contextPath}/resources/images/vandelay.jpg">
        </p>
    </body>
</html>