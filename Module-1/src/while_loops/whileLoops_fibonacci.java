
//Write a program to generate 10 Fibonacci numbers.
package while_loops;

import java.util.Scanner;

public class whileLoops_fibonacci {

	public static void main(String[] args) {
		System.out.println("Generate 10 Fibonacci numbers");
		// Program will prompt user for the input number. Once user provide the input,
		// the program will calculate the Fibonacci for the provided input number.

		int f1 = 0;
		int f3 = 1;
		int fact;

		int i = 0;
		while (i < 10) {
			fact = f1 + f3;
			System.out.print(fact + " ");
			f1 = f3;
			f3 = fact;
			++i;
		}

	}

}