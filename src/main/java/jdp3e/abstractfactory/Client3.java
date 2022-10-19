package jdp3e.abstractfactory;

import jdp3e.abstractfactory.pet.PetAnimalFactory;
import jdp3e.abstractfactory.wild.WildAnimalFactory;

class Client3 {

	AnimalFactory factory;

	public Client3(AnimalFactory factory) {
		this.factory = factory;
	}

	public AnimalFactory getFactory() {
		return factory;
	}

	public static void main(String[] args) {

		System.out.println("***Abstract Factory Pattern Demo.Variation-3.***\n");
		AnimalFactory animalFactory;
		// Making a wild dog and wild tiger through WildAnimalFactory
		Client3 client = new Client3(new WildAnimalFactory());
		animalFactory = client.getFactory();
		Dog dog = animalFactory.createDog("white");
		Tiger tiger = animalFactory.createTiger("golden and cinnamon");
		dog.displayMe();
		tiger.aboutMe();
		tiger.inviteDog(dog);

		System.out.println("\n************\n");

		// Making a pet dog and pet tiger through PetAnimalFactory now.
		client = new Client3(new PetAnimalFactory());
		animalFactory = client.getFactory();
		dog = animalFactory.createDog("mixed");
		tiger = animalFactory.createTiger("white and black");
		dog.displayMe();
		tiger.aboutMe();
		tiger.inviteDog(dog);
	}
}
