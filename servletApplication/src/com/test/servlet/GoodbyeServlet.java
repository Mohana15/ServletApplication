package com.test.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//by default servlets are singleton in nature

//when you start your server your servlet container is empty --
//whenever u actually send a request 
//during the first request to that servlet the servlet get instantiated!!


public class GoodbyeServlet  extends HttpServlet{

	private static final long serialVersionUID = 1L;
	//private int count ;  not thrread safe
	
	public void init() {
		System.out.println("hey you instatiated the request!!");
	}
	
	
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	PrintWriter pw=resp.getWriter();
	pw.println("hey i am gouing!!!!");
	
	req.getRequestDispatcher("Demo").forward(req, resp);
	
	
	}
}
