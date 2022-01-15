package sort;

import java.util.Arrays;

public class RadixSort {

	// radix sort algorithm, O(d(n + b))
	public static void sort(int[] list) {
		int max = getMax(list);

		// count sort each place value using an LSD approach
		// exponent = 10^i where i is the number of times iterated
		for(int exponent = 1; max / exponent != 0; exponent *= 10) {
			countSort(list, exponent);
		}
	}

	// return the greatest number in a list
	public static int getMax(int[] list) {
		if(list.length > 0) {
			int max = list[0];

			// linear search the list for the greatest number
			final int LIST_LENGTH = list.length;
			for(int index = 0; index < LIST_LENGTH; index++) {
				if(list[index] > max) {
					max = list[index];
				}
			}
			return max;
		} else {
			return -1;
		}
	}

	// sort each element in list from least to greatest digits
	public static void countSort(int[] list, int exponent) {

		// contains sorted version of list in regards to place value
		final int LIST_LENGTH = list.length;
		int radixList[] = new int[LIST_LENGTH];

		// indexes that correspond to the number of digits occurred
		final int DIGITS = 10;
		int occurrences[] = new int[DIGITS]; 

		// store digit occurrences in occurrences[]
		for (int index = 0; index < LIST_LENGTH; index++) {
			int digit = (list[index] / exponent) % DIGITS;
			occurrences[digit]++;
		}

		// create the index positions from least to greatest for radixList
		for (int index = 1; index < DIGITS; index++) {
			occurrences[index] += occurrences[index - 1];
		}

		// build radixList
		for (int index = LIST_LENGTH - 1; index >= 0; index--) {
			int digit = (list[index] / exponent) % DIGITS;
			int numDigitsIndex = occurrences[digit] - 1;
			radixList[numDigitsIndex] = list[index];

			// next same digit number will go into a behind index
			occurrences[digit]--;
		}

		// copy radixList to list
		for(int index = 0; index < LIST_LENGTH; index++) {
			list[index] = radixList[index];
		}
	}
}
