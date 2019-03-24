<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Output JSP</title>
</head>
<body>
	<h1>This is the output file.</h1>
	
	<!-- Use JSP Expression to execute 1 line Java code inside the tags -->
	<!-- The "request" and "response" variables can be accessed in the JSP file -->
	<p>Hello, my name is <%= request.getAttribute("firstName") %> <%= request.getAttribute("lastName") %></p>
	
	<!-- Use the JSP Scriplets to execute multiple lines of Java -->
	<p>Hello, my name is
	<%
		String firstName = request.getAttribute("firstName").toString();
		String lastName = request.getAttribute("lastName").toString();
		out.println(firstName + " " + lastName); // print out the result
	%>
	</p>
	
	<!-- Use HTML tags in the out.print() method to output HTML views -->
	<%
		for(int i = 0; i < 3; i++) {
			out.print("<p>The value of i = " + i + "</p>");
		}
	%>
	
	<!-- JSP Declarations, allow us to create reusable code -->
	<%!
		int calLength(String string) {
			return string.length();
		}
	%>
	<p>The length of String "hello" is: <%= calLength("hello") %></p>
	
</body>
</html>