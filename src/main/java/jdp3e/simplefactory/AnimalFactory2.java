package jdp3e.simplefactory;


class AnimalFactory2 {
	public enum Type {DOG, TIGER};
	public Animal createAnimal(Type animalType)
    {
        Animal animal;
        if (animalType.equals(Type.DOG)){
            animal = new Dog();
        }
        else if (animalType.equals(Type.TIGER)) {
            animal = new Tiger();
        }
        else {
        	System.out.println("You can create either a 'dog' or a 'tiger'. ");            
            throw new IllegalArgumentException("Unknown animal cannot be instantiated.");
        }
        return animal;
    }
}
