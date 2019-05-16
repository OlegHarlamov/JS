<%-- 
    Document   : listBooks
    Created on : May 9, 2019, 7:20:52 PM
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Список читателей библиотеки</title>
    </head>
    <body>
        <h1>Читатели:</h1>
        <c:forEach var="reader" items="${listReaders}">
            <p>${reader}</p>
        </c:forEach>
    </body>
</html>
