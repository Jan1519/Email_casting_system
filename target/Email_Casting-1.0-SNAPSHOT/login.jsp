<%-- 
    Document   : login
    Created on : Nov 29, 2020, 2:51:26 PM
    Author     : Janki Singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Mail Services</title>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <meta name="description" content="" />
        <meta name="keywords" content="" />
        <!--5grid-->
        
        <script src="css/5grid/viewport.js"></script>
        <!--[if lt IE 9]><script src="css/5grid/ie.js"></script><![endif]-->
        <link rel="stylesheet" href="css/5grid/core.css" />
        <link rel="stylesheet" href="css/style.css" />
        <!--[if IE 9]><link rel="stylesheet" href="css/style-ie9.css" /><![endif]-->
    </head>
    <body>
        <!-- ********************************************************* -->
        <div id="header-wrapper">
            <div class="5grid">
                <div class="12u-first">
                    <header id="header">
                        <h1><a href="#">Welcome to mail services</a></h1>
                    </header>
                </div>
            </div>
        </div>

        <div id="main">
            <div class="5grid">
                <div class="main-row">

                    <div class="4u-first">

                        <section>
                                <li>
                                    <span>
                                        <h2> Login or Signup</h2><br>
                                        <div>
                                            <%
                                            if (request.getAttribute("alreadyregister") != null) {
                                                String alreadyregister = (String) request.getAttribute("alreadyregister");
                                                out.print("<font style='color:red'>" + alreadyregister + "</font>");
                                            }
                                            if (request.getAttribute("register") != null) {
                                                String register = (String) request.getAttribute("register");
                                                out.print("<font style='color:red'>" + register + "</font>");
                                            }

                                            if (request.getAttribute("Error1") != null) {
                                                System.out.print(request.getAttribute("Error1"));
                                                String Error1 = (String) request.getAttribute("Error1");
                                                out.print("<font style='color:red'>" + Error1 + "</font>");

                                            }
                                            if (request.getAttribute("logout") != null) {
                                                System.out.print(request.getAttribute("logout"));
                                                String logout = (String) request.getAttribute("logout");
                                                out.print("<font style='color:navy'>" + logout + "</font>");
                                            }
                                            %>

                                            <form action="/Email_Casting/LoginServlet" method="post">
                                                <table style="table-layout: fixed">
                                                    <tr><td>Email id </td><td> : </td><td> <input type="text" name="Email"></br><br></td></tr>
                                                    <tr><td>Password </td><td> : </td><td> <input type="password" name="Pass"><br><br></td></tr>
                                                    <tr><td colspan="2"></td><td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    <input type="submit" value="Sign in">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
                                                    <a href="register.jsp">Signup</a> </td></tr>
                                                </table>
                                            </form>
                                    </span>
                                </li>
                            </ul>
                        </section>
                    </div>
                    <div class="4u">
                        <section>
                        </section>
                    </div>
                    <div class="4u">
                        <section>
                            <h2>How to use it?</h2>
                            <div class="6u-first">
                                <ul class="link-list">
                                    <li>First create an account with G-mail Account</li>
                                    <li>After that, you login and enjoy G-mail service</li>
                                    <li>In a new way.</li>  
                                </ul>
                            </div>
                        </section>
                    </div>
                </div>
            </div>
        </div>                                
                                            admin login here <a href="adminlogin.jsp">Click</a>
    </body>
    
</html>
