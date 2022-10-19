package jdp3e.builder.implementation_1;

/**
 * The CarDirector directs the 
 * car's instantiation steps.
 */

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
