package linkedlists;

public class SinglyLinkedList {

	// first Node of the list
	private Node first;

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
	}

	// insert data at the end of the list
	public void insertLast(int data) {
		// create a new Node
		Node newNode = new Node();
		newNode.setData(data);

		// get the current last Node of the list
		Node currentNode = first;
		while(currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}

		// set the last Node's next to the new Node
		currentNode.setNext(newNode);
	}

	// delete the first Node of the list
	public Node deleteFirst() {
		if(!isEmpty()) {
			Node oldFirst = first;

			// assign the first Node to equal its next Node
			first = first.getNext();

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
			if(currentNode.getNext() != null) {
				while(currentNode.getNext().getNext() != null) {
					currentNode = currentNode.getNext();
				}
			} else {
				// delete the only Node in the list
				first = null;
				return currentNode;
			}

			// set the second to last Node's next to null
			Node oldLast = currentNode.getNext();
			currentNode.setNext(null);
			return oldLast;
		} else {
			throw new RuntimeException("The LinkedList is empty!");
		}
	}

	// return the list as a String
	@Override
	public String toString() {
		// prevent null pointer exception
		if(isEmpty()) {
			return "[]";
		}
		String listString = "[";
		Node currentNode = first;

		// loop until the end of the list
		while(currentNode.getNext() != null) {
			listString += currentNode.getData() + ", ";
			currentNode = currentNode.getNext();
		}
		// fence-post solution
		listString += currentNode.getData();
		listString += "]";
		return listString;
	}
}
