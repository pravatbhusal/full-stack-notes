package trees;

public class Node {

	// key (index) of this Node
	private int key;

	// value of this Node
	private String value;

	// left child of this Node
	private Node leftChild;

	// right child of this Node
	private Node rightChild;

	// Node constructor for key and value
	public Node(int key, String value) {
		this.key = key;
		this.value = value;
	}

	// return the key
	public int getKey() {
		return key;
	}

	// return the value
	public String getValue() {
		return value;
	}

	// return the left child of this Node
	public Node getLeftChild() {
		return leftChild;
	}

	// return the right child of this Node
	public Node getRightChild() {
		return rightChild;
	}

	// set the key
	public void setKey(int key) {
		this.key = key;
	}

	// set the value
	public void setValue(String value) {
		this.value = value;
	}

	// set the left child of this Node
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	// set the right child of this Node
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
}
