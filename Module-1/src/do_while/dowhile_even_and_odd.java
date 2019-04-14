//	Write a program to print 10 even numbers and 10 odd numbers.

package do_while;

public class dowhile_even_and_odd {

	public static void main(String[] args) {
		
		int i = 0;
		System.out.println("Even numbers...");
		i = 0;
		do
		{
			System.out.print(i +" ");
			 i = i + 2;
		}while ( i < 10);
		
		System.out.println("\nOdd numbers...");
		i = 1;
		do
		{
			System.out.print(i + " ");
			 i = i + 2;
		}while ( i < 10);
	}

}
