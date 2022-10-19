package jdp3e.builder.implementation_1;

/**
 *  The motorcycle director directs the 
 *  motorcycle's instantiation steps.
 */


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
