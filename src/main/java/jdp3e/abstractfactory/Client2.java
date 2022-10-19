package jdp3e.abstractfactory;

import jdp3e.abstractfactory.pet.PetAnimalFactory;
import jdp3e.abstractfactory.wild.WildAnimalFactory;

// Factory provider
// (It is optional for you)
class FactoryProvider {
	public static AnimalFactory getFactory(String factoryType) {
		if (factoryType.contains("wild")) {
			return new WildAnimalFactory();
		} else if (factoryType.contains("pet")) {
			return new PetAnimalFactory();
		} else {
			throw new IllegalArgumentException("You need to pass either wild or pet as argument.");
		}
	}
}

class Client2 {

	public static void main(String[] args) {

		System.out.println("***Abstract Factory Pattern Demo.Variation-2.***\n");
		AnimalFactory animalFactory;

		// Making a wild dog and wild tiger through WildAnimalFactory
		animalFactory = FactoryProvider.getFactory("wild");		
		Dog dog = animalFactory.createDog("white");
		Tiger tiger = animalFactory.createTiger("golden and cinnamon");
		dog.displayMe();
		tiger.aboutMe();
		tiger.inviteDog(dog);

		System.out.println("\n************\n");

		// Making a pet dog and pet tiger through PetAnimalFactory
		animalFactory = FactoryProvider.getFactory("pet");
		dog = animalFactory.createDog("mixed");
		tiger = animalFactory.createTiger("white and black");
		dog.displayMe();
		tiger.aboutMe();
		tiger.inviteDog(dog);
	}
}
