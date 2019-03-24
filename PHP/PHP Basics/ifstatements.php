<?php

$user = "andy";

//if the user is rob, then it will say Hello Rob!
if ($user == "rob") {
    echo "Hello Rob!";
} else {
    echo "I don't know you";
}

echo "<br><br>";

$age = 16;

//if age is greater than or equal to 18 or if the user is rob, then you can proceed
if ($age >= 18 || $user == "rob") {
    echo "You may proceed...";
} else {
    echo "You are too young, sorry!";
}

?>