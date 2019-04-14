
//Write a program to generate 10 Fibonacci numbers.
package for_loops;

import java.util.Scanner;

public class forLoop_Factorial {

	public static void main(String[] args) {
		// Program will prompt user for the input number. Once user provide the input,
		// the program will calculate the Fibonacci for the provided input number.

		// System.out.println("A program to find factorial of a number.");
		System.out.println("Enter a Numner for factorial !");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int fact = 1;
		for (int i = 1; i <= n; ++i)
			fact = fact * i;

		System.out.println("Factorial of a number is " + fact);

	}

}
