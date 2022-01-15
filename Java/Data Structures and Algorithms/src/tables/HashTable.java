package tables;

public class HashTable {
	// Array container for the table
	private String[] hashTable;

	// number of elements in table 
	private int size;

	// HashTable constructor
	public HashTable(int capacity) {
		// set the capacity to a prime number
		if(isPrime(capacity)) {
			hashTable = new String[capacity];
		} else {
			int primeCapacity = getNextPrime(capacity);
			hashTable = new String[primeCapacity];
			System.out.println("Hash Table changed non-prime capacity to: " + primeCapacity);
		}
		size = 0;
	}

	// return if a number is prime
	private boolean isPrime(int num) {
		int currentNum = num;

		// only need to check half of the number to finds its divisors
		while(currentNum <= num / 2) {
			if(num % currentNum == 0) {
				// the number is divisible
				return false;
			}
			currentNum++;
		}
		return true;
	}

	// return the next available prime number of a number
	private int getNextPrime(int num) {
		int currentNum = num;
		while(!isPrime(currentNum)) {
			currentNum++;
		}
		return currentNum;
	}

	// first hash function, returns the preferred index position for data
	private int hashFunc1(String data) {
		final int ARRAY_SIZE = hashTable.length;

		// preferred index position for data
		int hashVal = Math.abs(data.hashCode() % ARRAY_SIZE);
		return hashVal;
	}

	// second hash function, returns a step size greater than zero
	private int hashFunc2(String data) {
		final int ARRAY_SIZE = hashTable.length;

		// preferred index position for data
		int hashVal = Math.abs(data.hashCode() % ARRAY_SIZE);

		// return stepSize, research says to use a prime number less than array size
		final int SMALLEST_PRIME = 3;
		int stepSize = SMALLEST_PRIME - (hashVal % SMALLEST_PRIME);
		return stepSize;
	}

	// return if the hash table is full
	public boolean isFull() {
		return size == hashTable.length;
	}

	// return if the hash table is empty
	public boolean isEmpty() {
		return size == 0;
	}

	// insert data into the table
	public void insert(String data) {
		if(!isFull()) {
			final int ARRAY_SIZE = hashTable.length;
			int index = hashFunc1(data);
			int stepSize = hashFunc2(data);

			// if there contains data in the index, then utilize double hashing probing
			while(hashTable[index] != null) {
				index = (index + stepSize) % ARRAY_SIZE;
			}
			// insert the data
			hashTable[index] = data;
			size++;		
		} else {
			throw new RuntimeException("The HashTable is full!");
		}
	}

	// find data in the table
	public int find(String data) {
		final int ARRAY_SIZE = hashTable.length;
		int index = hashFunc1(data);
		int stepSize = hashFunc2(data);

		// find the data, and utilize double hashing probing if needed
		while(hashTable[index] != null) {
			if(hashTable[index].equals(data)) {
				return index;
			}
			index = (index + stepSize) % ARRAY_SIZE;
		}
		return -1;
	}

	// return the table as a string
	@Override
	public String toString() {
		String table = "";
		for(int index = 0; index < hashTable.length; index++) {
			if(hashTable[index] != null) {
				// display only non-null indexes
				table += hashTable[index] + "\n";
			}
		}
		return table;
	}
}
