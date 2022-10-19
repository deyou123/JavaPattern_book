package jdp3e.factorymethod.implementation_2;

class TigerFactory extends AnimalFactory {
	
	// Creating and returning a 'Tiger' instance

	@Override
	protected Animal createAnimal(String color) {
		return new Tiger(color);
	}
}
