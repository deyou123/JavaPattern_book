package jdp3e.abstractfactory.pet;

// Concrete product-B2
import jdp3e.abstractfactory.Dog;

class PetDog implements Dog {
	public PetDog(String color) {
		System.out.println("A pet dog with " + color + " color is created.");
	}

	@Override
	public void displayMe() {
		System.out.println("The " + this + " says: Bow-Wow. I prefer to stay at home.");
	}

	@Override
	public String toString() {
		return "pet dog";
	}
}
