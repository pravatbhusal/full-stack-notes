/*the execution of javascript allows us to
execute javascript functions even it has been initialized!
undefined variables are undefined, but if it's not a
defined variable then it outputs an error (this is called Hoisting)
*/

//will execute, successfully
b();
//Hoisting (for Variables):
console.log(a); //returns undefined, but not an error!

var a = "Hello World";
function b() {
  console.log("Called b!");
}
