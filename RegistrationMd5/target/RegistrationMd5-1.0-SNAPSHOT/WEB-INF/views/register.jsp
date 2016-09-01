
<%@page import="com.mohit.program.dao.impl.RegisterDaoImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="registerDao" class="com.mohit.program.dao.impl.RegisterDaoImpl"></jsp:useBean>
    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link href="../assets/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
            <link href="../assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
            <script src="../assets/javascript/jquery.min.js" type="text/javascript"></script>
            <script src="../assets/js/bootstrap.min.js" type="text/javascript"></script>
            <title>JSP Page</title>
        </head>
        <body>

            <h1 style="font-family: cursive">Register</h1>
            <div>
                <form method="post" action=""  style="font-family: sans-serif">
                    <div>
                        <label>Username:</label>
                        <input type="text" name="username" required="required" style="width: 100%">
                    </div>
                    <br>
                    <div>
                        <label>Email:</label>
                        <input type="email" name="email" required="required" style="width: 100%">
                    </div>
                    <br>
                    <div>
                        <label>Password:</label>
                        <input type="password" name="pass1" id="pass1"  required="required" style="width: 100%">
                    </div>
                    <br>
                    <div>
                        <label>Confirm Password:</label>
                        <input type="password" name="pass2" id="pass2" onkeyup="checkPass();
                                return false;"  required="required" style="width: 100%">
                        <span id="confirmMessage" class="confirmMessage"></span>
                    </div>
                    <div>
                        <br>
                        <button >Register</button>
                    <a href="${pageContext.request.contextPath}/login">Login</a>
                </div>

            </form>
        </div>


        <script>
            function checkPass()
            {
                var pass1 = document.getElementById('pass1');
                var pass2 = document.getElementById('pass2');
                var message = document.getElementById('confirmMessage');
                var goodColor = "#66cc66";
                var badColor = "#ff6666";
                if (pass1.value == pass2.value) {
                    pass2.style.backgroundColor = goodColor;
                    message.style.color = goodColor;
                    message.innerHTML = "Passwords Match!"
                } else {
                    pass2.style.backgroundColor = badColor;
                    message.style.color = badColor;
                    message.innerHTML = "Passwords Do Not Match!"
                }
            };
           
        </script>
    </body>
</html>
