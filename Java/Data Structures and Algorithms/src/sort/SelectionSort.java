package sort;

public class SelectionSort {

	// selection sort algorithm, O(n^2)
	public static void sort(int[] list) {
		for(int i = 0; i < list.length; i++) {
			int minIndex = i;

			// only iterate after i because the list has been sorted before i
			for(int j = i + 1; j < list.length; j++) {
				if(list[j] < list[minIndex]) {
					minIndex = j;
				}
			}
			// swap the minimum to index i
			int temp = list[i];
			list[i] = list[minIndex];
			list[minIndex] = temp;
		} // f(n) = n^2, so O(f(n)) = n^2
	}
}
