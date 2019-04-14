//3) Write a program to generate tables of 10.
package do_while;

import java.util.Scanner;

public class dowhile_tables {

	public static void main(String[] args) {
		// Program will prompt user for the input number. Once user provide the input,
		// the program will calculate the tables for the provided input number.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for tables...");
		int x = sc.nextInt();

		int i = 1;
		do {
			System.out.println(x + " * " + i + " = " + i * x);
			++i;
		} while (i <= 10);

	}

}
