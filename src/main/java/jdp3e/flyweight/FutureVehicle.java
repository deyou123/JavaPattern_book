package jdp3e.flyweight;

// An unshared flyweight implementation
class FutureVehicle implements Vehicle {
	/**
	 * This is an intrinsic state: 
	 * 1.It is not supplied by client. 
	 * 2.It is independent of the flyweight’s context. 
	 * 3.This can be shared across. 
	 * 4.These data are often immutable.
	 */
	private String description;

	public FutureVehicle(String description) {
		this.description = description;
	}

	// Client cannot choose color for FutureVehicle.
	// It is an unshared flyweight.
	// So, we ignore the client's input.

	@Override
	public void aboutMe(String color) {
		System.out.print(description + " with " + "a blue (default) color.");
	}
}
