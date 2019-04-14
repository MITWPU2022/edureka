//Write a program to add the digits of a number.
package for_loops;

import java.util.Scanner;

public class forLoop_digits {

	public static void main(String[] args) {
		// Program will prompt user for the input number. Once user provide the input,
		// the program will add the digits for the provided input number.

		int num, rem = 0, sum = 0, temp;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a Number : ");
		num = scan.nextInt();

		temp = num;

		while (num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}

		System.out.print("Sum of Digits of " + temp + " is " + sum);
	}
}