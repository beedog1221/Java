//exercise 5, take two numbers as input and multiply them

import java.util.Scanner;

class InputMult{public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	int n, m;
	
	System.out.print("Enter numbers to be used");
	System.out.print("first number: ");
	n = in.nextInt();
	System.out.println();
	
	System.out.print("second number: ");
	m = in.nextInt();
	System.out.println();
	
	System.out.println( n + " x " + m + " = " + n*m);
}
}