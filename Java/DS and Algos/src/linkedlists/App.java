package linkedlists;

public class App {

	// implementation to test the linked list classes
	public static void main(String[] args) {
		nodeReference();
		singlyLinkedListReference();
		circularLinkedListReference();
		doublyLinkedListReference();
	}

	// utilize only the Node class to show a simple linearly linked list
	public static void nodeReference() {
		Node nodeA = new Node();
		nodeA.setData(4);

		Node nodeB = new Node();
		nodeB.setData(3);

		Node nodeC = new Node();
		nodeC.setData(7);

		Node nodeD = new Node();
		nodeD.setData(8);

		// linearly link the Nodes together
		nodeA.setNext(nodeB);
		nodeB.setNext(nodeC);
		nodeC.setNext(nodeD);

		System.out.println(getNodeListLength(nodeA)); // 4 <- 3 Nodes connected and itself
		System.out.println(getNodeListLength(nodeB)); // 3 <- 2 Nodes connected and itself
		System.out.println(getNodeListLength(nodeD)); // 1 <- only itself
	}

	// returns the length of a Node list: number of Nodes connected and itself
	public static int getNodeListLength(Node node) {
		int numNodes = 0;

		// loop until the end of the Node list
		Node currentNode = node;
		while(currentNode.getNext() != null) {
			numNodes++;
			currentNode = currentNode.getNext();
		}
		numNodes++; // fence-post solution, include itself
		return numNodes;
	}

	// utilize the SinglyLinkedList ADT to show an organized linearly linked list
	public static void singlyLinkedListReference() {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertFirst(4);
		list.insertFirst(2);
		list.insertFirst(7);
		list.insertFirst(8);
		list.insertLast(5);
		list.deleteFirst();
		list.deleteLast();
		System.out.println(list); // [7, 2, 4]
	}

	// utilize the CircularLinkedList ADT to show a cyclic wrap around linked list 
	public static void circularLinkedListReference() {
		CircularLinkedList list = new CircularLinkedList();
		list.insertFirst(4);
		list.insertLast(5);
		list.insertLast(7);
		list.insertFirst(3);
		list.insertLast(8);
		list.insertLast(3);
		list.deleteLast();
		System.out.println(list); // [3, 4, 5, 7, 8]
	}

	// utilize the DoublyLinkedList ADT to show a complete linked list
	public static void doublyLinkedListReference() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertFirst(3);
		list.insertLast(6);
		list.insertFirst(4);
		list.insertAfter(6, 7);
		list.deleteKey(6);
		list.insertFirst(9);
		list.deleteKey(3);
		System.out.println(list); // [9, 4, 7]
	}
}
