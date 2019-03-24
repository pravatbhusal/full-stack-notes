<?php

require "twitteroauth/autoload.php";

use Abraham\TwitterOAuth\TwitterOAuth;

$consumerkey = "dZ52MCrsr9T7ZZ0e3xJrBaQVS";

$consumersecret = "nyZy9jEzSv0IA9M4QaGrlaUBHHHP0DuqA1uIkFPR4ATpDid5iE";

$accesstoken = "703174801402138626-G6mNl13RXKKKBl2KwXl8icXUD4JqAlA";

$accesstokensecret = "j5x1CwDReoTYRxummy2YivGMgP37q2pefPt9ry2tMMomO";

$connection = new TwitterOAuth($consumerkey, $consumersecret, $accesstoken, $accesstokensecret);
$content = $connection->get("account/verify_credentials");


$statuses = $connection->get("statuses/home_timeline", ["count" => 25, "exclude_replies" => true]);

foreach ($statuses as $tweet) {
    
    
    if ($tweet->favorite_count >= 2) {
        
        $status = $connection->get("statuses/oembed", ["id" => $tweet->id]);
        
        echo $status->html;
        
    }
        
    
    
    
}

?>