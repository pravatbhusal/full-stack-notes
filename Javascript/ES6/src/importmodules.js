//we can import modules and define their own name

import {students, total} from './exportmodules';
import {add, multiply} from './exportmodules';
import Entity from './oop.js'; // we do not need the curly braces since its the default export

console.log(students, total);
console.log(add(3,5));

//inherting classes using the extends keyword
class Hobbit extends Entitiy {
  constructor(name, height) {
    //calls the Entity's constructor (sets the this variables)
    super(name, height);
  }
  
  //overrides the original goodbye() from entitiy
  goodbye() {
    console.log("Goodbye from your fellow Hobbit!");
  }
}

let Frodo = new Hobbit("Frodo", 4.5);
Frodo.greet(); //uses extended method (since there's no override)
Frodo.goodbye(); //uses overrided method
