package linkedlists;

public class CircularLinkedList {

	// first Node of the list
	private Node first;

	// last Node of the list
	private Node last;

	// return if the list is empty
	public boolean isEmpty() {
		return first == null;
	}

	// insert data at the beginning of the list
	public void insertFirst(int data) {
		// create a new Node that connects to the old first
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(first);

		// assign the first Node to the new Node
		first = newNode;

		// if last is empty, then assign last to the new Node as well
		if(last == null) {
			last = newNode;
			last.setNext(first); // cyclic wrap around
		}
	}

	// insert data at the end of the list
	public void insertLast(int data) {
		// create a new Node
		Node newNode = new Node();
		newNode.setData(data);

		if(isEmpty()) {
			// assign first and last to the new Node
			first = newNode;
			last = newNode;
			last.setNext(first); // cyclic wrap around
		} else {
			// connect old last to the new Node and assign last to the new Node
			last.setNext(newNode);
			last = newNode;
			last.setNext(first); // cyclic wrap around
		}
	}

	// delete the first Node of the list
	public Node deleteFirst() {
		if(!isEmpty()) {
			Node oldFirst = first;

			// assign the first Node to equal its next Node
			first = first.getNext();

			// if there are no more Nodes, set last to null as well
			if(first == null) {
				last = null;
			}
			return oldFirst;
		} else {
			throw new RuntimeException("The LinkedList is empty!");
		}
	}

	// delete the last Node of the list
	public Node deleteLast() {
		if(!isEmpty()) {
			// get the second to last Node of the list
			Node currentNode = first;
			if(currentNode != last) {
				while(currentNode.getNext() != last) {
					currentNode = currentNode.getNext();
				}
			} else {
				// delete the only Node in the list
				first = null;
				last = null;
				return currentNode;
			}

			// assign the last to the second to last Node
			Node oldLast = last;
			last = currentNode;
			last.setNext(first); // cyclic wrap around
			return oldLast;
		} else {
			throw new RuntimeException("The LinkedList is empty!");
		}
	}

	// return the list as a String
	@Override
	public String toString() {
		if(isEmpty()) {
			return "[]";
		}
		String listString = "[";
		Node currentNode = first;

		// loop until the end of the list
		while(currentNode != last) {
			listString += currentNode.getData() + ", ";
			currentNode = currentNode.getNext();
		}
		// fence-post solution
		listString += currentNode.getData();
		listString += "]";
		return listString;
	}
}
