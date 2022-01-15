package linkedlists;

public class DoublyLinkedList {

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

		if(isEmpty()) {
			// assign the last Node to the new Node
			last = newNode;
		} else {
			// set the old first's previous Node to the new Node
			first.setPrev(newNode);
		}

		// assign the first Node to the new Node
		first = newNode;
	}

	// insert data at the end of the list
	public void insertLast(int data) {
		// create a new Node that connects to the old last
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setPrev(last);

		if(isEmpty()) {
			// assign the first Node to the new Node
			first = newNode;
		} else {
			// set the old last's next Node to the new Node
			last.setNext(newNode);
		}

		// assign the last Node to the new Node
		last = newNode;
	}

	// insert data after a specific Node in the list
	public boolean insertAfter(int key, int data) {
		if(isEmpty()) {
			return false;
		}

		// get the Node that contains the key
		Node currentNode = first;
		while(currentNode.getData() != key) {
			currentNode = currentNode.getNext();

			if(currentNode == null) {
				// there were no Nodes that contain the key
				return false;
			}
		}

		// create a new Node
		Node newNode = new Node();
		newNode.setData(data);

		if(currentNode == last) {
			// the new Node becomes the last Node
			last = newNode;
		}
		// set the new Node between the current Node's previous and next Nodes
		newNode.setPrev(currentNode);
		newNode.setNext(currentNode.getNext());
		currentNode.setNext(newNode);
		return true;
	}

	// delete the first Node of the list
	public Node deleteFirst() {
		if(!isEmpty()) {
			Node oldFirst = first;

			// assign the first Node to equal its next Node
			first = first.getNext();

			// if there are no more Nodes
			if(first == null) {
				// set last to null as well
				last = null;
			} else {
				// unlink the old first Node
				first.setPrev(null);
			}
			return oldFirst;
		} else {
			throw new RuntimeException("The LinkedList is empty!");
		}
	}

	// delete the last Node of the list
	public Node deleteLast() {
		if(!isEmpty()) {
			Node oldLast = last;

			// assign the first Node to equal its previous Node
			last = last.getPrev();

			// if there are no more Nodes
			if(last == null) {
				// set first to null as well
				first = null;
			} else {
				// unlink the old last Node
				last.setNext(null);
			}
			return oldLast;
		} else {
			throw new RuntimeException("The LinkedList is empty!");
		}
	}

	// delete data at a specific Node in the list
	public Node deleteKey(int key) {
		if(!isEmpty()) {
			// get the Node that contains the key
			Node currentNode = first;
			while(currentNode.getData() != key) {
				currentNode = currentNode.getNext();

				if(currentNode == null) {
					// there were no Nodes that contain the key
					return null;
				}
			}

			// unlink the current Node from the list
			Node nextNode = currentNode.getNext();
			Node prevNode = currentNode.getPrev();
			if(currentNode == first && currentNode == last) {
				// delete the only Node in the list
				first = null;
				last = null;
			} else if(currentNode == first) {
				// set the first Node to the next Node
				first = nextNode;
				first.setPrev(null);
			} else if(currentNode == last) {
				// set the last Node to the previous Node
				last = prevNode;
				last.setNext(null);
			} else {
				// the current Node is in-between two Nodes, unlink it
				prevNode.setNext(nextNode);
				nextNode.setPrev(prevNode);
			}
			return currentNode;
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
