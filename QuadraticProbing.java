// Zia Anderson
//Chpt6 PA

public class QuadraticProbing {
	// declare public static variables
	public static int[] hashTable;
	public static int bucket;
	public static int bucketsProbed;
	public static int i;
	// declare and initialize public static variables
	public static int hashTableSize = 16;
	public static int c1 = 1;
	public static int c2 = 1;
	
	// define main class
	public static void main(String[] args) {
		
		// declare and initialize hash table 
		hashTable = new int[hashTableSize];
		for (i = 0; i < hashTableSize; i++) {
            hashTable[i] = -1;
        }
		
		// insert item 32 and output whether successful or not
		if (hashInsert(32)) {
			System.out.println("Item 32 was inserted successfully.");
		}
		else {
			System.out.println("Item 32 was inserted unsuccessfully.");
		}
		
		// insert item 63 and output whether successful or not
		if (hashInsert(63)) {
			System.out.println("Item 63 was inserted successfully.");
		}
		else {
			System.out.println("Item 63 was inserted unsuccessfully.");
		}
		
		// insert item 16 and output whether successful or not
		if (hashInsert(16)) {
			System.out.println("Item 16 was inserted successfully.");
		}
		else {
			System.out.println("Item 16 was inserted unsuccessfully.");
		}
		
		// insert item 3 and output whether successful or not
		if (hashInsert(3)) {
			System.out.println("Item 3 was inserted successfully.");
		}
		else {
			System.out.println("Item 3 was inserted unsuccessfully.");
		}
		
		// insert item 23 and output whether successful or not
		if (hashInsert(23)) {
			System.out.println("Item 23 was inserted successfully.");
		}
		else {
			System.out.println("Item 23 was inserted unsuccessfully.");
		}
		
		// insert item 11 and output whether successful or not
		if (hashInsert(11)) {
			System.out.println("Item 11 was inserted successfully.");
		}
		else {
			System.out.println("Item 11 was inserted unsuccessfully.");
		}
		
		// insert item 64 and output whether successful or not
		if (hashInsert(64)) {
			System.out.println("Item 64 was inserted successfully.");
		}
		else {
			System.out.println("Item 64 was inserted unsuccessfully.");
		}
		
		// insert item 99 and output whether successful or not
		if (hashInsert(99)) {
			System.out.println("Item 99 was inserted successfully.");
		}
		else {
			System.out.println("Item 99 was inserted unsuccessfully.");
		}
		
		// insert item 42 and output whether successful or not
		if (hashInsert(42)) {
			System.out.println("Item 42 was inserted successfully.");
		}
		else {
			System.out.println("Item 42 was inserted unsuccessfully.");
		}
		
		// insert item 49 and output whether successful or not
		if (hashInsert(49)) {
			System.out.println("Item 49 was inserted successfully.");
		}
		else {
			System.out.println("Item 49 was inserted unsuccessfully.");
		}
		
		// insert item 48 and output whether successful or not
		if (hashInsert(48)) {
			System.out.println("Item 48 was inserted successfully.");
		}
		else {
			System.out.println("Item 48 was inserted unsuccessfully.");
		}
		
		// insert item 21 and output whether successful or not
		if (hashInsert(21)) {
			System.out.println("Item 21 was inserted successfully.");
		}
		else {
			System.out.println("Item 21 was inserted unsuccessfully.");
		}
		System.out.println();
		
		// output all contents in the hash table
		displayHashTable();
		
		// remove item 32 and output whether successful or not
		if (hashRemove(32)) {
			System.out.println("Item 32 was removed successfully.");
		}
		else {
			System.out.println("Item 32 was removed unsuccessfully.");
		}
		
		// remove item 11 and output whether successful or not
		if (hashRemove(11)) {
			System.out.println("Item 11 was removed successfully.");
		}
		else {
			System.out.println("Item 11 was removed unsuccessfully.");
		}
		
		// search for item 64 and output where is was found if at all
		bucket = hashSearch(64);
		if (bucket == 0) {
			System.out.println("Item 64 was not found.");
		} 
		else {
			System.out.println("Item 64 was found in bucket " + bucket);
		}
		
		// insert item 9 and output whether successful or not
		if (hashInsert(9)) {
			System.out.println("Item 9 was inserted successfully.");
		}
		else {
			System.out.println("Item 9 was inserted unsuccessfully.");
		}
		
		// search for item 48 and output where is was found if at all
		bucket = hashSearch(48);
		if (bucket == 0) {
			System.out.println("Item 48 was not found.");
		} 
		else {
			System.out.println("Item 48 was found in bucket " + bucket);
		}
		
		// search for item 32 and output where is was found if at all
		bucket = hashSearch(32);
		if (bucket == 0) {
			System.out.println("Item 32 was not found.");
		} 
		else {
			System.out.println("Item 32 was found in bucket " + bucket);
		}
		
		// remove item 64 and output whether successful or not
		if (hashRemove(64)) {
			System.out.println("Item 64 was removed successfully.");
		}
		else {
			System.out.println("Item 64 was removed unsuccessfully.");
		}
		
		// remove item 99 and output whether successful or not
		if (hashRemove(99)) {
			System.out.println("Item 99 was removed successfully.");
		}
		else {
			System.out.println("Item 99 was removed unsuccessfully.");
		}
		System.out.println();
		
		// output all contents in the hash table
		displayHashTable();
		
	}
	
