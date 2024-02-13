// Zia Anderson
// Chpt2 PA

class BubbleSort {
	// define bubbleSort method
	static void bubbleSort(int[] array, int length) {
		
		// compare array values
		for (int i =0; i <= length - 2; i++) {
			for (int j = 0; j <= length - 2; j++) {
				if (array[j] > array[j+1]) {
					// switch values
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		
	
	}
	
	// define main class
	public static void main(String[] args) {
		// declare array and length
		int myArray[] = {93, 52, 72, 42, 3, 63, 100, 19, 61, 44, 21, 98, 6, 41, 78, 5, 51, 60, 67, 11};
		int arrayLength = myArray.length;
		
		// call method to use bubble sort to sort array
		bubbleSort(myArray, arrayLength);
		
		// output the sorted array to the user
		System.out.print("The sorted array is: ");
		for (int i = 0; i < arrayLength; i++) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
		
	}
}