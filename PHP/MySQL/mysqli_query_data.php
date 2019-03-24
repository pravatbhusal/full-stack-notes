<?php
include_once("mysqli_dbconnection.php");

//select everything in the "test" database (NOTE: queries don't need all caps, but it's standard practice)
$query = "SELECT * FROM users";
if($result = mysqli_query($link, $query)) { //if query was a success!
	$row = mysqli_fetch_array($result); //fetch mysql data first row into an array (need while loop to fetch all rows)
	print_r($row); //print the row array
	echo("<br><br>");
	echo("Your email is: " . $row["email"] . " and password is: " . $row["password"]);
}
?>