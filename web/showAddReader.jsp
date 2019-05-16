<%-- 
    Document   : showAddBook
    Created on : May 9, 2019, 2:49:58 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Добавление читателя</title>
    </head>
    <body>
        <h1>Новый чититель</h1>
      
        <form action="createReader" method="POST">
            Имя читателя:<br>
            <input type="text" name="name"><br>
            Фамилия читателя:<br>
            <input type="text" name="surname"><br>
            Телефон:<br>
            <input type="text" name="phone"><br>
            
            <input type="submit" value="Добавить">
        </form>        
    </body>
</html>
