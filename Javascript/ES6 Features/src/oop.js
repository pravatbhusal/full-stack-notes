/* object oriented programming
allows us to program with classes.
*/
class Entity {
  //each class can only have one constructor
  constructor(name, height) {
    //initializes the class's variables
    this.name = name;
    this.height = height;
  }
  greet() {
    console.log(`Hi! I'm ${this.name} from earth!`);
  }
  goodbye() {
    console.log("Goodbye!");
  }
}

//we're going to use this class within the importmodules.js file
export default Entity;
