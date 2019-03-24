/* "map" function
allows us to create an array by calling
a function on each element in the array
*/
let points = [10, 20, 30];
let addOne = (element) => {
  return element + 1;
}
//sets an array index to the value of the return from a function
points = points.map(addOne);
console.log(points); //outputs [11, 21, 30]
