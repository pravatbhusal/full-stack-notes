/* "Array.prototype.includes"
this checks if a string or array contains a certain value
*/
//for strings, it just checks if the value in the include() parameter is present in the string
var stringExample = "This is a test!";
var checkString = stringExample.includes("is a test");
alert(checkString); //prints true

//for arrays, it requires you to check the exact value within the index, not if it just contains
var arrayExample = ["test1", "test2", "test3"];
var checkArray1 = arrayExample.includes("test"); //false
var checkArray2 = arrayExample.includes("test1"); //true
alert(checkArray2); //prints true
