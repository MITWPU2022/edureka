//Write a program to add the digits of a number.
package co.edureka.learning;

import java.util.Scanner;

public class dowhile_addDigitsOfNumber {
	public static void main(String[] args) {
		// Program will prompt user for the input number. Once user provide the input,
		// the program will add the digits for the provided input number.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for  add the digits...");
		int x = sc.nextInt();

		int rem, sum = 0;

		do {
			rem = x % 10;
			sum = sum + rem;
			x = x / 10;
		} while (x > 0);
		System.out.println("Added digits of a number is " + sum);
	}

}
