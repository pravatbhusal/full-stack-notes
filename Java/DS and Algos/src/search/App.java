package search;

public class App {

	// a method to test the search algorithms
	public static void main(String[] args) {
		linearSearchReference();
		binarySearchReference();
		recursiveLinearSearchReference();
		recursiveBinarySearchReference();
	}

	// test the linear search algorithm
	public static void linearSearchReference() {
		int[] list = {45, 34, 435, 23, 565, 934};
		int index = LinearSearch.search(565, list); // 4
		System.out.println("Linear Search found: " + index);
	}

	// test the binary search algorithm
	public static void binarySearchReference() {
		int[] list = {1, 3, 15, 34, 85, 121};
		int index = BinarySearch.search(34, list); // 3
		System.out.println("Binary Search found: " + index);
	}

	// test the recursive linear search algorithm
	public static void recursiveLinearSearchReference() {
		int[] list = {45, 34, 435, 23, 565, 934};
		int startingIndex = 0;
		int index = LinearSearch.recursiveSearch(565, list, startingIndex); // 4
		System.out.println("Recursive Linear Search found: " + index);
	}

	// test the recursive binary search algorithm
	public static void recursiveBinarySearchReference() {
		int[] list = {1, 3, 15, 34, 85, 121};
		int rangeStart = 0;
		int rangeEnd = list.length - 1;
		int index = BinarySearch.recursiveSearch(34, list, rangeStart, rangeEnd); // 3
		System.out.println("Recursive Binary Search found: " + index);
	}
}
