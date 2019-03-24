//url system module
var url = require('url');

var addressURL = 'http://localhost:8080/default.htm?year=2017&month=february';
//parsing the URL of an address
var parsedURL = url.parse(addressURL, true);

//get the URL information
console.log(parsedURL.host); //returns 'localhost:8080'
console.log(parsedURL.pathname); //returns '/default.htm'
console.log(parsedURL.search); //returns '?year=2017&month=february'

//get the JSON data of the HTTP Request parameters
var urlData = parsedURL.query;
console.log(urlData.month); //returns 'february'
