/* "spread" operator
allows us to concatenate arrays into each other
*/
let a = [7,8,9];
let b = [6, ...a, 10];
console.log(b);
//we can also print each index, seperated by spaces
console.log(...b);
//we can also have unlimited arguments within a function
function print(...z) {
  console.log(z); //prints out the array
}
print(1,2,3,4,5);
