package sort;

public class MergeSort {

	// merge sort algorithm, O(log(n))
	public static void sort(int[] list, int left, int right) {
		// divide until the algorithm traverses the entire Array
		if(left < right) {
			int midPoint = (left + right) / 2;
			sort(list, left, midPoint); // left-side dividing
			sort(list, midPoint + 1, right); // right-side dividing
			merge(list, left, midPoint, right); // merge the half sections
		}
	}

	// merge algorithm, O(n)
	private static void merge(int[] list, int left, int midPoint, int right) {
		final int MERGED_ARRAY_LENGTH = (right - left) + 1;
		int mergedArray[] = new int[MERGED_ARRAY_LENGTH];

		// index for the left-side of the Array
		int leftIndex = left;

		// index for the right-side of the Array
		int rightIndex = midPoint + 1;

		// current index of the mergedArray
		int index = 0;

		// individually sort the left-side and the right-side of the list Array
		while(leftIndex <= midPoint && rightIndex <= right) {
			if(list[leftIndex] < list[rightIndex]) {
				// input the left index into the merged Array
				mergedArray[index] = list[leftIndex];
				leftIndex++;
			} else {
				// input the right index into the merged Array
				mergedArray[index] = list[rightIndex];
				rightIndex++;
			}
			index++;
		}

		if(leftIndex <= midPoint) {
			// dump the rest of the left indexes up till the mid point
			while(leftIndex <= midPoint) {
				mergedArray[index] = list[leftIndex];
				leftIndex++;
				index++;
			}
		} else if(rightIndex <= right) {
			// dump the rest of the right indexes up till the mid point
			while(rightIndex <= right) {
				mergedArray[index] = list[rightIndex];
				rightIndex++;
				index++;
			}
		}

		// copy the merged Array onto the list Array
		for(int mergedIndex = 0; mergedIndex < mergedArray.length; mergedIndex++) {
			list[left + mergedIndex] = mergedArray[mergedIndex];
		}
	}
}
