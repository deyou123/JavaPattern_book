package jdp3e.null_object.implementation1;

class NullVehicle implements Vehicle {
	// Early initialization
	private static  NullVehicle instance = new NullVehicle();
	public static int nullVehicleCount;
	// The constructor is private to prevent the use of "new"  
	NullVehicle(){
		nullVehicleCount++;
		System.out.println("A null vehicle object is created.");
	}
	// Global point of access.
	public static NullVehicle getInstance()	{
		return instance;
	}
	@Override
	public void travel(){
		//Do nothing
	}    
}
