package jdp3e.factorymethod.implementation_2;

class Dog implements Animal {
    public Dog(String color){
    	System.out.println("\nA dog with " + color+ " color is created.");
    }
    public void displayBehavior() {
    	System.out.println("It says: Bow-Wow.");            
    	System.out.println ("It prefers barking.");
    }
}
