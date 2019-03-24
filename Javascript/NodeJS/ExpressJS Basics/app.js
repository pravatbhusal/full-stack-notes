//express, body-parser, path modules
var express = require('express');
var bodyParser = require('body-parser');
var path = require('path');
var expressValidator = require('express-validator');

//initialize the web-server with express on port 3000
var app = express();
app.listen(3000, () => {
  console.log("Server started on port 3000...");
});

//creating an example middle-ware called "logger"
//we shouldn't "use" middle-ware until before the app handles the route
var logger = (request, response, next) => {
  console.log("Logging...");
  //function to call after the middle-ware was finished
  next();
}
app.use(logger);

//add the middle-ware for some modules
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: false}));
//any static client file within the "client" folder will overwrite the server-side routes
//do not use this middle-ware if you're rendering via server-side, just render via client-side from a different port
app.use(express.static(path.join(__dirname, 'client'))); //client folder
app.use(expressValidator());

//set-up the server-side routing (pages) with express
//handle a GET request on the homepage, and render a "Hello World"
app.get('/', (request, response) => {
  response.send("Hello World!");
});

//handle a GET request on the add page
app.get('/add', (request, response) => {
  response.send("This is the adding page");
});

//handle a POST request on the add page
app.get('/subtract', (request, response) => {
  response.send("This is the subtract page");
});

//get the profile page of a user, with a specific id
app.get('/profile/:id', (request, response) => {
  response.send("The profile of id " + request.params.id);
});

//get the profile page of a user, with a specific id and name
app.get('/profile/:id/:name', (request, response) => {
  response.send("The profile of id " + request.params.id +
   " and name " + request.params.name);
});

//handle a POST request on the api page
app.post('/api', (request, response) => {
  //check the POST params with express-validator
  request.checkBody('first_name', "First name is required!").notEmpty();
  request.checkBody('email', "Email is not proper!").isEmail();

  //check for any errors, which can be made with checkBody()
  var errors = request.validationErrors();

  if(errors) {
    response.json(errors); //sends all the checkBody() errors as JSON
  } else {
    response.send("Welcome to the API via a POST Request!");
  }
});
