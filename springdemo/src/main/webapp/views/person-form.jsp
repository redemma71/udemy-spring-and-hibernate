<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Person Form</title>
    </head>
    <body>
        <h2>Person Form</h2>


        <form:form action="processForm" modelAttribute="person">
            <form:label path="firstName">First Name</form:label><br>
            <form:input path="firstName" title="Arthur"/><br/>
            <form:label path="lastName">Last Name</form:label><br>
            <form:input path="lastName" /><br/>
            <form:label path="lastName">Your favorite football team</form:label><br>
            <!-- text dropdown -->
            <form:select path="footballTeam">
<%--                <form:option value="Cleveland Browns" label="Cleveland Browns" />--%>
<%--                <form:option value="Baltimore Ravens" label="Baltimore Ravens" />--%>
<%--                <form:option value="Pittsburgh Steelers" label="Pittsburgh Steelers" />--%>
<%--                <form:option value="Cincinnati Bengals" label="Cincinnati Bengals" />--%>
                <!-- from the hash map in Person -->
<%--                <form:options items="${person.footballTeamsMap}" />--%>
                <form:options items="#{footballTeams}" />
            </form:select><br/><br/>
            <!-- radio buttons-->
            Your favorite language:<br/>
            <form:label path="favoriteLanguage" for="Java">Java</form:label>
            <form:radiobutton path="favoriteLanguage" value="Java"/><br/>
            <form:label path="favoriteLanguage" for="Javascript">Javascript</form:label>
            <form:radiobutton path="favoriteLanguage" value="Javascript"/><br/>
            <form:label path="favoriteLanguage" for="Python">Python</form:label>
            <form:radiobutton path="favoriteLanguage" value="Python"/><br/>
            <form:label path="favoriteLanguage" for="XQuery">XQuery</form:label>
            <form:radiobutton path="favoriteLanguage" value="XQuery"/><br/>
            <input type="submit">
        </form:form>
    </body>
</html>