/*Question Statement 2 
 
2. Write another function display() with Employee ID array and Employee name array as arguments. (Note: here we are using concept of function overloading). This function will display the content of the 2 arrays in the following format. 
 
ID Name 
00 John 
002 Clark 
003 Nancy 
004 Joe 
005 Mary */
package Question.Statement_3;

import java.util.IdentityHashMap;
import java.util.Scanner;

class Employee {

}

public class Question {

	public static void main(String[] args) {

		// Program will prompt user for the input number. Once user provide the input,
		// the program will store the value in array for the provided input

		System.out.println("kindly confirm employee's number !");
		Scanner scan = new Scanner(System.in);
		// take limit for array
		int limit = scan.nextInt();
		// array declaration
		int[] id = new int[limit];
		String[] Name = new String[limit];
		double[] Salary = new double[limit];
		// Accepting data from user...
		for (int j = 0; j < limit; j++) {
			System.out.println("Please enter employee details as ID, Name, Salary!");
			System.out.println("Please enter ID");
			id[j] = scan.nextInt();
			System.out.println("Please enter Name");
			Name[j] = scan.next();
			System.out.println("Please enter Salary");
			Salary[j] = scan.nextDouble();

		}
		// class
		Question q = new Question();
		// funcation call
		q.display(id, Salary, Name);
		// concept of function overloading
		q.display(id, Salary);

		System.out.println("\n\nEnter employee's name to search for...");
		String searchName = scan.next();
		q.display(searchName, id, Name, Salary);

	}/*
		 * Write another function named display() which takes 4 arguments. The arguments
		 * are named as String and 3 arrays (Employee id, name and salary). Function
		 * prototype looks like: display (String name, int regno[], String Empname[],
		 * double salary[]).
		 */
	// Displays the arrays.

	void display(String searchName, int id[], String name[], double sal[]) {

		System.out.println("ID            Name          Salaray");

		int length = id.length;
		for (int i = 0; i < length; ++i) {

			if (name[i].equals(searchName))
				System.out.println(id[i] + "            " + name[i] + "          " + sal[i]);

		}

	}

	// Displays overloadind.
	void display(int id[], double salary[]) {
		System.out.println("\n\n\n***********************Employee Details *****************************************");
		System.out.println("ID                 Salaray");

		int length = id.length;
		for (int i = 0; i < length; ++i) {
			System.out.println(id[i] + "           " + "       " + salary[i]);
		}

	}

	// Displays the arrays.
	void display(int id[], double salary[], String name[]) {
		System.out.println("***********************Employee Details *****************************************");
		System.out.println("ID            Name          Salaray");

		int length = id.length;
		for (int i = 0; i < length; ++i) {
			System.out.println(id[i] + "             " + name[i] + "            " + salary[i]);
		}

	}

}
