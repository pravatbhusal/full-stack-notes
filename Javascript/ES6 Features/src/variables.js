/* variable scoping with "let" for blocks
if you define a variable anywhere inside the file,
it contains a global scope! so use "let" for scoping
*/
let letExample = "hello world";
console.log(letExample);
//standalone block of code: block scoping
{
  //only re-define variable from outside NOT inside its scope
  let letExample = "goodbye world";
  let insideScope = "inside this scope only, cannot be used outside";
  console.log("Inside scope: " + letExample);
}

/* variables with "const"
variables that are "const" are constant
and cannot change
*/
const constantTest = "This is a constant test";
//however, we CAN push, pop, slice, etc. an array
const array = ["test1", "test2"];
array.push("test3");

/* variables as "literals"
variables that are literals allow us to
concatenate them within strings.
you must use backticks for strings with literals
*/
const a = "string value here";
const b = `literal test of ${a}`;
console.log(b);

//we can optionally not declare variable states, so it sets the default to "var"
noDeclaration = "There was no declared variable state";
