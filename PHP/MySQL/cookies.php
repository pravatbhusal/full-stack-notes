<?php
/*
Cookies are helpful for maintaining logging data, and they're well encrypted.
You can use PHP sessions in-between files.
Cookies are deleted once the user chooses to clear them in the browser.
No need to use a start function, unlike sessions!
*/

//name of cookie, value of cookie, how long the cookie lasts, and how long the cookie lasts (currently set to 1 day)
setcookie("customerId", "12345", time() + 60 * 60 * 24);
echo($_COOKIE["customerId"]);

$_COOKIE["customerId"] = "67890"; //updates the value of the cookie, immediately
echo($_COOKIE["customerId"]);

//to unset a cookie, just make the value blank and set the time from the past. (refresh twice to see effect)
setcookie("customerid", "", time() - 60 * 60);
?>