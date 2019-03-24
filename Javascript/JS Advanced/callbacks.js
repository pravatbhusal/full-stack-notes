/* Callbacks are functions that are executed once its parent function executes */

function sayHiLater() {
  var greeting = "Hi!";
  //after 3 seconds, we initiate the callback function inside setTimeout
  setTimeout(function() {
    //it logs "Hi!" from the greeting variable even after the sayHilater() was called 3 seconds later
    console.log(greeting);
  }, 3000);
}
sayHiLater();

function tellMeWhenDone(callback) {
  alert("Not done yet...");
  callback(); //it alerts "All done!"
}
//invoking a callback function to tellMeWhenDone()
tellMeWhenDone(function() {
  alert("All done!");
});
