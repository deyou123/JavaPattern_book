package jdp3e.strategy;

// Capability to fly

class FlyBehavior implements VehicleBehavior {
	@Override
	public void showDetail(Vehicle vehicle) {
		System.out.println("The " + vehicle.getVehicle() + " can fly now.\n");

	}
}
