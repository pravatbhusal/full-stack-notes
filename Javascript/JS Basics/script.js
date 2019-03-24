
/*External javascript*/

//We can create a button that when clicked we do a function.
document.getElementById("changeWorld").onclick = function() {
	document.getElementById("text1").innerHTML = "Hello Pravat!";
}
		
document.getElementById("appendText").onclick = function() {
	document.getElementById("text2").innerHTML = "I think " + document.getElementById("text2").innerHTML + " is cool!";
}
		
document.getElementById("addText").onclick = function() {
	document.getElementById("text3").innerHTML = "Hello, how are you?";
}