package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String uname = req.getParameter("email");
		String password =req.getParameter("pwd");
		if(uname.equals("Mahadevi") && password.equals("Mahadevi")) {
		HttpSession session = req.getSession();
		session.setAttribute("name", uname);
		session.setAttribute("pwd", password);
		res.sendRedirect("welcome.jsp");
		}
		else {
			res.sendRedirect("error.jsp");
		}
			
	}


}
