<?php 
$host = "localhost";
$user = "root";
$password = "";
$dbname = "db_pdo";

# Set DSN - the associated database driver. in this case, we're using MySQL
$dsn = "mysql:host=" . $host . ";dbname=" . $dbname;

# Create a PDO instance
$pdo = new PDO($dsn, $user, $password);
# Sets default $pdo fetch mode as "object"
$pdo->setAttribute(PDO::ATTR_DEFAULT_FETCH_MODE, PDO::FETCH_OBJ);
# Sets emulation mode (PDO subsitute placeholders) for prepare statements to false
$pdo->setAttribute(PDO::ATTR_EMULATE_PREPARES, false);

# PDO Query (unsafe) - loop fetch as an associative array & object from a table
$stmt = $pdo->query("SELECT * FROM posts");

/*fetch all items in the "posts" table as associative array
while($row = $stmt->fetch(PDO::FETCH_ASSOC)) {
	echo $row["title"] . "<br>";
}*/

/*fetch all items in the "posts" table as object
while($row = $stmt->fetch(PDO::FETCH_OBJ)) {
	echo $row->title . "<br>";
}*/

/*this will fetch all items as object since we setAttribute() default to object*/
//while($row = $stmt->fetch()) {
	//echo $row->title . "<br>";
//}

# Prepared Statements - seperates instruction from the data variables
/*This is an unsafe due to MySQL injections
$query = "SELECT * FROM posts WHERE author = '$author'";*/

$author = "Brad";
$is_published = true;

/*Positional Parameters (first prepared statement style) - MySQLi uses same technique*/
$query = "SELECT * FROM posts where author = ?";
$stmt = $pdo->prepare($query);
$stmt->execute([$author]); //we filled the "?" placeholder in the query with "$author"
$row_count = $stmt->rowCount(); //gets row count
$posts = $stmt->fetchAll(); //fetch all from query with the default to object
foreach($posts as $post) {
	echo $post->title . "<br>";
}

/*Named Parameters (second prepared statement style)*/
$query = "SELECT * FROM posts where author = :author AND is_published = :is_published";
$stmt = $pdo->prepare($query);
$stmt->execute(["author" => $author, "is_published" => $is_published]);
$posts = $stmt->fetchAll();
foreach($posts as $post) {
	echo $post->title . "<br>";
}
?>

