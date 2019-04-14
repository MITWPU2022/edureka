//write a program to reverse the digits of a number
package co.edureka.learning;

import java.util.Scanner;

public class dowhile_ReverseDigits {

	public static void main(String[] args) {

		// Program will prompt user for the input number. Once user provide the input,
		// the program will calculate the reverse number for the provided input number.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for reverse the digit ...");
		int x = sc.nextInt();

		int rem, rev = 0;

		do {
			rem = x % 10;
			rev = rev * 10 + rem;
			x = x / 10;

		} while (x > 0);
		System.out.println("Reversed number is " + rev);

	}

}
