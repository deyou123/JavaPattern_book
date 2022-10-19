package jdp3e.prototype.implementation_1;

class Client {

	public static void main(String[] args) throws CloneNotSupportedException {

		System.out.println("***Prototype Pattern Demo***\n");

		// Working with a Nano car
		BasicCar nano = new Nano("Nano XM624 cc");
		System.out.println(nano);
		System.out.println("-------");

		// Getting a cloned version of Nano
		BasicCar clonedCar;
		clonedCar = nano.clone();
		// Working with the cloned Nano
		printCarDetail(clonedCar);

		System.out.println("-------\n");

		// Working with a Ford car copy
		BasicCar ford = new Ford("Ford Aspire");
		System.out.println(ford);
		System.out.println("-------");

		// Getting a cloned version of Ford
		clonedCar = ford.clone();
		// Working with the cloned Ford
		printCarDetail(clonedCar);
		System.out.println("-------\n");
	}

	private static void printCarDetail(BasicCar car) {
		System.out.println("Editing a cloned model:");
		System.out.println("Model: " + car.modelName);
		// Editing the on-Road price of a car
		// This is an optional step
		car.onRoadPrice += 100;
		System.out.println("Its on-road price: $" + car.onRoadPrice);
	}


}
