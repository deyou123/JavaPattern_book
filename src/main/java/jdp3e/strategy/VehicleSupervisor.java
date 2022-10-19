package jdp3e.strategy;


/**
 * The VehicleSupervisor class represents the
 * context class in this example.
 */

class VehicleSupervisor {	
	
	VehicleBehavior behavior;

	public VehicleSupervisor(VehicleBehavior behavior) {
		this.behavior = behavior;
	}

	/**
	 * You can use this method when you want to change
	 * the "vehicle behavior" on the fly.
	 */
	public void setVehicleBehavior(VehicleBehavior behavior) {
		this.behavior = behavior;
	}

	/**
	 * Delegates the behavior to the object referenced by
	 * a vehicle.	
	 */
	public void displayDetail(Vehicle vehicle)  {
		behavior.showDetail(vehicle);		
	}
}