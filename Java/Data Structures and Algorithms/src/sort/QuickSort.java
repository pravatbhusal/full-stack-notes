package sort;

public class QuickSort {

	// quick sort algorithm, O(n)
	public static void sort(int[] list, int left, int right) {
		// divide until the algorithm traverses the entire Array
		if(left < right) {
			int pivot = partition(list, left, right); // index of correctly placed pivot
			sort(list, left, pivot - 1); // left-side dividing
			sort(list, pivot + 1, right); // right-side dividing
		}
	}

	// partition algorithm, O(n)
	private static int partition(int[] list, int left, int right) {
		final int PIVOT = list[right]; 

		// less than index from the pivot
		int lessIndex = left - 1;

		// iterate the list from the left to right, excluding the pivot (last index)
		for(int greaterIndex = left; greaterIndex <= right - 1; greaterIndex++) {
			if(list[greaterIndex] <= PIVOT) {
				lessIndex++;

				/* swap lessIndex with greaterIndex, so the lesser value can be on the left
					of the pivot, and the greater value can be on the right of the pivot */
				int temp = list[lessIndex];
				list[lessIndex] = list[greaterIndex];
				list[greaterIndex] = temp;
			}
		}

		// swap the pivot into the proper position: lessIndex + 1
		final int SORTED_PIVOT_INDEX = lessIndex + 1;
		int temp = list[SORTED_PIVOT_INDEX];
		list[SORTED_PIVOT_INDEX] = PIVOT;
		list[right] = temp;

		return SORTED_PIVOT_INDEX;
	}
}
