package jdp3e.strategy;

// Capability to float

class FloatBehavior implements VehicleBehavior {
	
	@Override
	public void showDetail(Vehicle vehicle) {
		System.out.println("The " + vehicle.getVehicle() + " can float now.\n");
		
	}
}