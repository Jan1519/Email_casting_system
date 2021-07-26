package com.admin;

import java.io.IOException;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet(name = "DeleteServlet", urlPatterns = {"/DeleteServlet"}) 
public class DeleteServlet extends HttpServlet {  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {  
        int Id = Integer.parseInt(request.getParameter("Id"));
        EmpDao.delete(Id);  
        response.sendRedirect("ViewServlet");  
    }  
}  
