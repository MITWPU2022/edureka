//Write a program to find factorial of a number.

package co.edureka.learning;

import java.util.Scanner;

public class whileLoops_factorial {

	public static void main(String[] args) {
		// Program will prompt user for the input number. Once user provide the input,
		// the program will calculate the factorial number for the provided input
		// number.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for Factorial...");
		int x = sc.nextInt();

		int fact = 1;
		int i = 1;
		while (i <= x) {
			fact = fact * i;
			++i;
		}

		System.out.println("Factorial of a number is " + fact);
	}

}
