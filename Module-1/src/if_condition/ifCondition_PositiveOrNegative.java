//Write a program to check if  the  number is positive or negative.
//Extend the previous program to check whether the given number is positive, zero or negative.(Hint: use if else conditions)
package if_condition;

import java.util.Scanner;

public class ifCondition_PositiveOrNegative {

	public static void main(String[] args) {

		// case 1
		int number = 109;
		System.out.println(" *****Checking for number 109 ! *****");
		if (number > 0) {
			System.out.println(number + " is a positive number");
		} else if (number < 0) {
			System.out.println(number + " is a negative number");
		} else {
			System.out.println(number + " is neither positive nor negative");
		}

		// case 2
		System.out.println(" *****Checking for number -2019 ! *****");
		number = -2019;
		if (number > 0) {
			System.out.println(number + " is a positive number");
		} else if (number < 0) {
			System.out.println(number + " is a negative number");
		} else {
			System.out.println(number + " is neither positive nor negative");
		}

		// case 3
		System.out.println(" *****Checking for number 0 ! *****");
		number = 0;
		if (number > 0) {
			System.out.println(number + " is a positive number");
		} else if (number < 0) {
			System.out.println(number + " is a negative number");
		} else {
			System.out.println(number + " is neither positive nor negative");
		}

	}
}