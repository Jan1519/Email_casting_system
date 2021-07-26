<%-- 
    Document   : adminlogin
    Created on : Nov 29, 2020, 3:04:47 PM
    Author     : Janki Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <meta name="description" content="" />
        <meta name="keywords" content="" />
        <!--5grid--><script src="css/5grid/viewport.js"></script><!--[if lt IE 9]><script src="css/5grid/ie.js"></script><![endif]--><link rel="stylesheet" href="css/5grid/core.css" />
        <link rel="stylesheet" href="css/style.css" />
    </head>
    <body>
        <center><br><br><br><br>
            <h2> Admin Login</h2><br><br><br>
            <form action="Adminlogin" method="post">

                <table style="table-layout: fixed">

                    <tr><td>Email id </td><td> : </td><td> <input type="text" name="username"></br><br></td></tr>
                    <tr><td>Password </td><td> : </td><td> <input type="password" name="password"><br><br></td></tr>
                    <tr><td></td><td></td><td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="submit" value="Sign in"></td></tr>
                </table>
            </form>
        </center>
    Candidant login here <a href="login.jsp">Click</a>
    </body>
</html>
