/* 
"modules" are like classes that can be imported, you must utilize the "export" keyword to be used in other files
We will export modules from here for the importmodules.js to use
*/

//variables
export const students = ["Harry", "Ron", "Hermoine"];
export const total = 3;

//functions
const add = (x,y) => {
  return x + y;
}

//do not add export default const multiply, since default and const try
//and declare simutaneously and cause errors
const multiply = (x,y) => {
  return x * y;
}

//exporting functions
export {add, multiply};

//default export (no need for curly braces)
export default multiply;
