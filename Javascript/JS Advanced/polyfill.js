/* A polyfill is code that adds a fallback for unsupported features */
var person = {
  firstname: "Default",
  lastname: "Default",
  greet: function() {
    return "Hello " + this.firstname " " + this.lastname;
  }
}

//an example polyfill, creates an Object.create function if it's not supported by the browser
if (!Object.create) {
  Object.create = function (o) {
    if (arguments.length > 1) {
      throw new Error('Object.create implementation'
      + ' only accepts the first parameter.');
    }
    function F() {}
    F.prototype = o;
    return new F();
  };
}

//creates a new object with the prototype to the "person" variable
var john = Object.create(person);
//now we set the prototype variables
john.firstname = "John";
john.lastname = "Doe";
console.log(john.greet()); //logs "Hello John Doe"
