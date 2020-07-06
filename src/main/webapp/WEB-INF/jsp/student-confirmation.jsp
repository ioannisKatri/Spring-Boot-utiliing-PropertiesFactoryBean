<%--
  Created by IntelliJ IDEA.
  User: ioanniskatrimpouzas
  Date: 2019-08-17
  Time: 23:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Sstudent Confirmation</title>
</head>
<body>


<p>The student is confirmed ${student.firstName} ${student.lastName} and your country is ${student.country}</p>

<p>Studens favourite language is ${student.favouriteLanguage}</p>

<p><b>Operating systems has experienced: </b></p>
<ul>
    <c:forEach var="temp"  items="${student.operatingSystems}">
    <li>${temp}</li>
    </c:forEach>
</ul>
</body>
</html>
