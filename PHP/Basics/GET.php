<?php
/*
A GET variable is an HTTP message
GET variables are ENCODED within the URL itself. These are helpful for client-side and server-side connections
Example: http://localhost/php/getVariables.php/?something=pravat&lol=okay
*/
print_r($_GET); //prints the entire GET array
echo("<br>" . $_GET["something"]); //echos the "something" GET variable
echo("<br>" . $_GET["lol"]); //echos the "lol" GET variable
?>

<!--Here we are coding the HTML code outside of the PHP, awesome right?-->
<html>
	<form>
		<input name="something" type="text"> <!--something is the GET variable name-->
		<input name="lol" type="text"> <!--lol is the GET variable name-->
		<input type="submit" value="Go!">
	</form>
</html>