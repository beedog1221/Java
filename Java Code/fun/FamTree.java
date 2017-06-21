// enter and display names

import java.util.Scanner;

class FamTree{public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	int num;
	String[] names;
	
	System.out.print("How many names?: ");
	num = in.nextInt();
	System.out.println();
	
	// set number of arrays
	names = new String[num];
	
	for(int i = 0; i < names.length; i++){
		System.out.print("Enter name: ");
		names[i] = in.next();
		System.out.println();
	}
	
	System.out.println();
	
	for(int i=0; i < names.length; i++) 
		System.out.println(names[i]);
}
}