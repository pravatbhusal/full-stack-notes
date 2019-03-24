package search;

public class LinearSearch {

	// linear search algorithm, returns the first index of data
	public static int search(int data, int list[]) {
		final int LIST_LENGTH = list.length;

		// keep searching until the end of the list
		for(int index = 0; index < LIST_LENGTH; index++) {
			if(list[index] == data) {
				return index;
			}
		} // f(n) = n, so O(f(n)) = O(n)
		return -1;
	}

	// recursive linear search algorithm, returns the first index of data
	public static int recursiveSearch(int data, int list[], int index) {
		// (base-case) found the data or exhausted the list
		if(list[index] == data) {
			return index;
		} else if(index == list.length - 1) {
			return -1;
		} // f(n) = n, so O(f(n)) = O(n)

		// search the next index
		return recursiveSearch(data, list, index + 1);
	}
}
