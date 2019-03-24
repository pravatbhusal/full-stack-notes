<?php
include_once("mysqli_dbconnection.php");

$name = mysqli_real_escape_string($link, ""); //escape_string adds backslashes to prevent sql injection

//$query = "SELECT * FROM users WHERE id='1'"; //this specifically gets the user of id 1
//$query = "SELECT * FROM users WHERE id >= '2'"; //this specifically gets the user of id >= 2
//$query = "SELECT * FROM users WHERE email LIKE '%gmail.com'"; //this means select everything in the table where email ends (%) with gmail.com
//$query = "SELECT * FROM users WHERE id >= '2' AND email LIKE '%gmail.com'"; //this specifically gets the user of id >= 2 AND email ends with gmail.com
//$query = "SELECT * FROM users WHERE id >= '2' OR email LIKE '%gmail.com'"; //this specifically gets the user of id >= 2 OR email ends with gmail.com
//$query = "SELECT * FROM users WHERE name='$name'"; //we can use variables in mysql!
$query = "SELECT * FROM users WHERE email='pravat.bhusal@gmail.com'";
if($result = mysqli_query($link, $query)) {
	while($row = mysqli_fetch_array($result)) { //while loop to query each row of data
		print_r($row); //outputs each row if the query is not specific for 1 row
		echo("<br>");
		
		if(mysqli_num_rows($result)) { //if the # of rows is greater than 0 for the certain query, that means this email exists!
			echo("That email address has already been taken!");
		}
	}
}

?>