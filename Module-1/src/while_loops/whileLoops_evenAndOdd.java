//	Write a program to print 10 even numbers and 10 odd numbers.

package while_loops;

public class whileLoops_evenAndOdd {

	public static void main(String[] args) {

		int i = 0;
		System.out.println("Even numbers...");
		i = 0;
		while (i <= 10) {
			System.out.print(i + " ");
			i = i + 2;
		}

		System.out.println("\nOdd numbers...");
		i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i = i + 2;
		}
	}

}
