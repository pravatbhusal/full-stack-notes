package adt;

public class App {

	// implementation to test abstract data structures
	public static void main(String[] args) {
		counterReference();
		genericsReference();
	}

	// test the Counter class
	public static void counterReference() {
		Counter myCounter = new Counter("myCounter");
		myCounter.increment();
		System.out.println(myCounter);
	}

	// test the Generics class
	public static void genericsReference() {
		Generics<String, Integer> myGeneric = new Generics<>();
		myGeneric.setValue1("An example of a generic... Its Integer value is: ");
		myGeneric.setValue2(500);
		System.out.println(myGeneric.getValue1() + " " + myGeneric.getValue2());
	}
}
