<?php

$myArray = array("Rob", "Kirsten", "Tommy", "Ralphie");
$myArray[] = "Katie"; //this pushes a new item to the end of the array

//echoing an entire array doesn't work, so we can use print_r (the r is short for readable)
print_r($myArray);
echo($myArray[3]); //this echos a specific array index, so it's fine (echos Ralphie)

echo "<br><br>"; //line breaks

$anotherArray[0] = "pizza";
$anotherArray[1] = "yoghurt";
$anotherArray[5] = "coffee";
$anotherArray["myFavouriteFood"] = "ice cream"; //we can also have specific index names! (example: myFavouriteFood)
print_r($anotherArray);

echo "<br><br>";

//we can also declare arrays like this with specific index names
$thirdArray = array(
    "France" => "French", 
    "USA" => "English", 
    "Germany" => "German");

unset($thirdArray["France"]); //pops the france index out of the array
print_r($thirdArray);

echo sizeof($thirdArray); //tells us how many indexes there are in an array



?>