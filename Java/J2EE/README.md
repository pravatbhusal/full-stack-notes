# J2EE Basics
The basics to J2EE (Enterprise Edition), including Java Servlets, JSP, and the JSTL Tag library.

# Apache Tomcat v8.0
This Dynamic Web Project (boilerplate by Eclipse J2EE IDE) uses the Apache Tomcat v8.0 server.
- Make sure to set the "Switch Location" of the Tomcat v8.0 Server within Eclipse to the directory of the server. 
- Also, inside the Tomcat v8.0 Overview within Eclipse set the Server Location to "Use Tomcat Installation."

# WebContent Folder
All of the front-end HTML, CSS, JavaScript, and JSP is within the WebContent folder. The web.xml file inside the WEB-INF folder is used to connect the Java Servlets to their individual routes. Each Servlet inside the web.xml file has a <servlet> tag and <servlet-mapping> tag.

# Servlets
All Servlets are inside the src folder. Servlets are considered as HTTP Request Handlers that take a request and send back a response.

# JSP (Java Server Pages)
All JSP is inside the WebContent folder, and is a template engine to render the HTML views within the server-side. JSPs are connected to the Servlets by the getRequestDispatcher() method inside the Servlet. Attributes and data from the Servlet can also be sent to the JSP.

# Set the Default Web Browser
- On Eclipse, click Window, then click Preferences, then search for "Web Browser," then click "Use external web browser," and click your preferred Web Browser, then click Apply and Close
- Then go back to Window, click Web Browser, and click Default system web browser

# Set the Web Context Route
Right click on the project in the Eclipse IDE, click Properties, search for "Web Project Settings," set the Context Route to /[NAME], then click Apply and Close.

# Running the Server
Right click on the Project Folder in Eclipse, click Run As, and click Run on Server.

# Change the Tomcat server's port number
- To change the Tomcat port, go to the Tomcat's "conf" folder and open the server.xml file
- Search for "Connector port" and replace the "8080" to your port number
- Restart the Tomcat server

# Deploying the Tomcat Server to Production
- Right click on the Project Folder in Eclipse, export the Project Folder as a .war file
- Place that .war file in the Tomcat's "webapps" directory
- Run the Tomcat server via the Eclipse IDE
- A folder named after the .war file should be created in the webapps directory, this is your web-server's files
- If you wish for the web-server to be ROOT, then copy + paste all of the web-server's files to the ROOT folder from the webapps directory