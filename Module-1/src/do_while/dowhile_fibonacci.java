//Write a program to generate 10 Fibonacci numbers.
package do_while;

import java.util.Scanner;

public class dowhile_fibonacci {

	public static void main(String[] args) {
		System.out.println("Generate 10 Fibonacci numbers!");
		int f1 = 0, f2 = 1, fact;
		int i = 0;
		do {
			fact = f1 + f2;
			System.out.print(fact + " ");
			f1 = f2;
			f2 = fact;
			++i;
		} while (i < 10);

	}

}