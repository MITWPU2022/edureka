//Write programs to use all the data types and given arithmetic operations.
//Write program to perform all the arithmetic operations given in the table.
package co.edureka.learning;

public class DataTypesAndOperations {

	public static void main(String[] args) {

//		Java Data Types
//		Byte
//		Short
//		Int
//		Long
//		Float
//		Double
//		Boolean
//		Char

		/*
		 * A. Byte Byte data type is a 8-bit signed two's complement integer Minimum
		 * value is : -128 (-2^7) Maximum value is : 127 (inclusive)(2^7 -1) Default
		 * value is : 0 Byte data type is used to save space in large arrays, mainly in
		 * place of integers, since a byte is four times smaller than an int Syntax :
		 * byte Variable_Name = Value; Example (DataType_Byte.java) :
		 * 
		 */
		System.out.println("***************************byte******************************");
		byte a = 50;
		byte b = (byte) -80;
		byte c = (byte) (a + b);
		System.out.println("Addition : " + c);
		// Write program to perform all the arithmetic operations given in the table.
		System.out.println("Subtraction  : " + (a - b));
		System.out.println("Multiplication  : " + (a * b));
		System.out.println("Division  : " + (a / b));
		System.out.println("Increment   : " + (++a));
		System.out.println("Decrement   : " + (--a));

		/*
		 * B. Short Short data type is a 16-bit signed two's complement integer Minimum
		 * value is : -32,768 (-2^15) Maximum value is : 32,767(inclusive) (2^15 -1)
		 * Default value is : 0 Short data type can also be used to save memory as byte
		 * data type. A short is 2 times smaller than an int Syntax : short
		 * Variable_Name = Value; Example (DataType_Short.java) :
		 */
		System.out.println("***************************short******************************");

		short a1 = 1000;
		short b1 = -1500;
		short c1 = (short) (a1 + b1);
		// Write program to perform all the arithmetic operations given in the table.
		System.out.println("Addition : " + c1);
		System.out.println("Subtraction  : " + (a1 - b1));
		System.out.println("Multiplication  : " + (a1 * b1));
		System.out.println("Division  : " + (a1 / b1));
		System.out.println("Increment   : " + (++a1));
		System.out.println("Decrement   : " + (--a1));
		/*
		 * C. Int Int data type is a 32-bit signed two's complement integer Minimum
		 * value is : -2,147,483,648.(-2^31) Maximum value is :
		 * 2,147,483,647(inclusive).(2^31 -1) Default value is : 0 Int is generally used
		 * as the default data type for integral values unless there is a concern about
		 * memory Syntax : int Variable_Name = Value; Example (DataType_Int.java) :
		 */
		System.out.println("***************************int******************************");
		int a2 = 15000;
		int b2 = -20000;
		int c2 = a2 + b2;
		System.out.println("Addition : " + c2);
		// Write program to perform all the arithmetic operations given in the table.
		System.out.println("Subtraction  : " + (a2 - b2));
		System.out.println("Multiplication  : " + (a2 * b2));
		System.out.println("Division  : " + (a2 / b2));
		System.out.println("Increment   : " + (++a2));
		System.out.println("Decrement   : " + (--a2));
		/*
		 * D. Long Long data type is a 64-bit signed two's complement integer Minimum
		 * value is : -9,223,372,036,854,775,808.(-2^63) Maximum value is :
		 * 9,223,372,036,854,775,807 (inclusive). (2^63 -1) Default value is : 0L This
		 * type is used when a wider range than int is needed Syntax : long
		 * Variable_Name = Value_L; Example (DataType_Long.java) :
		 */
		System.out.println("***************************long******************************");
		long a3 = 1000L;
		long b3 = -2000L;
		long c3 = a3 + b3;
		System.out.println("Addition : " + c3);
		// Write program to perform all the arithmetic operations given in the table.
		System.out.println("Subtraction  : " + (a3 - b3));
		System.out.println("Multiplication  : " + (a3 * b3));
		System.out.println("Division  : " + (a3 / b3));
		System.out.println("Increment   : " + (++a3));
		System.out.println("Decrement   : " + (--a3));
		/*
		 * E. Float Float data type is a single-precision 32-bit IEEE 754 floating point
		 * Default value is : 0.0f Float data type is never used for precise values such
		 * as currency Float is mainly used to save memory in large arrays of floating
		 * point numbers Syntax :
		 * 
		 * float Variable_Name = (float) Value;
		 * 
		 * Example (DataType_Float.java) :
		 * 
		 */
		System.out.println("***************************float******************************");
		float a4 = (float) 10.56;
		float b4 = (float) -23.57;
		float c4 = a4 + b4;
		System.out.println("Addition : " + c4);
		// Write program to perform all the arithmetic operations given in the table.
		System.out.println("Subtraction  : " + (a4 - b4));
		System.out.println("Multiplication  : " + (a4 * b4));
		System.out.println("Division  : " + (a4 / b4));
		System.out.println("Increment   : " + (++a4));
		System.out.println("Decrement   : " + (--a4));
		/*
		 * F. Double double data type is a double-precision 64-bit IEEE 754 floating
		 * point Default value is : 0.0d Double data type should never be used for
		 * precise values such as currency This data type is generally used as the
		 * default data type for decimal values. generally the default choice Syntax :
		 * 
		 * double Variable_Name = Value;
		 * 
		 * Example (DataType_Double.java) :
		 * 
		 */
		System.out.println("***************************double******************************");
		double b5 = -45.894;
		double a5 = -25.894;
		double c5 = a5 + b5;
		System.out.println("Addition : " + c5);
		// Write program to perform all the arithmetic operations given in the table.
		System.out.println("Subtraction  : " + (a5 - b5));
		System.out.println("Multiplication  : " + (a5 * b5));
		System.out.println("Division  : " + (a5 / b5));
		System.out.println("Increment   : " + (++a5));
		System.out.println("Decrement   : " + (--a5));
		/*
		 * G. Boolean boolean data type represents one bit of information There are only
		 * two possible values : true and false This data type is used for simple flags
		 * that track true/false conditions Default value is : false Syntax :
		 * 
		 * boolean Variable_Name = Value (true/false);
		 * 
		 * Example (DataType_Boolean.java) :
		 */
		System.out.println("***************************boolean******************************");
		boolean a6 = true;
		if (a6 == true) {
			a6 = false;
			System.out.println("The Boolean Value is : " + a6);
		}

		/*
		 * H. Char char data type is a single 16-bit Unicode character Minimum value is
		 * : '\u0000' (or 0) Maximum value is : '\uffff' (or 65,535 inclusive) Char data
		 * type is used to store any character Syntax :
		 * 
		 * char Variable_Name = Value;
		 * 
		 * Example (DataType_Char.java) :
		 */
		System.out.println("***************************char******************************");
		char a8 = 'J';
		char b8 = 'A';
		char c8 = 'V';
		char d8 = 'A';
		System.out.println("The Characters Value is : " + a8 + b8 + c8 + d8);
	}
}