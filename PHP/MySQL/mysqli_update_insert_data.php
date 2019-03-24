<?php
include_once("mysqli_dbconnection.php");

//this query inserts values into the users table
$query = "INSERT INTO users (email, password) VALUES('test@gmail.com', 'anotherone')";
mysqli_query($link, $query);

//update the users database with this new email where the id is 1; the limit is just for extra safety to update once.
$query = "UPDATE users SET email='robpercival80@gmail.com' WHERE id='1' LIMIT 1";
mysqli_query($link, $query);

//query multiple columns
$query = "UPDATE users SET email='robpercival80@gmail.com', password='hello' WHERE id='2' LIMIT 1";
mysqli_query($link, $query);
?>