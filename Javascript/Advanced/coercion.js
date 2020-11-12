/*Coercion is converting one datatype to another*/

//outputs "Hello World"
var a = "Hello" + " World";
//outputs 12, as if those were 2 Strings that were concatenated!
var b = "1" + 2

//coercing values with "or" operator, for default values
//returns 1, since that's the true value
var c = 0 || 1;
//returns "lol", since that's the true value
var d = "lol" || undefined
//short circuit, so it returns "hi" since both are true
var e = "hi" || "sure"
//this sets the value of f to have a default value if it's not initialized
var f = f || "Default value of f";
