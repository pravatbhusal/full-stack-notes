# Bubble Sort
Simplest sorting algorithm that repeatedly swaps elements if in wrong order.  

This has a O(n^2) complexity, but is considered the worst sorting algorithm.  

<img src="/references/Java/DS and Algos/src/sort/images/bubblesort.gif" width="450" height="250" />

# Selection Sort
Sorting algorithm that swaps the minimum value to the back of the unsorted portion of the list. Therefore, the back of the unsorted portion of the list becomes the front of the sorted portion of the list.  

This has a O(n^2) complexity, but it's always faster than Bubble Sort because selection sort only searches in the unsorted portion of the list.  

<img src="/references/Java/DS and Algos/src/sort/images/selectionsort.gif" width="450" height="250" />

# Insertion Sort
Sorting algorithm that has a "sorted" and "unsorted" portion. The algorithm checks if the element in the front of the sorted portion is greater than the unsorted portion, then the unsorted element will search and push the sorted section until it finds the proper position.

This has a O(n^2) complexity, but it's always faster than Selection Sort because insertion sort only searches the unsorted portion until it finds the proper position.  

<img src="/references/Java/DS and Algos/src/sort/images/insertionsort.gif" width="450" height="250" />

Note: It's actually possible for insertion sort to be faster using an algorithm called the "Binary Insertion Sort." In the searching process, the search can utilize a binary search to make the sorted section search O(log(n)) fast, so the total complexity would be O(nlog(n)) instead of the insertion sort complexity of O(n^2). However, we don't cover "Binary Insertion Sort" in this lecture.  

# Radix Sort
Sorting algorithm that sorts based on the highest number of digits. If the radix sort follows LSD (Least Significant Digit), then the algorithm sorts by comparing each number's last place values and position up into its first place value and position.  

This has a O(d(n + b)) complexity where n is integers, b is base of numbers (decimals are base 10), d is most digits.  
If we assume a value k is the largest number in the list, then d = log(max(n)) = logb(k).  

<img src="/references/Java/DS and Algos/src/sort/images/radixsort.png" width="650" height="250" />

# Merge Sort
A recursive sorting algorithm that divides and conquers an Array into halves, then divides again in half, and again, and again until there is only one element per Array (base-case). Then the algorithm sorts and merges them into a full sorted Array.  

This has a O(nlog(n)) complexity because of being a divide-and-conquer algorithm it uses log(n), and the outer n comes from the merging algorithm of the halved Arrays, so it's n * log(n) which is O(nlog(n)).  

<img src="/references/Java/DS and Algos/src/sort/images/mergesort.gif" width="450" height="250" />

# Quicksort
A recursive sorting algorithm that divides and conquers an Array into partitions: picks a pivot and iterates all elements less than the pivot value to the left of the Array and all elements greater than the pivot value to the right of the Array. Then the pivot is placed in the proper position of the Array. Then this process is repeated by using another pivot, partitioning it, and then repeating again. Eventually all pivots are within the proper position of the Array, so it becomes sorted.  

This has a O(n^2) worst-case complexity but an average of O(nlog(n)) complexity. Surprisingly, this is still considered a divide-and-conquer algorithm even with its complexity.  

Unlike merge sort, new Arrays are not created, so if memory space is an issue then Quick Sort is the best option.  

<img src="/references/Java/DS and Algos/src/sort/images/quicksort.gif" width="450" height="250" />
