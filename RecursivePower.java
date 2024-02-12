// Zia Anderson
// Chpt2 PA


// import scanner object //
import java.util.Scanner;

class RecursivePower {
	// define recursive method //
	static int power(int exponent, int base) {
		
		// calculate exponential sum and return to main //
		if (exponent != 0) {
			return base * power(exponent-1, base);
		}
		else {
			return 1;
		}
		
	}

	// defining main class //
	public static void main(String[] args) {
		// declaring scanner object //
		Scanner scnr = new Scanner(System.in);
		// declaring variables //
		int base;
		int exponent;
		int sum;
		
		// retrieve base value from user //
		System.out.print("Enter base: ");
		base = scnr.nextInt();
		
		// retrieve exponent value from user //
		System.out.print("Enter exponent: ");
		exponent = scnr.nextInt();
		
		// using recursive method to calculate sum //
		sum = power(exponent, base);
		
		// outputting sum to user //
		System.out.println("Value is " + sum);
		
	}
}
		