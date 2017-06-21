//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

class exer12{public static void main(String args[]){
	
	Scanner in = new Scanner(System.in);
	
	int num1, num2, num3;
	
	System.out.println("Enter 3 numbers");
	
	num1 = in.nextInt();
	num2 = in.nextInt();
	num3 = in.nextInt();
	
	System.out.println("Average is: " + ((num1 + num2 + num3) / 3));
}
}