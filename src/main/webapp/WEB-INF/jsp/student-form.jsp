<%--
  Created by IntelliJ IDEA.
  User: ioanniskatrimpouzas
  Date: 2019-08-17
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
<%--data binding is pulling information out of an object into another object or property--%>
<form:form action="processForm" modelAttribute="student">
    <div>
        <label for="firstName">FirstName:</label>
            <%--            Path is the property that we are binding te radio button--%>

        <form:input id="firstName" path="firstName" value="${student.firstName}"/>
    </div>
    <div>
        <label for="lastName">LastName:</label>
        <form:input id="lastName" path="lastName" placeHolder="lastName"/>
    </div>

    <div>
        <span>Country: </span>
            <form:select id="country" path="country">
                <form:options items="${countryOptions}"/>
            </form:select>
    </div>

<%--    <div>--%>
<%--        <span>Favourite Language: </span>--%>
<%--        <span>--%>
<%--            <form:radiobutton id="Java" path="FavouriteLanguage" value="Java"/>--%>
<%--            <label for="Java">Java</label>--%>
<%--        </span>--%>
<%--        <span>--%>
<%--            <form:radiobutton id="C#" path="FavouriteLanguage" value="C#"/>--%>
<%--            <label for="C#">C#</label>--%>
<%--        </span>--%>
<%--        <span>--%>
<%--            <form:radiobutton id="PHP" path="FavouriteLanguage" value="PHP"/>--%>
<%--            <label for="PHP">PHP</label>--%>
<%--        </span>--%>
<%--    </div>--%>

    <div class="languages">
        <span>Favourite Language: </span>
        <span>
<%--            It is auto generating labelsa--%>
            <form:radiobuttons  path="favouriteLanguage" items="${student.favouriteLanguages}"/>
        </span>
    </div>


    <div class="operating-systems ">
        <span>Operating Systems: </span>
        <span>
            <form:checkbox id="Linux" path="operatingSystems" value="Linux"/>
            <label for="Linux">Linux</label>
        </span>
        <span>
            <form:checkbox id="Mac" path="operatingSystems" value="Mac"/>
            <label for="Mac">Mac</label>
        </span>
        <span>
            <form:checkbox id="MAC-OS" path="operatingSystems" value="MAC OS"/>
            <label for="MAC-OS">MAC OS</label>
        </span>
    </div>

    <input type="submit" value="submit"/>
</form:form>

</body>
</html>
