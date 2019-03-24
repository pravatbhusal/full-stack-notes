/* Arrays are basically a collection of anything */
var arrayExample = [
  1,
  false,
  "Hello",
  function(name) {
    console.log("Hello " + name);
  },
  {
    firstname: "Bob"
  }
];

//arrays always start at 0
console.log(arrayExample[0]); //logs "1"
console.log(arrayExample[4].firstname); //logs "Bob"
