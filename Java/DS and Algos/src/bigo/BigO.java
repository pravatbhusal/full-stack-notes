package bigo;

public class BigO {

	/* NOTE: For all methods, 
	 * if args is an Array, n = args.length
	 * if args is an integer, n = args
	 */

	// constant running time algorithm, O(1)
	public int showFirst(int[] args) {
		return args[0]; // 1, runs once

		// Complexity: O(1) => O(1)
	}

	// constant running time algorithm, O(1)
	public void doSomeThing(int args) {

		int p = args; // 1, runs once
		int i = 1; // 1, runs once
		int j = 1; // 1, runs once
		j++; // 1, runs once

		// Complexity: O(1) + O(1) + O(1) + O(1) = 4O(1) => O(1)
	}

	// linear running time algorithm, O(n)
	public int showFirstBad(int[] args) {

		// int i = 0 runs one, i < args.length runs n times, i++ runs n times
		for(int i = 0; i < args.length; i++) { // 2O(n) + 1
			int temp = args[i]; // O(n)
		}
		int j = 0; // 1, runs once
		return args[0]; // 1, runs once

		// Complexity: 2O(n) + 1 + O(n) + 1 + 1 = 3O(n) + 3 => O(n)
	}

	// quadratic running time algorithm, O(n^2)
	public void drive(int args) {

		int p = 10; // 1, runs once
		int i = 1; // 1, runs once
		while(i < args) { // O(n), i < args runs n times
			int j = 1; // O(n), runs n times
			while(j < i) { // nested loop of i < args, so O(n * n) = O(n^2)
				p = p * j; // nested of i < args, so O(n * n) = O(n^2)
				j++; // nested of i < args, so O(n * n) = O(n^2)
			}
			i++; // O(n), runs n times
		}

		// Complexity: 2O(1) + 3O(n) + 3O(n^2) = O(n^2)
	}
}
