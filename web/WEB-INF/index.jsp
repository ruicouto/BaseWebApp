<%-- 
    Document   : index
    Created on : Oct 25, 2017, 7:48:41 PM
    Author     : ruicouto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello, <%= request.getAttribute("username") %>!</h1>
        
        <form method="GET">
            Name:<input type="text" name="username"/>
            <input type="submit"/>
        </form>
    </body>
</html>
