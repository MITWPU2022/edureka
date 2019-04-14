//	Write a program to print 10 even numbers and 10 odd numbers.
package for_loops;

public class forLoop_evenAndOdd_ {

	public static void main(String[] args) {
		System.out.println("Even numbers...");
		for (int i = 0; i < 10; i = i + 2)
			System.out.print(i + " ");

		System.out.println("\nOdd numbers...");
		for (int i = 1; i < 10; i = i + 2)
			System.out.print(i + " ");

	}

}
