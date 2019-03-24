<?php
//namespace archives\PHP //NOTE: a namespace is a filedirectory
/*use My\Full\Classname as Name; //NOTE: "use" imports other php class/function/constant
the classname is referred to "Name" instead of "Classname" because of the "as" keyword*/

/*CLASS - a new object*/
class Customer {
	public $id; //public attributes are available to any class
	private $name; //private attributes are available only to this class
	protected $email; //protected attributes are available to only a class that is extended
	public $balance;
	public const CONSTANT_VALUE = "This is a constant value and CANNOT change"; //constant values cannot be changed
	
	//constructors create the class (usually at the start) - there can only be ONE constructor
	public function __construct($id, $name, $email, $balance) {
		//we can use the "$this" keyword to refer to the class's global properties
		$this->id = $id;
		$this->name = $name;
		$this->email = $email;
		$this->balance = $balance;
	}
	//method of a class (get methods allows us to get the variable from an extended class)
	public function getEmail() {
		return $this->email; //return methods make the method equal to the return value
	}
	//destructors delete the class (usually at the end) - there can only be ONE destrutor
	public function __destruct() {
		echo(" Destructing the class...");
	}
}

class Subscriber extends Customer {
	public $plan;
		
	public function __construct($id, $name, $email, $balance, $plan) {
		parent::__construct($id, $name, $email, $balance); 	//run the parent constructor (this is similar to the super() method in java)
		$this->plan = $plan;
		$this->email = $email; //accessing protected variable in an extended class
	}
}
//creating a new instance of the class
$subscriber = new Subscriber(1, "Pravat", "pravat.bhusal@gmail.com", 5, "Pro");
echo($subscriber->getEmail()); //get the email of the person (extending classes allows us to call the method from the parent)
echo($subscriber::CONSTANT_VALUE); //the "::" keyword allows us to access static/constant properties

/*ABSTRACT CLASS - "template" classes that you extend. only abstract methods must be implemented*/
abstract class Car {
	//you may not have a body for an abstract class, except for the constructor/destructor
	abstract public function getName();
	
	//non-abstract functions don't have to be initiated in an extended class, but must have a body
	public function getModel() {
		
	}
	
	public function __destruct() {
		echo(" Destructing the abstract class...");
	}
}
class Toyota extends Car {
	public $name;
	
	public function __construct($name) {
		$this->name = $name;
	}
	//abstract methods MUST be implemented onto your extended class, but if it's not abstract that's fine
	public function getName() {
		return $this->name;
	}
}
$newCar = new Toyota(" Rav 4 ");
echo($newCar->getName());

/*INTERFACE - all methods must be implemented*/
interface Motorcycle {
	//constructors/destructors WITHOUT bodies may also be created in an interface
	public function __construct();
	
	//all methods in an interface must be implemented, and they must all be public
	public function getName($name);
}
class Harvey implements Motorcycle {
	public function __construct() {
	}
	public function getName($name) {
		return $name;
	}
}
$newMotorcycle = new Harvey();
echo($newMotorcycle->getName("Model B"));

/*STATIC KEYWORD*/
class User {
	public $username;
	public $password;
	public static $passwordLength = 5;
	
	//static variables can only be called in static methods
	public static function getPasswordLength() {
		return self::$passwordLength; //do NOT use $this for static variables, use self
	}
}

//to call static methods we don't need instantiate a new class, but we must use "::"
echo(User::getPasswordLength());
?>