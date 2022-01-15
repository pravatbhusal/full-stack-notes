package tables;

public class App {

	// a method to test the table data structures
	public static void main(String[] args) {
		hashTableReference();
	}

	// a method to test the hash table data structure
	public static void hashTableReference() {
		final int CAPACITY = 10;
		HashTable table = new HashTable(CAPACITY);
		table.insert("Table");
		table.insert("Phone");
		table.insert("Milk");
		table.insert("Apple");
		System.out.println(table);
	}
}
