package jdp3e.abstractfactory;

import jdp3e.abstractfactory.pet.PetAnimalFactory;
import jdp3e.abstractfactory.wild.WildAnimalFactory;

class Client {

	public static void main(String[] args) {

		System.out.println("***Abstract Factory Pattern Demo.***\n");
		// PetDog petDog;//Cannot access it directly-it is not public and imported
		// WildDog wildDog;//Cannot access it directly-it is not public and imported
		AnimalFactory animalFactory;
		
		// Making a wild dog and wild tiger through WildAnimalFactory
		animalFactory = new WildAnimalFactory();
		Dog dog = animalFactory.createDog("white");
		Tiger tiger = animalFactory.createTiger("golden and cinnamon");
		dog.displayMe();
		tiger.aboutMe();
		tiger.inviteDog(dog);

		System.out.println("\n************\n");

		// Making a pet dog and pet tiger through PetAnimalFactory now.
		
		animalFactory = new PetAnimalFactory();
		dog = animalFactory.createDog("black");
		tiger = animalFactory.createTiger("yellow");
		dog.displayMe();
		tiger.aboutMe();
		tiger.inviteDog(dog);

	}
}
