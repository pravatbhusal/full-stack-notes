/* The new keyword makes a brand new scope for an object */
function Person(firstname, lastname) {
  //the "this" keyword won't refer to the above scope if it's initialized with a "new" keyword
  this.firstname = firstname;
  this.lastname = lastname;
}

//prototype: setting a new property for ALL objects created by the "new" keyword
Person.prototype.getFullName = function() {
  return this.firstname " " + this.lastname;
}

//creating a new object with the "new" keyword
var john = new Person("John", "Doe");
console.log(john.getFullName()); //logs "John Doe"
