package jdp3e.factorymethod.implementation_2;

abstract class AnimalFactory{
	
	public void createAndDisplayAnimal(String color){
		Animal animal;
		animal=createAnimal(color);	
		// common code	
	    animal.displayBehavior();
	}
	
	// This is the "factory method"
	// Notice that I defer the instantiation process
	// to the subclasses.
	protected abstract Animal createAnimal(String color);
}



