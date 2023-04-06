/* Prototypes (__proto__) are like fallbacks for object properties
NOTE: see new_keyword.js to read about the prototype property
*/

var person = {
  firstname: "Default",
  lastname: "Default",
  getFullName: function() {
    return this.firstname + " " this.lastname;
  }
}

var john = {
  firstname: "John",
  lastname: "Doe"
}

//setting the john object to have a prototype (or fallback) of person
john.__proto__ = person;
alert(john.getFullName()); //alerts "John Doe" even though getFullName() isn't within the john object

//loops through all objects within john and sets each object to prop
for(var prop in john) {
  //Reflection: Checks if an object has its OWN property not from any prototype or anything
  //This example will return false
  if(john.hasOwnProperty("getFullName")) {
    alert("John has a getFullName property!");
  }
  console.log(prop + ": " john[prop]);
}
