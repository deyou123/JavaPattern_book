package jdp3e.builder.implementation_1;

// This is the common interface

interface Builder {
	
	void addBrandName();

	void buildBody();

	void insertWheels();

	// The following method is used to
	// retrieve the object that is constructed.	 
	Vehicle getVehicle();
}