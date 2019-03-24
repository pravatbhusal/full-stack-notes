package sort;

public class BubbleSort {

	// bubble sort algorithm, O(n^2)
	public static void sort(int[] list) {
		for (int i = 0; i < list.length; i++) {
			for(int j = 1; j < list.length; j++) {
				if(list[j - 1] > list[j]) {
					// swap the element positions
					int temp = list[j - 1];
					list[j - 1] = list[j];
					list[j] = temp;
				}
			}
		} // f(n) = n^2, so O(f(n)) = n^2
	}
}
