//Write a program to find largest of two numbers.

package if_condition;

import java.util.Scanner;

public class ifCondition_largestOfTwo {

	public static void main(String[] args) {
		//// Program will prompt user for the input number. Once user provide the input,
		//// the program will check for largest for the provided input number.

		System.out.println("Lets check largest number !");
		System.out.println("Please enter 1st Numner  :");
		Scanner scan = new Scanner(System.in);
		int f = scan.nextInt();
		System.out.println("Please enter 2nd Numner  :");
		int s = scan.nextInt();
		if (f == s)
			System.out.println("Both number are same ");
		else if (f < s)
			System.out.println("largest number is " + s);
		else
			System.out.println("largest number is " + f);

	}

}
