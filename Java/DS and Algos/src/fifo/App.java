package fifo;

public class App {

	// implementation to test the Queue.java class
	public static void main(String[] args) {
		// declare and initialize the queue
		final int CAPACITY = 5;
		Queue queue = new Queue(CAPACITY);

		// enqueue new items to the queue
		queue.enqueue(16);
		queue.enqueue(32);
		queue.enqueue(64);
		queue.enqueue(128);
		queue.enqueue(256);

		// dequeue items from the queue
		queue.dequeue();
		queue.dequeue();

		// output the queue
		System.out.println(queue);
	}
}
