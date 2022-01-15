package sort;

public class InsertionSort {

	// insertion sort algorithm, O(n^2)
	public static void sort(int[] list) {
		for(int i = 1; i < list.length; i++) {
			int element = list[i];
			
			// index for the front of the sorted portion
			int searchIndex = i - 1;

			// keep searching the sorted portion for a proper position for the element
			while(searchIndex >= 0 && list[searchIndex] > element) {
				// push sorted elements forward
				list[searchIndex + 1] = list[searchIndex];
				searchIndex--;
			}
			// place the element in its proper position
			list[searchIndex + 1] = element;
		} // f(n) = n^2, so O(f(n)) = O(n^2)
	}
}
