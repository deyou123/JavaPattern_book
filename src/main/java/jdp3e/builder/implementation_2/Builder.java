package jdp3e.builder.implementation_2;

// The common interface
interface Builder {
	
	Builder addBrandName();

	Builder buildBody();

	Builder insertWheels();	

	// The following method is used to
	// retrieve the object that is constructed.	 
	Vehicle getVehicle();
}
