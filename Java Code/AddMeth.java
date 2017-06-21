// a program that uses the vehicle class

class Vehicle{
	int passengers;
	int fuelcap;
	int mpg;
	
	// display range
	void range() {
		System.out.println("Range is " + fuelcap * mpg);
	}
}

class AddMeth{ public static void main(String args[]) {
	Vehicle minivan = new Vehicle();
	Vehicle sportscar = new Vehicle();
	int range1, range2;
	
	// assign values to fields
	minivan.passengers = 7;
	minivan.fuelcap = 16;
	minivan.mpg = 21;
	
	//assign value to sportscar
	sportscar.passengers = 2;
	sportscar.fuelcap = 14;
	sportscar.mpg = 12;
	
	
	System.out.println("Minivan can carry " + minivan.passengers + ". ");
	minivan.range(); // display range of minivan
	
	System.out.println("Sprts car can carry " + sportscar.passengers + ". ");
	sportscar.range();// display range of sportscar
}
}