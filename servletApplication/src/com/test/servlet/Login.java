package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("username"));
		System.out.println(req.getParameter("password"));
		
		
		PrintWriter out=resp.getWriter();
		out.println("we got your response!!");
		
		if("abi".equals(req.getParameter("password"))) {
			req.getRequestDispatcher("register.jsp").forward(req, resp);
		}else {
			req.getRequestDispatcher("login.html").forward(req, resp);
		}
			
		
		//req.getRequestDispatcher("/goodbye").forward(req, resp);

	}

}
