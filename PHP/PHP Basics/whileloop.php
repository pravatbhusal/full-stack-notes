<?php

	//array
    $family = array("Rob", "Kirsten", "Tommy", "Ralphie");

	//we create the index variable outside of the while loop
    $i = 0;
    while ($i < sizeof($family)) { //same as the for loop iterating through array indexes
        echo $family[$i]."<br>"; //state the value within the index with a linebreak
        $i++;
    }
	
	echo("<br><br>");

    $i = 1;
    while ($i <= 10) { //do this code 10 times
        $j = $i * 5; //$j is a variable that equals to i times 5
        echo $j."<br>";
        $i++;
    }

?>