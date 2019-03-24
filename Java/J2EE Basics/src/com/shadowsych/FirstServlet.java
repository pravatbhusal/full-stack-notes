package com.shadowsych;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// extend the HttpServlet class to convert this class into a Servlet
public class FirstServlet extends HttpServlet {

	// handling GET requests that are sent to the FirstServlet
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get the GET request parameters sent from the form
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		
		// outputs to the Server's Console, not in the browser
		System.out.println("The name was: " + firstName + " " + lastName);
		
		// outputs to the Browser, not in the Server's Console
		// the PrintWriter class supports HTML tags
		// NOTE: the PrinterWriter views will be overwritten by any getRequestDispatcher() methods
		PrintWriter browserWriter = resp.getWriter();
		browserWriter.print("<h1>The name was: " + firstName + " " + lastName + "</h1>");
		
		// redirecting the user to another URL, if the firstName is Google
		if(firstName.equals("Google")) {
			resp.sendRedirect("http://www.google.com");
			return; // must return in order for the remaining code not to run once redirected
		}
		
		// sets the view as the output.jsp file onto the Browser, and overwrite any other views from the Servlet
		RequestDispatcher dispatcher = req.getRequestDispatcher("/output.jsp");
		req.setAttribute("firstName", firstName); // send a firstName property to the JSP
		req.setAttribute("lastName", lastName); // send a lastName property to the JSP
		dispatcher.forward(req, resp);
	}
	
	// handling POST requests that are sent to the FirstServlet
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
