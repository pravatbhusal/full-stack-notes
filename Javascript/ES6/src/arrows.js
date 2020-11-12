/* "arrow" functions
its an anonymous function (no named identifier).
we declare using an operator and not the function keyword
*/
//ES5 method (old way)
function blastOff(text) {
  console.log(text);
}
blastOff("hello world");

//ES6 method (arrow functions)
setTimeout(() => {
  console.log("This is a message after 1 second.");
}, 1000);

//using identifiers (with variables)
const blastoff = (text) => {
  console.log(text);
}
blastoff("hello world");

//arrow functions do NOT bind their own "this", rather it goes to the upper-level
//this is an object within the function scope and binds to the object
this.a = 25;
let arrowPrint = () => {
  console.log(this.a); //outputs 25
}
arrowPrint();

//arrow functions in one line returns the value of the line
const mathTest = () => 5 + 5;
console.log(mathTest()); //outputs 10

//arrow functions with one parameter do NOT need paranthesis
const testParanthesis = test => {
    alert(test);
}
testParanthesis("no need for paranthesis");
