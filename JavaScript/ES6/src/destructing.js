/* "destructing" arrays
allows us to destructure data from arrays into separate
variables
*/
//the ES5 method (old way)
let c = [100, 200];
let a1 = c[0];
let b2 = c[1];

//we can separate console.log with commas, which outputs spaces
console.log(a1, b1); //outputs: 100 200

//the ES6 method (destructing - new method)
let [a2,b2] = c;
console.log(a2, b2); //outputs 100 200

//using spreads with destructing
let d = [100, 200, 300 , 400, 500];
let [a3, ...b3] = d;
console.log(a3, b3); //outputs 100 [200, 300, 400, 500]

/* "destructing" objects
allows us to destructure data from objects into separate
variables
*/
//the ES5 method (old way)
let wizard1 = {magical1: true, power1: 10};
let magical1 = wizard1.magical;
let power1 = wizard1.power;
console.log(magical1, power1);

//the ES6 method (destructing - new method) - MUST MATCH the keys
//the keys can be in any order within the destructor
let wizard2 = {magical2: true, power2: 10};
let {magical2, power2} = wizard2;
console.log(magical2, power2);

//wrapping statements with external variables
let wizard3 = {magical3: true, power3: 10};
let magical3 = true;
let power3 = 2;
//this would've been considered its own block, so we need paranthesis
({magical3, power3} = wizard3); //updates magical3 and power3 variables
console.log(magical3, power3);
//using spreads with destructing
//gets the entire wizard3 array and then changes power3 to 15 for this array
let wizardModified = {...wizard3, power3: 15};
console.log(wizardModified);
