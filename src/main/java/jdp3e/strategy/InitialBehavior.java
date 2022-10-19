package jdp3e.strategy;

/** 
 * This class used to show the initial 
 * behavior of a vehicle. It cannot do
 * anything special.
 */

class InitialBehavior implements VehicleBehavior {
	@Override
	public void showDetail(Vehicle vehicle) {

		System.out.println("The " + vehicle.getVehicle() + " is in born state.");
		System.out.println("It cannot do anything special.\n");
	}
}