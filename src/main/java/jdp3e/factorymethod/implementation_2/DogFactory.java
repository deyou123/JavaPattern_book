package jdp3e.factorymethod.implementation_2;


class DogFactory extends AnimalFactory {
	
	// Creating and returning a 'Dog' instance

	@Override
	protected Animal createAnimal(String color) {
			
		return new Dog(color);
	}
}

