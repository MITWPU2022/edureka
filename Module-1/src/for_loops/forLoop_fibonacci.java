//Write a program to generate 10 Fibonacci numbers.
package for_loops;

import java.util.Scanner;

public class forLoop_fibonacci {

	public static void main(String[] args) {
		System.out.println("Generate 10 Fibonacci numbers!");

		int f1 = 0, f2 = 1, fact;
		for (int i = 0; i < 10; ++i) {
			fact = f1 + f2;
			System.out.print(fact + " ");
			f1 = f2;
			f2 = fact;
		}

	}

}