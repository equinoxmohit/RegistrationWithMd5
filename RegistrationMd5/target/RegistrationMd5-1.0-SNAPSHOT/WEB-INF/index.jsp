<%-- 
    Document   : index
    Created on : Sep 1, 2016, 6:41:53 PM
    Author     : Mohit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Either Register or Login:</h1>
        <a href="${pageContext.request.contextPath}/register">Register</a>
        
        <a href="${pageContext.request.contextPath}/login">Login</a>
    </body>
</html>
