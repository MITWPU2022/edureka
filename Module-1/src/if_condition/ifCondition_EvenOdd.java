//Write a program to check given number is even or odd. (Hint: use % operator)
package if_condition;

import java.util.Scanner;

public class ifCondition_EvenOdd {

	public static void main(String[] args) {
		//// Program will prompt user for the input number. Once user provide the input,
		//// the program will check for even and odd number for the provided input
		//// number.

		System.out.println("Lets check even or odd number !");
		System.out.println("Please enter Numner  :");
		Scanner scan = new Scanner(System.in);
		int f = scan.nextInt();
		if (f % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("odd");
	}

}
