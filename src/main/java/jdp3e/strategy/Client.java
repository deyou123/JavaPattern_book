package jdp3e.strategy;

// Client

class Client {

	public static void main(String[] args) {

		System.out.println("***Strategy Pattern Demo.***\n");
		Vehicle vehicle = new Vehicle("airplane");
		VehicleSupervisor supervisor=new VehicleSupervisor(new InitialBehavior());
		supervisor.displayDetail(vehicle);
		
		System.out.println("Setting flying capability to it.");
		supervisor.setVehicleBehavior(new FlyBehavior());
		supervisor.displayDetail(vehicle);

		System.out.println("Changing the vehicle behavior again.");
		supervisor.setVehicleBehavior(new FloatBehavior());
		supervisor.displayDetail(vehicle);
		
	}
}
