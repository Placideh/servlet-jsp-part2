package com.placide.DemoApp2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		/* 
		 * ServletConfig and SevletContext 
		 * this is are the interface
		 * 
		 * */
		out.println("Hi ");
		/*
		 *this is for sevletsContext
		 * ServletContext ctx=getServletContext();//it is possible that we can also use
		 * request.getServletsContext();
		 * 
		 * String str=ctx.getInitParameter("name"); out.println("My name is :"+str);
		 */
		
		//this is for sevlets Config
		ServletConfig cg=getServletConfig();
		String str =cg.getInitParameter("name");
		out.println(str);
		
	}

	

}
