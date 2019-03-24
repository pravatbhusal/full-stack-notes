<?php

	//md5 is not so secure, but it does hash!:
	echo(md5("password")); //this is an md5 hash for the password (we can store this into the database)
	
	echo("<br>");
	
	//for more security, we can use salt:
	$salt = "isdfh8349odg8udhg8934hg";
	echo(md5($salt."password"));
	
	echo("<br>");
	
	//for even more security, we can use the user's unique id and a salt
	$salt = "isdfh8349odg8udhg8934hg";
	$id = "2";
	echo(md5($salt.$id."password"));
?>