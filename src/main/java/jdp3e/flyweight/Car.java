package jdp3e.flyweight;

// A shared flyweight implementation

class Car implements Vehicle {
	/**
	 * This is an intrinsic state: 
	 * 1.It is not supplied by client. 
	 * 2.It is independent of the flyweight’s context.
	 * 3.This can be shared across. 
	 * 4.These data are often immutable.
	 */
	private String description;

	/**
	 * The VehicleFactory will supply this 
	 * inside the flyweight object.
	 */
	public Car(String description) {
		this.description = description;
	}

	// Client supplies the color
	@Override
	public void aboutMe(String color) {
		System.out.print(description + " with " + color + " color.");
	}
}
