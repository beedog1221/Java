/* a simple generic class
here, T is a type parameter that 
will be replaced by a real typewhen an object of type Gen is created
*/

class Gen<T> {
	T ob; // declare an object of type T
	// pass the constructor a reference to an object of type T.
	
	Gen(T o) {
		ob = o;
	}
	
	// return ob
	T getob() {
		return ob;
	}
	
	// show type of T.
	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}

class GenDemo {public static void main(String args[]) {
	// create a Gen reference to integers.
	Gen<Integer> iob;
	
	//creat a Gen<interger> object and assign its
	// reference to iob. notice the use of autoboxing
	// to encapsulate the value 88 within an integer object
	iob = new Gen<Integer>(88);
	
	// show the type of data used by iob.
	iob.showType();
	
	//get the vaulue in iob. notice that
	// no cast is needed
	int v = iob.getob();
	System.out.println("value: " + v);
	
	System.out.println();
	
	//create a Gen object for strings.
	Gen<String> strOb = new Gen<String>("Generics test");
	
	//show the type of data used by strOb.
	strOb.showType();
	
	//get the value of strOb. again, notice
	// that no cast is needed.
	String str = strOb.getob();
	System.out.println("value: " + str);
}
}