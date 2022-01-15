package com.shadowsych;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet {
	
	public LifeCycleServlet() {
		super();
		System.out.println("Inside the no parameter constructor!");
	}
	
	//initiated whenever the Servlet has loaded
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Initiated the Servlet!");
	}
	
	//initiated whenever an HTTP service (request) has been received from the client
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.service(req, resp);
		System.out.println("Received an HTTP service (request)!");
	}
	
	//a method to destroy the Servlet from use
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Destroyed the Servlet!");
	}
}
