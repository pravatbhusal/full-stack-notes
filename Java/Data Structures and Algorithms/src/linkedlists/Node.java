package linkedlists;

public class Node {

	// data value of this Node
	private int data;

	// next Node after this Node
	private Node next;

	// previous Node before this Node
	private Node prev;

	// return the data of this Node
	public int getData () {
		return data;
	}

	// return the next Node
	public Node getNext() {
		return next;
	}

	// return the previous Node
	public Node getPrev() {
		return prev;
	}

	// set a data value
	public void setData(int data) {
		this.data = data;
	}

	// set a value for the next Node
	public void setNext(Node next) {
		this.next = next;
	}

	// set a value for the previous Node
	public void setPrev(Node prev) {
		this.prev = prev;
	}
}
