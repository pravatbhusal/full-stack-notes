package lifo;

public class App {

	// implementation to test the Stack.java class
	public static void main(String[] args) {
		// declare and initialize the stack
		final int CAPACITY = 5;
		Stack stack = new Stack(CAPACITY);

		// add new items to the stack
		stack.push(16);
		stack.push(32);
		stack.push(64);
		stack.push(128);
		stack.push(256);

		// pop items from the stack
		stack.pop();
		stack.pop();

		// output the stack
		System.out.println(stack);
	}
}
