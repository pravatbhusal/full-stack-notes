<?php
/*
A POST variable is an HTTP message like GET
POST variables do not contain variables in the URL, but they do the same as GET
*/
print_r($_POST);
echo("<br>" . $_POST["something"]); //post the value within the something POST variable
?>

<!--Here we are coding the HTML code outside of the PHP, awesome right?-->
<html>
	<!--The default method is GET, so we need to specify to POST-->
	<!--If we wanted to POST to another php file, we use action="url_here" within the form tag-->
	<form method="POST">
		<input name="something" type="text"> <!--something is the POST variable name-->
		<input name="lol" type="text"> <!--lol is the POST variable name-->
		<input type="submit" value="Go!">
	</form>
</html>