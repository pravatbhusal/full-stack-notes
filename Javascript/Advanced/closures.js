/* Closures are basically functions inside another function */

function greet(greetType) {
  //here's a closure
  return function(name) {
    console.log(greetType + " " + name);
  }
}
greet("Hello")("Pravat"); //logs "Hello Pravat"

//closures can even be variables
var greeting = greet("Hi");
greeting("Pravat"); //logs "Hi Pravat"
