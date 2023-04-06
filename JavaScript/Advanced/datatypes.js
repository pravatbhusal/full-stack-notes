/* We can check the datatype (type of data of an object/primitive) through certain methods */

var a = 3;
console.log(typeof a); //returns "number"

var b = "Hello";
console.log(typeof b) //returns "string"

var c = [];
console.log(typeof c); //returns "object" since arrays are objects
console.log(Object.prototype.toString().call(c)); //returns "[object Array]" now!

var d = function() {};
console.log(typeof d); //returns "function"

var e = new Object();
console.log(e instanceof Object); //returns "true" since it is an Object
