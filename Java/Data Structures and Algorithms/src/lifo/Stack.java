package lifo;

import java.util.Arrays;

public class Stack {
	// top of the stack
	private int top;

	// stack internal Array container
	private int[] stack;

	// Stack constructor
	public Stack(int capacity) {
		top = -1;
		stack = new int[capacity];
	}

	// return if the stack is full
	public boolean isFull() {
		return top == (stack.length - 1);
	}

	// return if the stack is empty
	public boolean isEmpty() {
		return top == -1;
	}

	// push a new item into the top of the stack
	public void push(int data) {
		if(!isFull()) {
			top++;
			stack[top] = data;
		} else {
			throw new ArrayIndexOutOfBoundsException("The Stack is full!");
		}
	}

	// pop an item from the top of the stack
	public int pop() {
		if(!isEmpty()) {
			int oldTop = stack[top];
			top--;
			return oldTop;
		} else {
			throw new ArrayIndexOutOfBoundsException("The Stack is empty!");
		}
	}

	// return the top item of the stack
	public int peek() {
		return stack[top];
	}

	// return the stack as a String
	@Override
	public String toString() {
		final int STACK_LENGTH = top + 1;
		int[] outputStack = new int[STACK_LENGTH];

		/* stacks work from bottom to top and the stack uses a stack-based internal Array
			container, so the Array output is unchanged: [bottom, next, next..., top] */
		for(int item = 0; item < STACK_LENGTH; item++) {
			outputStack[item] = stack[item];
		}
		return Arrays.toString(outputStack);
	}
}
