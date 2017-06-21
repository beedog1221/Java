// a program that uses the vehicle class

class Vehicle{
	int passengers;
	int fuelcap;
	int mpg;
}

class VehicleDemo{ public static void main(String args[]) {
	Vehicle minivan = new Vehicle();
	int range;
	
	// assign values to fields
	minivan.passengers = 7;
	minivan.fuelcap = 16;
	minivan.mpg = 21;
	
	//compute the range assuming a full tank of gas
	range = minivan.fuelcap * minivan.mpg;
	System.out.println("Minivan can carry " + minivan.passengers + " with  a rang of " + range);
}
}