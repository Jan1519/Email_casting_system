<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                <h1>reply</h1>
        
                
        <%
            response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");//HTTP 1.1
            response.setHeader("Pragma", "no-cache");//HTTP 1.0
            response.setHeader("Expires", "0");// for proxy

            if (session.getAttribute("username") != null) {
                String username = (String) session.getAttribute("username");
                //out.print("<font style='color:navy'>Welcome " + username + "</font>");
            } else {
                request.setAttribute("Error1", "Plz Do login First");
        %>
        
        <%}
        %>
        
        
        
        
        
        
        
    </body>
</html>
