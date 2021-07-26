package com.admin;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  

@WebServlet(name = "Adminlogin", urlPatterns = {"/Adminlogin"})  
public class Adminlogin extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        request.getRequestDispatcher("/manageUserAdmin.jsp").include(request, response);  
          
        String username=request.getParameter("username");  
        String password=request.getParameter("password");  
          
        if(username.equals("jankisu1@gmail.com") && password.equals("1234")){  
        out.print("Welcome, "+username);  
        HttpSession session=request.getSession();  
        session.setAttribute("name",username);  
        }  
        else{  
            out.print("Sorry, username or password error!");  
            request.getRequestDispatcher("adminlogin.jsp").include(request, response);  
        }  
        out.close();  
    }  
}  