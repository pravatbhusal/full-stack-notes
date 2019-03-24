package trees;

public class App {

	// a method to test the tree data structures
	public static void main(String[] args) {
		bstReference();
		maxHeapReference();
	}

	// test the binary search tree data structure
	public static void bstReference() {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(10, "Ten");
		tree.insert(20, "Twenty");
		tree.insert(30, "Thirty");
		tree.insert(75, "Seventy-Five");
		tree.insert(100, "Hundred");
		tree.remove(20);
		System.out.println(tree.findMin().getKey()); // 10
		System.out.println(tree.findMax().getKey()); // 100
	}

	// test the max heap data structure
	public static void maxHeapReference() {
		MaxHeap tree = new MaxHeap(5);
		tree.insert(35);
		tree.insert(73);
		tree.insert(89);
		tree.insert(65);
		tree.insert(23);
		tree.pop();
		tree.pop();
	}
}
