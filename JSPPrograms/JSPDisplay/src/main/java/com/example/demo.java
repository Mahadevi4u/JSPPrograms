package com.example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/demo")
public class demo extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {

     req.setAttribute("label","Mahadevi");
     RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
     rd.forward(req, res);
	}
     


}
