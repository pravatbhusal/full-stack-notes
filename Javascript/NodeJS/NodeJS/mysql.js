//mysql module
var mysql = require('mysql');

//connecting to a mysql database
//the port default is 3306, but you can set it with the port object
var mysqlConnection = mysql.createConnection({
  host: "localhost",
  user: "userName",
  password: "password"
});

//connect to the mysql database
mysqlConnection.connect((error) => {
  if(error) {
    throw(error);
  } else {
    console.log("Connected!");
  }
});

//initiate a query, which is set in the first parameter
mysqlConnection.query("SELECT * FROM testTable", (error, result) => {
  if(error) {
    throw(error);
  } else {
    console.log("Result: " + result);
  }
});
