<?php
$host = "localhost"; //host that we're using (can be an ip-address)
$sqluser = "root"; //sql user whenever logging-in
$sqlpassword = ""; //sql password whenever logging-in
$dbusername = "db_mysqli"; //the database name

//we use mysqli connection (this is way better than PDO and is modern)
mysqli_connect($host, $sqluser, $sqlpassword, $dbusername);

//if we do have an error connecting to the database, then let's stop the script (die)
if(mysqli_connect_error()) {
	die("There was an error connecting to the database...");
} else {
	echo("Database connection successful!");
}
?>