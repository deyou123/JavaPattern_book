package jdp3e.abstractfactory.pet;

// Concrete Factory2: Pet animal factory

import jdp3e.abstractfactory.AnimalFactory;
import jdp3e.abstractfactory.Dog;
import jdp3e.abstractfactory.Tiger;

public class PetAnimalFactory extends AnimalFactory {
	public PetAnimalFactory() {
		System.out.println("You opt for a pet animal factory.\n");
	}

	@Override
	public Tiger createTiger(String color) {
		return new PetTiger(color);
	}

	@Override
	public Dog createDog(String color) {
		return new PetDog(color);
	}
}