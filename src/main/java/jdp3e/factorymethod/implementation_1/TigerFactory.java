package jdp3e.factorymethod.implementation_1;

// The TigerFactory class is used to create tigers
class TigerFactory extends AnimalFactory
{	
	// Creating and returning a 'Tiger' instance
	
	@Override
	protected Animal createAnimal() {
		return new Tiger();	
	}
}
