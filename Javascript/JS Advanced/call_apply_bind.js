/*
This is seen a bunch in javascript libraries/frameworks
*/

var person = {
  firstname: "Pravat",
  lastname: "Bhusal",
  getFullName: function() {
    //the "this" keyword will look to the scope above
    var fullname = this.firstname + " " + this.lastname;
    return fullname;
  }
}

var logName = function(lang1, lang2) {
  //the "this" keyword no longer refers to global, instead it refers to the variable "person"
  console.log("Logged: " + this.getFullName()); //logs "Logged: Pravat Bhusal"
  console.log(lang1 + " " lang2); //logs "en es" when using call() or apply()
};

//Binds: binds a variable to a function to set the "this" object
var logPersonName = logName.bind(person);
logPersonName(); //calling the function, also parameters are optional in JS but will return undefined

//Call: It calls the function and sets the "this" object, first parameter is the object
logName.call(person, "en", "es");

//Apply: It does the same as Call, but it requests the parameters as arrays instead
logName.apply(person, ["en", "es"]);
