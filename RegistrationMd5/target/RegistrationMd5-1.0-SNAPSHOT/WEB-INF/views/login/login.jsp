<%-- 
    Document   : login
    Created on : Sep 1, 2016, 6:00:47 PM
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

        <h1 style="font-family: cursive">Login</h1>
        <div>
            <form method="post" action=""  style="font-family: sans-serif">
                <div>
                    <label>Username:</label>
                    <input type="text" name="username" required="required" style="width: 100%">
                </div>
                <br>
                <br>
                <div>
                    <label>Password:</label>
                    <input type="password" name="pass1" id="password"  required="required" style="width: 100%">
                </div>
                <br>
                <div>
                    <button >Login</button>
                    <a href="${pageContext.request.contextPath}/forget">Forgot Password</a>
                </div>
            </form>
        </div>

    </body>
</html>
