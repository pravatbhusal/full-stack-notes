package sort;

import java.util.Arrays;

public class App {

	// a method to test the sort algorithms
	public static void main(String[] args) {
		bubbleSortReference();
		selectionSortReference();
		insertionSortReference();
		radixSortReference();
		mergeSortReference();
		quickSortReference();
	}

	// test the bubble sort algorithm
	public static void bubbleSortReference() {
		int[] list = {34, 325, 76, 35, 23};
		BubbleSort.sort(list);
		String listString = Arrays.toString(list);
		System.out.println(listString);
	}

	// test the selection sort algorithm
	public static void selectionSortReference() {
		int[] list = {34, 325, 76, 35, 23};
		SelectionSort.sort(list);
		String listString = Arrays.toString(list);
		System.out.println(listString);
	}

	// test the insertion sort algorithm
	public static void insertionSortReference() {
		int[] list = {34, 325, 76, 35, 23};
		InsertionSort.sort(list);
		String listString = Arrays.toString(list);
		System.out.println(listString);
	}
	
	// test the radix sort algorithm
	public static void radixSortReference() {
		int[] list = {34, 325, 76, 35, 23};
		RadixSort.sort(list);
		String listString = Arrays.toString(list);
		System.out.println(listString);
	}

	// test the merge sort algorithm
	public static void mergeSortReference() {
		int[] list = {34, 325, 76, 35, 23};
		int left = 0;
		int right = list.length - 1;
		MergeSort.sort(list, left, right);
		String listString = Arrays.toString(list);
		System.out.println(listString);
	}

	// test the quick sort algorithm
	public static void quickSortReference() {
		int[] list = {34, 325, 76, 35, 23};
		int left = 0;
		int right = list.length - 1;
		QuickSort.sort(list, left, right);
		String listString = Arrays.toString(list);
		System.out.println(listString);
	}
}
