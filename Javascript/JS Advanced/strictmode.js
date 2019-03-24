//"use strict";

/* Strictmode makes Javascript more conservative about how the code works.
This will make javascript less flexible, but it could help prevent confusing errors.
The strict mode must be enabled with "use strict"; and must go on the top of a file
or on top of a function.
Read more about strictmode here: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Strict_mode
*/

function a() {
  "use strict";
  console.log("We're in strict mode, and won't allow certain flexibilities in this function");
  person = {};
  //this outputs an error since person never contained a "var" keyword
  //however, in flexible javascript it would've ran just fine and gave the "var" keyword as default
  console.log(person);
}
a();
