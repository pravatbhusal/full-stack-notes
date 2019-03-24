/* Functions ARE objects
First Class Functions: Functions can do everything an object can! */

//here's a function with only 1 parameter of "a"
function log(a) {
  a(); //alerts, "See? Functions are objects!" <- Proof that functions are objects
}
//passing a function as a parameter as if it was a variable!
log(function() {
  alert("See? Functions are objects!");
})

//functions can also be shortened to ""() =>"" with arrows, new to ES6
alert(() => {
  //functions can also equal to a value, which is used with "return"
  return "Hello";
}); //alerts "Hello"

//IIEFs (Immediately Invoked Functions Expressions)
var firstname = "Pravat";
//this is immediately evoked when the code is encountered in the callstack
(function(name) {
  //in IIEFs, the variable inside a function cannot be accessed outside its scope
  var personName = name;
  console.log("Hello " + personName)
}(firstname)); //IIEF
