//Write a program to generate tables of 10.
package for_loops;

import java.util.Scanner;

public class forLoop_tables {

	public static void main(String[] args) {
		// Program will prompt user for the input number. Once user provide the input,
		// the program will calculate the tables for the provided input number.

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number for tables...");
		int x = sc.nextInt();
		
		int i;
		for (i = 1; i <= 10; ++i)
			System.out.println(x + " * " + i + " = "+i * x);

	}

	}

