/* Everything within javascript is an Object / a reference variable */

//creating a new object variable, using the "new" keyword
var example = new Object();

example["firstname"] = "Pravat"
alert(example["firstname"]); //alerts "Pravat"
alert(example.firstname); //alerts "Pravat"; you can use a dot operator, too!

example.lastname = "Bhusal";
alert(example.lastname); //alerts "Bhusal"

example.location.city = "Austin";
alert(example.location.city); //alerts "Austin"; we can have nested objects!

//creating a simpler, JSON object
var person = {
  firstname: "Pravat",
  lastname: "Bhusal",
  location: {
    city: "Austin";
  }
};

alert(person.location.city); //alerts "Austin"

//we can also stringify our object to act as a JSON object for API calls
person = JSON.stringify(person);
//then we can parse the JSON, so we don't encounter any errors
person = JSON.parse(person);
