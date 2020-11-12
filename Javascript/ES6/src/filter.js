/* "filter" method
returns new array based on initial array,
but it reduces the array based on some test
*/
let isPassing = (grade) => {
  //must return a boolean for it to filter
  return grade >= 70;
}
let scores = [90,85,67,55,88];
//only scores that are passing are within the new array
let passing = scores.filter(isPassing);
console.log(passing);
