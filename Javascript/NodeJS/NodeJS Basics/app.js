//modules (or packages)
const http = require('http');
const fileSystem = require('fs');

//server constants (localhost:3000)
const serverHost = '127.0.0.1';
const serverPort = 3000;

//read the index.html file from the file system
fileSystem.readFile('index.html', (error, data) => {
  //make sure we had no error opening the index.html file
  if(error) {
    throw(error);
  }

  //creating the web-server
  const webServer = http.createServer((requests, results) => {
    //200 is the success status code
    results.statusCode = 200;
    //set the results contents to "HTML"
    results.setHeader('Content-type', 'text/html');
    //send the data from index.html back to the client
    results.write(data);
    //end the results
    results.end();
  });

  //now initiate the web-server
  webServer.listen(serverPort, serverHost, () => {
    console.log("Server started on port " + serverPort);
  });
});
