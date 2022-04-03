//object = an instance of a class that may contain attributes and methods

public class Car {
//	Constructor = special method is called when an object is instantiated(created)
     
	
	
	String make="Chevrolette";
	String model="corvette";
	int year=2020;
	String color="black";
	double price=50000.00;
	public String toString() {
		return this.make+" "+this.model+" "+this.year+" "+this.price;
	}
	void drive() {
		System.out.println("Drivin");
	}
	void brake() {
		System.out.println("Breakin");
	}
}
