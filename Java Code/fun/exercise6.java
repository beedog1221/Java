// write java program two print the addition, multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner;

class exercise6{public static void main(String args[]){
	int num1, num2;
	
	// create scanner
	Scanner in = new Scanner(System.in);
	
	//get intputs
	System.out.println("First number");
	num1 = in.nextInt();
	
	System.out.println("Second number");
	num2 = in.nextInt();
	
	//print equations
	
	//addition
	System.out.println( num1 + " + " + num2 + " = " + (num1 + num2));
	
	//multiply
	System.out.println( num1 + " * " + num2 + " = " + (num1 * num2));
	
	//subtract
	System.out.println( num1 + " - " + num2 + " = " + (num1 - num2));
	
	// divide
	System.out.println( num1 + " / " + num2 + " = " + (num1 / num2));
	
	//remainder
	System.out.println( num1 + " mod " + num2 + " = " + (num1 % num2));
	
}
}