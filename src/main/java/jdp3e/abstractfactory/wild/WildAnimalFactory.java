package jdp3e.abstractfactory.wild;



// Concrete Factory 1: Wild animal factory

import jdp3e.abstractfactory.AnimalFactory;
import jdp3e.abstractfactory.Dog;
import jdp3e.abstractfactory.Tiger;

public class WildAnimalFactory extends AnimalFactory {
	public WildAnimalFactory() {
		System.out.println("You opt for a wild animal factory.\n");
	}

	@Override
	public Tiger createTiger(String color) {
		return new WildTiger(color);
	}

	@Override
	public Dog createDog(String color) {
		return new WildDog(color);
	}
}