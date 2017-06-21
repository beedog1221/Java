//Write a Java program to swap two variables.

class exer15{public static void main(String args[]){
	
	int num1 = 5;
	int num2 = 16;
	int temp;
	
	System.out.println("num1 is " + num1);
	System.out.println("num2 is " + num2);
	
	temp = num1;
	num1 = num2;
	num2 = temp;
	
	System.out.println("num1 is " + num1);
	System.out.println("num2 is " + num2);
}
}