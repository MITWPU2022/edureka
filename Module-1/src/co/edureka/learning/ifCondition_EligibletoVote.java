//Write a program to check if a candidate is eligible for voting or not. (Hint: Check age)
package co.edureka.learning;

import java.util.Scanner;

public class ifCondition_EligibletoVote {

	public static void main(String[] args) {
////Program will prompt user for the input number. Once user provide the input, the program will check for age for the provided input number.

		int age;
		System.out.println("Eligible for voting");
		System.out.println("Please enter your Age :");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt(); // get age from user
		if (age > 18) {
			System.out.println("You are eligible to vote!");
		} else {
			System.out
					.println("You aren’t eligible to vote! and after " + (18 - age) + " Year you will able to vote !");
		}
	}

}
