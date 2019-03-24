package search;

public class BinarySearch {

	// binary search algorithm, returns the first index of data
	// assume list[] is sorted
	public static int search(int data, int list[]) {
		int rangeStart = 0;
		int rangeEnd = list.length - 1;

		// keep searching until we search through all possible ranges
		while(rangeStart <= rangeEnd) {
			int midPoint = (rangeStart + rangeEnd) / 2;
			if(list[midPoint] == data) {
				return midPoint;
			} else if(data < list[midPoint]) {
				// divide the section in-half minus one to the left
				rangeEnd = midPoint - 1;
			} else if(data > list[midPoint]) {
				// divide the section in-half plus one to the right
				rangeStart = midPoint + 1;
			}
		} // f(n) = log2(n), so O(f(n)) = O(log2(n))
		return -1;
	}

	// recursive binary search algorithm, returns the first index of data
	// assume list[] is sorted
	public static int recursiveSearch(int data, int list[], int rangeStart, int rangeEnd) {
		if(rangeStart <= rangeEnd) {
			int midPoint = (rangeStart + rangeEnd) / 2;
			if(list[midPoint] == data) {
				return midPoint;
			} else if(data < list[midPoint]) {
				// divide the section in-half minus one to the left
				rangeEnd = midPoint - 1;
				return recursiveSearch(data, list, rangeStart, rangeEnd);
			} else if(data > list[midPoint]) {
				// divide the section in-half plus one to the right
				rangeStart = midPoint + 1;
				return recursiveSearch(data, list, rangeStart, rangeEnd);
			}
		} // f(n) = log2(n), so O(f(n)) = O(log2(n))
		return -1; // (base-case) could not find the data or exhausted the list
	}
}
