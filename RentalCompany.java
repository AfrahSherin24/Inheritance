// A rental company has a parent class Vehicle with methods start() and stop().
// The subclasses Car and Bike inherit these methods and have their own method
// called displayType().
//
//Implement inheritance and demonstrate how both subclasses reuse 
//the parent class methods.

package FirstProgram;

class Vehicle{
	void start() {
		System.out.println("started");
	}
	
	void stop() {
		System.out.println("stoped");
	}
}

class Car extends Vehicle{
	void displayType() {
		System.out.println("Maruti");
	}
}

class Bike extends Vehicle{
	void displayType() {
		System.out.println("honda");
	}
	
}

public class RentalCompany {
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.displayType();
		c.stop();
		
		Bike b = new Bike();
		b.start();
		b.displayType();
		b.stop();
	}

}
