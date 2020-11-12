<?php
	//check if the user has set both the first and last name before using the POST data
	if (isset($_POST["first_name"]) && isset($_POST["last_name"])) {
		$first_name = $_POST["first_name"];
		$last_name = $_POST["last_name"];
	} else {
		$first_name = "";
		$last_name = "";
	}
?>

<html>
	<head>
		<title>PHP And HTML</title>
	</head>
	
	<body>
	<!--The data can be received by just declaring a php tag and then receiving the variable-->
		<p><?php echo($first_name . " " . $last_name);?></p>
		
	<!--We can send data back to PHP by simply making a form. We would require AJAX for non-form actions-->
		<form method="POST">
			First Name: <input type="text" name="first_name"><br>
			Last Name: <input type="text" name="last_name"><br>
			<input type="submit" value="Submit">
		</form>
		
	</body>
</html>