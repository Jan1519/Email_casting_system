package com.admin;
import java.io.IOException;  
import java.io.PrintWriter;   
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet(name = "SaveServlet", urlPatterns = {"/SaveServlet"})  
public class SaveServlet extends HttpServlet {  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
        int Id=Integer.parseInt(request.getParameter("Id"));
        String Name=request.getParameter("Name");  
        String Email=request.getParameter("Email");  
        String Password=request.getParameter("Password"); 
        String Country=request.getParameter("Country"); 
          
        Emp e=new Emp();
        e.setId(Id);
        e.setName(Name);  
        e.setEmail(Email); 
        e.setPassword(Password);  
        e.setCountry(Country);
          
        int status=EmpDao.save(e);  
        if(status>0){  
            out.print("<p><b style='color:green'>Record saved successfully!</p>");  
            request.getRequestDispatcher("/manageUserAdmin.jsp").include(request, response);  
        }else{  
            out.println("<b style='color:red'>Sorry! unable to save record");             
        }            
        out.close();  
    } 
}


