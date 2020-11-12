<?php

//the array
$family = array("Rob", "Kirsten", "Tommy", "Ralphie");

//iterates through each index of the array ($key = index number, $value = value of key index)
foreach ($family as $key => $value) {
    $family[$key] .= " Percival"; //concatenate the index by adding the "Percival" string
    echo "Array item ".$key." is ".$value."<br>"; //the $value does NOT change even with the code above!
}

echo("<br><br>");

//same thing as the foreach loop, but instead we interate through the entire array by looking at its length
for ($i = 0; $i < sizeof($family); $i++) {
    echo $family[$i]."<br>";
}

echo("<br><br>");

//print from 10 to 0
for ($i = 10; $i >= 0; $i--) {
    echo $i."<br>";
}


?>