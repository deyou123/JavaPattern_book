package jdp3e.factorymethod.implementation_1;

class Tiger implements Animal
{
    public Tiger() {
    	System.out.println("\nA tiger is created.");
    }
    public void displayBehavior(){
    	System.out.println("It says: Halum.");
    	System.out.println("It loves to roam in a jungle.");
    }
}
