<%-- 
    Document   : register
    Created on : Nov 29, 2020, 3:17:44 PM
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
        <!--5grid--><script src="css/5grid/viewport.js"></script><!--[if lt IE 9]><script src="css/5grid/ie.js"></script><![endif]--><link rel="stylesheet" href="css/5grid/core.css" />
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

        <br><br><br><br>
        <%
            if (request.getAttribute("registererror") != null) {
                String registererror = (String) request.getAttribute("registererror");
                out.print("<font style='color:red'>" + registererror + "</font>");
            }%>
        <form method="post" action="/Email_Casting/validFilter">
            <center>
                <table>
                    <thead>
                    <caption><h2>Register Here</h2></caption>
                    </thead>
                    <tbody>
                        <tr>
                            <th>Id</th> <td> : </td> 
                            <td><input type="text" placeholder="Enter Id" name="Id" id="Id" size="30"  value="<%
                                String Id = (String) request.getParameter("Id");
                                if (Id != null) {
                                    out.print(Id);
                                }
                                 %>" /></td>
                            <td><%String IdMSG = (String) request.getAttribute("IdMSG");
                                if (IdMSG != null) {
                                    out.print(IdMSG);
                                }
                                %>
                            </td>
                        </tr>
                        
                        <tr>
                            <th>Name</th> <td> : </td> 
                            <td><input type="text" placeholder="Enter Name" name="Name" id="Name" size="30"  value="<%
                                String Name = (String) request.getParameter("Name");
                                if (Name != null) {
                                    out.print(Name);
                                }
                                 %>" /></td>
                            <td><%String NameMSG = (String) request.getAttribute("NameMSG");
                                if (NameMSG != null) {
                                    out.print(NameMSG);
                                }
                                %>
                            </td>
                        </tr>
                        
                        <tr>
                            <th>Email</th> <td> : </td>
                            <td><input type="text" placeholder="Enter Email" name="Email" id="Email" size="30" value="<%
                                String Email = (String) request.getParameter("Email");
                                if (Email != null) {
                                    out.print(Email);
                                }

                                       %>" /></td>
                            <td><% String EmailMSG1 = (String) request.getAttribute("EmailMSG1");
                                String EmailMSG2 = (String) request.getAttribute("EmailMSG2");
                                if (EmailMSG1 != null) {
                                    out.print(EmailMSG1);
                                }
                                if (EmailMSG2 != null) {
                                    out.print(EmailMSG2);
                                }
                                %>


                        </tr>
                        <tr>
                            <th>Password</th> <td> : </td>
                            <td><input type="password"  placeholder="Enter your gmail password" name="Password" id="Password" size="30" value="<%
                                String Password = (String) request.getParameter("Password");
                                if (Password != null) {
                                    out.print(Password);
                                }

                                       %>" /></td>
                            <td><%                                String PasswordMSG = (String) request.getAttribute("passMSG");
                                if (PasswordMSG != null) {
                                    out.print(PasswordMSG);
                                }

                                %>

                            </td>
                        </tr>
                        <tr>
                            <th>Country</th> <td> : </td>
                            <td><select name="Country" style="width:250px;">  
                            <option>India</option>  
                            <option>USA</option>  
                            <option>UK</option>  
                            <option>Other</option>  
                            </select> 
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                            <td><input type="submit" value="Register" name="register" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
                            <input type="reset" value="Reset"></td>
                        </tr>
                        <tr>
                            <th colspan="3" align="left">Already Registered!! <a href="login.jsp">Login Here</a></th>
                        </tr>
                    </tbody>
                </table>
            </center>
        </form>
    </body>
</html>
