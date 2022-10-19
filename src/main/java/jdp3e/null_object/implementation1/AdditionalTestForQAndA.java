package jdp3e.null_object.implementation1;

import java.util.ArrayList;
import java.util.List;

class AdditionalTestForQAndA {

	public static void main(String[] args) {
		// Additional test
		System.out.println("Doing an additional test");
		System.out.println("We'll iterate over the list of vehicles.");
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		vehicleList.add(new Bus());
		vehicleList.add(new Train());
		vehicleList.add(null);
		//vehicleList.add(NullVehicle.getInstance());
	

		for (Vehicle currentVehicle : vehicleList) {
			currentVehicle.travel();
		}

	}

}
