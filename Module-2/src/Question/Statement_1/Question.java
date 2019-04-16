/*1. Write a program to accept 5 employee IDs and the corresponding names and their salaries from the user and store them in three arrays. Pass these arrays to a function display() as arguments. This display() will display the content of the arrays in the following format. 
 
ID Name Salary 
00 John 600000 
002 Clark 550000 
003 Nancy 500000 
004 Joe 500000 
005 Mary 300000 */

package Question.Statement_1;

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
		// input
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
