package adt;

public class Counter {

	// name of the counter
	private String name;

	// starting value
	private int value;

	// Counter constructor
	public Counter(String name) {
		this.name = name;
		value = 0;
	}

	// increment value
	public void increment() {
		value ++;
	}

	// return the value
	public int getCurrentValue() {
		return value;
	}

	// return the counter as a String
	@Override
	public String toString() {
		return name + ": " + value;
	}
}
