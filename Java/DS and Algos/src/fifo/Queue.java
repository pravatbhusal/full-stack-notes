package fifo;

import java.util.Arrays;

public class Queue {

	// front (first) of the queue
	private int front;

	// back (last) of the queue
	private int back;

	// size of the queue, different from capacity (the max # of items)
	private int size;

	// queue internal Array container
	private int[] queue;

	// Queue constructor
	public Queue(int capacity) {
		front = 0;
		back = 0;
		size = 0;
		queue = new int[capacity];
	}

	// return if the queue is full
	public boolean isFull() {
		return size == queue.length;
	}

	// return if the queue is empty
	public boolean isEmpty() {
		return size == 0;
	}

	// insert a new item to the back of the queue
	public void enqueue(int data) {
		if(!isFull()) {
			queue[back] = data;
			back++;
			if(back == queue.length) {
				// cyclic wrap around
				back = 0;
			}
			size++;
		} else {
			throw new ArrayIndexOutOfBoundsException("The Queue is full!");
		}
	}

	// dequeue an item from the front of the queue
	public int dequeue() {
		if(!isEmpty()) {
			int oldFront = queue[front];
			front++;
			if(front == queue.length) {
				// cyclic wrap around
				front = 0;
			}
			size--;
			return oldFront;
		} else {
			throw new ArrayIndexOutOfBoundsException("The Queue is empty!");
		}
	}

	// return the front of the queue
	public int peek() {
		return queue[front];
	}

	// return the queue as a String
	@Override
	public String toString() {
		int[] outputQueue = new int[size]; 

		/* queues work from back to front but the queue uses a stack-based internal Array
			container, so the Array output is reverse: [front, next, next..., back] */
		int index = front;
		for(int item = 0; item < size; item++) {
			outputQueue[item] = queue[index];
			index++;

			// cyclic wrap around
			if(index == queue.length) {
				index = 0;
			}
		}
		return Arrays.toString(outputQueue);
	}
}
