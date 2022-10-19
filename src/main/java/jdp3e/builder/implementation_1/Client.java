package jdp3e.builder.implementation_1;

class Client {

	public static void main(String[] args) {
		System.out.println("*** Builder Pattern Demonstration. ***");

		// Making a car
		//Car carToMake=new Car("Ford");		
		Builder builder = new CarBuilder();
		Director director = new CarDirector();
		Vehicle vehicle=director.instruct(builder);		
		vehicle.showProduct();

		// Making a motorcycle
		// MotorCycle motorCycleToMake=new MotorCycle("Honda");
		builder = new MotorCycleBuilder();
		director = new MotorCycleDirector();
		vehicle=director.instruct(builder);		
		vehicle.showProduct();
	}

}
