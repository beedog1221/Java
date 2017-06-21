//take a number input and print it's multiplication table up to 10

import  java.util.Scanner;

class exer7{public static void main(String args[]){
	
	// create scanner
	Scanner in = new Scanner(System.in);
	
	int num;
	
	// gather number
	System.out.println("Enter number: ");
	num = in.nextInt();
	
	//print multiplicationi table
	for(int i = 1; i <= 10; i++)
		System.out.println(num + " x " + i + " = " + (num*i));
}
}