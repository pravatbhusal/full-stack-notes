package trees;

public class MaxHeap {

	// Array container for the max heap Nodes
	private int[] heap;

	// size of the max heap
	private int size;

	// MaxHeap constructor
	public MaxHeap(int capacity) {
		heap = new int[capacity];
		size = 0;
	}

	// return the size
	public int getSize() {
		return size;
	}

	// return if the max heap is empty
	public boolean isEmpty() {
		return heap.length == 0;
	}

	// return if the max heap is full
	public boolean isFull() {
		return size == heap.length;
	}

	// insert a new Node into the max heap and return if it succeeded
	public boolean insert(int data) {
		if(isFull()) {
			return false;
		}
		// create and place the new Node at the bottom of the Heap
		heap[size] = data;

		// trickle-up the heap and place the new Node into its proper position
		trickleUp();

		size++;
		return true;
	}

	// trickle-up the max heap to place a new Node into its proper position
	private void trickleUp() {
		int index = size;
		int parentIndex = (index - 1) / 2;
		int newNode = heap[index];

		/* loop while we haven't reached the root Node and
			parent Node is still less than new Node */
		while(index > 0 && heap[parentIndex] < newNode) {
			heap[index] = heap[parentIndex]; // move each Node up
			index = parentIndex; // move new Node up
			parentIndex = (parentIndex - 1) / 2; // move up the parent Nodes
		}

		// set the new Node to its proper position
		heap[index] = newNode;
	}

	// remove the root Node from the max heap
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		// create and place the newest Node at the root of the Heap
		int oldRoot = heap[0];
		heap[0] = heap[size - 1]; // root becomes the newest Node
		size--; // delete the newest Node's reference

		// trickle-down the heap and place the new root Node into its proper position
		trickleDown();

		return oldRoot;
	}

	// trickle-up the max heap to place a new root Node into its proper position
	private void trickleDown() {
		int largerChildIndex; // the largest Child's index of a parent Node
		int moveNode = heap[0];
		int index = 0;

		// loop while we haven't reached the bottom of the heap: at least one child
		while(index < (size / 2)) {
			int leftChildIndex = (2 * index) + 1;
			int rightChildIndex = (2 * index) + 2;

			// figure out the larger child, and error check if indexes are less than size
			if(rightChildIndex < size && heap[rightChildIndex] >= heap[leftChildIndex]) {
				largerChildIndex = rightChildIndex;
			} else {
				largerChildIndex = leftChildIndex;
			}
			if(moveNode >= heap[largerChildIndex]) {
				// successfully found a proper location for the new root Node
				break;
			}
			// swap locations of index to the larger child
			heap[index] = heap[largerChildIndex];
			index = largerChildIndex;
		}
		// assign the new root Node to its proper position
		heap[index] = moveNode;
	}
}
