package jdp3e.builder.implementation_1;

// Director class 

abstract class Director {
	// Director knows how to use/instruct the
	// builder to create a vehicle.
	public abstract Vehicle instruct(Builder builder);

}
