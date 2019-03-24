<?php
include_once("mysqli_dbconnection.php");

//this query deletes values from the users table where id is equal to 2
$query = "DELETE FROM users WHERE id='2'";
mysqli_query($link, $query);
?>