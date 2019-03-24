/*Global contexts are accessible in all of the program
Furthermore, code that is not inside a function is global
Creates a global object: "this"
In fact, "this" refers to the "window" object in JavaScript
*/

//this is a global variable
var a = "Hello World";
//in fact, you can also execute "window.a" and returns "Hello World"
alert(window.a);
function b() {
  //inside of the b() scope, not global
  //the variable c is only available within b()'s scope
  var c = "Goodbye World";
}

function d() {
  //"this" keyword always refers to the scope above, which is the global scope for this example
  this.testText = "Hello";
}
console.log(testText); //logs "Hello" because "this" keyword is global for d()
