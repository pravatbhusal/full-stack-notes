<?php
/*
Sessions are helpful for maintaining logging data, and they're well encrypted.
You can use PHP sessions in-between files.
Sessions are deleted once the user closes the browser.
*/
session_start(); //you must use this in order to initialize session use within php

$_SESSION['username'] = "pravatbhusal"; //saves a session
echo($_SESSION['username']);

//use these 2 commands to completely clear ALL sessions
session_unset();
session_destroy();
?>