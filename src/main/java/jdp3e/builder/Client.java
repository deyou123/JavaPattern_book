package jdp3e.builder;

import java.util.LinkedList;

//The common interface
interface Builder {
	void addBrandName();

	void buildBody();

	void insertWheels();

	// The following method is used to
	// retrieve the object that is constructed.	 
	Vehicle getVehicle();
}

//The CarBuilder builds cars.

class CarBuilder implements Builder {

	Car car;

	public CarBuilder(Car car) {
		this.car=car;
	}
    @Override
	public void addBrandName() {
		// Starting with brand name
		car.add(" Adding the car brand:" + car.brandName);
	}
    @Override
	public void buildBody() {
		car.add(" Making the car body.");
	}

	public void insertWheels() {
		car.add(" 4 wheels are added to the car.");
	}
	
	@Override
	public Vehicle getVehicle() {
		return car;
	}
	
}

//The MotorCycleBuilder builds motorcycles.

class MotorCycleBuilder implements Builder {
	
	MotorCycle motorCycle;
	

	public MotorCycleBuilder(MotorCycle motorCycle) {
		this.motorCycle=motorCycle;
	}

	public void addBrandName() {
		motorCycle.add(" Adding the brand name: "+ motorCycle.brandName);
	}

	public void buildBody() {
		motorCycle.add(" Making the body of the motorcycle.");
	}

	public void insertWheels() {
		motorCycle.add(" 2 wheels are added to the motorcycle.");
	}

	public Vehicle getVehicle() {
		return motorCycle;
	}
}

// Vehicle(Product) class 

// Making the class abstract, so that 
// you cannot instantiate from it directly.

abstract class Vehicle {
	/*
	 * You can use any data structure that you prefer. 
	 * I have used LinkedList<String> in this case.
	 */
	private LinkedList<String> parts;

	public Vehicle() {
		parts = new LinkedList<String>();
	}

	public void add(String part) {
		// Adding parts
		parts.addLast(part);
	}

	public void showProduct() {
		System.out.println("These are the construction sequence:");
		for (String part : parts)
			System.out.println(part);
	}
}
class Car extends Vehicle{
	String brandName;
	public Car(String brandName) {
		this.brandName=brandName;
		System.out.println("\nWe are about to make a " + brandName+ " car.");
	}
}

class MotorCycle extends Vehicle{
	String brandName;
	public MotorCycle(String brandName) {
		this.brandName=brandName;
		System.out.println("\nWe are about to make a " + brandName+ " motorcycle.");
	}
}


// Director class 

abstract class Director {
	// Director knows how to use/instruct the
	// builder to create a vehicle.
	public abstract Vehicle instruct(Builder builder);

}

// The CarDirector directs car's instantiation steps.

class CarDirector extends Director {
	// The car director follows
	// its own sequence:
	// Make body-> add wheels->then add the brand name.
	public Vehicle instruct(Builder builder) {
		builder.buildBody();
		builder.insertWheels();
		builder.addBrandName();
		return builder.getVehicle();
	}
}

// The MotorCycleDirector directs motorcycle's instantiation steps.

class MotorCycleDirector extends Director {
	// The motor cycle director follows
	// its own sequence:
	// Add brand name-> make body-> insert wheels.
	public Vehicle instruct(Builder builder) {
		builder.addBrandName();
		builder.buildBody();
		builder.insertWheels();
		return builder.getVehicle();
	}
}

class Client {

	public static void main(String[] args) {
		System.out.println("***Builder Pattern Demo***");

		// Making a car
		Car car=new Car("Ford");		
		Builder builder = new CarBuilder(car);
		Director director = new CarDirector();
		Vehicle vehicle=director.instruct(builder);		
		vehicle.showProduct();

		// Making a motorcycle
		MotorCycle motorCycle=new MotorCycle("Honda");
		builder = new MotorCycleBuilder(motorCycle);
		director = new MotorCycleDirector();
		vehicle=director.instruct(builder);		
		vehicle.showProduct();
	}

}
