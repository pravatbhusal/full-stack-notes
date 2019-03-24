package adt;

// create a new Generics class
public class Generics<E, T> {

	// generic data-types from the class specification
	private E value1;
	private T value2;

	// return value1
	public E getValue1() {
		return value1;
	}

	// return value2
	public T getValue2() {
		return value2;
	}

	// set value1
	public void setValue1(E value1) {
		this.value1 = value1;
	}

	// set value2
	public void setValue2(T value2) {
		this.value2 = value2;
	}
}