	// method that returns bucket number
	public static int hash(int key) {
		return key % hashTableSize;
	}
	
	// method to insert a value into the hash table 
	public static boolean hashInsert(int item) {
		i = 0;
		bucketsProbed = 0;
		
		// determine initial bucket
		bucket = hash(item);

		while (bucketsProbed < hashTableSize) {
			// insert item in next empty bucket
			if (hashTable[bucket] == -1 || hashTable[bucket] == -2) {
				hashTable[bucket] = item;
				// returns booelan value of true if item is inserted 
				return true;
			}
			
			// increment i and bucketsProbed 
			// recompute bucket number 
			i++;
			bucket = (hash(item) + c1 * i + c2 * i * i) % hashTableSize;
			bucketsProbed++;
		}
		
		// if item not found will return false 
		return false;
		
	}
	
	// method to remove a value from the hash table 
	public static boolean hashRemove(int item) {
		i = 0;
		bucketsProbed = 0;
		
		// determine initial bucket
		bucket = hash(item);
		
		while ((hashTable[bucket] != -1) && (bucketsProbed < hashTableSize)) {
			// check if bucket is occupied and if the item equals the value of the index 
			if ((hashTable[bucket] != -1 || hashTable[bucket] != -2) && (hashTable[bucket] == item)) {
				// change value in bucket to removed after value of -2
				hashTable[bucket] = -2;
				// returns true if item is able to be removed
				return true;
			}
			
			// increment i and bucketsProbed
			// recompute bucket number
			i++;
			bucket = (hash(item) + c1 * i + c2 * i * i) % hashTableSize;
			bucketsProbed++;
		}
		
		// returns false if item unable to be removed 
		return false;
	}
	
	// method to search through the hash table for a value and return the bucket number 
	public static int hashSearch(int item) {
		i = 0;
		bucketsProbed = 0;
		
		// determine initial bucket 
		bucket = hash(item);
		while ((hashTable[bucket] != -1) && (bucketsProbed < hashTableSize)) {
			// checks if bucket is occupied and if the item equals the bucket item
			if ((hashTable[bucket] != -1 || hashTable[bucket] != -2) && (hashTable[bucket] == item)) {
				// returns item in bucket value if found
				return bucket;
			}
			
			// increment i and bucketsProbed
			// recompute bucket number
			i++;
			bucket = (hash(item) + c1 * i + c2 * i * i) % hashTableSize;
			bucketsProbed++;
		}
	
		// returns 0 if item was not found in hash table 
		return 0;
	}
	
	// method to display all contents in the hash table
	public static void displayHashTable() {
		int i;
		
		// output function for array values
        System.out.println("The hash table contents are: ");
        for (i = 0; i < hashTableSize; i++) {
            System.out.println("HashTable[" + i + "] is " + hashTable[i]);
        }
        System.out.println();
	}
	
}