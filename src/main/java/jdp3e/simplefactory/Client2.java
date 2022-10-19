package jdp3e.simplefactory;

class Client2 {

	public static void main(String[] args) {

		System.out.println("*** Simple Factory Demonstration-2.***");
		AnimalFactory2 factory = new AnimalFactory2();

		Animal animal = factory.createAnimal(AnimalFactory2.Type.DOG);
		animal.displayBehavior();

		animal = factory.createAnimal(AnimalFactory2.Type.TIGER);
		animal.displayBehavior();

		// animal = factory.createAnimal("cat");//Compile-time error now
		// animal.displayBehavior();		

	}
}
