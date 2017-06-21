// demonstrate two simple lambda expressions.

// a functional interface
interface MyValue {
	double getValue();
}

//another functional interface
interface MyParamValue {
	double getValue(double v);
}

class LambdaDemo { public static void main(String args[]) {
		
		MyValue myVal;
		
		//here, the lambda expression is simply a constant expression.
		//when it is assigned to myVal, a class instance is 
		//constructed in which the lambda expression implements
		//the getValue() method in MyValue.
		myVal = () -> 98.6;
		
		//call getValue(), which is provided by the previously assigned lambda expression.
		System.out.println("A constant value: " + myVal.getValue());
		
		// now, create a parameterized lambda expression and assign it to a MyParamValue reference. this
		// lambda expression returns the reciprocal of its argument.
		MyParamValue myPval = (n) -> 1.0 / n;
		
		// call getValue(v) through the myPval reference
		System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));
		System.out.println("Reciprocal of 8 is " + myPval.getValue(8.0));
		
		// a lambda expression must be compatible with the method
		// defined by the functional interface. therefore, these won't work:
		// myVal = () -> "three"; // Error! string not compatible with double.
		// myPval = () -> Math.random(); // error! parameter required.
}
}