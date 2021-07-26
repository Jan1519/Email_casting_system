package com.validation;

import com.candidate.RegisterUser;
import com.candidate.alreadyRegUser;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "validFilter", urlPatterns = {"/validFilter"})
public class validFilter extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = new PrintWriter(response.getWriter());
        int Id =Integer.parseInt(request.getParameter("Id"));
        String Name = request.getParameter("Name");
        String Email = request.getParameter("Email");
        String Password = request.getParameter("Password");
        String Country = request.getParameter("Country");
        //out.println("<center>" + name + " <br> " + email + "<br> " + pass + "</center>");
        int status_RegisterUser = RegisterUser.register(Id, Name, Email, Password,Country );
        if (status_RegisterUser > 0) {
            String register = "You are Successfully registered";
            request.setAttribute("register", register);
            RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
            rd.include(request, response);
        }else{
        boolean status_alreadyRegUser = alreadyRegUser.alreadyRegister(Id, Name, Email);
        if(status_alreadyRegUser==true){
            String alreadyregister = "You are already registered";
            request.setAttribute("alreadyregister", alreadyregister);
            RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
            rd.include(request, response);
        } else {
            String registererror = "Sorry,Registration failed. please try later";
            request.setAttribute("registererror", registererror);
            RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
            rd.include(request, response);
        }
        out.close();
    }
    }
}
