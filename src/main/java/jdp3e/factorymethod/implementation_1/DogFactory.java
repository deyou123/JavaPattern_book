package jdp3e.factorymethod.implementation_1;

// The DogFactory class is used to create dogs
class DogFactory extends AnimalFactory
{
	// Creating and returning a 'Dog' instance
	
	@Override
	protected Animal createAnimal() {
		return new Dog();	
	}
}
