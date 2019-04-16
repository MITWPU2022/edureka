/*Question Statement 1 
 
1. Write a program to accept 5 employee IDs and the corresponding names and their salaries from the user and store them in three arrays. Pass these arrays to a function display() as arguments. This display() will display the content of the arrays in the following format. 
 
ID Name Salary 
00 John 600000 
002 Clark 550000 
003 Nancy 500000 
004 Joe 500000 
005 Mary 300000 
 
Question Statement 2 
 
2. Write another function display() with Employee ID array and Employee name array as arguments. (Note: here we are using concept of function overloading). This function will display the content of the 2 arrays in the following format. 
 
ID Name 
00 John 
002 Clark 
003 Nancy 
004 Joe 
005 Mary 

Question Statement 3 
 
3. Write another function named display() which takes 4 arguments. The arguments are named as String and 3 arrays (Employee id, name and salary). Function prototype looks like: 
display (String name, int regno[], String Empname[], double salary[]).   
This function will search for the name in the Empname array and will display its corresponding id and salary in the below given format. For example, if Divya is given as the name to search then display () function will display the following record. 
 
ID Name Salary 
00 John 600000 
*/
package co.edureka.learning;

import java.util.Scanner;

public class module2Assignment {

	// Displays the arrays.
	void display(int id[], double salary[], String name[]) {

		System.out.println("ID            Name          Salaray");

		int length = id.length;
		for (int i = 0; i < length; ++i) {
			System.out.println(id[i] + "             " + name[i] + "          " + salary[i]);
		}

	}

	// Displays the arrays.
	void display(int id[], String name[]) {

		System.out.println("ID            Name   ");

		int length = id.length;
		for (int i = 0; i < length; ++i) {
			System.out.println(id[i] + "            " + name[i] + "        ");
		}

	}

	// Displays the arrays.
	void display(String searchName, int id[], String name[], double sal[]) {

		System.out.println("ID            Name          Salaray");

		int length = id.length;
		for (int i = 0; i < length; ++i) {

			if (name[i].equals(searchName))
				System.out.println(id[i] + "            " + name[i] + "          " + sal[i]);

		}

	}

	public static void main(String args[]) {
		int id[] = new int[5];
		double salary[] = new double[5];
		String name[] = new String[5];

		// Accepting data from user...

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; ++i) {
			System.out.println("Enter employee record in ID Name salaray format...");
			id[i] = sc.nextInt();
			name[i] = sc.next();
			salary[i] = sc.nextDouble();
		}

		module2Assignment m1 = new module2Assignment();
		m1.display(id, salary, name);
		System.out.println();

		m1.display(id, name);

		System.out.println("Enter a name to search for...");
		String searchName = sc.next();
		m1.display(searchName, id, name, salary);

	}

}
