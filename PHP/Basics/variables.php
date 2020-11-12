<?php
//variable basics
$name = "Pravat"; //variables use the dollar symbol
echo($name);
echo("$name"); //php is smart and can DETECT variables with the dollar sign even within strings!

//concatenate
$string1 = "This is the first sentence.";
$string2 = "This is the second sentence.";
echo($string1 . " " . $string2); //we concatenate strings with the period

//html tags
$string3 = "<p>This is the first part</p>";
echo($string3);

//numbers
$myNumber = 45;
$calculation = $myNumber * 3 / 5.5;
echo("The result of the calculation is " . $calculation); //php will output a double by default

//booleans
$myBool = true;
echo("<p>The boolean is $myBool</p>"); //php booleans: (false = nothing, true = 1)

//double dollar-signs (very rare)
$variableName = "name";
echo($$variableName); //adding a dollar sign makes the $variableName equal to the $name because $variableName = "name"
?> 