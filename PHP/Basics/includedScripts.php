<?php
	//we can include the code of other local scripts into our script
	include("helloworld.php");
	
	//this receives all the html code of a URL
	echo file_get_contents("https://www.ecowebhosting.co.uk");
?>


