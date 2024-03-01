// Zia Anderson
// Chpt5 PA

// import scanner
import java.util.Scanner;

public class StackAsArray {
	// declare global variables
	public static int allocSize;
	public static int maxSize;
	public static int[] stackArray;
	public static int length = 0;
	
	// main class
	public static void main(String[] args) {
		// declare scanner
		Scanner scnr = new Scanner(System.in);

		// prompt user to input allocation size 
		System.out.print("Enter the allocation size of the stack: ");
		allocSize = scnr.nextInt();
		
		// prompt user to input the max length
		System.out.print("Enter the maximum length of the stack: ");
		maxSize = scnr.nextInt();
		System.out.println();
		
		// declare stack array
		stackArray = new int[allocSize];
		
		// push item 1 and output if successful 
		if (push(1)) {
			System.out.println("Item 1 was pushed successfully.");
		}
		else {
			System.out.println("Item 1 was pushed unsuccessfully.");
		}
		
		// push item 2 and output if successful
		if (push(2)) {
			System.out.println("Item 2 was pushed successfully.");
		}
		else {
			System.out.println("Item 2 was pushed unsuccessfully.");
		}
		
		// output the top item on the stack array 
		System.out.println("The top item on the stack is: " + peek());
		
		// push item 3 and output if successful
		if (push(3)) {
			System.out.println("Item 3 was pushed successfully.");
		}
		else {
			System.out.println("Item 3 was pushed unsuccessfully.");
		}
		
		// output the length of the stack array 
		System.out.println("The length of the stack is: " + length);
		System.out.println();
		
		// pop item and output popped item 
		System.out.println("The item popped from the stack was " + pop());
		
		// output the top item on the stack array 
		System.out.println("The top item on the stack is: " + peek());
		System.out.println();
		
		// push item 4 and output if successful
		if (push(4)) {
			System.out.println("Item 4 was pushed successfully.");
		}
		else {
			System.out.println("Item 4 was pushed unsuccessfully.");
		}
		System.out.println();
		
		// output all items in the stack array 
		printStack();
		
		// push item 5 and output if successful
		if (push(5)) {
			System.out.println("Item 5 was pushed successfully.");
		}
		else {
			System.out.println("Item 5 was pushed unsuccessfully.");
		}
		
		// pop item and output popped item 
		System.out.println("The item popped from the stack was " + pop());
		
		// push item 6 and output if successful
		if (push(6)) {
			System.out.println("Item 6 was pushed successfully.");
		}
		else {
			System.out.println("Item 6 was pushed unsuccessfully.");
		}
		System.out.println();
		
		// output all items in the stack array 
		printStack();
		
		// pop item and output popped item
		System.out.println("The item popped from the stack was " + pop());
		
		// output whether the stack array is empty is true or false
		System.out.println("The stack is empty: " + isEmpty());
		System.out.println();
		
		// pop three items and output three items popped 
		System.out.println("The item popped from the stack was " + pop());
		System.out.println("The item popped from the stack was " + pop());
		System.out.println("The item popped from the stack was " + pop());
		
		// output whether the stack is empty is true or false 
		System.out.println("The stack is empty: " + isEmpty());

	}
	
	// method to resize the stack array 
	public static void stackResize() {
		int newSize = allocSize * 2;
		
		if (maxSize > 0) {
			newSize = maxSize;
		}
		
		int[] newArray = new int[newSize];
		
		for (int i = 0; i < length; i++) {
			newArray[i] = stackArray[i];
		}
		
		stackArray = newArray;
		allocSize = newSize;
	}
	
	// method to add new item to stack array 
	public static boolean push(int item) {
		if (length == maxSize) {
			return false;
		}
		if (length == allocSize) {
			stackResize();
		}
		stackArray[length] = item;
		length++;
		return true;
	}
	
	// method to cut last item from stack array 
	public static int pop() {
		int popped = stackArray[length - 1];
		length = length - 1;
		return popped;
	}
	
	// method to check if the stack array is empty or not
	public static boolean isEmpty() {
		if (length  == 0) {
			return true;
		}
		return false;
	}
	
	// method that returns the item on the top of the array 
	public static int peek() {
		return stackArray[length - 1];
	}
	
	// method to print all items in stack array 
	public static void printStack() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
		}
		else {
			System.out.println("The Stack contents are the following: ");
			for (int i = length - 1; i > -1; i--) {
				System.out.println(stackArray[i]);
			}
			System.out.println();
		}
	}
	
}