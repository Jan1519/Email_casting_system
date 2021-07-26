package com.validation;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "ValidationFilterForRegistratio", urlPatterns = {"/validFilter"})
public class ValidationFilterForRegistratio implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = new PrintWriter(response.getWriter());
        
        String Name = request.getParameter("Name");
        String Email = request.getParameter("Email");
        String Password = request.getParameter("Password");
        
        if (Name.equals("")) {
            String nameMSG = "<b>Name can't be empty";
            request.setAttribute("nameMSG", nameMSG);
            //request.getRequestDispatcher("register.jsp").include(request, response);
        }
        if (Email.equals("")) {
            String EmailMSG1 = "<b>Email can't be empty";
            request.setAttribute("EmailMSG1",EmailMSG1 );
            //request.getRequestDispatcher("register.jsp").forward(request, response);

        }
        if (!Email.endsWith("@gmail.com")&& !Email.equals("")){
            String EmailMSG2 = "<b>Please Enter A Right Gmail";
            request.setAttribute("EmailMSG2", EmailMSG2);
            //request.getRequestDispatcher("register.jsp").forward(request, response);
        }
        if (Password.equals("")) {
            String PasswordMSG = "<b>Pasword can't be empty";
            request.setAttribute("PasswordMSG", PasswordMSG);
           // request.getRequestDispatcher("register.jsp").forward(request, response);
        } 
        if((Name.equals(""))||(Email.equals(""))||(!Email.endsWith("@gmail.com")&& !Email.equals(""))||(Password.equals(""))){
            
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
        
        else {
            chain.doFilter(request, response);
        }

    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig filterConfig) {

    }

}
