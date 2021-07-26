package com.candidate;

import com.DB.GetCon;
import com.User.UserPass;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet 
{
        @Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
        {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String Email=request.getParameter("Email");
		String Password=request.getParameter("Password");
		boolean status=VerifyLogin.checkLogin(Email,Password);
		if(status==true){
			HttpSession session=request.getSession();
			session.setAttribute("Email",Email);
			out.println("Welcome    " + Email);
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			rd.include(request, response);
		}
		else{
			out.println("Please check your E-Mail and Password");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
			
		}
		out.close();
	}

}
