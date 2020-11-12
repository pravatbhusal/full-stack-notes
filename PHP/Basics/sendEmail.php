<?php
	//NOTE: This requires a mailserver (SMTP) to your localhost at port25.
	//setup the "smtp_port" setting in the php.ini file
    $emailTo = "pravat.bhusal@gmail.com";
    $subject = "I hope this works!";
    $body = "I think you're great!";
    $headers = "From: rob@robpercival.co.uk";

	//put the mail function within an if function to see if the mail could be sent or not
    if (mail($emailTo, $subject, $body, $headers)) {
        echo "The email was sent successfully!";
    } else {
        echo "Error, The email could not be sent!";
    }
?>


